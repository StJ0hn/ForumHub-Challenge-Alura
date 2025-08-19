package com.forumhub.forumhub.controller;

import com.forumhub.forumhub.dto.DadosCadastroTopico;
import com.forumhub.forumhub.model.Curso;
import com.forumhub.forumhub.model.Topico;
import com.forumhub.forumhub.model.Usuario;
import com.forumhub.forumhub.repository.CursoRepository;
import com.forumhub.forumhub.repository.TopicoRepository;
import com.forumhub.forumhub.repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private CursoRepository cursoRepository;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroTopico dados) {
        // Busca o autor e o curso no banco de dados pelos IDs recebidos
        Usuario autor = usuarioRepository.getReferenceById(dados.autorId());
        Curso curso = cursoRepository.getReferenceById(dados.cursoId());

        // Cria a entidade Topico com os dados do DTO e as entidades encontradas
        Topico topico = new Topico(dados, autor, curso);

        // Salva no banco de dados
        topicoRepository.save(topico);

        return ResponseEntity.ok().build(); // Retorna um 200 OK simples por enquanto
    }
}