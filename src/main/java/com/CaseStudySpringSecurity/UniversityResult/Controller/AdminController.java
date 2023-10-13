package com.CaseStudySpringSecurity.UniversityResult.Controller;

import com.CaseStudySpringSecurity.UniversityResult.Repository.UniversityResultSpringDataJpaRepository;
import com.CaseStudySpringSecurity.UniversityResult.Result.UniversityResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AdminController {

    @Autowired
    private UniversityResultSpringDataJpaRepository repository;

    @GetMapping("/user/result/{id}")
    public Optional<UniversityResult> getResult(@PathVariable int id) {
        return repository.findById(id);
    }

    @GetMapping("/admin/results")
    public List<UniversityResult> getAllResults() {
        return repository.findAll();
    }

    @PostMapping("/admin/results/add")
    public void addResult(@RequestBody UniversityResult result) {
        repository.save(result);
    }

    @PostMapping("/admin/results/update")
    public void updateResult(@RequestBody UniversityResult result) {
        repository.save(result);
    }

    @DeleteMapping("/admin/results/delete/{id}")
    public void deleteResult(@PathVariable int id) {
        repository.deleteById(id);
    }


}
