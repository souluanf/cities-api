package dev.luanfernandes.states.repositories;

import dev.luanfernandes.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
