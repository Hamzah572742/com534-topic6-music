class Single(val aSide: Song, val bSide: Song) :Music {

    override fun getPlayingTime(): Double {
        return aSide.playingTime + bSide.playingTime
    }


    override fun allPlayingTime(): List<Song> {
        return listOf(aSide, bSide)
    }
}