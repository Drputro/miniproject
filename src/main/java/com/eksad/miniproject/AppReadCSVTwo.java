package com.eksad.miniproject;


import com.eksad.miniproject.model.dataEmployee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
 
public class AppReadCSVTwo {
    public static void main( String[] args ) throws ParseException{
        
        BufferedReader br;
        String line;
        List<dataEmployee> listDataEmployee=new ArrayList<dataEmployee>();
        
        try {
            br=new BufferedReader(new FileReader("src/main/resources/siswa.csv"));
            while((line=br.readLine())!=null){
                
                String[] DataEmployeeArray=line.split(",");
                
                dataEmployee data=new dataEmployee();
                data.setId(Integer.parseInt(DataEmployeeArray[0]));
                data.setName(DataEmployeeArray[1]);
                data.setDob(new SimpleDateFormat("dd-MM-yyyy").parse(DataEmployeeArray[2]));
                data.setAddress(DataEmployeeArray[3]);
                data.setPhone(DataEmployeeArray[4]);
                data.setAge(Integer.parseInt(DataEmployeeArray[5]));
                data.setPob(DataEmployeeArray[6]);
                data.setSalary(Integer.parseInt(DataEmployeeArray[7]));
                data.setId_div(Integer.parseInt(DataEmployeeArray[8]));
                
                
                dataEmployee dataEmployee = null;
				listDataEmployee.add(dataEmployee);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        //buat cek data
        for(dataEmployee dataEmployee:listDataEmployee){
            System.out.println("Name:"+dataEmployee.getName()+" "+
        new SimpleDateFormat("yyyy-MM-dd").format(dataEmployee.getDob()));
        }
        
    }
}