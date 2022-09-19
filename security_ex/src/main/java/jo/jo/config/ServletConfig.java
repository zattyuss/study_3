package jo.jo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import jo.jo.RootConfig;

@EnableWebMvc
@ComponentScan(basePackageClasses = {RootConfig.class})
public class ServletConfig implements WebMvcConfigurer{

	@Override
	   public void configureViewResolvers(ViewResolverRegistry registry) {
	      registry.jsp("/WEB-INF/views/", ".jsp");
	      
	   }
}
