// Authors: Stephen Kistler, Sarah McCabe
// Throws clause purpose: 

// Part 1: need to use student compareTo to sort, not sort function in printInOrder()


import java.util.ArrayList; 
import java.util.Collections;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class ScoreTrakker {
	private ArrayList<Student> studentList = new ArrayList<Student>();
	private String[] files = {"scores.txt","badscore.txt","nofile.txt"};

	//reads in student data from file and stores student objects in ArrayList
	public void loadDataFromFile(String file) throws FileNotFoundException{
		studentList.clear();
		File scores = new File(file);
		try {
			Scanner in = new Scanner(scores);
			while(in.hasNextLine()) {
				String name = in.nextLine();
				String scoreStr = in.nextLine();
				try {
					int score = Integer.parseInt(scoreStr);
					Student s = new Student(name, score);
					studentList.add(s);
				}
				catch(NumberFormatException e) {
					System.out.println("Incorrect format for " + name + " not a valid score: " + scoreStr + "\n");
				}
			}
			in.close();
		}
		finally {
			if(file == null) {
				processFiles();
			}
		}
	}

	//sort and print ArrayList
	public void printInOrder() {
		System.out.println("Student Score List");
		ArrayList<Student> sorted = new ArrayList<Student>();
		sorted.clear();
		
		int index = 0;
		while(studentList.size() > 0){
			index = 0;
			for(int j = index; j < studentList.size(); j++){
				if(studentList.get(index).compareTo(studentList.get(j)) > 0){
					index = j;
				}
			}
			Student s = studentList.get(index);
			studentList.remove(index);
			sorted.add(s);
		}
		
		for(Student s : sorted) {
			System.out.println(s.toString());
		}
		System.out.println(" ");
	}

	//call loadDataFromFile method (pass in correct file) and call printInOrder
	public void processFiles() /*throws FileNotFoundException*/{
		for (int i = 0; i < 3; i++) {
			try {
				loadDataFromFile(files[i]);
				printInOrder();
			}
			catch(FileNotFoundException e) {	
				System.out.println("Can't open file: " + files[i] + "\n");
			} 
		}
	}

	//creates new ScoreTrakker and calls processFiles
	public static void main(String[] args) throws FileNotFoundException {
		ScoreTrakker scoreTrakker = new ScoreTrakker();
		scoreTrakker.processFiles();
	}

}
