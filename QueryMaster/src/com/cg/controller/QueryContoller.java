package com.cg.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.dto.QueryMaster;
import com.cg.service.QueryService;

@Controller
public class QueryContoller 
{
	@Autowired
	QueryService queSer;
	@RequestMapping(value="run",method=RequestMethod.GET)
	public String sayHello(@ModelAttribute("queryid")QueryMaster query,BindingResult result)
	{
		return "SearchQuery";
	}
	@RequestMapping(value="searchQu",method=RequestMethod.POST)
	public ModelAndView updateQuery(@ModelAttribute("queryid")QueryMaster queryMaster,Model model,BindingResult result )
	{
		QueryMaster query=queSer.findOne(queryMaster.getQueryId());	
		if(query!=null)
		{
		 model.addAttribute("solutionGiver",( new String[] { "Uma", "Rahul", "Kavita", "Hema" }));		
		return new ModelAndView("Success","q",query);
		}
		else return new ModelAndView("Failed");
		
	}
	@RequestMapping(value="update",method=RequestMethod.POST)
	public ModelAndView showSuccess(@ModelAttribute("updatesuccess")QueryMaster queryMaster)
	{
		String ans=queryMaster.getSolution();
		queryMaster.setSolution(ans);
		QueryMaster qM=queSer.updateQuery(queryMaster);
		return new ModelAndView("SuccessPage","qr",qM);
	}
}
