package config;

import main.chapter_four.services.CommentService;
import main.chapter_one_three.Parrot;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = {"main.chapter_six"})
@EnableAspectJAutoProxy
public class ProjectConfig {
}
