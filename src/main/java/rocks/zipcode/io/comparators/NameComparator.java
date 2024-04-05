package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class NameComparator implements Comparator<Item> {
    private String name;
    private Long id;
    private Double price;

    @Override
    public int compare(Item o1, Item o2) {
        return o1.getName().compareTo(o2.getName());
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
