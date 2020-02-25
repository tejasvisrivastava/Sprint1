package Repository;
import java.util.*;
import DistributorDetailsCons.Distributors;
public class DistributorRepository {
	private DistributorRepository()
	{
	}
	static Map<Integer,Distributors> distributorMap=new HashMap<Integer,Distributors>();
	static
	{
		distributorMap.put(1, new Distributors(1,"John","Kanpur","096412789"));
		distributorMap.put(2, new Distributors(2,"Tom","Kanpur","5282938738"));
		distributorMap.put(3, new Distributors(3,"Michael","Kanpur","3467856983"));
		distributorMap.put(4, new Distributors(4,"John","Kanpur","096412789"));
	}
public static Map<Integer,Distributors> get()
{
	return distributorMap;
}
}
