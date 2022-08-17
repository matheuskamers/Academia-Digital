package com.springboot.academiadigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.academiadigital.entity.Aluno;
import com.springboot.academiadigital.entity.Matricula;
import com.springboot.academiadigital.entity.form.MatriculaForm;
import com.springboot.academiadigital.repository.AlunoRepository;
import com.springboot.academiadigital.repository.MatriculaRepository;
import com.springboot.academiadigital.service.IMatriculaService;

public class MatriculaServiceImpl implements IMatriculaService {

    @Autowired
    private MatriculaRepository repository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public Matricula create(MatriculaForm form) {
        Matricula matricula = new Matricula();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        matricula.setAluno(aluno);

        return repository.save(matricula);
    }

    @Override
    public Matricula get(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Matricula> getAll() {
        return repository.findAll();
    }

    @Override
    public void delete(Long id) {
        
    }
    
}
