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