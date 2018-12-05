package com.cg.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="query_master")
public class QueryMaster 
{
	@Id
	@Column(name="query_id")
	//@NotEmpty(message="Id cannot be Empty")
	
	private int queryId;
	@Column(name="technology")
	@NotNull(message="technology cannot be empty")
	private String technology;	
	@Column(name="query")
	@NotNull(message="query cannot be empty")
	private String query;
	@Column(name="solutions")
	private String solution;
	@Column(name="query_raised_by")
	@NotNull(message="name cannot be empty")
	private String queryGiver;
	@Column(name="solution_given_by")
	private String solutionGiver;
	
	public int getQueryId() {
		return queryId;
	}
	public void setQueryId(int queryId) {
		this.queryId = queryId;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public String getSolution() {
		return solution;
	}
	public void setSolution(String solution) {
		this.solution = solution;
	}
	public String getQueryGiver() {
		return queryGiver;
	}
	public void setQueryGiver(String queryGiver) {
		this.queryGiver = queryGiver;
	}
	public String getSolutionGiver() {
		return solutionGiver;
	}
	public void setSolutionGiver(String solutionGiver) {
		this.solutionGiver = solutionGiver;
	}
	@Override
	public String toString() {
		return "QueryMaster [queryId=" + queryId + ", technology=" + technology
				+ ", query=" + query + ", solution=" + solution
				+ ", queryGiver=" + queryGiver + ", solutionGiver="
				+ solutionGiver + "]";
	}
	public QueryMaster(int queryId, String technology, String query,
			String solution, String queryGiver, String solutionGiver) {
		super();
		this.queryId = queryId;
		this.technology = technology;
		this.query = query;
		this.solution = solution;
		this.queryGiver = queryGiver;
		this.solutionGiver = solutionGiver;
	}
	public QueryMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
