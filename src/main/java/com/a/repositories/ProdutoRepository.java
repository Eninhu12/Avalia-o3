package com.a.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.a.domain.Produto;
@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Integer> {
	List<Produto> findById(int id);
}
