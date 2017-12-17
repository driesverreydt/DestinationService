package com.travelagency.destinationservice.service;

import java.util.Map;

import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.DestinationInfo;

@Produces(APPLICATION_JSON)
@RestController
public class DestinationService {
Map<String,DestinationInfo> destinationInfos;
	
	public DestinationService(){
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
