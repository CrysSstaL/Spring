package config;

import main.chapter_four.services.CommentService;
import main.chapter_one_three.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"main.chapter_four.services"})
public class ProjectConfig {
}
