package com.exercicio.sextoandar.repository;

import com.exercicio.sextoandar.entity.Imovel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImovelRepository extends JpaRepository <Imovel, Long> {
}
