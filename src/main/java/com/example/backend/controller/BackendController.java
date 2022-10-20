package com.example.backend.controller;

import java.util.ArrayList;
import java.util.Iterator;
import org.springframework.web.bind.annotation.PostMapping;
import net.minidev.json.JSONObject;
import com.example.backend.model.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
		

@RestController
public class BackendController {
	
	
	
	//First API to display all the paths from a JSON file.
	
	@PostMapping(path ="json1")
	public JSONObject api1(@RequestBody Root rootModel) {
		ArrayList<Vertex> vertices = rootModel.models.get(0).vertices;
		JSONObject obj1 = new JSONObject();
		for (int i = 0; i< vertices.size();i++) {
		obj1.put("path"+(i+1), vertices.get(i).name);
			
			System.out.println("paths are/" +vertices.get(i).name);
				}
		
			return obj1;
	
	}
	
	//Second API to display the common path from 2 JSON files.	
	
	@PostMapping(path ="common")
	public JSONObject apiCommon(@RequestBody Common commonModel ) {
		JSONObject objcomm = new JSONObject();
		
													
			
			ArrayList<Vertex> verticesOfFirst = commonModel.files.get(0).models.get(0).vertices;
			for (int i = 0; i< verticesOfFirst.size();i++) {
		
			}
			
			ArrayList<Vertex> verticesOfSecond = commonModel.files.get(1).models.get(0).vertices;
			for (int i = 0; i< verticesOfSecond.size();i++) {
				 
			}
			
			ArrayList<String> namesOfFirst = new ArrayList<String>();
			Iterator<Vertex> iter = verticesOfFirst.iterator(); 
	 
	        while (iter.hasNext()) { 
	            namesOfFirst.add(iter.next().name);
	        } 
	        
	        ArrayList<String> namesOfSecond = new ArrayList<String>();
		    Iterator<Vertex> iter2 = verticesOfSecond.iterator(); 
	 
	        while (iter2.hasNext()) { 
	            namesOfSecond.add(iter2.next().name);
	        } 
			ArrayList<String> common = new ArrayList<String>(namesOfFirst);
			common.retainAll(namesOfSecond);	  
	        
			System.out.println("Common elements: "
	                           + common); 
			
			objcomm.put("common_path", common);

			return objcomm;
	}
	
	//Third API to display the all the paths from both JSON files.
	
	@PostMapping(path ="all")
	public JSONObject apiAll(@RequestBody Common finalModel ) {
		
			ArrayList<Vertex> verticesOfF = finalModel.files.get(0).models.get(0).vertices;
			JSONObject obj3 = new JSONObject();
			for (int k = 0; k< verticesOfF.size();k++) {
	
				System.out.println(" " + verticesOfF.get(k).name);
				obj3.put("path"+(k+1), verticesOfF.get(k).name);
				 
					}
		
			ArrayList<Vertex> verticesOfS = finalModel.files.get(1).models.get(0).vertices;
			for (int k = 0; k< verticesOfS.size();k++) {
				obj3.put("path"+(k+verticesOfF.size()), verticesOfS.get(k).name);
				System.out.println(" " + verticesOfS.get(k).name);
				 
			}
			return obj3;
			
	}
	}
 