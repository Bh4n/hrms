package bahan.hrms.business.abstracts;

import java.util.List;

import bahan.hrms.entities.concretes.JobTitle;

public interface JobTitleService {
	List<JobTitle> getAll();
}
