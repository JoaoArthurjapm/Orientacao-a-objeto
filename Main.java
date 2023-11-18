import java.util.ArrayList;
import java.util.List;

class Student
{
  private String name;
  private List < Subject > subjects;

  public Student (String name)
  {
    this.name = name;
    this.subjects = new ArrayList <> ();
  }

  public void addSubject (Subject subject)
  {
    subjects.add (subject);
  }

  public void print ()
  {
    System.out.println ("Student: " + name);
  }
}

class Course
{
  private String name;
  private List < Subject > subjects;

  public Course (String name)
  {
    this.name = name;
    this.subjects = new ArrayList <> ();
  }

  public void addSubject (Subject subject)
  {
    subjects.add (subject);
  }

  public void print ()
  {
    System.out.println ("Course: " + name);
  }
}

class Professor
{
  private String name;
  private List < Subject > subjects;

  public Professor (String name)
  {
    this.name = name;
    this.subjects = new ArrayList <> ();
  }

  public void addSubject (Subject subject)
  {
    subjects.add (subject);
  }

  public void print ()
  {
    System.out.println ("Professor: " + name);
  }
}

class Subject
{
  private String name;
  private List < Student > students;
  private List < Course > courses;
  private Professor professor;

  public Subject (String name, Professor professor)
  {
    this.name = name;
    this.professor = professor;
    this.students = new ArrayList <> ();
    this.courses = new ArrayList <> ();
  }

  public void addStudent (Student student)
  {
    students.add (student);
  }

  public void addCourse (Course course)
  {
    courses.add (course);
  }

  public void print ()
  {
    System.out.println ("Subject: " + name);
  }
}

public class Main
{
  public static void main (String[]args)
  {
    Student student01 = new Student ("Joao");
    Course course01 = new Course ("Arquitetura");
    Professor professor01 = new Professor ("Hially");
    Subject subject01 = new Subject ("Object-Oriented Programming", professor01);

    student01.addSubject (subject01);
    course01.addSubject (subject01);
    professor01.addSubject (subject01);
    subject01.addStudent (student01);
    subject01.addCourse (course01);

    student01.print ();
    course01.print ();
    professor01.print ();
    subject01.print ();
  }
}

