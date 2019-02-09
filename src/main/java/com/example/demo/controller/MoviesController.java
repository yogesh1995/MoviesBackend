package com.example.demo.controller;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MoviesController {

	@CrossOrigin(*)
	@RequestMapping("/getAllMovies")
	public @ResponseBody String getAllMovies(){
		  JSONParser jsonParser = new JSONParser();
	        try 
	        {
	        	InputStream is = getClass().getResourceAsStream("moviesInfo.json");
	        	Reader reader = new InputStreamReader(is);
	        	
	            Object obj = jsonParser.parse(reader);
	            JSONArray movieList = (JSONArray) obj;
	            return movieList.toString();
	 
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
			return null; 
		
	}
}
