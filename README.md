# Either
This is a sample app to show the handling of checked exceptions which may occure during stream processing

'Either' Type Introduction
--------------------------
This type of Object is derived from scala.Either type. It can be used to represent a value which is either correct or an error.

Refer [Exception Handling in Java Streams](https://dev.to/brianverm/exception-handling-in-java-streams-2mjh) for more details.

Usage
---------
Wrap the statements responsible for checked exceptions as below.

* Use `Either.lift()` - This will just log the exception and continue processing the stream.
* Use `Either.liftWithValue` - This will log both the exception and input parameter value (responsible for exception). Then it continues processing the stream.

Refer `src/org.javedrpi.App.java` for sample usages.

![alt text](https://github.com/javed0863/Either/blob/main/output.png?raw=true)