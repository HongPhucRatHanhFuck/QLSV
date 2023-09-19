package view;

import manager.StudentManager;
import model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuStudent {
    StudentManager studentManager = new StudentManager();
    Scanner inputInt = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);

    public void showMainMenu() {

        int choice;
        do {
            System.out.println("=== Menu Student Manager === " +
                    "\n1.Add student" +
                    "\n2.Delete student" +
                    "\n3.Edit student" +
                    "\n4.Find student by id" +
                    "\n5.Find student word" +
                    "\n6.Find Student AVG max" +
                    "\n7.Show all" +
                    "\n0.OUT");
            System.out.println("Enter your option: ");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    showMenuAdd();
                    break;
                case 2:
                    showMenuDelete();
                    break;
                case 3:
                    showMenuEdit();
                    break;
                case 4:
                    showMenuSearchById();
                    break;
                case 5:
                    showFindWordStudent();
                case 6:
                    showMaxAvg();
                    break;
                case 7:
                    showAll();
                    break;
            }

        } while (choice != 0);
    }

    public void showMenuAdd() {
        System.out.println("=== Here is menu add new: ===");
        System.out.println("Add id: ");
        int id = inputInt.nextInt();
        System.out.println("Enter your student: ");
        String name = inputString.nextLine();
        System.out.println("Enter gender student: ");
        String gender = inputString.nextLine();
        System.out.println("Enter math score: ");
        double math = inputInt.nextDouble();
        System.out.println("Enter lirature score: ");
        double lirature = inputInt.nextDouble();
        System.out.println("Enter math score: ");
        double english = inputInt.nextDouble();
        double pointAvg = (math + lirature + english) / 3;
        Student student = new Student(id, name, gender, math, lirature, english, pointAvg);
        studentManager.add(student);
        System.out.println("===> add complete");
    }

    public void showAll() {
        System.out.println("List student is: ");
        ArrayList<Student> list = studentManager.findAll();
        for (Student student : list) {
            System.out.println(student);
        }
    }

    public void showMenuEdit() {
        System.out.println("=== Menu edit ===");
        System.out.println("Enter id edit: ");
        int idEdit = inputInt.nextInt();
        System.out.println("Enter your student: ");
        String name = inputString.nextLine();
        System.out.println("Enter gender student: ");
        String gender = inputString.nextLine();
        System.out.println("Enter math score: ");
        double math = inputInt.nextDouble();
        System.out.println("Enter lirature score: ");
        double lirature = inputInt.nextDouble();
        System.out.println("Enter math score: ");
        double english = inputInt.nextDouble();
        Student newStudent = new Student(idEdit, name, gender, math, lirature, english);
        studentManager.update(idEdit, newStudent);
        System.out.println("====> Edit complete");
    }

    public void showMenuDelete() {
        System.out.println("=== Delete student by id ===");
        System.out.println("Enter id: ");
        int idDelete = inputInt.nextInt();
        studentManager.delete(idDelete);
        System.out.println("=>>>>>> Delete complete");
    }

    public void showMenuSearchById() {
        System.out.println("=== Search by id ===");
        System.out.println("Enter id find student: ");
        int id = inputInt.nextInt();
        ArrayList<Student> list = studentManager.findAll();
        int index = studentManager.findIndexById(id);
        System.out.println(list.get(index));
    }
    public void showFindWordStudent(){
        System.out.println("=== Search student by word ===");
        System.out.println("Enter word find student");
        String word = inputString.nextLine();
        ArrayList<Student>list = studentManager.findAll();
        ArrayList<Student>newList = new ArrayList<>();
        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i).getName().toLowerCase().contains(word.toLowerCase())){
                newList.add(list.get(i));
            }
        }
        System.out.println("List student has word: " + word + "is: " );
        for (Student student: newList){
            System.out.println(student);
        }
    }

    public String showMaxAvg() {
        System.out.println("=== Show student has max AVG ");
        ArrayList<Student> list = studentManager.findAll();
        double max = list.get(0).getPointAvg();
        int index = -1;
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getPointAvg() > max) {
                max = list.get(i).getPointAvg();
                index = i;
            }
        }
        return "Student has max AVG: " + max + "student is: " + list.get(index).getName();
    }
}

