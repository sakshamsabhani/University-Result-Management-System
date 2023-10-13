package com.CaseStudySpringSecurity.UniversityResult.CML;

import com.CaseStudySpringSecurity.UniversityResult.Repository.UniversityResultSpringDataJpaRepository;
import com.CaseStudySpringSecurity.UniversityResult.Result.UniversityResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UniversityResultCommandLineRunner implements CommandLineRunner {

    @Autowired
    UniversityResultSpringDataJpaRepository repository;


    @Override
    public void run(String... args) throws Exception {
        repository.save(new UniversityResult(1, "Saksham", 90, "Pass"));
        repository.save(new UniversityResult(2, "Bob", 30, "Fail"));
        repository.save(new UniversityResult(3, "Ryan", 50, "Pass"));
    }
}
