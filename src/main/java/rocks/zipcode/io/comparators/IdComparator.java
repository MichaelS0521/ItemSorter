package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class IdComparator implements Comparator<Item> {

    private String name;
    private Long id;
    private double price;

    @Override
    public int compare(Item o1, Item o2) {
        return Long.compare(o1.getId(), o2.getId());
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
