package com.henriquelavor.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henriquelavor.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
