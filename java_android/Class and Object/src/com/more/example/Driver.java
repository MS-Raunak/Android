package com.more.example;

public class Driver
{
    public static void main(String[] args)
    {
        Subject subject1 = new Subject("TPG10AB", "Technical Programming 1");
        /*
        Subject subject2 = new Subject("TPG10AB", "Technical Programming 1");

        if(subject1.equals(subject2))
        {
            System.out.println("THey are the same!");
            System.out.println(subject1);
        }
         */
        Student student1 = new Student("Chuck Norris", 12381928);

        ExamPaper paper = new ExamPaper(student1, subject1, 100);
        System.out.println(paper
        );
        // System.out.println("subject code: " + paper.getSubject().getSubjectName());
        // System.out.println("Student Number: " + paper.getStudent().getStudentNumber());

    }
}
