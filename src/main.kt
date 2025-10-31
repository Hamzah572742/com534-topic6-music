fun main() {
    // Create some songs
    val song1 = Song("Song A", "Artist 1", 180.0)
    val song2 = Song("Song B", "Artist 2", 200.0)
    val song3 = Song("Song C", "Artist 1", 220.0)
    val song4 = Song("Song D", "Artist 3", 150.0)

    // Create a Single
    val single = Single(song1, song2)

    // Create an Album
    val album = Album(listOf(song1, song2, song3, song4))

    val recordPlayer = RecordPlayer()

    recordPlayer.play(single)
    recordPlayer.play(album)

    // Create a list of Music
    val musicList: List<Music> = listOf(single, album)

    // Loop through each item of Music and display details
    musicList.forEach { music ->
        println("Total playing time: ${music.getPlayingTime()} seconds")
        println("All songs:")
        if (music is Single) {
            music.allPlayingTime().forEach { song ->
                println(" - ${song.title} by ${song.artist}")
            }
        } else if (music is Album) {
            music.allPlayingTime().forEach { song ->
                println(" - ${song.title} by ${song.artist}")
            }
        }
        println()
    }

    // Test the findSongsByArtist() method
    val artist1Songs = album.findSongsByArtist("Artist 1")
    println("Songs found using findSongsByArtist(\"Artist 1\"):")
    artist1Songs.forEach { println(" - ${it.title}") }
}
