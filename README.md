# ScalaSTM Usage Examples

The Maven POM file was taken mostly from a
[Dzone tutorial](https://dzone.com/articles/scala-in-java-maven-project)
by [Alexey Zvolinskiy](https://dzone.com/users/1123737/Alex_Zvolinskiy.html).

It's a good tutorial, and I recommend reading through it!
I'm a Scala n00b, and I went through the the tutorial in hopes of
getting a better understanding of how to integrate Scala into a
Java project.

The ScalaSTM examples are from the
[https://nbronson.github.io/scala-stm/](ScalaSTM Site). More specific links
to their sources can be found at the top of each file in the comments.

## Running the Examples

- The `Runner.main()` method is a very basic proof-of-concept to show
  how a class created with ScalaSTM can be imported into and used in a Java
  project.
- The `RealityShowPhilosophers.main()` method shows concurrency in action!
  It uses five threads to simulate and observe five philosophers eating
  and thinking concurrently.
