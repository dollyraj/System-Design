package LLD.designPatterns.behavioral.strategy;

public class StrategyMainClient {
    public static void main(String[] args) {
        GoogleMaps maps = new GoogleMaps();
        maps.findPath("A", "B", TransportMode.CAR);
    }
}

/*Homework
Rainwater trapping
Implement via strategy DP
BF->N^2,1
Op1->N,N
op2->N,1
 */
