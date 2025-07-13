package LLD.designPatterns.behavioral.strategy;

public class StrategyMainClient {
    public static void main(String[] args) {
        GoogleMaps maps = new GoogleMaps();
        maps.findPath("A", "B", TransportMode.CAR);
    }
}
