package com.a.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.a.domain.MateriaPrima;
@Repository
public interface MateriaPrimaRepository extends JpaRepository<MateriaPrima,Integer> {
	List<MateriaPrima>findById(int id);
}
