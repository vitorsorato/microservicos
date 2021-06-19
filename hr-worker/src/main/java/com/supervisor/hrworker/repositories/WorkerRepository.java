package com.supervisor.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.supervisor.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
