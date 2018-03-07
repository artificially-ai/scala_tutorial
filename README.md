# Scala Tutorial

Contains some code and documentation about how to get started with Scala.

## Requirements

* Java JDK 8
* Scala

## Installing Scala on a MacBook

- ```brew install scala```

## Where to find the code

All script related code can be found under ```scripts```. There I have written basic examples on conditional and loop statements, using both imperative and functional approaches.
There is also some examples of methods, types, units and parameterisation (equivalent to Java generics).

The more Object Oriented related code can be found under objects.  The classes contain documentation, thus better to refer to what is written there as well. They also contain details
about compiling and running the code and inspecting the byte-code.

This is all work in progress, so bare with me whilst I work on some more advanced examples.

## Some general notes

#### Pros
* Type inference
* Static types
* Community support
* Pattern matching, clean syntax, API, currying, partial functions, operator overloading.

#### Cons
* It’s difficult.
* Backwards compatibility.
    * Not that much.

#### The Basics
- val: defines a final variable, a constant, cannot be changed after a value is assigned to it.
    - ```val a = 100```
        - Type inference will make it an integer
    - ```val a:Int = 100```
        - In case we want to specify it. However, not really needed.
- var: defines a variable, can have values reassigned to it. Not very used because it's mutable.
- lazy val
    - Delays evaluation of the val to when it’s actually used.
- OpChars (Operation Characters)
    - unicode.org/charts/PDF/U0000.pdf
- Unicode Symbol Math
    - fileformat.info/info/unicode/category/Sm/list.html
- Unicode Symbol Other
    - fileformat.info/info/unicode/category/So/list.html
- Escape reserved keywords (with a backtick)
    - ```val `import`  = 10```

#### Primitives
- Byte
    - ```val a:Byte = 10```
- Short
    - ```val a:Short = 130```
- Integer (default)
    - ```val a = 100000```
- Long
    - ```val a = 100000```
- Float
    - ```val a = 100.0F```
- Double (default)
    - ```val a = 100.0```
- Char
    - ```val a = ‘k’```
    - ```val a = ‘\u03BB’```
- Boolean
    - ```val b = true```
- All primitives inherit from AnyVal
- AnyVal inherits from Any, which is the mother of everything.
- AnyRef inherits from Any as well, and all objects inherit from AnyRef

#### Operator overloading
- ```1.+(4)``` -> prints 5
- ```-5.abs``` -> prints 5
- It uses implicit wrapping (by rich wrappers).
- Example:
    - ```import scala.math.pow```
    - ```def **(x:Int, ex:Int) = pow(x, exp)```

#### Units
- Unit is something you get when there is nothing to give. It’s like “void” in Java.
    - ```val g:Unit = ()```

#### Method in Method
- Cool idea of having methods inside methods. The closest thing to it that I would say Java has is anonymous classes, which are not cool anyway.
- This keeps code cleaner and the scope of the inner-method is limited by the outer-method.

#### Method overloading
- Works just like in Java. Nothing special there.

#### Parameterisation
- This is analogous to Generics in Java. It helps to keep the code more polymorphic and abolish the use of isInstanceOf and asInstanceOf (casting).

#### Classes
- Have a look at the ```Person.scala``` and the ```PersonScript.scala```. There is a lot of documentation available there.

#### Accessor and Mutators
- From a Java perspective, the Getters and Setters are analogous to Scala's accessors and mutators.
- If one needs Java style Getters and Setters, the scala.beans.BeanProperty annotation can be used on the constructor parameters.
  Have a look at the ```Computer.scala``` class.

#### Constructors
- The primary constructor is expected to have all the information that is needed to create an object of the class. The remaining constructors
  must always call the primary one, either directly or via another constructor.
- There are no empty constructors in immutable languages in order to avoid excessive copy and memory consumption.
