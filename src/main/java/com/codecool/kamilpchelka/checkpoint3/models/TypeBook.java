package com.codecool.kamilpchelka.checkpoint3.models;

public class TypeBook {

    private int typeID;
    private String typeName;

    public TypeBook(int typeID, String typeName) {
        this.typeID = typeID;
        this.typeName = typeName;
    }

    public int getTypeID() {
        return typeID;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, ID: %d", typeName, typeID);
    }
}
