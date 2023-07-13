package projectB;

//----------------------------------------------------
//Project
//Project B
//Written by : Linlin Xie 2343895, Qingjun Bao 2398022, Zhi Li 0645750, 
//----------------------------------------------------
public class Employee {

	private String name;
	private int id;
	private Date hiredDate;
	private String position;
	
	public Employee(String name, int id, Date hiredDate, String position) {
		this.name = name;
		this.id = id;
		this.hiredDate = hiredDate;
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getHiredDate() {
		return hiredDate;
	}

	public void setHiredDate(Date hiredDate) {
		this.hiredDate = hiredDate;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return name + "       " + id + "      " + hiredDate.toString() + "       " + position;
	}
	
	
	
	
}
