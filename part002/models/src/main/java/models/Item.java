package ru.dimcher.part002.models;

public class Item{
	public String name;
	public String description;
	public long create;
	private String id;
	
	public Item(){}
	public Item(String name,String description){
		this.name = name;
		this.description = description;

	}
	public Item(String id,String name,String description){
    		this.id = id;
    		this.name = name;
    		this.description = description;
		
	}
	public Item(String name,String description,long create){
		this.name = name;
		this.description = description;
		this.create = create;
	}
	
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description = description;
	}
	public long getCreate(){
		return this.create;
	}
	public String getId(){
		return this.id;
	}
	public void setId (String id){
		this.id = id;
	}
}