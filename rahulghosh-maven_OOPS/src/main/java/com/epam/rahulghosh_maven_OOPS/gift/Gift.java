package com.epam.rahulghosh_maven_OOPS.gift;
import com.epam.rahulghosh_maven_OOPS.chocolates.Chocolate;
import com.epam.rahulghosh_maven_OOPS.sweets.Sweets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Gift {
	private ArrayList<Chocolate> chocolates;
    private ArrayList<Sweets> sweets;

    public Gift(){
        chocolates=new ArrayList<>();
        sweets=new ArrayList<>();

}
    public void addChocolates(Chocolate... chocolates){
        this.chocolates.addAll(Arrays.asList(chocolates));
    }

    public void addSweets(Sweets... sweets){
        this.sweets.addAll(Arrays.asList(sweets));
    }

    public void sort(){
        Collections.sort(chocolates);
        Collections.sort(sweets);
    }

    public ArrayList<Chocolate> getChocolates() {
        return chocolates;
    }

    public ArrayList<Sweets> getSweets() {
        return sweets;
    }

    public int findTotalWeight(){
        int weight=0;

        for(Chocolate c: this.chocolates)
            weight+=c.getWeight();
        for(Sweets s: this.sweets)
            weight+=s.getWeight();

        return weight;
    }
}
