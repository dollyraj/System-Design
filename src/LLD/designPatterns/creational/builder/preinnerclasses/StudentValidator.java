package LLD.designPatterns.creational.builder.preinnerclasses;

public class StudentValidator {

    public static boolean validate(StudentHelper studentHelper){

        return validateAge(studentHelper.getAge())
                && validateGradYear(studentHelper.getGradYear())
                && validateName(studentHelper.getName())
                && validatePhoneNumber(studentHelper.getPhoneNumber());
    }

    private static boolean validateAge(int age){
          if(age<18){
              return false;
          }else{
              return true;
          }
    }

    private static boolean validateGradYear(int gradYear){
            if(gradYear<2025){
                return false;
            }else{
                return true;
            }
    }

    private static boolean validateName(String name){
           if(name==null || name.isEmpty()){
               return false;
           }else{
               return true;
           }
    }

    private static boolean validatePhoneNumber(String phoneNumber){
              if(phoneNumber.isEmpty() || phoneNumber.length()!=10){
                  return false;
              }else{
                  return true;
              }
    }
}
