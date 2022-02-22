package entities;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExamRepository extends MongoRepository<Exam, String> {
	Exam findByExamId(String examId);

}
