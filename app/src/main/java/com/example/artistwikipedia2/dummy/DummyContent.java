package com.example.artistwikipedia2.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        addItem(new DummyItem("1","Ariana"));
        addItem(new DummyItem("2","Blackpink"));
        addItem(new DummyItem("3","BTS"));
        addItem(new DummyItem("4","Coldplay"));
        addItem(new DummyItem("5","Halsey"));
        addItem(new DummyItem("6","Maroon 5"));
        addItem(new DummyItem("7","One Direction"));
        addItem(new DummyItem("8","SF9"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }


    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;

        public DummyItem(String id, String content) {
            this.id = id;
            this.content = content;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}