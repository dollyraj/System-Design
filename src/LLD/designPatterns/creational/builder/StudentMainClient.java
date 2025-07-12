package LLD.designPatterns.creational.builder;

import LLD.designPatterns.creational.builder.preinnerclasses.StudentHelper;
import LLD.designPatterns.creational.builder.preinnerclasses.StudentValidator;
import LLD.designPatterns.creational.builder.productionised.Student;

public class StudentMainClient {
    public static void main(String[] args) {

        //Pre inner classes
        /*StudentHelper studentHelper=new StudentHelper(1,"Taposhi",99,25,"Sandeep's Batch","ACD University",2022,"1234567890");
        boolean isvalid= StudentValidator.validate(studentHelper);

        Student student=null;

        if(isvalid){
            student=new Student(studentHelper);
        }

         */

        //Productionised
        //Student.builder()//returns empty object of StudentHelper
        Student student=Student.builder()
                .id(1)
                .name("Dheeraj")
                .age(23)
                .gradYear(2024)
                .universityName("ABCD")
                .psp(99)
                .batch("Sandeep's Batch")
                .phoneNumber("1234567890")
                .build();

    }
}

/*
1. Moved the StudentHelper-->Builder class as a static inner class inside student
2.Removed all getters from StudentsHelper as its only for validation and will not be used anywhere else in the code
3.Since, we do not have getters and setters,we only have setters,we do not need to put prefix names like setId()
only id(),age()... will suffice
4.Put all the validations inside StudentHelper class with a method called validate
5.Created a method called build()->which would return Student object post validation
6.Add a static method in Student to get StudentHelper Object
7.Follow->
   Classname obj=Classname.builder()
                 .attr1()
                 .attr2()
                 .attr3()
                 .attr4()
                 .build()

 */
