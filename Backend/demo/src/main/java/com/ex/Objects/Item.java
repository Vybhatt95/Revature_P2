package com.ex.Objects;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="ITEM")
public class Item {
    private int itemId;
    private String itemName;
    private double itemPrice;
    private int barcode;

    private Store_Front stores;

    public Item(){}


    @OneToOne
    @JoinColumn(name = "STOREID")
    public Store_Front getStores() {
        return stores;
    }

    public void setStores(Store_Front stores) {
        this.stores = stores;
    }

    @Id
    @GenericGenerator(name="itemIdGen",strategy = "increment")
    @GeneratedValue(generator = "itemIdGen")
    @Column(name="ITEMID")
    public int getitemId() {
        return itemId;
    }

    public void setitemId(int itemId) {
        this.itemId = itemId;
    }

    @Column(name="ITEMNAME")
    public String getitemName() {
        return itemName;
    }

    public void setitemName(String itemName) {
        this.itemName = itemName;
    }

    @Column(name="ITEMPRICE")
    public double getitemPrice() {
        return itemPrice;
    }

    public void setitemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Column(name="BARCODE")
    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }
}
