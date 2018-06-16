package com.dekonoplyov.render

import com.avsievich.image.JavaImage
import com.dekonoplyov.render.util.TGAReader

fun draw_african_head() {
    val width = 800
    val height = 800
    val model = Model("model/african_head/african_head.obj")
    val texture = TGAReader.getImage("model/african_head/african_head_diffuse.tga")
    val renderer = Renderer(width, height)
    renderer.render(model, texture)
    renderer.image.save("output.png")
}

fun main(args: Array<String>) {
    draw_african_head()
}