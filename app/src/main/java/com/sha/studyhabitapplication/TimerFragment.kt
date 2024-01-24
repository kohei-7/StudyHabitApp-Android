package com.sha.studyhabitapplication

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.Fragment
import com.google.android.material.textfield.TextInputEditText

class TimerFragment : Fragment(R.layout.fragment_timer) {
    private lateinit var hoursBoxEditTextView : TextInputEditText
    private lateinit var minutesBoxEditTextView: TextInputEditText
    private lateinit var secondsBoxEditTextView: TextInputEditText

    //ref: https://www.geeksforgeeks.org/ontextchangedlistener-in-android/
    private var textWatcher: TextWatcher = object : TextWatcher{
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            Toast.makeText(activity, "before textWatcher", Toast.LENGTH_SHORT).show()
        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            Toast.makeText(activity, "changed textWatcher", Toast.LENGTH_SHORT).show()
        }

        override fun afterTextChanged(s: Editable?) {
            Toast.makeText(activity, "after text changed", Toast.LENGTH_SHORT).show()
        }

    }
    //Do not access graphical things through onCreate method
    // because this will be called before finishing onCreate() of Activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view: View = inflater.inflate(R.layout.fragment_timer, container, false)
        hoursBoxEditTextView = view.findViewById(R.id.hours_box)
        minutesBoxEditTextView = view.findViewById(R.id.minutes_box)
        secondsBoxEditTextView = view.findViewById(R.id.seconds_box)

        hoursBoxEditTextView.addTextChangedListener (textWatcher)
        return view
    }
    override fun onResume() {
        super.onResume()
//        Toast.makeText(activity, "onResume method", Toast.LENGTH_LONG).show()

    }
}
