package com.CaseStudySpringSecurity.UniversityResult.Repository;

import com.CaseStudySpringSecurity.UniversityResult.Result.UniversityResult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversityResultSpringDataJpaRepository extends JpaRepository<UniversityResult, Integer> {
}
