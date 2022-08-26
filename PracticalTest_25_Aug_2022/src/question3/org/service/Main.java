package question3.org.service;

public class Main {

	public static void countObject(Degree[] obj) {
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		for (Object element : obj) {
			if(element.getClass().getName().equals("question3.org.service.Degree")){
				count1++;
			}
			else if(element.getClass().getName().equals("question3.org.service.UnderGraduate")){
			count2++;
			}
			else{
				count3++;
			}	
		}
		
		System.out.println("Degree Students = " +count1);
		System.out.println("Undergraduate Students = " +count2);
		System.out.println("Postgraduate Students = " +count3);	
	}
	
	public static void main(String[] args) {
		Degree harshal = new Degree();
		PostGraduate mayur = new PostGraduate();
		PostGraduate dhiraj = new PostGraduate();
		UnderGraduate raghav = new UnderGraduate();
		UnderGraduate raju = new UnderGraduate();
		
		
		Degree[] objArray = {harshal, mayur, raghav, dhiraj, raju};
		countObject(objArray);
	}
}
