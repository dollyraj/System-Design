package LLD.designPatterns.creational.builder.productionised;

public class Student {
    private int id;
    private String name;
    private double psp;
    private int age;
    private String batch;
    private String universityName;
    private int gradYear;
    private String phoneNumber;

    public Student(int id, String name, double psp, int age, String batch, String universityName, int gradYear, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.psp = psp;
        this.age = age;
        this.batch = batch;
        this.universityName = universityName;
        this.gradYear = gradYear;
        this.phoneNumber = phoneNumber;
    }

    public static Builder builder(){
        return new Builder();
    }

    //inner classes
    //will be used only for validation-->not required for any other operation so, we will remove getters
    public static class Builder {
        private int id;
        private String name;
        private double psp;
        private int age;
        private String batch;
        private String universityName;
        private int gradYear;
        private String phoneNumber;

        public Builder(){}

        //Return StudentHelper for setters
        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder psp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder batch(String batch) {
            this.batch = batch;
            return this;
        }

        public Builder universityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public Builder gradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        private void validate(){
            if(this.age<18){
              throw new InvalidAgeException("Age must be atLeast 18");
            }
            if(this.gradYear>2025){
                throw new InvalidGradYearException("Grad Year must be 2025 or earlier");
            }
            if(this.name==null || this.name.isEmpty() || this.name.isBlank()){
                throw new InvalidNameException("Name cannot be empty");
            }
        }

        public Student build(){
            validate();
            return new Student(this.id,this.name,this.psp,this.age,this.batch,this.universityName,this.gradYear,this.phoneNumber);
        }
    }
}
