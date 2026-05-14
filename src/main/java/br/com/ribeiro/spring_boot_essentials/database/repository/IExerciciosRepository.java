package br.com.ribeiro.spring_boot_essentials.database.repository;

import br.com.ribeiro.spring_boot_essentials.database.model.ExerciciosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExerciciosRepository extends JpaRepository<ExerciciosEntity, Integer>{
}
