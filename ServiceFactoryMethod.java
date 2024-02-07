package in.ineuron.Factory;

import in.ineuron.service.*;
public class ServiceFactoryMethod {

	public ServiceFactoryMethod() 
	{
		System.out.println("service fact");

	}
	public IService getServiceDAo()
	{
		IService d=null;
		if(d==null)
			d=new ServiceImpl();
		return d;
	}
}
