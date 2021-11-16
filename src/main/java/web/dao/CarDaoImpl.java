package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao {
    private List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("Bmw X5", 3.5, 2017));
        carList.add(new Car("Mersedes Benz s200", 2.4, 2010));
        carList.add(new Car("Hyundai Solaris", 1.8, 2016));
        carList.add(new Car("Vaz 2101", 1.3, 1978));
        carList.add(new Car("Nissan Murano", 3.5, 2014));
    }

    public List<Car> getCars(int count) {
        if (count > carList.size() || count < 0)
            return carList;
        return carList.stream().limit(count).collect(Collectors.toList());
    }

    public int getSize() {
        return carList.size();
    }
}
