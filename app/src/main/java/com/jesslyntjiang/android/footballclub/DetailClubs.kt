package com.jesslyntjiang.android.footballclub

import android.graphics.Typeface
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import org.jetbrains.anko.*


class DetailClubs : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var clubName = intent.getStringExtra("name")
        var clubImage = intent.getIntExtra("image", 0)
        var clubDescription = intent.getStringExtra("desc")
        val detailClubs = DetailClubsUI()
        detailClubs.setContentView(this)


        verticalLayout{

            gravity = Gravity.CENTER_HORIZONTAL

            imageView(clubImage){}
                    .lparams(width = 500, height = 500) {
                        padding = dip(20)
                    }


            textView(clubName){
                textSize = 20f
                gravity = Gravity.CENTER_HORIZONTAL
                typeface = Typeface.DEFAULT_BOLD
            }.lparams(width = wrapContent, height = wrapContent){
                topMargin = dip(30)
            }

            textView(clubDescription){
                gravity = Gravity.CENTER_HORIZONTAL
                typeface = Typeface.SANS_SERIF
            }.lparams(width = matchParent, height = wrapContent){

            }


        }


    }


    class DetailClubsUI() : AnkoComponent<DetailClubs>{


        override fun createView(ui: AnkoContext<DetailClubs>) = with(ui) {
            verticalLayout{
                gravity = Gravity.CENTER_HORIZONTAL

//                imageView(images){}
//                        .lparams(width = 500, height = 500) {
//                    padding = dip(20)
//                }
//
//
//                names = textView().
//                        lparams(width = wrapContent, height = wrapContent){
//                            padding = dip(20)
//                        }
//
//                descs = textView().
//                        lparams(width = wrapContent, height = wrapContent){
//                            padding = dip(20)
//                        }


            }
        }

    }
}
