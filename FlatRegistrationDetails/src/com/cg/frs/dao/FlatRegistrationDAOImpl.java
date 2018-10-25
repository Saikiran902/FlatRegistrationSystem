package com.cg.frs.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.cg.frs.dto.FlatRegistrationDTO;

public class FlatRegistrationDAOImpl implements IFlatRegistrationDAO {
	ArrayList<Integer> ids=  new ArrayList<Integer>();
	CollectionUtil colUtil = new CollectionUtil();
	public FlatRegistrationDAOImpl(){
		
	}
//	FlatRegistrationDTO dto;
	private ArrayList<FlatRegistrationDTO> flatDetails = new ArrayList<FlatRegistrationDTO>();
	@Override
	public FlatRegistrationDTO registerFlat(FlatRegistrationDTO flat) {
		// TODO Auto-generated method stub
		int id = (int)(1000*Math.random());
		flat.setId(id);
//		boolean b = CollectionUtil.addFlatDetails(flat);
	 flatDetails.add(flat);
//	 System.out.println(flat);
	 
		return flat;
	}

	@Override
	public ArrayList<Integer> getAllOwnerIds() {
		// TODO Auto-generated method stub
		ids.add(1);
		ids.add(2);
		ids.add(3);
		return ids;
	}

}
