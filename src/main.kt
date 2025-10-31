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

    // Create a list of Music
    val musicList: List<Music> = listOf(single, album)

    // Call interface methods using forEach
    musicList.forEach { music ->
        println("Total playing time: ${music.getPlayingTime()} seconds")
        println("All songs:")
        music.getAllSongs().forEach { song ->
            println(" - ${song.title} by ${song.artist}")
        }
        println()
    }

    // Example of using songsByArtist on the album
    val artist1Songs = album.songsByArtist("Artist 1")
    println("Songs by Artist 1 in album:")
    artist1Songs.forEach { println(" - ${it.title}") }
}
