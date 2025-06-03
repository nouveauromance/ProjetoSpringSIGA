package com.siga.service;

import com.siga.model.Aluno;
import com.siga.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    private final AlunoRepository repository;

    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }

    public Aluno save(Aluno aluno) {
        return repository.save(aluno);
    }

    public List<Aluno> findAll() {
        return repository.findAll();
    }

    public Aluno findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
