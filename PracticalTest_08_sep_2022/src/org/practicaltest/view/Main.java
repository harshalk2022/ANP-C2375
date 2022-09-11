package org.practicaltest.view;
import java.util.Scanner;
import org.practicaltest.model.QuestionAnswer;
public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void displayQuestion(QuestionAnswer [] array){
		for(int i=0; i<array.length; i++) {
			if(array[i]!=null) {
				System.out.println("Question. "+array[i].getQuestion());
				System.out.println("A : "+array[i].getOption1());
				System.out.println("B : "+array[i].getOption2());
				System.out.println("C : "+array[i].getOption3());
				System.out.println("D : "+array[i].getOption4());
				
				System.out.print("Enter your Answer : ");
				String answer = sc.nextLine();
				
				if(array[i].getAnswer().equalsIgnoreCase(answer) ) {
					System.out.println("Correct");
				}else {
					System.out.println("Wrong");
				}
				System.out.println();
			}else {
				break;
			}
		}	
	}
	
	public static void main(String [] args) {
		
		QuestionAnswer [] array =  new QuestionAnswer[50];
		
		QuestionAnswer questionAnswer1=new QuestionAnswer("Choose the correct spelling of the word. ", "Separate", "Separete", "Soperate", "Saperate", "Separate");
		QuestionAnswer questionAnswer2=new QuestionAnswer("Choose the correct spelling of the word. ", "Amatuer", "Amature", "Amateur", "Ameteur", "Amateur");
		QuestionAnswer questionAnswer3=new QuestionAnswer("Choose the correct spelling of the word. ", "Servent", "Sarvent", "Servant", "Sarvant", "Servant");
		QuestionAnswer questionAnswer4=new QuestionAnswer("Choose the correct spelling of the word. ", "Comittee", "Commitee", "Committee", "Committey", "Committee");
		QuestionAnswer questionAnswer5=new QuestionAnswer("Choose the correct spelling of the word. ", "Shakespear", "Shakespeare", "Shakspiear", "Shakespear", "Shakespeare");

		array[0]=questionAnswer1;
		array[1]=questionAnswer2;
		array[2]=questionAnswer3;
		array[3]=questionAnswer4;
		array[4]=questionAnswer5;

		displayQuestion(array);
	}
}
