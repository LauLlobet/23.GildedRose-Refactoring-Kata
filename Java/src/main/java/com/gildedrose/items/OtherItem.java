package com.gildedrose.items;

import com.gildedrose.Item;

public class OtherItem extends Item{
    public OtherItem(String name, int sellIn, int quality) {
        super(name,sellIn,quality);
    }

    @Override
    public void updateQuality() {

    }

    @Override
    public void updateSellin() {
        sellIn = sellIn - 1;
    }
}
