package web.classes;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


//просто реализую интерфейс на классе и добавляю 5 машин в список
@Service
public class CarServiceImpl implements CarService {

    ArrayList<Car> cars = new ArrayList<>();

    public CarServiceImpl() {
        cars.add(new Car("Mazda", "G8", "black"));
        cars.add(new Car("Volkswagen", "x7", "red"));
        cars.add(new Car("Nissan", "T6", "blue"));
        cars.add(new Car("Toyota", "RAF-4", "black"));
        cars.add(new Car("Honda", "S3", "yellow"));
    }


    @Override
    public void addCar(Car car, int car_numbers) {
        cars.add(car);
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }



}
