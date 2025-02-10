package web.service;

import web.classes.Car;

import java.util.List;

public interface CarService {
    void addCar(Car car);  // добавление машины
    List<Car> getCars(int count);  // получение машин
}
