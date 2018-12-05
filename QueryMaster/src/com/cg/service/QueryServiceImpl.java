package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.QueryDao;
import com.cg.dto.QueryMaster;

@Service("service")

public class QueryServiceImpl implements QueryService
{
	@Autowired
	QueryDao dao;
	@Override
	public boolean save(QueryMaster queryId) {
		
		return dao.save(queryId);
	}

	@Override
	public QueryMaster findOne(int queryId) {
		
		return dao.findOne(queryId);
	}

	@Override
	public List<QueryMaster> getQuery() {
		
		return dao.getQuery();
	}

	@Override
	public QueryMaster updateQuery(QueryMaster queryMaster) {
		
		return dao.updateQuery(queryMaster);
	}
	
}
