package j2ee_Container.constructorIntialization;

public class Student {
	private String name;
	private int reg_no;
	
	public Student(String name, int reg_no) {
		super();
		this.name = name;
		this.reg_no = reg_no;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getReg_no() {
		return reg_no;
	}
	public void setReg_no(int reg_no) {
		this.reg_no = reg_no;
	}
	
	

}
