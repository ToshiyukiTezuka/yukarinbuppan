package yukari.kingdom.yukarinbuppan.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import yukari.kingdom.yukarinbuppan.section.Section;

public class HomeAdapter extends ArrayAdapter<SectionItem> {

    private List<Section> mSectionList = new ArrayList<Section>();
    private Map<SectionType, Integer> mTypeMap = new HashMap<SectionType, Integer>();

    public HomeAdapter(Context context) {
        super(context, 0);
    }

    public boolean addSection(final Section section) {
        final SectionType type = section.getType();
        if(!hasSectionType(type)) {
            mSectionList.add(section);
            mTypeMap.put(type, 0);
            return true;
        }
        return false;
    }

    private boolean hasSectionType(final SectionType type) {
        for (final Section section : mSectionList) {
            if (section.getType() == type) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    @Override
    public void add(SectionItem object) {
        super.add(object);
    }

    @Deprecated
    @Override
    public void addAll(SectionItem... items) {
        super.addAll(items);
    }

    @Deprecated
    @Override
    public void addAll(Collection<? extends SectionItem> collection) {
        super.addAll(collection);
    }

    public void add(SectionType type, SectionItem object) {
        if (!mTypeMap.containsKey(type)) {
            return;
        }
        final Integer itemCount = mTypeMap.get(type);
        mTypeMap.put(type, itemCount+1);
        super.add(object);
    }

    public SectionItem getItem(final int position) {
//        return getSectionFromPosition(position);
        return super.getItem(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return getItem(position).getView();
//        return super.getView(position, convertView, parent);
    }

//    private Section getSectionFromPosition(final int position) {
//        int count = 0;
//        for (final Integer c : mTypeMap.values()) {
//            count += c;
//        }
//        if (count > position + 1) {
//            return null;
//        }
//
//    }


}
