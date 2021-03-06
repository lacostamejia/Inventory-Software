package ucf.assignments;

/*
 *  UCF COP3330 Summer 2021 Assignment 5 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 */

//This class holds all the information for each item
public class InventoryItems {

     String name;
     String serial;
     String price;

    public InventoryItems(String name, String serial, String price) {
        this.name = name;
        this.serial = serial;
        this.price = price;
    }

    //--------- Get Item Information -------------//
    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getSerial() {
        return serial;
    }

    //--------- Set Item Information -------------//
    public void setName(String name) {
        this.name = name;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    //--------- Modify Item Information -------------//
    public void ModifyName(String name){
        this.name = name;
    }

    public void ModifySerialNumber(String serial){
        this.serial = serial;
    }

    public void ModifyPrice(String price){ this.price = price;}

    //---------- Seach Item -----------//

    public String FindName(){
        return name;
    }

    public String FindSerialNumber(){
        return serial;
    }

    //---------- Save Item ------------//
    public String SaveName(){
        return name;
    }

    public String SaveSerialNumber(){
        return serial;
    }

    public String SavePrice(){ return price;}

    //---------- Load Item -----------//
    public void LoadName(String name){ this.name = name;}

    public void LoadSerial(String serial){ this.serial = serial;}

    public void LoadPrice(String price){ this.price = price;}


    @Override
    public String toString() {
        return "InventoryItems{" +
                "name='" + name + '\'' +
                ", serial='" + serial + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
