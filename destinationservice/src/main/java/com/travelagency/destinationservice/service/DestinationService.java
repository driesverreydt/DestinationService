package com.travelagency.destinationservice.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.DestinationInfo;

@RestController
public class DestinationService {
Map<String,DestinationInfo> destinationInfos;
	
	public DestinationService(){
		destinationInfos = new HashMap<String,DestinationInfo>();
		initDestinationInfos();
	}
	
	private void initDestinationInfos(){
		destinationInfos.put("balen", new DestinationInfo("balen", 2490, "dorpje in de Kempen"));
		destinationInfos.put("leuven", new DestinationInfo("leuven", 3000, "studentenstad"));
	}
	
	@RequestMapping("/info/{city}")
	public DestinationInfo getDestinationInfo(@PathVariable String city){
		return destinationInfos.get(city);
	}
}
