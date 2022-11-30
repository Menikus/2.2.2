package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

public interface CarService {

    void add(Car car);

    List<Car> listCar();

    List<Car> getSomeCar(int count, List<Car> allCar);


}
