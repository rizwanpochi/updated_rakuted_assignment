package com.example.backend.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import com.example.backend.model.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BackendController {

	// First API to display all the paths from a JSON file.

	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping(path = "json1")
	public JSONObject api1(@RequestBody Common commonModel) {
		ArrayList<Vertex> vertices = commonModel.files.get(0).models.get(0).vertices;

		// Store the vertices id/name as a map, for reference later
		HashMap<String,String> verticesMap = new HashMap<String,String>();
		for (int i = 0; i < vertices.size(); i++) {
			verticesMap.put(vertices.get(i).id,vertices.get(i).name);
		}
		
		ArrayList<Edge> edges = commonModel.files.get(0).models.get(0).edges;
		JSONObject json = new JSONObject();
		JSONArray paths = new JSONArray();
		
		for (int i = 0; i < edges.size(); i++) {
			JSONObject path = new JSONObject();
			path.put("edge", edges.get(i).name);
			path.put("from", verticesMap.get(edges.get(i).sourceVertexId));
			path.put("to", verticesMap.get(edges.get(i).targetVertexId));
			paths.add(path);
		}
		
		json.put("paths", paths);
				
		return json;
	}
		

	// Second API to display the common path from 2 JSON files.

	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping(path = "common")
	public JSONObject apiCommon(@RequestBody Common commonModel) {
		JSONObject objcomm = new JSONObject();

		ArrayList<Vertex> verticesOfFirst = commonModel.files.get(0).models.get(0).vertices;
		for (int i = 0; i < verticesOfFirst.size(); i++) {

		}

		ArrayList<Vertex> verticesOfSecond = commonModel.files.get(1).models.get(0).vertices;
		for (int i = 0; i < verticesOfSecond.size(); i++) {

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

		System.out.println("Common elements: " + common);

		objcomm.put("common_path", common);

		return objcomm;
	}

	// Third API to display the all the paths from both JSON files.

	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping(path = "all")
	public JSONObject apiAll(@RequestBody Common finalModel) {
	
		ArrayList<Vertex> verticesOfFirst = finalModel.files.get(0).models.get(0).vertices;
		ArrayList<Vertex> verticesOfSecond = finalModel.files.get(1).models.get(0).vertices;
		
				
		// Store the vertices id/name as a map, for reference later
		HashMap<String,String> verticesMap = new HashMap<String,String>();
		for (int i = 0; i < verticesOfFirst.size(); i++) {
			verticesMap.put(verticesOfFirst.get(i).id,verticesOfFirst.get(i).name);
		}
		for (int i = 0; i < verticesOfSecond.size(); i++) {
			verticesMap.put(verticesOfSecond.get(i).id,verticesOfSecond.get(i).name);
		}
		
		ArrayList<Edge> edgesOfFirst = finalModel.files.get(0).models.get(0).edges;
		JSONObject json = new JSONObject();
		JSONArray paths = new JSONArray();
	
		for (int i = 0; i < edgesOfFirst.size(); i++) {
			JSONObject path = new JSONObject();
			path.put("from", verticesMap.get(edgesOfFirst.get(i).sourceVertexId));
			path.put("to", verticesMap.get(edgesOfFirst.get(i).targetVertexId));
			path.put("edge", edgesOfFirst.get(i).name);
			paths.add(path);
		}
		
		ArrayList<Edge> edgesOfSecond = finalModel.files.get(1).models.get(0).edges;
	
		for (int i = 0; i < edgesOfSecond.size(); i++) {
			JSONObject path = new JSONObject();
			path.put("from", verticesMap.get(edgesOfSecond.get(i).sourceVertexId));
			path.put("to", verticesMap.get(edgesOfSecond.get(i).targetVertexId));
			path.put("edge", edgesOfSecond.get(i).name);
			paths.add(path);
		}

	
		json.put("paths", paths);
			
		return json;
	}

}
