package Simon_Murtagh11170381.Student_Register;

//import array list to handle students in class
import java.util.ArrayList;

public class module {

	//init variables
	private String ModuleName;
	private static String ModuleID;
	private   ArrayList<student> Students = new ArrayList<student>();
	

	//Constructor
	public module(String name, String id ) 
	{
		
		setModuleName(name);
		setModuleID(id);
		
	}
	
	//Method to add students to modules. Stored in Array List
	public void addStudent(student e){
		this.getStudents().add(e);
		return ;
		
	}
	
	//to String method  for printing module name
	public String toString()
	{
		return "Module Name: " + this.ModuleName + "  Module ID: " + module.ModuleID;
	}
	
	//Method for printing Module Detials
	public Object listModuleDetails()
	{
		
		System.out.println(toString());
		System.out.println("Registered Students:");
		for (int i=0; i< getStudents().size(); i++){
			System.out.println(getStudents().get(i));
	}
		return "\n";
	}

	
	
	
	//Getters and Setters
	public String getModuleName() {
		return ModuleName;
	}

	public void setModuleName(String moduleName) {
		ModuleName = moduleName;
	}

	public static String getModuleID(int i) {
		return ModuleID;
	}

	public void setModuleID(String moduleID) {
		ModuleID = moduleID;
	}

	public ArrayList<student> getStudents() {
		return Students;
	}

	public void setStudents(ArrayList<student> students) {
		Students = students;
	}
}
//END