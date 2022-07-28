package com.springboot.demo1.courses.bean;

public class Course {
	private long id;
	private String name;
	private String time;
	public Course(long id, String name, String time) {
		super();
		this.id = id;
		this.name = name;
		this.time = time;
	}
	
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public String getTime() {
		return time;
	}

    @Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", time=" + time + "]";
	}
	

}
