package com.springboot.academiadigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.academiadigital.entity.Aluno;
import com.springboot.academiadigital.entity.AvaliacaoFisica;
import com.springboot.academiadigital.entity.form.AvaliacaoFisicaForm;
import com.springboot.academiadigital.entity.form.AvaliacaoFisicaUpdateForm;
import com.springboot.academiadigital.repository.AlunoRepository;
import com.springboot.academiadigital.repository.AvaliacaoFisicaRepository;
import com.springboot.academiadigital.service.IAvaliacaoFisicaService;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService{

    @Autowired
    private AvaliacaoFisicaRepository repository;

    @Autowired
    private AlunoRepository alunoRepository;
    
    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get(); // inserir validação para ID inexistente
        
        avaliacaoFisica.setAluno(aluno);
        avaliacaoFisica.setPeso(form.getPeso());
        avaliacaoFisica.setAltura(form.getAltura());

        return repository.save(avaliacaoFisica);
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        
    }

}
