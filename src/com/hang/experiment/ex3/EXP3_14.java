package com.hang.experiment.ex3;

public class EXP3_14 {
    public static void main(String[] args) {
        Student student1 = new Student(63012, "张三", 75, 95, 45);
        Student student2 = new Student(63012, "张三", 77, 95, 45);
        StudentXW studentxw1 = new StudentXW(63012, "张三", 75, 42, 45, "收发作业");
        StudentBZ studentbz1 = new StudentBZ(63012, "张三", 75, 75, 45, "管理");
        System.out.println(student1.testScore());
        System.out.println(student2.testScore());
        System.out.println(studentxw1.testScore());
        System.out.println(studentbz1.testScore());
    }
}

class Student {
    int num;
    String name;
    float englishScore, mathScore, computerScore, sum;

    Student() {
        this(0, null, 0.0f, 0.0f, 0.0f);
    }

    Student(int num, String name, float englishScore, float mathScore, float computerScore) {
        this.num = num;
        this.name = name;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
        this.computerScore = computerScore;
    }

    float getEnglishScore() {
        return englishScore;
    }

    float getMathScore() {
        return mathScore;
    }

    float getComputerScore() {
        return computerScore;
    }

    float getSum() {
        return sum;
    }

    float sum() {
        sum = englishScore + mathScore + computerScore;
        return sum;
    }

    void setEnglishScore(float a) {
        englishScore = a;
        sum();
    }

    void setMathScore(float a) {
        mathScore = a;
        sum();
    }

    void setComputerScore(float a) {
        computerScore = a;
        sum();
    }

    float testScore() {
        return (sum() / 3);
    }

    Student toString(Student a) {
        return a;
    }

    boolean equals(Student a) {
        if (englishScore == a.englishScore && mathScore == a.mathScore && computerScore == a.computerScore)
            return true;
        else
            return false;
    }

    String compare(Student a) {
        if (this.sum > a.sum)
            return "大于";
        else if (this.sum < a.sum)
            return "小于";
        else
            return "等于";
    }
}

class StudentXW extends Student {
    String duty;

    StudentXW(int num, String name, float englishScore, float mathScore, float computerScore, String duty) {
        super(num, name, englishScore, mathScore, computerScore);
        this.duty = duty;
    }

    float testScore() {
        return ((sum() / 3) + 3);
    }
}

class StudentBZ extends Student {
    String duty;

    StudentBZ(int num, String name, float englishScore, float mathScore, float computerScore, String duty) {
        super(num, name, englishScore, mathScore, computerScore);
        this.duty = duty;
    }

    float testScore() {
        return ((sum() / 3) + 5);
    }
}

