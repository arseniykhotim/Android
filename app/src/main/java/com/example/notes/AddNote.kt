package com.example.notes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.notes.databinding.ActivityAddNoteBinding
import com.example.notes.databinding.ActivityAllNotesBinding

class AddNote : AppCompatActivity() {
    lateinit var binding: ActivityAddNoteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddNoteBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bNav.selectedItemId = R.id.item3
        binding.bNav.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.item1 -> {
                    val intent = Intent(this, AllNotes::class.java)
                    startActivity(intent)
                    Toast.makeText(this, "Item 1", Toast.LENGTH_SHORT).show()
                }
                R.id.item2 -> {
                    val intent = Intent(this, SearchActivity::class.java)
                    startActivity(intent)
                }
                R.id.item3 -> {

                }
                R.id.item4 -> {
                    val intent = Intent(this, Profile::class.java)
                    startActivity(intent)
                }
            }
            true
        }
    }
}