package DistributorDetailsCons;


	public class Distributors {
		
		   //public static final String Orderid = null;
		 private int distributorId;
		   private String distributorName;
		   private String address;
		   private String phoneNumber;
		   

		   public Distributors(int DistributorId, String DistributorName, String PhoneNumber, String Address){
		      this.distributorId = distributorId;
		      this.distributorName = distributorName;
		      this.address = address;
		      this.phoneNumber = phoneNumber;
		   }
		   public int getDistributorId() {
			      return distributorId  ;
			   }

			   public void setDistributorId(int getdistributorId) {
			      this.distributorId = getdistributorId;
			   }

		   public String getDistributorName() {
		      return distributorName;
		   }

		   public void setDistributorName(String getdistributorName) {
		      this.distributorName = getdistributorName;
		   }

		 
		   
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber)	{
			this.phoneNumber = phoneNumber;
		}
		}

