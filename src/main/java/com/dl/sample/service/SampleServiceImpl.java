package com.dl.sample.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.dl.sample.controller.HomeController;
import com.dl.sample.dao.SampleDAO;;
 
@Service("sampleService")
public class SampleServiceImpl implements SampleService{
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Resource(name="sampleDAO")
    private SampleDAO sampleDAO;
	
	@Override
	public List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception {
		return sampleDAO.selectBoardList(map);
	}
 
}