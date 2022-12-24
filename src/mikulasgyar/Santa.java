package mikulasgyar;

import java.util.*;

public class Santa {
    List<Toy> bag;
    List<String> children;

    public void addToyToBag(Factory factory, String color, int size){
        int random = (int) (Math.random() * 2);
        switch (random) {
            case 0: {
                bag.add(factory.produce(color, size));
            }break;
            case 1: {
                bag.add(factory.produce(color));
            }break;
        }
    }

    public void bringToChildren(List<String> children){
        while (bag.size() == 0 || children.isEmpty()) {

        }
    }
}
