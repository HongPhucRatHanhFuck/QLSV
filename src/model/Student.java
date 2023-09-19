package model;

public class Student {
    private int id;
    private String name;
    private String gender;
    private double MathScore;
    private double LiratureScore;
    private double EnglishScore;
    private double pointAvg;
    private static int idIncrement = 1;


    public Student(String name, String gender, double mathScore, double liratureScore, double englishScore, double pointAvg) {
        this.id = idIncrement;
        this.name = name;
        this.gender = gender;
        this.MathScore = mathScore;
        this.LiratureScore = liratureScore;
        this.EnglishScore = englishScore;
        this.pointAvg = pointAvg;
        idIncrement++;
    }
    public Student(int id, String name, String gender, double mathScore, double liratureScore, double englishScore, double pointAvg){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.MathScore = mathScore;
        this.LiratureScore = liratureScore;
        this.EnglishScore = englishScore;
        this.pointAvg = pointAvg;
    }

    public Student(int idEdit, String name, String gender, double math, double lirature, double english) {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getMathScore() {
        return MathScore;
    }

    public void setMathScore(double mathScore) {
        MathScore = mathScore;
    }

    public double getLiratureScore() {
        return LiratureScore;
    }

    public void setLiratureScore(double liratureScore) {
        LiratureScore = liratureScore;
    }

    public double getEnglishScore() {
        return EnglishScore;
    }

    public void setEnglishScore(double englishScore) {
        EnglishScore = englishScore;
    }

    public double getPointAvg() {
        return pointAvg;
    }

    public void setPointAvg(double pointAvg) {
        this.pointAvg = pointAvg;
    }

    @Override
    public String toString() {
        return "id student: " + id + "|"+
               "Student Name: " + name + "|" +
               "Student gender: " + gender + "|" +
               "Math score student: " + MathScore + "|" +
               "Lirature score student: " + LiratureScore + "|" +
               "English score student: " + EnglishScore+ "|" +
                "Point Avg: " + pointAvg;
    }
}
