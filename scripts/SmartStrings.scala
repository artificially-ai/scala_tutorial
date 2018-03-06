val lyrics = """Well do you remember a time when you thought you belonged to something more than you?
                |A country that cared for you
                |A national anthem you could sing without feeling used or ashamed
                |You poor sods have only yourselves to blame
                |On your knees, peasant
                |You're living for the New King""".stripMargin

println(lyrics)

val message = "We are meeting on June 13th of this year and having lunch at 12:30PM"

// Using Smart Strings for the regex allows us to get rid of escapes, like in \\s.
val regex = """(\s|[0-9])?[0-9]:[0-5][0-9]\s*(AM|PM)""".r

println(regex.findAllIn(message).toList)
