package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.UserDaoImpl;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    @Autowired
    private UserDaoImpl userDao;


    public List<Car> getCars(int count) {
        return userDao.getCars(count);
    }

    public int getSize() {
        return userDao.getSize();
    }
}
