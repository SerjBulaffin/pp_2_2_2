package web.dao;

import web.model.Car;

import java.util.List;

public interface UserDao {
    public List<Car> getCars(int count);
    public int getSize();
}
