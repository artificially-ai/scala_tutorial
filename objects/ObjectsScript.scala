/*
* That's the Music Singleton that contains 1 method, which returns its title.
*/
object Music {
  def title = "The Last Century for Men."
}

// It looks like calling a static method!
println(Music.title)

/*
* Let's get some more stuff done!
*/

class Book(val title:String, val author:String)

object LOTR extends Book("Lord of the Rings: The Fellowship of the Ring", "J. R. R. Tolkien")

println(LOTR.title)
println(LOTR.author)

object BookFactory {
  def create(title:String, author:String) = {
    new Book(title, author)
  }
}

val book1 = BookFactory.create("Lord of the Rings: The Two Towers", "J. R. R. Tolkien")

println(book1.title)
println(book1.author)
