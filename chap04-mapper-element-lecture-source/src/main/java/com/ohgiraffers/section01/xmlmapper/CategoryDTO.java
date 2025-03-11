package com.ohgiraffers.section01.xmlmapper;

public class CategoryDTO {
    private int categoryCode;
    private String categoryName;
    private Integer refCategoryCode;

    public CategoryDTO(int categoryCode, String categoryname, Integer refCategoryCode) {
        this.categoryCode = categoryCode;
        this.categoryName = categoryname;
        this.refCategoryCode = refCategoryCode;
    }

    public CategoryDTO() {
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCategoryname() {
        return categoryName;
    }

    public void setCategoryname(String categoryname) {
        this.categoryName = categoryname;
    }

    public Integer getRefCategoryCode() {
        return refCategoryCode;
    }

    public void setRefCategoryCode(Integer refCategoryCode) {
        this.refCategoryCode = refCategoryCode;
    }

    @Override
    public String toString() {
        return "CategoryDTO{" +
                "categoryCode=" + categoryCode +
                ", categoryName='" + categoryName + '\'' +
                ", refCategoryCode=" + refCategoryCode +
                '}';
    }
}
