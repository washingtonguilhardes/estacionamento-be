package com.estacionamento.be.domains.car.controllers;

import com.estacionamento.be.domains.car.dtos.NewCarDto;
import com.estacionamento.be.domains.car.entities.Carro;
import com.estacionamento.be.domains.car.services.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController implements ICarController {

    private  final CarService carService;
    public CarController(CarService carService){
        this.carService = carService;
    }

    @Override
    public Object adicionarNovo(NewCarDto car) {
        return null;
    }

    @Override
    public Object atualizar(Integer id, NewCarDto carToUpdate) {
        return null;
    }
    @Override
    @GetMapping("/car/all")
    public List<Carro> obterTodos() {
        return carService.obterTodos();
    }

    @Override
    public Object obterPorId(Integer id) {
        return null;
    }

    @Override
    public Object remover(Integer id) {
        return null;
    }

}
