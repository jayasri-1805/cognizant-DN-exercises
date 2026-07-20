package com.cognizant.ormlearn;
import java.util.List;
import org.slf4j.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
@SpringBootApplication
public class OrmLearnApplication{
private static final Logger LOGGER=LoggerFactory.getLogger(OrmLearnApplication.class);
private static CountryService countryService;
public static void main(String[] args){
ApplicationContext context=SpringApplication.run(OrmLearnApplication.class,args);
countryService=context.getBean(CountryService.class);
LOGGER.info("Inside main");
testGetAllCountries();
}
private static void testGetAllCountries(){
LOGGER.info("Fetching countries");
List<Country> countries=countryService.getAllCountries();
for(Country c:countries){LOGGER.debug("{}",c);}
LOGGER.info("Completed");
}
}
