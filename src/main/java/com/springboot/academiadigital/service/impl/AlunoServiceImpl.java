package com.springboot.academiadigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.academiadigital.entity.Aluno;
import com.springboot.academiadigital.entity.AvaliacaoFisica;
import com.springboot.academiadigital.entity.form.AlunoForm;
import com.springboot.academiadigital.entity.form.AlunoUpdateForm;
import com.springboot.academiadigital.repository.AlunoRepository;
import com.springboot.academiadigital.service.IAlunoService;

@Service
public class AlunoServiceImpl implements IAlunoService {

    @Autowired
    AlunoRepository repository;

    @Override
    public Aluno create(AlunoForm form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataDeNascimento(form.getDataDeNascimento());

        return repository.save(aluno);
    }

    @Override
    public Aluno get(Long id) {
    
        return null;
    }

    @Override
    public List<Aluno> getAll() {
       return repository.findAll();
    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
    
        return null;
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {
        Aluno aluno = repository.findById(id).get();

        return aluno.getAvaliacoes();
    }
    
}
