package com.example.dhrpande.mathemagic.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {
        // Add 3 sample items.
        addItem(new DummyItem("1", "Let Me Read Your Mind!"));
        addItem(new DummyItem("2", "Let Me Guess Your Age!"));
        addItem(new DummyItem("3", "Magic of Numbers - Trick1"));
        addItem(new DummyItem("4", "Magic of Numbers - Trick2"));
        addItem(new DummyItem("5", "Magic of Numbers - Trick3"));
        addItem(new DummyItem("6", "Magic of Numbers - Trick4"));
        addItem(new DummyItem("7", "Magic of Numbers - Trick5"));
        addItem(new DummyItem("8", "Magic of Numbers - Trick6"));
        addItem(new DummyItem("9", "Magic of Numbers - Trick7"));
        addItem(new DummyItem("10", "Beauty of Numbers - Hailstone Numbers"));

    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public String id;
        public String puzzleName;

        public DummyItem(String id, String content) {
            this.id = id;
            this.puzzleName = content;
        }

        @Override
        public String toString() {
            return puzzleName;
        }
    }
}
