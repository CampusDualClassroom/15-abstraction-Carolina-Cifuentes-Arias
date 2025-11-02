package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    private Date expirationDate;

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
         this.expirationDate = expirationDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getFormattedDate (Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat ("dd-MM-yyyy");
        return sdf.format(date);
    }

    @Override
    public String getSpecificData() {
        return "Localización: " +  getLocation() + "\nFecha de caducidad: " + getFormattedDate((expirationDate));
    }

    public void printSpecificData (){
        System.out.println(getSpecificData());
    }
}

