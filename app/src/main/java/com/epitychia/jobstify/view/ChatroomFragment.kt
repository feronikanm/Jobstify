package com.epitychia.jobstify.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.epitychia.jobstify.R


class ChatroomFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_chatroom, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            ChatroomFragment().apply {
                arguments = Bundle().apply {}
            }
    }
}