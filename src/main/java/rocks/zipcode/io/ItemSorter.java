package rocks.zipcode.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {

    Item[] items;

    public ItemSorter(Item[] items) {
        this.items = items;
    }

    public Item[] sort(Comparator<Item> comparator) {
        List<Item> asList = Arrays.asList(items);
        asList.sort(comparator);
        return asList.toArray(Item[]::new);
    }
}
