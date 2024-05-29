package com.example.demo_vs;

import org.apache.logging.log4j.message.StructuredDataMessage;
import org.springframework.stereotype.Component;

@Component
public class Student {

        private int studentid;
        private String studentname;
        private Integer age;
    

        Student()
        {
            super();
        }
        Student(int studentid,String studentname,int age)
        {
                this.studentid=studentid;
                this.studentname=studentname;
                this.age=age;
        }
    
        public String toString()
        {
            return this.getStudentname() + " " + this.getStudentid() + " " + this.getAge();
        }
    
        public void setStudentid(int studentid)
        {
            this.studentid=studentid;
        }
    
        public void setStudentname(String studentname)
        {
            this.studentname=studentname;
        }
        
        public void setage(int age)
        {
            this.age=age;
        }
    
        public int getStudentid()
        {
            return this.studentid;
        }
    
        public int getAge()
        {
            return this.age;
        }
    
        public String getStudentname()
        {
            return this.studentname;
        }
    }
