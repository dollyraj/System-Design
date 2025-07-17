package LLD.designPatterns.observer;

import LLD.designPatterns.creational.Singleton.SingletonMultiThreaded;

import java.util.ArrayList;
import java.util.List;

//publisher
public class OrderService {
//   // need to make singleton
//    private List<OrderPlacedSubscriber> orderPlacedSubscribers;
//
//    public OrderService() {
//        this.orderPlacedSubscribers = new ArrayList<>();
//    }

    private static OrderService instance = null;

    private List<OrderPlacedSubscriber> orderPlacedSubscribers;

    private OrderService() {
        this.orderPlacedSubscribers = new ArrayList<>();
    }

    public static OrderService getInstance() {
        if (instance == null) {
            synchronized (OrderService.class) {
                if (instance == null) {
                    instance = new OrderService();
                }
            }
        }
        return instance;
    }

    public void placeOrder() {
        //order being placed -- business logic
        for (OrderPlacedSubscriber orderPlacedSubscriber : orderPlacedSubscribers) {
            orderPlacedSubscriber.orderPlaceAction();
        }
    }

    public void add(OrderPlacedSubscriber orderPlacedSubscriber) {
        orderPlacedSubscribers.add(orderPlacedSubscriber);
    }

    public void remove(OrderPlacedSubscriber orderPlacedSubscriber) {
        orderPlacedSubscribers.remove(orderPlacedSubscriber);
    }
}


/*
    Youtube -> create channels -> upload Videos
    -- validate the video
    -- figure out the language and captions creation
    -- encode video in different formats
    -- update feed for youtube

    Solve this with observer design pattern
 */