package com.welcome;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class JDBC {
	    public Connection configureDbQuery() throws Exception  //(Previous return type was List<Object>
	    {
	    	//Student std = new Student();
	    	String url
	            = "jdbc:mysql://localhost:3306/demodatabase"; // table details
	        String username = "root"; // MySQL credentials
	        String password = "Harapani@tsdfg53";
	        //String query= "select *from stud_table"; // query to be run
	       // ResultSet rs = null ;
	       // List<Object> stu_list = new ArrayList<>();
	        Connection con = null;
	        try {
	        Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
	        con = DriverManager.getConnection(url, username, password);
	       System.out.println("Connection Established successfully");
	      
	     /*   Statement st = con.createStatement();
	        rs = st.executeQuery(query); // Execute query
	    
	 		while(rs.next()) {
	 		    
	 		    std.setId(rs.getInt("Id"));
	 		   std.setName(rs.getString("stud_name")); // Retrieve name from db
	 		    std.setCls(rs.getString("stud_class"));
	 		    std.setAge(rs.getInt("stud_age"));
	 		    std.setMarks(rs.getInt("stud_marks"));
	 		    //System.out.println(id+" , "+name+" , "+cls+" , "+age); // Print result on console
	 		    stu_list.add(std);
	 		    
	 		    }
	 		
	        st.close(); 
	        con.close(); 
	    
	        System.out.println("Connection Closed....");
	        
	        }
	        
	        catch (Exception E) {
	        	System.err.println("Some Error: "+E);
	        }
			return stu_list;
	       
	    } */
//	    return stu_list;
	              
	        }
	        catch (Exception g) {
	        	System.err.println("Post Error Exception");
	        }
	        return con;
	    }
	          
	}


