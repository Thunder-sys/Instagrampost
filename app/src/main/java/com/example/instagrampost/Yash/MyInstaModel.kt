package com.example.instagrampost.Yash

class MyInstaModel {
    var imglogo:Int=0
    var mainimg:Int=0
    var username:String=""
    var song:String=""
    var like:String=""
    var comment:String=""
    var committime:String=""
    var commtime:String=""

    constructor(
        imglogo: Int,
        mainimg: Int,
        username: String,
        song: String,
        like: String,
        comment: String,
        committime: String,
        commtime: String
    ) {
        this.imglogo = imglogo
        this.mainimg = mainimg
        this.username = username
        this.song = song
        this.like = like
        this.comment = comment
        this.committime = committime
        this.commtime = commtime
    }
}