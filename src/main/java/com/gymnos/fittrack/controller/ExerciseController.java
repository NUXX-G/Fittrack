package com.gymnos.fittrack.controller;

import com.gymnos.fittrack.model.Exercise;
import com.gymnos.fittrack.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/exercises")
public class ExerciseController
{
    @Autowired
    private ExerciseService exerciseService;

    @GetMapping
    public ResponseEntity<List<Exercise>> getAllExercises()
    {
        List<Exercise> exercises = exerciseService.getAllExercises();
        return ResponseEntity.ok((exercises));
    }

    @GetMapping ("/{id}")
    public ResponseEntity<Exercise> getExerciseById(@PathVariable Long id)
    {
        Optional<Exercise> exercise = exerciseService.getExerciseById(id);
        return exercise.map((ResponseEntity::ok))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Exercise> createExercise(@RequestBody Exercise exercise)
    {
        exerciseService.createExercise(exercise);
        return ResponseEntity.status(HttpStatus.CREATED).body(exercise);
    }
}
