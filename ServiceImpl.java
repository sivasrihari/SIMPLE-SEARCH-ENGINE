package in.ineuron.service;

import java.util.List;

import in.ineuron.DAO.DataAccessingLayer;
import in.ineuron.DTO.row;
import in.ineuron.Factory.DAOFactoryMethod;

public class ServiceImpl implements IService {

	DataAccessingLayer d=null;
	DAOFactoryMethod f=null;
	public ServiceImpl() {
		// TODO Auto-generated constructor stub
		f=new DAOFactoryMethod();
		d=f.getDAo();
	}
	
	@Override
	public List<row> searchDatabase(String keyword) {
		// TODO Auto-generated method stub
		System.out.println(f);
		System.out.println(d);

		return d.searchDatabase(keyword);
		
	}
	@Override
	public String saveUserAndKeyword(String keyword, String user,Integer userid) {
	
		return d.saveUserAndKeyword(keyword,user,userid);
	}

}
