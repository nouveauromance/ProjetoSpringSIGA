package com.siga.controller;

import com.siga.model.Aluno;
import com.siga.service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class ControllerAluno {

    private final AlunoService alunoService;

    public ControllerAluno(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    // listar todos os alunos
    @GetMapping
    public List<Aluno> listarAlunos() {
        return alunoService.listarTodos();
    }

    // buscar aluno por ID
    @GetMapping("/{id}")
    public Aluno buscarAlunoPorId(@PathVariable Long id) {
        return alunoService.buscarPorId(id);
    }

    // criar novo aluno
    @PostMapping
    public Aluno criarAluno(@RequestBody Aluno aluno) {
        return alunoService.salvar(aluno);
    }

    // atualizar aluno existente
    @PutMapping("/{id}")
    public Aluno atualizarAluno(@PathVariable Long id, @RequestBody Aluno aluno) {
        return alunoService.atualizar(id, aluno);
    }

    // deletar aluno por ID
    @DeleteMapping("/{id}")
    public void deletarAluno(@PathVariable Long id) {
        alunoService.deletar(id);
    }
}