import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

// Authors: Stephen Kistler, Sarah McCabe
public class ScoreTrakker {
	private ArrayList<Student> studentList = new ArrayList<Student>();

	public ScoreTrakker() {
	}

	//reads in student data from file and stores student objects in ArrayList
	public void loadDataFromFile(String file){
		File scores = new File(file);
		try {
			Scanner in = new Scanner(scores);
			while(in.hasNextLine()) {
				String name = in.nextLine();
				int score = in.nextInt();
				Student s = new Student(name, score);
				studentList.add(s);
			}
		}
		catch(FileNotFoundException e) {	
			e.printStackTrace();
		}
	}

	//sort and print ArrayList - needs to sort using loop and compareTo
	public void printInOrder() {
		System.out.println("Student Score List");
		Collections.sort(studentList);
		for(Student s : studentList) {
			System.out.println(s.toString());
		}
	}

	//call loadDataFromFile method (pass in correct file) and call printInOrder
	public void processFiles(String file) {
		loadDataFromFile("scores.txt");
		printInOrder();
	}

	//creates new ScoreTrakker and calls processFiles
	public void main() {
		ScoreTrakker scoreTrakker = new ScoreTrakker();
		processFiles("scores.txt");
	}

}
