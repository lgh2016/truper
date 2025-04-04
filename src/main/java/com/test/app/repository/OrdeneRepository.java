package com.test.app.repository;

import com.test.app.entity.Ordene;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdeneRepository extends JpaRepository<Ordene, Integer> {
}