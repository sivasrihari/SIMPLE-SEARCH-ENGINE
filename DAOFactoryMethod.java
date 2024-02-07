package in.ineuron.Factory;

import in.ineuron.DAO.DataAccessingLayer;
public class DAOFactoryMethod {

	public DAOFactoryMethod() 
	{
		System.out.println("DAO fact");

	}
	public DataAccessingLayer getDAo()
	{
		DataAccessingLayer d=null;
		if(d==null)
			d=new DataAccessingLayer();
		return d;
	}

}
