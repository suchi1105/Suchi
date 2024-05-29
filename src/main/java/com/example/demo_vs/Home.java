package com.example.demo_vs;

import org.springframework.web.bind.annotation.RestController;
//import com.google.gson.Gson;

import com.google.gson.Gson;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Home {
    
    List<List<Student>> alist= new ArrayList<>();
    List<List<Integer>> numlist= new ArrayList<>();
        

    @Autowired
    Student s;
    @RequestMapping(method = RequestMethod.GET,value="/get")
    public String getdata()
    {
        Gson gs = new Gson();
        List<Student> slist= new ArrayList<>();
        s.setStudentid(1);
        s.setStudentname("Suchi");
        s.setage(28);
       slist.add(s);
       alist.add(slist);

       String js=gs.toJson(s);
       printdata(alist);

        return js;
    }
    public void printdata(List<List<Student>> s)
    {
       
        numlist.add(Arrays.asList(1,2));
        numlist.add(Arrays.asList(3,4));
        iterateElasticWrites(numlist).subscribe(a ->);
       /*iterateElasticWrites().subscribe(a -> {
        
       
        System.out.println("size:::::::" +a.size());
        System.out.println("elemernt::::::::::;;" +a.get(0));
    
        
    });*/
}
    

   /*Mono<List<Student>> iterateElasticWrites() 
        {
        
    return Flux.fromIterable(alist).collectList();
      
    }*/

   Flux<Integer> iterateElasticWrites(List<List<Integer>> s) 
    {
    
           //return Flux.fromIterable(alist).collectList();

          

           return Flux.fromIterable(numlist).flatMap( b -> Flux.fromIterable(b));
  
}
}
