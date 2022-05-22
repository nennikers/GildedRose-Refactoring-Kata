package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SulfurasTest {
    @Test
    void test() {
        Item[] items = new Item[] {new Item("Sulfuras, Hand of Ragnaros", 0, 0)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertEquals(0, items[0].sellIn);
        assertEquals(0, items[0].quality);
    }
}
