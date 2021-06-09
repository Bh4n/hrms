package bahan.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import bahan.hrms.entities.concretes.JobTitle;

public interface JobTitleDao  extends JpaRepository<JobTitle, Integer>{

}
