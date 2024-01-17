package config;

import main.chapter_four.services.CommentService;
import main.chapter_one_three.Parrot;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = {"main.chapter_four.services", "main.chapter_four.repositories"})
public class ProjectConfig {
}
