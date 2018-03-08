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

- The class ```Person.scala``` contains the implementation of a few constructors. Please, read the documentation there.
- The primary constructor is expected to have all the information that is needed to create an object of the class. The remaining constructors
  must always call the primary one, either directly or via another constructor.
- There are no empty constructors in immutable languages in order to avoid excessive copy and memory consumption.
- Constructors are defined just like a method, but they are called ```this```. To have a multi-lined constructor, just use curly-brackets.
- The first line of an ancillary constructor has to be a call to another constructor.

#### Default and Named Parameters

Just like they are used in methods, there is no reason why they shouldn't in constructors. Isn't it lovely?

- All required self-explanatory code can be found in the ```Computer.scala``` class.
- Using default and named arguments is helpful and decrease the need of having ancillary (secondary) constructors.
  However, as a personal opinion, a constructor with a lot of parameters is a bit hard to read / use. Instead, I
  would have a few more constructors.

#### Methods in Classes

No mystery here. Just like Java, except for some improvements, Scala has the methods in classes. We have already seen some, bu in the script files we worked with.

- Methods have access to the internal state of objects and hence can modify their state.
- Default and named parameters are also allowed. That helps a lot! Why? Instead of defining methods to change the state, we can use the Memento Pattern and create a copy of an object,
  keep the state on the member we want and changing those we don't.

For further details please refer to the ```Computer.scala``` class.

#### Precondition and Exceptions

- Constructors and methods' parameters can be checked for preconditions with ```require```, ```assert```,  ```assume``` or ```ensuring```. Each of them behaving
  slightly different from each other. For instance, a ```require``` throws an ```IllegalArgumentException``` if a condition is not met. When it comes
  to ```assert``` and ```assume```, an AssertionError is thrown. Both are used for static checking, differing only in intent. The prior is a predicate whilst the latter is an axiom.
- Some more details about the other two, ```require``` and ```ensuring```, they are used as a mean of design-by-controct specification.
- In order to disable the checker, use -Xdisable-assertions, which raises -Xelide-below above elidable.ASSERTION.
- Exceptions in Scala are handled in a similar fashion as they are in Java. The main difference is that the ```catch``` block uses a matching patters to check which exception
  has actually been thrown.
- Just like in Java, you can also have a ```finally``` block.
- All exceptions in Scala are Runtime.

To get a glimpse on how it all works, have a look at the ```Computer.scala``` class and the ```ComputerScript.scala```. Remember: if you don't explicitly check them, they will look ugly on the console, browser, etc.

#### Inheritance (Subclasses)

- Just like with Java, the keyword ```extends``` is used to denote inheritance, a is-a relationship.
- Again, like in Java, attributer that belong to the superclass are sent to its constructor.
- And guess what, polymorphism also applies.

* But wait! That doesn't have anything to do with Java, that's all about Object Orientation. Ah, we are fine! ;)

- The inheritance example is depicted in the ```Models.scala``` class and execution-wise, more details can be found in the ```ModelsScript.scala```.
  Yes, as I said previously, we don't need the file name to be the same as the class name. Moreover, there can be multiple classes per file. I mean, multiple public classes.

#### Method Overriding

Again, there are only a few differences when compared to Java, and that's not only about syntax-sugar. Below some details on how to work with method overriding.

- The keyword ```override``` is mandatory. In Java we have an annotation which only indicates that a particular methods overrides another, but it can be omitted.
- Of course, like in Java, the signature must be the same. Otherwise, it is not overriding, but overloading - which I will explain later.

A new method, called ```fullName```, was added to the class ```Person.scala``` and is being overridden in the ```Employee``` class, which lies inside the ```Models.scala```
Have a look at the ```ModelsScript.scala``` for further understanding.

#### Method Overloading

- Method overloading does not have a special keyword. It works just like in Java. So, if have method A(param1, param2) and want to overload it to add an extra parameter.
  To achieve that, just define a method A(param1, param2, param3) and you are good to go.
- There is one small thing about method overloading, though: it does not work if the method being overloaded contains default parameters.
  To confirm this problem, have a look at the ```Models.scala```. There I overloaded the 'update' method, which is declared in the ```Person.scala``` class. The overloading method
  is currently commented out. Please, remove the comment blocks and try compiling the file.

#### equals

- As the name suggests, ```equals``` is used to test equality of values between two objects. For example, if we have created 2 instances of the class 'Person' with the same
  first name, last name and address, checking for value equality should return ```true```.
- The ```equals``` method is defined in the ```AnyRef``` class, which means that we have to override it. If we simply check for equality, without overriding the method, it will
  return false, since that the default implementation in the ```AnyRef``` class does not take into account the class members we have defined.
- After defining out ```equals``` method, with can call it using the ```==``` operator; that's equivalent to the equals, so not really like Java ```==```, which checks for
  reference equality.
- In Scala, to check for reference equality, or if objects reference the same instance, we have to use the operator ```eq```. Check the ```Person.scala``` and
  the ```PersonScript.scala``` file.

#### hashCode

- The ```hasCode``` method is used to return a hash, a unique as possible identifying number, which is related to a particular object. It's also used as a link by the JVM
  to help fetching where in the memory a given object is stored. So, it's not the memory address itself.
- As with ```equals```, the ```hashCode``` method is also defined in the ```AnyRef``` class. In order to use it, we have to add our own implementation to our classes. This is
  a must have for any domain model class since the method is used in Maps.
- The ```hashCode``` implementation used here is suggested by Josh Block in his Effective Java 2nd Edition book. Have a look at the ```Person.scala``` class to see how it's done.

#### toString

- The ```toString``` method kicks in when we need a human readable representation of an object. As the other two, it's also defined in the ```AnyRef``` class. It's implementation?
  Feel free to do whatever you want. Again, have a look at the ```Person.scala``` class.

Remark: when using an IDE, the three methods explained above should be easy to generate in an automatic fashion.

#### Case Classes

And now the time to forget about writing ```equals```, ```toString``` and ```hashCode``` has come! Yes, just use the keyword ```case``` before ```class``` in your class declaration. Done!

What else does ```case``` bring to the table?

- No need to use the ```new``` keyword when instantiating classes.
- No need to use the ```val``` before the constructor parameters.
- It creates a ```copy``` method which can be used to create a new object of an instance (GoF Memento Pattern).
- It has automatic pattern matching.
- However, case classes cannot be subclassed. It makes them good to be domain model classes.

If you don't like the ```toString``` implementation, for example, just implement your own. Have a look at the ```Models.scala``` and look for the ```Department``` class.

#### Abstract Classes

If you come from Java, C++, C#, etc., you know what abstract classes mean. There are only a few things here that I should mention.

- Use the ```abstract``` keyword in the class declaration.

Have a look at the ```Models.scala``` file and the new abstract class that has been added.

#### Parameterised Types on Classes

We have already seen Parameterised Types with Scala. So, it is not very different from Java and you have a lot of freedom. I mean, it's the same thing.
To know more about how using it with classes, please refer to the following files:

- ```Box.scala``` class
- ```Couple.scala``` class
- ```BoxScript.scala``` script
- ```CoupleScript.scala``` script

No extra explanation needed.

#### Parameterised Methods in Classes

Again, nothing really special here if you are already used to Java generics. Have a look at the same files I depicted above for examples on how to use it.
