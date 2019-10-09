package com.company;

public class Book {
    private int pageCount;
    private String name;
    private String ganre;

    public Book() {
    }

    public Book(int pageCount, String name, String genre) {
        this.pageCount = pageCount;
        this.name = name;
        this.ganre = genre;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGanre() {
        return ganre;
    }

    public void setGanre(String ganre) {
        this.ganre = ganre;
    }

    @Override
    public String toString() {
        return this.getName()+"--"+this.getPageCount();
    }
}
