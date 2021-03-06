package com.demo.navigationcomponent


import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_two.*


/**
 * @author yangzc
 *
 */
class TwoFragment : Fragment() {
    private val LogTags = "TwoFragment"
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(LogTags, "$LogTags-----onCreateView")
        return inflater.inflate(R.layout.fragment_two, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(LogTags, "$LogTags-----onActivityCreated")
        button_two.setOnClickListener {
            findNavController().navigate(R.id.action_twoFragment_to_threeFragment)
        }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(LogTags, "$LogTags-----onCreate")
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        Log.d(LogTags, "$LogTags-----onAttach")
    }

    override fun onStart() {
        super.onStart()
        Log.d(LogTags,"$LogTags-----onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(LogTags,"$LogTags-----onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(LogTags,"$LogTags-----onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(LogTags,"$LogTags-----onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(LogTags,"$LogTags-----onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LogTags,"$LogTags-----onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(LogTags,"$LogTags-----onDetach")
    }


    override fun onHiddenChanged(hidden: Boolean) {
        super.onHiddenChanged(hidden)
        if (hidden){
            Log.d(LogTags,"$LogTags-----hidden")
        }else{
            Log.d(LogTags,"$LogTags-----show")
        }
    }

    }


