import scala.beans.BeanProperty

/*
* Here we user 'var' for both memory and disk properties as those are cable to  be updated.
* Using 'val' and 'var' would already be enough to have accessors and mutators. However,
* if one wants to have Java-style getters and setters, the BeanProperty annotation can help.
*
* I'm new of Scala, but I'm already in love with the semantics of 'val' and 'var'. So,
* I would not use the BeanProperty at all.
*
* Compile this class and check the byte-code structure:
* scalac -d classes src/Computer.scala
* javap -p -cp classes Computer
*/

class Computer(@BeanProperty var memory:Int,
               @BeanProperty val cpu:Double,
               @BeanProperty var disk:Int)
