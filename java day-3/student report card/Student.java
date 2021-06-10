
public class Student{
    private String name;
    private int age;
    private String phonenumber;
    private String address;
    private int mathsmarks=90;
    private int sciencemarks=100;
    private	int englishmarks=80;
    private String email;
    
    Student(String name,String phonenumber){
        this.name=name;
        this.phonenumber=phonenumber;
        
    }
    Student(String name,String phonenumber,String email,int age,String address){
        this(name,phonenumber);
        this.email=email;
        this.age=age;
        this.address=address;
    }

    
	public int getMathsmarks() {
		return mathsmarks;
	}
	public int getSciencemarks() {
		return sciencemarks;
	}
	public int getEnglishmarks() {
		return englishmarks;
	}
	void show()
	{
        System.out.println("NAME: "+name);
        System.out.println("PH.NO. "+phonenumber);
        System.out.println("Email: "+email);
        System.out.println("Age: "+age);
        System.out.println("Address: "+address);
	}
	void calculate()
	{
		final int percentage=((mathsmarks+sciencemarks+englishmarks)/3);
		System.out.println("Percentage: "+percentage);
		if (percentage>=90){
			System.out.println("Grade is A");
		}
		else if (percentage>=70 && percentage<90){
			System.out.println("Grade is C");
		}
		else if (percentage>=60 && percentage<70){
			System.out.println("Grade is C");
		}
		else {
			System.out.println("Grade is D");
		}
	}
}


