# Java-Scala Integration Example

All the code in this example project was taken from a
[Dzone tutorial](https://dzone.com/articles/scala-in-java-maven-project)
by [Alexey Zvolinskiy](https://dzone.com/users/1123737/Alex_Zvolinskiy.html).
The tutorial was from 2016, so there were some slight updates
that needed to be made to make it work in the current version
of scala in 2018. I didn't see the example code posted in
[Zvolinskiy's GitHub account](https://github.com/Fruzenshtein),
so I'm posting it here as an example of working code for
me to reference in the future. I hope he doesn't mind!

It's a good tutorial, and I recommend reading through it!
I'm a Scala n00b, and I went through the the tutorial in hopes of
getting a better understanding of how to integrate Scala into a
Java project. The result was having a main Scala project/runnable
that pulls in Java code.

The next step was to go the other direction:
to have a java project/runnable that pulls in Scala code. That is,
I'd like the *bulk* of my project to be Java, with a small subset
of Scala inserted into the project. The end-goal is to use
[ScalaSTM](https://nbronson.github.io/scala-stm/) in a mostly Java
project.

To that effect, I modified the java Runner class to pull in the
BooksProcessor that was written in Scala. It works! A more elegant
solution could be written, but this at least serves as a proof of
concept.
