package com.a.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.a.domain.Insumo;
@Repository
public interface InsumoRepository extends JpaRepository<Insumo, Integer> {
	List<Insumo> findById(int id);
}
