package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgedBrieTest {
    @Test
    void test() {
        Item[] items = new Item[] {new Item("Aged Brie", 0, 0)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertEquals(-1, items[0].sellIn);
        assertEquals(2, items[0].quality);
    }

}
