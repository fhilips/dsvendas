package com.dev.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
