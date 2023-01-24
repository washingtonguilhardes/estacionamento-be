package com.estacionamento.be.domains.car.controllers;

import com.estacionamento.be.domains.car.dtos.NewCarDto;
import com.estacionamento.be.domains.car.entities.Carro;

import java.util.List;

public interface ICarController {
    List<Carro> obterTodos();
    Object obterPorId(Integer id);

    Object adicionarNovo(NewCarDto car);
    Object atualizar(Integer id, NewCarDto carToUpdate);

    Object remover(Integer id);
}
