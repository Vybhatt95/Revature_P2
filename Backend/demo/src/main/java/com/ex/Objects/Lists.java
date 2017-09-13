package com.ex.Objects;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

import java.util.List;

@Entity
@Table(name="LISTS")
public class Lists {
    private int listId;
    private String listName;
    private int listTotal;
    private List<Item> items;


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "LIST_JUNCTION", joinColumns ={@JoinColumn(name = "LISTID")}, inverseJoinColumns = {@JoinColumn(name = "ITEMID")})
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Id
    @GenericGenerator(name="listIdGen",strategy = "increment")
    @GeneratedValue(generator = "listIdGen")
    @Column(name = "LISTID")
    public int getlistId() {
        return listId;
    }

    public void setlistId(int listId) {
        this.listId = listId;
    }

    @Column(name = "LISTNAME")
    public String getlistName() {
        return listName;
    }

    public void setlistName(String listName) {
        this.listName = listName;
    }

    @Column(name = "LISTTOTAL")
    public int getlistTotal() {
        return listTotal;
    }

    public void setlistTotal(int listTotal) {
        this.listTotal = listTotal;
    }


}
