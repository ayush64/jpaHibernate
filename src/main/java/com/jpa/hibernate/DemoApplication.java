package com.jpa.hibernate;

import com.jpa.hibernate.entity.Course;
import com.jpa.hibernate.repository.CourseRepository;
import com.jpa.hibernate.repository.EmployeeRepository;
import com.jpa.hibernate.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

   @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private EmployeeRepository employeeRepository;


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Course course = courseRepository.findById(10001L);
//        courseRepository.delete(10001L);
//        courseRepository.save(new Course("Microservices in 100 Steps"));
        //studentRepository.saveStudentWithPassport();
        //repository.playWithEntityManager();
        //courseRepository.addHardcodedReviewsForCourse();
//        List<Review> reviews = new ArrayList<>();
//
//        reviews.add(new Review("5", "Great Hands-on Stuff."));
//        reviews.add(new Review("5", "Hats off."));
//
//        courseRepository.addReviewsForCourse(10003L, reviews );
    }
}
