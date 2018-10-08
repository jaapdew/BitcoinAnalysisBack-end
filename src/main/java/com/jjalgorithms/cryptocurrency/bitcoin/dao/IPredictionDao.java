package com.jjalgorithms.cryptocurrency.bitcoin.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.jjalgorithms.cryptocurrency.bitcoin.model.Prediction;

public interface IPredictionDao  extends CrudRepository< Prediction, Long> {
	
	@Override
	public long count();
	
	@Override
	public List<Prediction> findAll();	
	
	
	public List<Prediction> findAllByOrderByIdAsc();	
	
	@Override
	public Optional<Prediction> findById(Long id);

	@Override
	public <S extends Prediction> S save(S s);
	
	@Override
	public <S extends Prediction> List<S> saveAll(Iterable<S> s);
	
	@Override
	public void deleteById(Long id);
		
}
