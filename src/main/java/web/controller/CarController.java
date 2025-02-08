package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.classes.Car;
import web.classes.CarService;

import java.util.List;

@Controller
public class CarController {

    final CarService carService;

    @Autowired()
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String pageWithCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        // Получаем все машины
        List<Car> cars = carService.getCars();

        // Если count меньше 5, ограничиваем количество машин
        if (count < 5) {
            cars = cars.subList(0, count);  // Получаем только первые "count" машин
        }

        model.addAttribute("cars", cars);
        return "cars"; // возвращаем имя страницы, где будет отображен список машин
    }
}
