package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaxCalculator {

    HashMap<String,Double> stateTax = new HashMap<>();
    String taxCode;
    Double amount;
    public TaxCalculator() {
        stateTax.put("ma",6.25);
        stateTax.put("ny",3.0);
        stateTax.put("nj",5.92);
        stateTax.put("mi", 8.9);
        stateTax.put("in", 5.6);
        stateTax.put("cal",7.5);
        stateTax.put("jamaica",2.98);
        Scanner input = new Scanner(System.in);
        System.out.print("What state are you trying to calculate the tax for  -->  ");
        taxCode = input.nextLine();
        System.out.println("How much is the total cost of items --> " );
        amount = input.nextDouble();

       double totalAmount = things (taxCode, amount);
       System.out.println("The total Amount including the state tax is -->  $" + totalAmount);
    }


    public double things(String stateCode, double amount){

        if(stateTax.containsKey(stateCode)){
           return stateTax.get(stateCode)/100*amount + amount;
        }
        else {
            return 0.0;
        }
      /* for (String s: stateTax.keySet()){
           return amount*(stateTax.get(stateCode)*10/100);
       }*/

    }

}
