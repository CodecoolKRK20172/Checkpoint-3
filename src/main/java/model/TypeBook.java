package model;

public class TypeBook {

    protected int typeID;
    protected String type;

    public TypeBook(String type, int typeID) {
        this.typeID = typeID;
        this.type = type;
    }

    public TypeBook(String type) {
        this.type = type;
    }
}
