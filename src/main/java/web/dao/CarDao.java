package web.dao;

import web.model.Car;

import java.util.List;


public interface CarDao {


    void add(Car car);

    List<Car> listCar();

    List<Car> getSomeCar(int count, List<Car> allCar);





}
