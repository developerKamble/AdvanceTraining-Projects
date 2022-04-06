package com.coreproject2;

import java.util.Random;

import com.coreproject1.Flute;
import com.coreproject1.Guitar;
import com.coreproject1.Piano;

public class TestMedicine {

	public static void main(String[] args) {
		MedicineInfo med[]=new MedicineInfo[10];
		
		Random rand=new Random();
		for (int i = 0; i < 10; i++) {
	    	int randomNum = rand.nextInt((3 - 1) + 1) + 1;
	    	
	    	if (randomNum == 1)
	    		med[i] = new Tablet();
	    	else if (randomNum == 2)
	    		med[i] = new Syrup();
	    	else if (randomNum == 3)
	    		med[i] = new Ointment();
	    	
	    	for(int j=0;j<10;j++) {
	    		if(med[j] instanceof Tablet)
	    			med[j].displayLabel();
	    		else if(med[j] instanceof Syrup)
	    			med[j].displayLabel();
	    		else if(med[j] instanceof Ointment)
	    			med[j].displayLabel();
	    	}
	    	
	    }
	}
}
