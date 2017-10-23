package com.dm.app.datatopic.statistis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.dm.app.datatopic.statistis.service.TjZynzwbzmjJclService;
@Service
public class TjZynzwbzmjJclServiceImpl implements TjZynzwbzmjJclService {
	@Autowired
	protected MongoTemplate mongoTemplate;
	
	public List findAll(Class entityClass) {
		
		Query query = new Query();
		return mongoTemplate.find(query, entityClass);
	}

}
