package com.cg.frs.service;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.frs.dao.FlatRegistrationDAOImpl;
import com.cg.frs.dao.IFlatRegistrationDAO;
import com.cg.frs.dto.FlatRegistrationDTO;
import com.cg.frs.exception.ClientException;

public class FlatRegistrationServiceImpl implements IFlatRegistrationService {
	IFlatRegistrationDAO frdao = null;
	public FlatRegistrationServiceImpl(){
		frdao = new FlatRegistrationDAOImpl();
	}
	@Override
	public FlatRegistrationDTO registerFlat(FlatRegistrationDTO flat) {
		// TODO Auto-generated method stub
		return frdao.registerFlat(flat);
	}

	@Override
	public ArrayList<Integer> getAllOwnerIds() {
		// TODO Auto-generated method stub
		return frdao.getAllOwnerIds();
	}

	
	

	@Override
	public boolean validateFlatArea(int a)throws ClientException {
		// TODO Auto-generated method stub
		Integer input = new Integer(a);
		String s = input.toString();
		String ptr = "[1-9]{3}";
		if(Pattern.matches(ptr, s)){
			return true;
		}
		else{
			throw new ClientException("invalid flat area");
		}
	}

	@Override
	public boolean validateRent(double rent) throws ClientException{
		// TODO Auto-generated method stub
		Double input = new Double(rent);
		String s = input.toString();
		String dgtptr = "\\d{4,9}\\.\\d{0,4}";
		if(Pattern.matches(dgtptr, s)){
			return true;
		}
		else{
			throw new ClientException("invalid rent");
		}
		
	}

	@Override
	public boolean validateDeposit(double amount)throws ClientException {
		// TODO Auto-generated method stub
		Double input = new Double(amount);
		String s = input.toString();
		String dgtptr = "\\d{4,9}\\.\\d{0,4}";
		if(Pattern.matches(dgtptr, s))
		{
			return true;
		}
		else{
			throw new ClientException("invalid deposit");
		}
	}
	@Override
	public boolean amountVerifcation(int rent,int deposit) {
		if(rent<deposit){
			return true;
		}
		else{
			return false;
		}
	}

}
