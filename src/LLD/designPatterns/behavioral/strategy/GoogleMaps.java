package LLD.designPatterns.behavioral.strategy;

public class GoogleMaps {
    public void findPath(String source, String destination, TransportMode mode){

        //using factory method to create PathCalculator object based on mode
        PathCalculator pc = PathCalculatorFactory.getPathCalculator(mode);
        pc.findPath(source, destination);
    }
}
