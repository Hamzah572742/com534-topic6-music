class Album(val songs: List<Song>):Music {
    fun findSongsByArtist(searchArtist: String): List<Song> {
        return songs.filter { it.title == searchArtist }
    }

    fun getPlayingTime(): Double {
            return songs.sumOf { it.playingTime }

        }



        fun allPlayingTime(): List<Song> {
            return songs
        }
    }



class RecordPlayer {

    fun play(music: Music) {
        println("Now playing...")

        // Show total playing time
        println("Total playing time: ${music.getPlayingTime()} seconds")

        // Show all songs
        println("Songs:")
        music.getAllSongs().forEach { song ->
            println(" - ${song.title} by ${song.artist} (${song.playingTime} seconds)")
        }

        println("Playback finished.\n")
    }
}
