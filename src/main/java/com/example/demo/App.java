package com.example.demo;

import com.example.demo.child.ChildConfig;
import com.example.demo.parent.ParentConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class App extends SpringBootServletInitializer {

  public static void main(String... args) {
    SpringApplication.run(App.class, args);
  }

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application
                   .parent(ParentConfig.class)
                   .child(ChildConfig.class);
  }

  //But this works
  /*@Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application
                   .sources(ParentConfig.class, ChildConfig.class);
  }*/

}
