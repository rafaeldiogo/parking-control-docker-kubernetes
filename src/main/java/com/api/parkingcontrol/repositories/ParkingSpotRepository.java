package com.api.parkingcontrol.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.parkingcontrol.models.ParkingSpotModel;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID>{ // criado para fazer as transações com o banco de dados
	
	boolean existsByLicensePlateCar(String licensePlateCar); // declarando o metodo exists para a placa do carro
	boolean existsByParkingSpotNumber(String parkingSpotNumber); // declarando o metodo exists para o numero da vaga
	boolean existsByApartmentAndBlock(String apartment, String block); // declarando o metodo exists para o apartamento/bloco 
}
