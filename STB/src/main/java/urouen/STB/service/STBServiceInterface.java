package urouen.STB.service;

import java.util.List;

import urouen.STB.model.StbType;

public interface STBServiceInterface {

	
	boolean addStb(StbType stb);
	List<StbType> getStbs();
	List<StbType> searchStbById(int id) ;
}
