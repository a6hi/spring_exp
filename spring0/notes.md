##can't generate bean name
org.springframework.beans.factory.parsing.BeanDefinitionParsingException: Configuration problem: Unnamed bean definition specifies neither 
- 'class' 	
- 'parent' 
- 'factory-bean' 


Main intension of providing bean definition of a class, is that instance of that class is maintained by Spring, i.e should be available for DI.

First let us try by providing class property for the bean definition.
