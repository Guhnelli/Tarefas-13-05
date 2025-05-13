package com.Tarefas.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Tarefas.Entity.Tarefas;
import com.Tarefas.Repository.TarefasRepository;



@Service

public class TarefasService {
	
	private final TarefasRepository tarefasRepository;// vincula com o repository

	@Autowired
	public TarefasService(TarefasRepository tarefasRepository) {
		this.tarefasRepository = tarefasRepository;
	}// até aqui vincula com o repository
	
	public List<Tarefas> buscaTodosTarefas() {
		return tarefasRepository.findAll();
	}

	public Tarefas buscaTarefasId(Long id) {
		Optional<Tarefas> Tarefas = tarefasRepository.findById(id);
		return Tarefas.orElse(null);
	}
	

	public Tarefas salvaTarefas(Tarefas Tarefas) {
		return tarefasRepository.save(Tarefas);
	}

	public Tarefas alterarTarefas(Long id, Tarefas alterarT) {
		Optional<Tarefas> existeTarefas = tarefasRepository.findById(id);
		if (existeTarefas.isPresent()) {
			alterarT.setId(id);
			return tarefasRepository.save(alterarT);
		}
		return null;
	}
	
	public boolean apagarTarefas(Long id) {
		Optional<Tarefas> existeTarefas = tarefasRepository.findById(id);
		if (existeTarefas.isPresent()) {
			tarefasRepository.deleteById(id);
			return true;
		}
		return false;
	}

	
	


}
