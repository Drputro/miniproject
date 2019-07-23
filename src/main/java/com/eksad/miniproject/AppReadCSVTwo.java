package com.eksad.miniproject;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;

import com.eksad.miniproject.model.Employee;
import com.eksad.miniproject.model.dataEmployee;
import com.eksad.miniproject.repository.EmployeeRepository;
import com.eksad.miniproject.service.DataService;
 
@SpringBootApplication
public class AppReadCSVTwo {
	
	
	
    public static void main( String[] args ) throws ParseException{
    	SpringApplication.run(AppReadCSVTwo.class, args);
    }
		
//    @Autowired
//    EmployeeRepository employeeRepo;
    

    
    @Bean
	public static DataService dataService()
	{
		return new DataService();
	}
    
//    @Override
//	@Transactional
//	public void run(ApplicationArguments args) throws Exception {
//	    
//    	//employeeRepo.save(data);
////        BufferedReader br;
////        String line = null;
////        StringBuffer contents = new StringBuffer();
////        
////        List<dataEmployee> listDataEmployee=new ArrayList<dataEmployee>();
////        
////        try {
////            br=new BufferedReader(new FileReader("src/main/resources/DataEmployee.csv"));
////            System.out.println(br.readLine());
////            while((line =br.readLine())!=null){
////            	Employee data=new Employee();
////            	System.out.println(line);
////            	String[] dataEmployeeArray=line.split(";");
////            	//data.setId(Integer.parseInt(dataEmployeeArray[0]) );
////            	data.setName(dataEmployeeArray[1]);
////            	data.setDob(new SimpleDateFormat("yyyy-MM-dd").parse(dataEmployeeArray[2]));
////            	data.setAddress(dataEmployeeArray[3]);
////            	data.setPhone(dataEmployeeArray[4]);
////            	data.setAge(Integer.parseInt(dataEmployeeArray[5]));
////            	data.setPob(dataEmployeeArray[6]);
////            	data.setSalary(Integer.parseInt(dataEmployeeArray[7]));
////            	data.setId_div(Integer.parseInt(dataEmployeeArray[8]));
////            	
////            	employeeRepo.save(data);
////            	
////            	data = null;
////            	dataEmployeeArray = null;
//////            	
//////            	dataEmployee dataEmployee = null;
//////            	contents.append(line);
//////                contents.append(System.getProperty("line.separator"));
//////            	line = br.readLine();
//////            	System.out.println(line);
//////            	String[] dataEmployeeArray=line.split(",");
//////            	System.out.println(dataEmployeeArray);
////            	
////            	
////            	
//////                String[] dataEmployeeArray=line.split(",");
//////                System.out.println(dataEmployeeArray.length);
//////                for (int i = 0; i < dataEmployeeArray.length; i++) {
//////                	//data.setDob(new SimpleDateFormat("dd-MM-yyyy").parse(dataEmployeeArray[2]));
//////                    data.setAddress(dataEmployeeArray[3]);
//////                    data.setPhone(dataEmployeeArray[4]);
//////                    data.setAge(Integer.parseInt(dataEmployeeArray[5]));
//////                    data.setPob(dataEmployeeArray[6]);
//////                    data.setSalary(Integer.parseInt(dataEmployeeArray[7]));
//////                    data.setId_div(Integer.parseInt(dataEmployeeArray[8]));
//////				}
////                //System.out.println(dataEmployeeArray[2]);
////                
////                //data.setId(Integer.parseInt(DataEmployeeArray[0]));
////                //data.setName(dataEmployeeArray[1]);
////                
////                
////                
////                
////				//listDataEmployee.add(dataEmployee);
////            }
////        } catch (FileNotFoundException ex) {
////            ex.printStackTrace();
////        } catch (IOException ex) {
////            ex.printStackTrace();
////        }
////        
////        //buat cek data
//////        for(dataEmployee dataEmployee:listDataEmployee){
//////            System.out.println("Name:"+dataEmployee.getName()+" "+
//////        new SimpleDateFormat("yyyy-MM-dd").format(dataEmployee.getDob()));
//////        }
////        
//    }
}