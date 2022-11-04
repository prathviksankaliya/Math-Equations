package com.itcraftsolution.mathequations;

public class Category {
    String catName, catDesc;

    public Category(String catName, String catDesc) {
        this.catName = catName;
        this.catDesc = catDesc;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCatDesc() {
        return catDesc;
    }

    public void setCatDesc(String catDesc) {
        this.catDesc = catDesc;
    }
}
