package com.gymnos.fittrack.service;

import com.gymnos.fittrack.model.Exercise;
import com.gymnos.fittrack.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExerciseService
{
    @Autowired
    private ExerciseRepository exerciseRepository;

    public List<Exercise> getAllExercises()
    {
        return exerciseRepository.findAll();
    }

    public Optional<Exercise> getExerciseById(Long id)
    {
        return exerciseRepository.findById(id);
    }

    public void createExercise(Exercise exercise)
    {
        exerciseRepository.save(exercise);
    }
}
