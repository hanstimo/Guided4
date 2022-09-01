package com.example.guided4_bundle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText


class GD4BundleResult : AppCompatActivity() {
    private lateinit var nama: TextInputEditText
    private lateinit var nim: TextInputEditText
    private lateinit var fakultas: TextInputEditText
    private lateinit var prodi: TextInputEditText
    private lateinit var mBundle: Bundle

    lateinit var vNama : String
    lateinit var vNim : String
    lateinit var vFakultas : String
    lateinit var vProdi : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getBundle()
        setText()

    }
    fun getBundle() {
        mBundle = intent.getBundleExtra("register")!!
        vNama = mBundle.getString("nama")!!
        vNim = mBundle.getString("nim")!!
        vFakultas = mBundle.getString("fakultas")!!
        vProdi = mBundle.getString("prodi")!!
    }

    fun setText() {
        nama = findViewById(R.id.nama)
        nama.setText(vNama)
        nim = findViewById(R.id.nim)
        nim.setText(vNim)
        fakultas = findViewById(R.id.fakultas)
        fakultas.setText(vFakultas)
        prodi = findViewById(R.id.prodi)
        prodi.setText(vProdi)
    }

}