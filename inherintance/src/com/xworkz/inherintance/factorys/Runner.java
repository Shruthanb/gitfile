package com.xworkz.inherintance.factorys;

import com.xworkz.inherintance.factorys.factory.Factory;

public class Runner {
    public static void main(String[] args) {
        Factory cf = new Factory();
        cf.produceGoods();
    }
}
