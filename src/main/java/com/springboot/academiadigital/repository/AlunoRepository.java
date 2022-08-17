package com.springboot.academiadigital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.academiadigital.entity.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{
    
}
