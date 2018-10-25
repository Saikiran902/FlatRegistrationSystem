package com.cg.frs.service;

import java.util.ArrayList;

import com.cg.frs.dto.FlatRegistrationDTO;
import com.cg.frs.exception.ClientException;

public interface IFlatRegistrationService {
	FlatRegistrationDTO registerFlat(FlatRegistrationDTO flat);
    ArrayList<Integer> getAllOwnerIds();
    
    public boolean validateFlatArea(int a)throws ClientException;
    public boolean validateRent(double rent)throws ClientException;
    public boolean validateDeposit(double amount)throws ClientException;
    public boolean amountVerifcation(int rent, int deposit);
	
}
