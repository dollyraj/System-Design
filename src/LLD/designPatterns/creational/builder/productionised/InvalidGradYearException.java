package LLD.designPatterns.creational.builder.productionised;

public class InvalidGradYearException extends RuntimeException{

    public InvalidGradYearException() {
    }

    public InvalidGradYearException(String message) {
        super(message);
    }

    public InvalidGradYearException(String message, Throwable cause) {
        super(message, cause);
    }
}
