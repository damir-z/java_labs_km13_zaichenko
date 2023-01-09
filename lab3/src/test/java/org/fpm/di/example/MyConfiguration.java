package org.fpm.di.example;

import org.fpm.di.Binder;
import org.fpm.di.Configuration;
import org.fpm.di.example.myExample.*;

public class MyConfiguration implements Configuration {
    @Override
    public void configure(Binder binder) {
        binder.bind(MySingleton.class);
        binder.bind(MyPrototype.class);

        binder.bind(UseA.class);

        binder.bind(A.class, B.class);
        binder.bind(B.class, new B());

        //-----------------------------

        binder.bind(Brand.class);
        binder.bind(CarBrands.class);
        binder.bind(Sedan.class);

        binder.bind(SportsCar.class, Ford.class);
        binder.bind(Marketplace.class);
        binder.bind(Garage.class, CarDealer.class);
    }
}
