package com.company.service;

import org.springframework.stereotype.Service;

import com.company.vo.ApiRequest;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ApiService{
	public String testApi(ApiRequest req) {
		log.debug("API is hit");
		return "API HIT MESSAGE: " + req.getReq() ;
	}

}
