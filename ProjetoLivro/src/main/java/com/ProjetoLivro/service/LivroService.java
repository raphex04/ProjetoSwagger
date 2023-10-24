package com.ProjetoLivro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjetoLivro.entities.Livro;
import com.ProjetoLivro.repository.LivroRepository;
@Service
public class LivroService {
	private final LivroRepository livroRepository;
	
	@Autowired
	public LivroService(LivroRepository livroRepository) {
		this.livroRepository = livroRepository;
	}
	public List<Livro> buscaTodosLivro(){
		return livroRepository.findAll();
	}
	public Livro buscaLivroId(Long id) {
		Optional<Livro> Livro = livroRepository.findById(id);
		return Livro.orElse(null);
	}
	public Livro salvaLivro(Livro livro) {
		return livroRepository.save(livro);
	}
	public Livro alterarLivro(Long id, Livro alterarLivro) {
		Optional <Livro> existeLivro = livroRepository.findById(id);
		if(existeLivro.isPresent()) {
			alterarLivro.setId(id);
			return livroRepository.save(alterarLivro);
		}
		return null;
	}
	public boolean apagarLivro(Long id) {
		Optional <Livro> existeLivro = livroRepository.findById(id);
		if (existeLivro.isPresent()) {
			livroRepository.deleteById(id);
			return true;
		}
		return false;
	}
}