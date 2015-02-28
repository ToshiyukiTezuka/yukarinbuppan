package yukari.kingdom.yukarinbuppan.section;

import yukari.kingdom.yukarinbuppan.adapter.SectionType;

public abstract class Section {

    private SectionType mType;

    protected Section(final SectionType type) {
        mType = type;
    }

    public SectionType getType() {
        return mType;
    }
}
