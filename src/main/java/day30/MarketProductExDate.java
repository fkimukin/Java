package day30;

import java.time.LocalDate;

public class MarketProductExDate {
    String pruductName;
    double productPrice;
    String expriationDate;


    public MarketProductExDate(String pruductName, double productPrice){
this.pruductName= pruductName;
this.productPrice= productPrice;
    }

    public MarketProductExDate(String name, double price, int monthLeft){
        pruductName= name;
        productPrice= price;
        expriationDate= LocalDate.now().plusMonths(monthLeft).toString();
    }

}
