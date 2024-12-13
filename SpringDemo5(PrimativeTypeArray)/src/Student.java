import java.util.Arrays;

public class Student {
	String[] sName;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String[] getsName() {
		return sName;
	}

	public void setsName(String[] sName) {
		this.sName = sName;
	}

	@Override
	public String toString() {
		return "Student [sName=" + Arrays.toString(sName) + "]";
	}
	
}
