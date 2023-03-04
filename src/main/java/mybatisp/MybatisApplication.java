package mybatisp;

import mybatisp.entity.Student;
import mybatisp.mapper.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MybatisApplication {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        SpringApplication.run(MybatisApplication.class, args);

        Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sqlSessionFactory.openSession();

        // create student mapper
        StudentMapper studentMapper = session.getMapper(StudentMapper.class);

        // insert student
        Student student = new Student("Duc4", "java", 90, 1234567, "duchm@gmail.com");
        studentMapper.insert(student);
        session.commit();
        System.out.println("insert sucessfully");

        // show list student
        List<Student> listStudents = studentMapper.getAll();
        for (Student st : listStudents) {
            System.out.println(st.toString());
        }

        // get student by Id
        System.out.println("enter id to get: ");
        int id = sc.nextInt();
        Student student1 = studentMapper.getById(id);
        if (student1 == null) {
            System.out.println("id does not exist");
        } else {
            System.out.println("Student with id = " + id + ": " + student1);
        }

        // update student
        Student student2 = studentMapper.getById(12);
        if (student2 == null) {
            System.out.println("id does not exist");
        } else {
            student2.setName("Abc");
            student2.setPhone(123);
            studentMapper.update(student2);
            session.commit();
            System.out.println("update sucessfully");
            System.out.println("after updated: " + studentMapper.getById(12));
        }

        // delete student
        Student student3 = studentMapper.getById(20);
        if (student3 == null) {
            System.out.println("id does not exist");
        } else {
            studentMapper.delete(20);
            session.commit();
            System.out.println("delete successfully");
        }

        // close session
        session.close();

    }

}
