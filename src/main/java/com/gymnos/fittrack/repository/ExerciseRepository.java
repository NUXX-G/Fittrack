package com.gymnos.fittrack.repository;

import com.gymnos.fittrack.model.Exercise;
import com.gymnos.fittrack.model.MuscleGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

import java.util.List;

@Repository
public interface ExerciseRepository extends JpaRepository<Exercise,Long>
{
    Optional<Exercise> findByName(String name);
    List<Exercise> findByMuscleGroup(MuscleGroup m);
}
