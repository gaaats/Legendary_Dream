package com.rvappstudios.montessori.math.games.kids.number.countin.ujojukuo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rvappstudios.montessori.math.games.kids.number.countin.R
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.scopes.ActivityScoped

@AndroidEntryPoint
@ActivityScoped
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
        onDestroy()
    }
}