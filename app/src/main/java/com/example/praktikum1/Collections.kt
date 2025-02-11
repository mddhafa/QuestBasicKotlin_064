package com.example.praktikum1


fun ContohList(){
    println("== List ==")
    //List Read-Only
    val readOnlyAbjad = listOf("A", "B","C")
    println(readOnlyAbjad)

    // List Mutable
    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    //Menambahkan data ke dalam List Mutable
    shape.add("Circle")
    println(shape)

    //Mengahpus data dari List Mutable
    shape.remove("Triangle")
    println(shape)

    println(shape.first())
    println(shape.last())
    println(shape.count())

    shape.removeAt(1)
    println(shape)

    //Mengunggah dari dalam List Mutable
    shape[0] = "Oval"
    println(shape)

    //List Read-Only
    val shapeLocked: List<String> = shape
    println(shapeLocked)
}
// set adalah kumpulan data yang memiliki posisi atau urutan dan hanya menyimpan data unik(tidak ada duplikasi)
// set bersifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu
// set bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// set read only menggunakan setOf
// set mutable menggunakan mutableSetOf

fun ContohSet(){
    println()
    println("=== Set ===")

    //Set Read-Only
    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)

    //Set Mutable
    val shape: MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
    println(shape)

    //Menambahkan data ke dalam Set Mutable
    shape.add("Rectanle")
    println(shape)

    //Menghaps data dari set Mutable
    shape.remove("Circle")
    println(shape)

    //Set Read-Only
    val shapesLocked: Set<String> = shape
    println(shapesLocked)
}

// map adalah kumpulan data yang disusun dalam pasangan key-value
// map bersifat unordered, artinya daya yang dimasukkan tidak memiliki posisi tertentu
// map bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// map read only menggunakan mapOf
// map mutable menggunakan mutableMapOf

fun ContohMap(){
    println()
    println("=== MAP ===")

    //Map Read-Only
    val readOnlyShape: Map<String, Int> = mapOf("Circle" to 1, "Squere" to 2, "Triangle" to 3)
    println(readOnlyShape)

    //Map Mutable
    val shape: MutableMap<String, Int> = mutableMapOf("Circle" to 1, "Squere" to 2, "Triangle" to 3)
    println(shape)

    //Menambahkan data kedalam Map Mutable
    shape["Rectangle"] = 4
    println(shape)

    //Menghapus data dari Map Mutable
    shape.remove("Circle")
    println(shape)

    //Mengubah data di dalam Map Mutable
    shape["Squere"] = 5
    println(shape)

    //Map Read-Only
    val shapesLocked: Map<String, Int> = shape
    println(shapesLocked)
}

fun main(){
    ContohList()
    ContohSet()
    ContohMap()
}