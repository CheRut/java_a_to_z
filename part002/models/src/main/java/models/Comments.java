package ru.dimcher.part002.models;

public class Comments extends Item {
    private String comm;
    public Comments(){}

    public Comments(String name,String desc){
        this.name = name;
        this.description = desc;

    }

    public Comments(String name,String desc,String comments){

        this.name = name;
        this.description = desc;
        this.comm = comments;
    }
    public String getComm(){return this.comm;}

    public void setComm(String comm) {
        this.comm = comm;
    }
}

