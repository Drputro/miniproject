package com.eksad.miniproject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import com.eksad.miniproject.repository.EmployeeRepository;
 
public class AppReadCSV {
	
    public static void main( String[] args ){
    	
        
        BufferedReader br;
        String line;
        try {
            br=new BufferedReader(new FileReader("src/main/resources/DataEmployee.csv"));
            while((line=br.readLine())!=null){
                
                String[] DataEmployee=line.split(",");
                System.out.println("id:"+DataEmployee[0]+" name:"+DataEmployee[1]+
                		" dob:"+DataEmployee[2]+" address:"+DataEmployee[3]+" phone:"+DataEmployee[4]+
                		" age:"+DataEmployee[5]+" pob:"+DataEmployee[6]+" salary:"+DataEmployee[7]+
                		" id_div:"+DataEmployee[8]);
                
                
                
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
  
    
}