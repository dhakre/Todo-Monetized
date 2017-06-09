package com.example.qosmio.todo.Models;

/**
 * Created by Qosmio on 12/10/2016.
 */

public class todo {

    private String Title;
    private String Description;
    private String DateTime;
    private int posId;

    public void setTitle(String title){
        this.Title = title;
    }


    public void setDescription(String description){
        this.Description = description;
    }


    public void setDateTime(String dt){

        this.DateTime = dt;
    }

    public void setPosID(int id){
        this.posId = id;
    }

    public String getTitle(){
        return this.Title;
    }

    public String getDescription(){
        return this.Description;
    }

    public String getDateTime(){
        return this.DateTime;
    }


    public int getID() {
        return this.posId;
    }
}
