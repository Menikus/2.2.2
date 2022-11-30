package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final CarDao carDao;

    {
        carDao = new CarDaoImpl();

        carDao.add((new Car("Audi",5,"Oleg")));
        carDao.add((new Car("BMW",3,"Ivan")));
        carDao.add((new Car("Mers",7,"Petr")));
        carDao.add((new Car("BMW",5,"Semen")));
    }


    @Override
    public void add(Car car) {
        carDao.add(car);
    }

    @Override
    public List<Car> listCar() {
        return carDao.listCar();
    }

    @Override
    public List<Car> getSomeCar(int count, List<Car> allCar) {
        return carDao.getSomeCar(count, allCar);
    }
}
