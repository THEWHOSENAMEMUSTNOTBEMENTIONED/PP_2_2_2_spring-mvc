package web.dao;

import org.springframework.stereotype.Repository;
import web.classes.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private final List<Car> cars;

    public CarDaoImpl() {
        this.cars = new ArrayList<>();
        // Пример добавления нескольких машин
        cars.add(new Car("Mazda", "G8", "black"));
        cars.add(new Car("Volkswagen", "x7", "red"));
        cars.add(new Car("Nissan", "T6", "blue"));
        cars.add(new Car("Toyota", "RAF-4", "black"));
        cars.add(new Car("Honda", "S3", "yellow"));
    }

    @Override
    public void add(Car car) {
        cars.add(car);
    }

    @Override
    public List<Car> getCars(int count) {
        // Ограничиваем список машин до "count"
        return cars.size() > count ? cars.subList(0, count) : cars;
    }
}
