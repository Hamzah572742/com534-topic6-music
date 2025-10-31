class Single(val aSide: Song, val bSide: Song) :Music {

    fun getPlayingTime(): Double {
        return aSide.playingTime + bSide.playingTime
    }


    fun allPlayingTime(): List<Song> {
        return listOf(aSide, bSide)
    }
}