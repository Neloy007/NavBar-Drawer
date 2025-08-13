package com.example.navanddrawer.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import com.example.navanddrawer.R

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class AddFragment : Fragment() {

    private lateinit var editTitle: EditText
    private lateinit var editDescription: EditText
    private lateinit var imagePreview: ImageView
    private lateinit var btnSubmit: Button



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_add, container, false)

        editTitle = view.findViewById(R.id.editTitle)
        editDescription = view.findViewById(R.id.editDescription)
        imagePreview = view.findViewById(R.id.imagePreview)
        btnSubmit = view.findViewById(R.id.btnSubmit)



        btnSubmit.setOnClickListener {
            val title = editTitle.text.toString().trim()
            val desc = editDescription.text.toString().trim()

            if (title.isEmpty() || desc.isEmpty()) {
                Toast.makeText(requireContext(), "Please fill all fields", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(requireContext(), "Item Added", Toast.LENGTH_SHORT).show()
                editTitle.text.clear()
                editDescription.text.clear()
                imagePreview.setImageResource(R.drawable.ic_add_photo)
            }
        }

        return view
    }
}
