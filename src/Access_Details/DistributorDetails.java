package Access_Details;
import java.util.*;
import DistributorDetailsCons.Distributors;
import Repository.DistributorRepository;
public class DistributorDetails {
	Map<Integer,Distributors> repositoryMap;
	//constructor
	public DistributorDetails()
	{
		repositoryMap=DistributorRepository.get();
		
	}
// this function get the order ids and return list
	public List<Integer> getIds()
	{
		List<Integer> orderIdList = new ArrayList<Integer>();
		for(Map.Entry<Integer, Distributors> obj:repositoryMap.entrySet())
		{
			orderIdList.add(obj.getKey());
		}
		return orderIdList;
	}
	//this function give the result by validating the id
	public String getDistributorDetails(Integer id)
	{
		String result = null;
		for(Map.Entry<Integer, Distributors> obj:repositoryMap.entrySet())
		{
			if(obj.getKey().equals(id))
			{
				result=obj.getValue().getDistributorId()+"\n"+obj.getValue().getDistributorName()+"\n"+obj.getValue().getAddress()+"\n"+obj.getValue().getPhoneNumber();
			}
		}
		return result;
	}
}
