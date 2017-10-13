package Simon_Murtagh11170381.Student_Register;

//Import joda LocalDate to handle dates
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;


public class student {
	
	//init variables
	private String studentName;
	private String classID;
	private int StudentID;
	private LocalDate dob;
	private DateTimeFormatter format = DateTimeFormat.forPattern("dd-mm-yyyy");

	
	//Constructor
	public student(String Name, int StudentID, String ClassID, String dob) 
	{
		
		setStudentID(StudentID);
		this.dob = format.parseLocalDate(dob);
		setClassID(ClassID);
		setstudentName(Name);
	
		
	}
	


	//to string method to print all details of student object
	public String toString(){
		return "Student Name: " + this.studentName + " "  + "ClassID: " + this.classID + " "  + "StudentID: " + 
				this.StudentID + " "  + "Date Of Birth: " + dob.toString();
	}
	
	public String getUsername() {
        return this.studentName.replaceAll(" ", "") + getAge() + "\n";
        
	}
	   public String getAge() {
	        new LocalDate();
			return Integer.toString(LocalDate.now().getYear() - dob.getYear());
	}
	



	
	//Getters and Setters
	public String getstudentName() {
		return studentName;
	}

	public void setstudentName(String FirstName) {
		this.studentName = FirstName;
	}

	public String getClassID() {
		return classID;
	}

	public void setClassID(String classID) {
		this.classID = classID;
	}
	
	public void getDob(LocalDate dob) {
		this.dob = dob;
	}

	
	public int getStudentID() {
		return StudentID;
	}
	
	public void setStudentID(int studentID) {
		StudentID = studentID;
	}
	
}
//END
