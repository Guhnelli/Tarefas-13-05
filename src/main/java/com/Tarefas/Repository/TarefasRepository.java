package com.Tarefas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Tarefas.Entity.Tarefas;

public interface TarefasRepository extends JpaRepository<Tarefas, Long> {

}
