package com.estacionamento.be.domains.car.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity(name = "carro")
public class Carro {
    @Id @GeneratedValue
    private Long id;

    @Column
    String placa;

    @Column
    String modelo;

    @Column
    String cor;

    public Carro() {}

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Carro carro)) return false;
        return getId().equals(carro.getId()) && getPlaca().equals(carro.getPlaca()) && Objects.equals(getModelo(), carro.getModelo()) && Objects.equals(getCor(), carro.getCor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getPlaca(), getModelo(), getCor());
    }

    @Override
    public String toString() {
        return "Carro{" +
                "id=" + id +
                ", placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}
