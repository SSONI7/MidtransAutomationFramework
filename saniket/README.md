This is the small framework design to midtrans testcases

In this project we have three packages given below:-
1. Basepage
2. Testcase
3. Util

in Util package we have created the class for browser selection this package is for common utilities used in the framework.
after that we have basepage package in which we use PageFactory(POM) design for pages to identify all the web element.
and also created the methods used on that page which further used in the testcases.
Now last is testcase package. In this package we have testcases and common class. In common class we use TestNG annontations so that
we know which method is going to run next and its easy for the compiler to identify the errors.
We extend the testcase class with the common class and we create the object of the basepages too. So that we can call the method of basepage.

