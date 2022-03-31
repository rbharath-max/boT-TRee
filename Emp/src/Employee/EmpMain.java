package Employee;

public class EmpMain {

	public static void main(String[] args) {
		EmpData[] empObjArr=new EmpData[4];
		EmpImpl obj =new EmpImpl();
		empObjArr[0]=new EmpData("Raj","dev",250000f,8);
		empObjArr[1]=new EmpData("Jadeja","dev",250000f,3);
		empObjArr[2]=new EmpData("Dhoni","dev",250000f,6);
		empObjArr[3]=new EmpData("Raina","dev",250000f,4);
		for(int i=0;i<4;i++)
		{
			obj.display(empObjArr[i]);
		}

		
	}	
	public void show() {
		
		System.out.println("Im show inside employee");
		// TODO Auto-generated method stub

	}

}
