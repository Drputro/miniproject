package com.eksad.miniproject.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.eksad.miniproject.model.Employee;
import com.eksad.miniproject.model.dataEmployee;
import com.eksad.miniproject.repository.EmployeeRepository;

public class DataService {
	 @Autowired
	    EmployeeRepository employeeRepo;
	
	public void saveData() {
		BufferedReader br;
        String line = null;
        StringBuffer contents = new StringBuffer();
        
        List<dataEmployee> listDataEmployee=new ArrayList<dataEmployee>();
        
        try {
            br=new BufferedReader(new FileReader("src/main/resources/DataEmployee.csv"));
            System.out.println(br.readLine());
            while((line =br.readLine())!=null){
            	Employee data=new Employee();
            	System.out.println(line);
            	String[] dataEmployeeArray=line.split(";");
            	//data.setId(Integer.parseInt(dataEmployeeArray[0]) );
            	data.setName(dataEmployeeArray[1]);
            	try {
					data.setDob(new SimpleDateFormat("yyyy-MM-dd").parse(dataEmployeeArray[2]));
				} catch (ParseException e) {
					e.printStackTrace();
				}
            	data.setAddress(dataEmployeeArray[3]);
            	data.setPhone(dataEmployeeArray[4]);
            	data.setAge(Integer.parseInt(dataEmployeeArray[5]));
            	data.setPob(dataEmployeeArray[6]);
            	data.setSalary(Integer.parseInt(dataEmployeeArray[7]));
            	data.setId_div(Integer.parseInt(dataEmployeeArray[8]));
            	
            	employeeRepo.save(data);
            	
            	data = null;
            	dataEmployeeArray = null;

            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

		
	}

}
