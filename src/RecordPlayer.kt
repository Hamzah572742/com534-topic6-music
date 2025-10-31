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
