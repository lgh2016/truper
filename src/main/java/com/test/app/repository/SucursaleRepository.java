package com.test.app.repository;

import com.test.app.entity.Sucursale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SucursaleRepository extends JpaRepository<Sucursale, Integer> {
}