package Simon_Murtagh11170381.Student_Register;

//Imports
import java.util.ArrayList;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class program {
	
	//init variables
	private String CourseName;
	private String CourseID;
	private LocalDate startDate,endDate;
	private DateTimeFormatter format = DateTimeFormat.forPattern("dd-mm-yyyy");
	private ArrayList<module> Modules = new ArrayList<module>();

	
	//Constructor
	public program(String name,String id,module mod, String startDate, String endDate) 
	{
		setCourseName(name);
		setCourseID(id);
		this.startDate = this.format.parseLocalDate(startDate);
		this.endDate = this.format.parseLocalDate(endDate);
		
	}
	

	//method to add module to program
	public void addModule(module e){
		this.Modules.add(e);
		return ;
		
	}
	
	//toString method for printing program name	
	public String toString(){
		return "Course Name: " + this.CourseName + "\nCourse ID: " + this.CourseID
				+ "\nStart Date: " + this.startDate + "\nEnd Date: " + this.endDate;
	}
	
	//List all program details including Modules
	public Object listDetails()
	{
		System.out.println(toString());
		System.out.println("Contains Modules:");
		for (int i=0; i< Modules.size(); i++){
			System.out.println(Modules.get(i));
	}
		return "\n";
	}



	//Getters and Setters
	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public LocalDate getstartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getendDate() {
		return endDate;
	}

	public void setendDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	

	public String getCourseID() {
		return CourseID;
	}

	public void setCourseID(String ID) {
		CourseID = ID;
	}


}
//END