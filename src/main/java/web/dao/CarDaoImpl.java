package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Repository
public class CarDaoImpl implements CarDao {

    private List<Car> carList = new ArrayList<>();


    @Override
    public void add(Car car) {
        carList.add(car);
    }

    @Override
    public List<Car> listCar() {
        return carList;
    }

    @Override
    public List<Car> getSomeCar(int count, List<Car> allCar) {
        return (count >= 5) ? allCar : allCar.subList(0, count);
    }
}
