class Album(val songs: List<Song>):Music {
    fun findSongsByArtist(searchArtist: String): List<Song> {
        return songs.filter { it.title == searchArtist }
    }

    override fun getPlayingTime(): Double {
            return songs.sumOf { it.playingTime }

        }



        override fun allPlayingTime(): List<Song> {
            return songs
        }
    }