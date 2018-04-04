Hello Callie,

I write this text file to answer the questions regarding my personality and explain some considerations about the programming exercises. Please if you have any doubt don't doubt to ask me.

 * Spent Time: I spent 90 minutes to finish both exercises. I'm really meticulous so I tried to improve each part of the code and spent all of it. But in general, in one hour I had more or less 80% of the code done. 

Personal questions:

 * What was the last thing you really geeked out about?

Last week, I was sticked with two online courses. I really love Coursera and I'm watching some videos of two impressive courses. They are "Neural Networks for Machine Learning" and "Bitcoin and Cryptocurrency Technologies". Although I don't always have time to do the assignment, They worth each second!   

 * If we were to ask your work colleagues to describe you, what would they say?

I think that they say I'm very meticulous, hard worker and friendly. But one disadvantage that I have is that sometimes I am conservative in order to perform a software refactoring. I prefer to have all the steps well-defined before start, and not regred in the middle of the process.

 * What type of language do you prefer to write complex algorithms in and why?

I worked with both Python and Java which are the most popular language today. So I know their advantages and drawbacks. Python is quite good in terms of quick development but the dynamic typing sometimes makes you feel confused. Java has a well-defined code but it has some pitfalls that you could become angry (ex. Integers caching). Therefore, I think that Java is better for complex algorithms due to the fact that its expressiveness is quite good and the wide-range of different tools.

Programming considerations:

* I decided to use Java because it's quite good language to support in a enterprise. As I mentioned, I really like both Java and Python but I know their drawbacks, and I firmly believe that Java has incredible tools to manage multiple projects.

* I used JUnit to make some unit tests to face the different parameter cases in each exercise. I consider this tool a must to have each user case working properly. Also, I used gradle which is a incredible tool for building software, and also It's easy to open in any IDE to edit. (Just in case, I love Eclipse :P) 

* I decided to use "int" instead of "Integer" class to optimize resources.

* I chose Java 8 due to the fact that it is a well-built and stable version of Java, and It's not so old. 

Considerations of Exercise 1:

* The coded function is in MergeFunction class. And some tests are in Exercise1ApplicationTests class.

* I made some unit tests to consider all the differents cases of the function. I decided it to support null values and also I defined it as static in order not to declare objects with no internal state.

* In MergeFunction.merge method, I traversed both arrays and combine each element with the lower in each position, unitl I reach the end of both. Also, I decided to return a new object in each call.

Considerations of Exercise 2:

* I considered internally represent a pin using an int value. Using that idea, the int value '124' represents the pin '0124'. I consider this to make easier the model but could be a different quite-good implementation to use string representing the whole '0124'. Anyway, I formatted the values to print it with all the 4 digits, don't worry :) 

* I decided to create random numbers between 0 to 9999 and then check if each uno of them pass all the pin rules. I used SecureRandom class to provide random uniformily numbers, and I decided to do that approach to generate a real random and filter for the conditions. 

* I considered to create a abstract class to represent a pin rule. Each of rules has its own implementation and extend from this abstract class. Also each one has this unit test considering if it is working properly. For example: FourDigitLongRule class has the responsability to check if the pin has only 4 digits of length, and FourDigitLongRuleTests check if it is working properly. I think that this idea is great if in a future someone wants to add new rules.

* PinGeneratorTests only consider to test if the batch has 1000 elements and also that doesn't have repeated values. We can check if they are valid pins, but it is not necesary considering that each rule has its own test.

* PinGenerator export only the method generateBatch which returns 1000 valid pins. To use it properly, before we have to call to the constructor. It is a good option to wrap it using a Bean of Spring Framework (if you want to use it) to avoid initialize it constantly. A Bean represents a singletons that could inject easily. Therefore it's a great solution for a middle-size projects. 

Thanks so much for this opportunity! :)

