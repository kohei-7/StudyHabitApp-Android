package com.sha.studyhabitapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment

class TimerFragment : Fragment(R.layout.fragment_timer) {
    private lateinit var hoursBoxEditTextView :EditText
    private lateinit var minutesBoxEditTextView: EditText
    private lateinit var secondsBoxEditTextView: EditText

    //Do not access graphical things through onCreate method
    // because this will be called before finishing onCreate() of Activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        Toast.makeText(activity, "onCreate method", Toast.LENGTH_LONG).show()
//        hoursBoxEditTextView.findViewById<>()



    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        //doesn't work
//        hoursBoxEditTextView.findViewById<EditText>(R.id.hours_box)
//        minutesBoxEditTextView.findViewById<EditText>(R.id.minutes_box)
//        secondsBoxEditTextView.findViewById<EditText>(R.id.seconds_box)

//        hoursBoxEditTextView.isClickable = true
//        minutesBoxEditTextView.isClickable = true
//        secondsBoxEditTextView.isClickable = true
        return inflater.inflate(R.layout.fragment_timer, null)
    }
    override fun onResume() {
        super.onResume()
        Toast.makeText(activity, "onResume method", Toast.LENGTH_LONG).show()

    }
}
