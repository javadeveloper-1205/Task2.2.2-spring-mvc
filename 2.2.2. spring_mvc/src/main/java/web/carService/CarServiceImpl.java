package web.carService;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import sun.jvm.hotspot.utilities.Assert;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Service
public class CarServiceImpl {
    List<Car> list;

    {
        list = new ArrayList<>();
        list.add(new Car((long) 1, "Honda", 2015));
        list.add(new Car((long) 2, "Kia", 2016));
        list.add(new Car((long) 3, "BMW", 2017));
        list.add(new Car((long) 4, "Mersedes", 2018));
        list.add(new Car((long) 5, "Subaru", 2019));
    }



            public List<Car> numbers(Integer count) {
                List<Car> listCars = new ArrayList<>();
                if (count == null) {
                    return list;
                }
                for (int i = 0; i < count; i++) {
                    if (count >= 5) {
                        return list;
                    } else {
                        listCars.add(list.get(i));
                    }
                }
                return listCars;
            }
        }

