package example

import org.mockito.{ArgumentMatchersSugar, IdiomaticMockito}
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class MainSpec extends AnyFreeSpec with Matchers with IdiomaticMockito with ArgumentMatchersSugar {
  //Note, the compilation error occurs when the mock is declared at the top level of the Spec
  //If the mock is declared inside the test, all is well.
  val helloServer = mock[HelloServer]

  "Hello.run should call Server.sayHello once" in {
    val mockResponse = "Goodbye, whoever you are!"
    helloServer.sayHello(*) shouldReturn mockResponse
    val hello = new Hello(helloServer)

    hello.greeting shouldBe s"$mockResponse"

    helloServer.sayHello("world") wasCalled once
    helloServer wasNever calledAgain
  }
}
