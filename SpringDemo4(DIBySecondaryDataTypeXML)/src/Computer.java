
public class Computer 
{
	String company;
	HardDisk hdd;
	public Computer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Computer(String company, HardDisk hdd) {
		super();
		this.company = company;
		this.hdd = hdd;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public HardDisk getHdd() {
		return hdd;
	}
	public void setHdd(HardDisk hdd) {
		this.hdd = hdd;
	}
	@Override
	public String toString() {
		return "Computer [company=" + company + ", hdd=" + hdd + "]";
	}
	
	
	
	
}
