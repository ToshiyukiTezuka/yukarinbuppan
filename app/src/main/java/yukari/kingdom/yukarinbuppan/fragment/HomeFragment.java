package yukari.kingdom.yukarinbuppan.fragment;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ListView;

import butterknife.InjectView;
import yukari.kingdom.yukarinbuppan.R;
import yukari.kingdom.yukarinbuppan.adapter.HomeAdapter;
import yukari.kingdom.yukarinbuppan.section.HomeSection;

public class HomeFragment extends Fragment {

//    @InjectView(R.id.id_fragment_home_list_view)
//    private ListView mListView;

    @SuppressLint("ValidFragment")
    private HomeFragment() {
        super();
    }

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_home, null);
        return null;
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final HomeAdapter adapter = new HomeAdapter(getActivity());
        adapter.addSection(new HomeSection());

//        mListView.setAdapter(adapter);
    }
}
