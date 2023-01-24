package com.estacionamento.be.domains.car.repositories;

import com.estacionamento.be.domains.car.entities.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}
