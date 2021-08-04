package com.hibernate.bean;

import java.text.SimpleDateFormat;

import java.util.Date;


public class CustomerManagment {
	
public String getNationalCode(String nationalCode) {
		
		return nationalCode;
	}
	
    public boolean validationNationalCode(String nationalCode){
        //check length
        if (nationalCode.length() != 10)
            return false;

        long NationalCode = Long.parseLong(nationalCode);
        byte[] arraynationalCode = new byte[10];

        //extract digits from number
        for (int i = 0; i < 10 ; i++) {
            arraynationalCode[i] = (byte) (NationalCode % 10);
            NationalCode = NationalCode / 10;
        }

        //Checking the control digit
        int sum = 0;
        for (int i = 9; i > 0 ; i--)
            sum += arraynationalCode[i] * (i+1);
        int temp = sum % 11;
        if (temp < 2)
            return arraynationalCode[0] == temp;
        else
            return arraynationalCode[0] == 11 - temp;
   
}
    
    
   
    
    }
    
  
    
    
    
   


