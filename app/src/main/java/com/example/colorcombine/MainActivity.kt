package com.example.colorcombine

import android.content.DialogInterface
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val list1= arrayOf("Black", "Red", "Green", "Blue", "Pink")
    private val list2= arrayOf("White", "Brown", "Yellow", "Orange", "Purple")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter=ArrayAdapter(this, android.R.layout.simple_spinner_item, list1)
        val adapter2=ArrayAdapter(this, android.R.layout.simple_spinner_item, list2)

        val bc=findViewById(R.id.mainback) as ConstraintLayout

        val b1=findViewById(R.id.confirm) as Button
        val b2=findViewById(R.id.instruction) as Button

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_item)

        spinner.adapter=adapter
        spinner.onItemSelectedListener=object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?){}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?,position: Int,id: Long){
                if(spinner.selectedItemPosition==0){
                    pick1.setText(" " + spinner.selectedItem)
                }
                if(spinner.selectedItemPosition==1){
                    pick1.setText(" " + spinner.selectedItem)
                }
                if(spinner.selectedItemPosition==2){
                    pick1.setText(" " + spinner.selectedItem)
                }
                if(spinner.selectedItemPosition==3){
                    pick1.setText(" " + spinner.selectedItem)
                }
                if(spinner.selectedItemPosition==4){
                    pick1.setText(" " + spinner.selectedItem)
                }
            }
        }

        spinner2.adapter=adapter2
        spinner2.onItemSelectedListener=object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?){}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?,position: Int,id: Long){
                if(spinner.selectedItemPosition==0){
                    pick2.setText(" " + spinner2.selectedItem)
                }
                if(spinner.selectedItemPosition==1){
                    pick2.setText(" " + spinner2.selectedItem)
                }
                if(spinner.selectedItemPosition==2){
                    pick2.setText(" " + spinner2.selectedItem)
                }
                if(spinner.selectedItemPosition==3){
                    pick2.setText(" " + spinner2.selectedItem)
                }
                if(spinner.selectedItemPosition==4){
                    pick2.setText(" " + spinner2.selectedItem)
                }
            }
        }

        b1.setOnClickListener {
            if (spinner.selectedItemPosition == 0 && spinner2.selectedItemPosition == 0) {
                result.setText("Color: Grey")
                bc.setBackgroundColor(Color.parseColor("#808080"))
            }
            if(spinner.selectedItemPosition==0 && spinner2.selectedItemPosition ==1) {
                result.setText("The result is: Dark Brown")
                bc.setBackgroundColor(Color.parseColor("#5C4033"))
            }
            if(spinner.selectedItemPosition==0 && spinner2.selectedItemPosition ==2) {
                result.setText("The result is: Green")
                bc.setBackgroundColor(Color.parseColor("#00FF00"))
            }
            if(spinner.selectedItemPosition==0 && spinner2.selectedItemPosition ==3) {
                result.setText("The result is: Brown")
                bc.setBackgroundColor(Color.parseColor("#964B00"))
            }
            if(spinner.selectedItemPosition==0 && spinner2.selectedItemPosition ==4) {
                result.setText("The result is: Dark Purple")
                bc.setBackgroundColor(Color.parseColor("#301934"))
            }
            if (spinner.selectedItemPosition == 1 && spinner2.selectedItemPosition == 0) {
                result.setText("Color: Pink")
                bc.setBackgroundColor(Color.parseColor("#FFC0CB"))
            }
            if(spinner.selectedItemPosition==1 && spinner2.selectedItemPosition ==1) {
                result.setText("The result is: Maroon")
                bc.setBackgroundColor(Color.parseColor("#800000"))
            }
            if(spinner.selectedItemPosition==1 && spinner2.selectedItemPosition ==2) {
                result.setText("The result is: Vermilion")
                bc.setBackgroundColor(Color.parseColor("#E34234"))
            }
            if(spinner.selectedItemPosition==1 && spinner2.selectedItemPosition ==3) {
                result.setText("The result is: Brown")
                bc.setBackgroundColor(Color.parseColor("#964B00"))
            }
            if(spinner.selectedItemPosition==1 && spinner2.selectedItemPosition ==4) {
                result.setText("The result is: Magenta")
                bc.setBackgroundColor(Color.parseColor("#FF00FF"))
            }
            if (spinner.selectedItemPosition == 2 && spinner2.selectedItemPosition == 0) {
                result.setText("Color: Light Green")
                bc.setBackgroundColor(Color.parseColor("#90EE90"))
            }
            if(spinner.selectedItemPosition==2 && spinner2.selectedItemPosition ==1) {
                result.setText("The result is: Forest Green")
                bc.setBackgroundColor(Color.parseColor("#228B22"))
            }
            if(spinner.selectedItemPosition==2 && spinner2.selectedItemPosition ==2) {
                result.setText("The result is: Chartreuse")
                bc.setBackgroundColor(Color.parseColor("#DFFF00"))
            }
            if(spinner.selectedItemPosition==2 && spinner2.selectedItemPosition ==3) {
                result.setText("The result is: Light Brown")
                bc.setBackgroundColor(Color.parseColor("##C4A484"))
            }
            if(spinner.selectedItemPosition==2 && spinner2.selectedItemPosition ==4) {
                result.setText("The result is: Dark Plum")
                bc.setBackgroundColor(Color.parseColor("#673147"))
            }
            if (spinner.selectedItemPosition == 3 && spinner2.selectedItemPosition == 0) {
                result.setText("Color: Sky Blue")
                bc.setBackgroundColor(Color.parseColor("#87CEEB"))
            }
            if(spinner.selectedItemPosition==3 && spinner2.selectedItemPosition ==1) {
                result.setText("The result is: Dark Blue")
                bc.setBackgroundColor(Color.parseColor("#00008B"))
            }
            if(spinner.selectedItemPosition==3 && spinner2.selectedItemPosition ==2) {
                result.setText("The result is: Green")
                bc.setBackgroundColor(Color.parseColor("#00FF00"))
            }
            if(spinner.selectedItemPosition==3 && spinner2.selectedItemPosition ==3) {
                result.setText("The result is: Brown")
                bc.setBackgroundColor(Color.parseColor("#964B00"))
            }
            if(spinner.selectedItemPosition==3 && spinner2.selectedItemPosition ==4) {
                result.setText("The result is: Lavender")
                bc.setBackgroundColor(Color.parseColor("#E6E6FA"))
            }
            if (spinner.selectedItemPosition == 4 && spinner2.selectedItemPosition == 0) {
                result.setText("Color: Light Pink")
                bc.setBackgroundColor(Color.parseColor("#FFB6C1"))
            }
            if(spinner.selectedItemPosition==4 && spinner2.selectedItemPosition ==1) {
                result.setText("The result is: Dark Pink")
                bc.setBackgroundColor(Color.parseColor("#AA336A"))
            }
            if(spinner.selectedItemPosition==4 && spinner2.selectedItemPosition ==2) {
                result.setText("The result is: Orange")
                bc.setBackgroundColor(Color.parseColor("#FFA500"))
            }
            if(spinner.selectedItemPosition==4 && spinner2.selectedItemPosition ==3) {
                result.setText("The result is: Salmon Pink")
                bc.setBackgroundColor(Color.parseColor("#FA8072"))
            }
            if(spinner.selectedItemPosition==4 && spinner2.selectedItemPosition ==4) {
                result.setText("The result is: Magenta")
                bc.setBackgroundColor(Color.parseColor("#FF00FF"))
            }
        }

        b2.setOnClickListener {

            val dialogBuilder = AlertDialog.Builder(this)

            dialogBuilder.setMessage("Pick two colors and click confirm to combine colors.")
                .setCancelable(false)
                .setPositiveButton("OK", DialogInterface.OnClickListener {
                        dialog, id -> dialog.cancel()
                })

            val alert = dialogBuilder.create()

            alert.setTitle("Instructions")
            alert.show()
        }
    }
}
