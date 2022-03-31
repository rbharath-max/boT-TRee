package Person;

public class PersonDriver {

	public static void main(String[] args) {
		PersonInfo obj=new PersonInfo();
		obj.fname="chan";
		obj.lname="M";
		//obj.age=10;
		obj.setAge(10);
		System.out.println("age="+obj.getAge());
		obj.show();
		//obj.display();
		
		System.out.println(obj);
		

	}

}
