package web.dao;

import web.classes.Car;

import java.util.List;

public interface CarDao {
    void add(Car car);  // добавление машины
    List<Car> getCars(int count);  // получение списка машин
}
