# EndavaTest
Endava Test

Considering the test code, it was evident that no design pattern was used and there was only one class that shared the mapping of the elements and their interactions along with their validations, as well as an explicit wait that is not recommended to use. 
For this reason the POM design pattern was used, where the code was separated by their respective packages of user_interfaces, controller, and test so that the code was maintainable and in this way to be able to organize the code.
In the user_interfaces package is the AmazonPage class where the mapping of the elements and the interactions that are made with each one of them is done, the browser is instantiated, some locators were also changed and other necessary ones were added.
In the controller package, the AmazonController class is found, where the interactions that are in the AmazonPage class are called and the validations are made and finally the tests package is found, where I have the AmazonTest class, in this class I call the controller where I made the validations. 
This is how the POM design pattern was implemented, with the Java programming language, the selenium and testNG frameworks.
