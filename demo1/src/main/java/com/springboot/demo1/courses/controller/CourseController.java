package com.springboot.demo1.courses.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo1.courses.bean.Course;

@RestController
public class CourseController {
@GetMapping("/courses")
public List<Course> getAllCorses(){
	return Arrays.asList(new Course(1, "Learn singboot", "in1hour"));
}
}
