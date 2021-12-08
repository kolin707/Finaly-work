package com.kolin.applicationfragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

private const val TAG = "MyTag"

class StartFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG,"StartFragment - onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG,"StartFragment - onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_start, container, false)

        //some work
        //  val textView:TextView=view.findViewById()

        Log.d(TAG,"StartFragment - onCreateView")

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(TAG,"StartFragment - onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"StartFragment - onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"StartFragment - onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"StartFragment - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"StartFragment - onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG,"StartFragment - onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"StartFragment - onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG,"StartFragment - onDetach")
    }
}