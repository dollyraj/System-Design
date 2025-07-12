package LLD.designPatterns.creational.Prototype;

public class PrototypeMainClient {

    public static void main(String[] args) {
        //batch1prototype
        Student batch1prototype=new Student();
        batch1prototype.setBatchName("Batch 1");
        batch1prototype.setBatchId(1);
        batch1prototype.setInstructorName("Sandeep");
        batch1prototype.setModule("LLD");
        batch1prototype.setSchedule("MWF Evening");
        batch1prototype.setBatchPsp(56.45);
        batch1prototype.setBatchAttendance(78);

        //batch2prototype
        Student batch2prototype=new Student();
        batch2prototype.setBatchName("Batch 2");
        batch2prototype.setBatchId(2);
        batch2prototype.setInstructorName("Aditya");
        batch2prototype.setModule("LLD");
        batch2prototype.setSchedule("TTS Evening");
        batch2prototype.setBatchPsp(60.45);
        batch2prototype.setBatchAttendance(80);

        Registry<Student> studentRegistry=new Registry<>();
        studentRegistry.add("Batch 1",batch1prototype);
        studentRegistry.add("Batch 2",batch2prototype);

        //add student
        Student Milan=batch1prototype.copy();
        Milan.setName("Milan");
        Milan.setId(1);
        Milan.setContactDetails("12345678");
        Milan.setPsp(90);

        //add student
        Student Hrushikesh=batch1prototype.copy();
        Hrushikesh.setName("Hrushikesh");
        Hrushikesh.setId(2);
        Hrushikesh.setContactDetails("12345679");
        Hrushikesh.setPsp(80);

        //create student of batch 2
        //add student
        Student Ranjan=batch2prototype.copy();
        Ranjan.setName("Ranjan");
        Ranjan.setId(1);
        Ranjan.setContactDetails("12345678");
        Ranjan.setPsp(90);

        //add student
        Student Vibha=batch2prototype.copy();
        Vibha.setName("Vibha");
        Vibha.setId(2);
        Vibha.setContactDetails("12345679");
        Vibha.setPsp(80);


    }
}

//if we update prototype, changes will not reflect in older objects
