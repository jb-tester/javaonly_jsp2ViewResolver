package com.mytests.springmvc.javaonly.jspViewRes.configs;

import com.mytests.springmvc.javaonly.jspViewRes.controllers.MyController1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/5/2016.
 * Project: havaonly_JSPViewResolvers
 * Variant1: class extends WebMvcConfigurerAdapter,
 * view resolver is configured as @Bean-annotated method of ViewResolver type
 * *******************************
 */
/*@Configuration
@EnableWebMvc
//@ComponentScan(basePackageClasses = MyController1.class)
@ComponentScan("com.mytests.springmvc.javaonly.jspViewRes.controllers")

public class WebConfig extends WebMvcConfigurerAdapter
{
    public static final String PREFIX = "/WEB-INF/myViews/";
    public static final String SUFFIX = ".jsp";

    @Bean

    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        //viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix(PREFIX);
        viewResolver.setSuffix(SUFFIX);
        return viewResolver;
    }
}*/
/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/5/2016.
 * Project: havaonly_JSPViewResolvers
 * Variant2: class extends WebMvcConfigurerAdapter,
 * view resolver is configured by configureViewResolvers() method overriding
 * *******************************
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = MyController1.class)
public class WebConfig extends WebMvcConfigurerAdapter
{

    public static final String PREFIX = "/WEB-INF/myViews/";
    public static final String SUFFIX = ".jsp";

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp(PREFIX, SUFFIX);
        super.configureViewResolvers(registry);
    }


}
/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/5/2016.
 * Project: havaonly_JSPViewResolvers
 * Variant3: class extends WebMvcConfigurationSupport,
 * view resolver is configured by configureViewResolvers() method overriding
 * *******************************
 */

/*@Configuration
@ComponentScan(basePackageClasses = MyController1.class)
public class WebConfig extends WebMvcConfigurationSupport
{
    public static final String PREFIX = "/WEB-INF/myViews/";
    public static final String SUFFIX = ".jsp";
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp(PREFIX,SUFFIX);
        super.configureViewResolvers(registry);
    }

}*/
