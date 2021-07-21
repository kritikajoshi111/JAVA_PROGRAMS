
public class Encapsulation 
{
	 public static void main(String[] args)
	    {
	        StudentDetails obj = new StudentDetails();
	 
	        // setting values of the variables
	        obj.setName("kritika");
	        obj.setAge(23);
	        obj.setRollNo(51);
	 
	        // Displaying values of the variables
	        System.out.println("Student name: " + obj.getName());
	        System.out.println("Student age: " + obj.getAge());
	        System.out.println("Student roll: " + obj.getRollNo());
	 // Direct access of RollNo/name/age is not possible due to encapsulation System.out.println("Student roll: " + obj.getName);
	    }
}
class StudentDetails 
{
    private String Name; // private variables declared these can only be accessed by public methods of class
    private int RollNo;
    private int Age;
 
    public int getAge() 
    { 
    	return Age; 
    }
 
    public String getName() 
    { 
    	return Name;  	
    }
 
    public int getRollNo() 
    { 
    	return RollNo; 
    }

    public void setAge(int newAge) 
    { 
    	Age = newAge; 
    	}

    public void setName(String newName)
    {
        Name = newName;
    }
    
    public void setRollNo(int newRollNo) 
    { 
    	RollNo = newRollNo; 
    	}
}
 
