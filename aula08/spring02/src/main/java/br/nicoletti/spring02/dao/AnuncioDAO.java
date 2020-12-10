package br.nicoletti.spring02.dao;

import org.springframework.data.repository.CrudRepository;

import br.nicoletti.spring02.model.Anuncio;

//CRUD - Creat Read Update Delete
public interface AnuncioDAO extends CrudRepository<Anuncio, Integer>{
    public Anuncio findById(int id);

}
