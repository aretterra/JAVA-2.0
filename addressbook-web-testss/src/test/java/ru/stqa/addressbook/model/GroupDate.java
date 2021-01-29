package ru.stqa.addressbook.model;

public class GroupDate {
    private final String name;
    private final String header;
    private final String footer;



    private String parent;

    public GroupDate(String name, String header, String footer, String parent) {
        this.name = name;
        this.header = header;
        this.footer = footer;
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public String getHeader() {
        return header;
    }

    public String getFooter() {
        return footer;
    }

    public String getParent() {
        return parent;
    }
}
