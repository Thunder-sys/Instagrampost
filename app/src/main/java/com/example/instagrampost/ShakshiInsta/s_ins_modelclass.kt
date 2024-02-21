package com.example.instagrampost.ShakshiInsta

class s_ins_modelclass {
    var i_imag:Int=0
    var i_comment:String=""
    var i_share:Int=0
    var i_save:Int=0
    var i_like:String=""
    var i_user:String=""
    var i_mainimg:Int=0
    var i_ncomm:String=""
    var i_nlik:String=""
    var i_nview:String=""

    //alt insert select all for constructor
    constructor(i_imag:Int,i_comment:String,i_share:Int,i_save:Int,i_like:String,i_user:String,i_mainimg:Int){
        this.i_imag=i_imag
        this.i_comment=i_comment
        this.i_share=i_share
        this.i_save=i_save
        this.i_like=i_like
        this.i_user=i_user
        this.i_mainimg=i_mainimg
        this.i_ncomm=i_ncomm
        this.i_nlik=i_nlik
        this.i_nview=i_nview
    }
}