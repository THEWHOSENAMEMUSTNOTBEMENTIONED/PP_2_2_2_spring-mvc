package web.classes;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//создал общий интерфейс и пометил сервисом, он для методов добавления
// и возврата всех машин
@Service
public interface CarService {
    public void addCar(Car car,int car_numbers);
    List<Car> getCars();
}
