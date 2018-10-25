package com.cg.frs.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.cg.frs.dto.FlatRegistrationDTO;



public class CollectionUtil {
      private  static ArrayList<Integer> ids = new ArrayList<Integer>();
      private static ArrayList<Object> flatDetails = new ArrayList<Object>();
      
      
      public static boolean addFlatDetails(FlatRegistrationDTO dto){
    	  return flatDetails.add(dto);
		
      }
      
}
