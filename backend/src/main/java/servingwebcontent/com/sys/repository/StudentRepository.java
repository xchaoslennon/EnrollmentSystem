package servingwebcontent.com.sys.repository;

import servingwebcontent.com.sys.entity.Student;
import servingwebcontent.com.sys.entity.StudentKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, StudentKey>
{
    Student findByAccountNumberAndPassword(String accountNumber,String password);
}
