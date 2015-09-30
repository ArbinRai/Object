package com.Arbin;

public class ITECCourseManager {



    public static void main(String[] args) {
        ITECCourse maintenanceCourse = new ITECCourse("Microcomputer Systems Maintenance",1310,20);
        //maintenanceCourse.name = "Microcomputer Systems Maintenance";
        //maintenanceCourse.code = 1310;
        //maintenanceCourse.maxStudents = 20;

        //Add some students.
        //TODO check that we have not exceeded the max number for the class

        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");

        maintenanceCourse.writeCourseInfo();


        ITECCourse datacomCourse = new ITECCourse("Data Communications",1425,30);
        //datacomCourse.name = "Data Communications";
        //datacomCourse.code = 1425;
        //datacomCourse.maxStudents = 30;

        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");

        datacomCourse.writeCourseInfo();

        ITECCourse javaProgramming=new ITECCourse("Java Programming",2445,24);
        javaProgramming.addStudent("Gus");
        javaProgramming.addStudent("Harry");
        javaProgramming.addStudent("Izzy");
        javaProgramming.writeCourseInfo();
    }
    }
