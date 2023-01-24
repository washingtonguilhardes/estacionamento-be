package com.estacionamento.be.domains.car.services;

import com.estacionamento.be.domains.car.entities.Carro;
import com.estacionamento.be.domains.car.repositories.CarroRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service()
public class CarService {

    private  final CarroRepository carroRepository;
    public CarService(CarroRepository carroRepository){
        this.carroRepository = carroRepository;
    }

    public List<Carro> obterTodos(){
       return this.carroRepository.findAll();
    }
}
