package example

class HelloServer {
  def sayHello(name: String): String = s"Hello, $name!"
}

class Hello(server: HelloServer) {
  def greeting: String = server.sayHello("world")
}

object Main extends App {
  val server = new HelloServer
  val hello = new Hello(server)
  println(hello.greeting)
}

