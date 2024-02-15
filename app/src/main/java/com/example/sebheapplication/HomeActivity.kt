package com.example.sebha_app

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sebheapplication.R
import com.example.sebheapplication.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding
    lateinit  var azkirList: MutableList<String>
    var currentIndexZikr=0
      var Counter =1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding=ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        azkirList=resources.getStringArray(R.array.azkirLists).toMutableList()


        binding.zikrText.text=azkirList[currentIndexZikr]

        sebhaClick()
    }
   @SuppressLint("SuspiciousIndentation")
    private fun sebhaClick() {
        binding.sebhaBody.setOnClickListener {
            binding.sebhaBody.rotation += (360 / 33).toFloat()
            if (Counter<33)
                Counter++
            else
                Counter=0
                currentIndexZikr= if (currentIndexZikr < azkirList.size) ++currentIndexZikr else 0
    binding.counter.text=Counter.toString()
        }

    }
}