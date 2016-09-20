package models;

public class Comments extends Item {
    public String comments;
    
	public Comments(){}

    public Comments(String name,String desc){
        this.name = name;
        this.description = desc;

    }

    public Comments(String name,String desc,String comments){

        this.name = name;
        this.description = desc;
        this.comments = comments;
    }
    public String getComments(){return this.comments;}

    public void setComments(String comments) {
        this.comments = comments;
    }
}

