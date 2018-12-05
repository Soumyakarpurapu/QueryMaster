package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dto.QueryMaster;

@Repository("dao")
@Transactional
public class QueryDaoImpl implements QueryDao
{
	@PersistenceContext
	EntityManager manager;

	@Override
	public boolean save(QueryMaster queryId) {
		if(queryId!=null)
		{
			manager.persist(queryId);
			manager.flush();
			return true;
		}
		return false;
	}

	@Override
	public QueryMaster findOne(int queryId) {
		Query queryOne=manager.createQuery("From QueryMaster");
		List<QueryMaster> QM=queryOne.getResultList();
		for(QueryMaster query1:QM)
		{
			if(query1.getQueryId()==queryId)
			{
				QueryMaster query=manager.find(QueryMaster.class, queryId);
				return query;
			}
		}
		return null;
		
	}

	@Override
	public List<QueryMaster> getQuery() {
		Query queryOne= manager.createQuery("FROM query_master");
		List<QueryMaster> myList=queryOne.getResultList();
		return myList;
	}

	@Override
	public QueryMaster updateQuery(QueryMaster queryMaster) {
		QueryMaster qryMas=manager.merge(queryMaster);
		manager.flush();
		return qryMas;
	}
	
}
