package service;

import mapper.StudentMapper;
import model.Student;
import model.StudentExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public int insert(Student student) {
        return studentMapper.insertSelective(student);
    }

    public List<Student> select(StudentExample studentExample) {
        return studentMapper.selectByExample(studentExample);
    }
}
