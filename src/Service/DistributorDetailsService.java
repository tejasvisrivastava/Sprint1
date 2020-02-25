package Service;
import Access_Details.DistributorDetails;
import Exception.NoDataFoundException;

import java.util.*;
public class DistributorDetailsService
{
	DistributorDetails distributorDaoObj=new DistributorDetails();
	List<Integer>IdList=new ArrayList<Integer>();
	public List<Integer> getId()
	{
		IdList=distributorDaoObj.getIds();
		return IdList;
	}
	public String getDistributorDetails(Integer orderId) throws NoDataFoundException
	{
		String result = null;
		for(Integer i:IdList)
		{
			if(i.equals(orderId))
			{
				result= distributorDaoObj.getDistributorDetails(orderId);
			}
			
		}
		if(result==null)
		{
			throw new NoDataFoundException("not valid id");
		}
		else
		{
			return result;
		}
	}
}