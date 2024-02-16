package com.sha.studyhabitapplication

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import com.google.android.material.textfield.TextInputEditText
import kotlin.math.max
import kotlin.time.Duration.Companion.minutes

class TimerFragment : Fragment(R.layout.fragment_timer) {
    private lateinit var hoursBoxEditTextView: TextInputEditText
    private lateinit var minutesBoxEditTextView: TextInputEditText
    private lateinit var secondsBoxEditTextView: TextInputEditText
    private lateinit var popupMSGTextView: TextView
    private lateinit var progressBar: ProgressBar
    private lateinit var adviceErrorTextView: TextView
    private lateinit var finishBTN: Button
    private lateinit var pauseBTN: Button
    private lateinit var startBTN: Button
    private var seconds: Int = 0
    private var minutes: Int = 0
    private var hours: Int = 0
    private final val input: String = "INPUT"




    //Do not access graphical things through onCreate method
    // because this will be called before finishing onCreate() of Activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_timer, container, false)
        initViews(view)
        setVisibilities()
        startBTN.setOnClickListener {

        }
        return view
    }

    private fun initViews(view: View) {
        hoursBoxEditTextView = view.findViewById(R.id.hours_box)
        minutesBoxEditTextView = view.findViewById(R.id.minutes_box)
        secondsBoxEditTextView = view.findViewById(R.id.seconds_box)
        popupMSGTextView = view.findViewById(R.id.popup_msg)
        progressBar = view.findViewById(R.id.progress_bar)
        adviceErrorTextView = view.findViewById(R.id.advice_error_TextView)
        finishBTN = view.findViewById(R.id.finish_btn)
        startBTN = view.findViewById(R.id.start_btn)
        pauseBTN = view.findViewById(R.id.pause_btn)
    }

    private fun setVisibilities() {
        popupMSGTextView.isVisible = false
        progressBar.isVisible = false
        adviceErrorTextView.isVisible = false
        finishBTN.isVisible = false
        pauseBTN.isVisible = false
        startBTN.isClickable = true
    }

    override fun onResume() {
        super.onResume()
//        Toast.makeText(activity, "onResume method", Toast.LENGTH_LONG).show()
//        hoursBoxEditTextView.addTextChangedListener(hoursTextWatcher)
//        minutesBoxEditTextView.addTextChangedListener(minutesTextWatcher)
//        secondsBoxEditTextView.addTextChangedListener(secondsTextWatcher)
        secondsBoxEditTextView.setOnFocusChangeListener { v, hasFocus ->
            if(!hasFocus){
                if(!secondsBoxEditTextView.text.isNullOrEmpty()){
                    var s : String = secondsBoxEditTextView.text.toString()
                    seconds = s.toString().toInt()
                    Log.i(input, seconds.toString())
                    if (seconds > 60) {
                        minutes += seconds / 60
                        seconds %= 60
                    }
                    secondsBoxEditTextView.setText(seconds.toString())
                }
            }

        }


    }
}
