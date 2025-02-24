package com.example.javapointapp.yazdigimkodlar

class ButtonCalismasi {
}

/*
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Button Action Example"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.073"
        android:textAppearance="@style/Base.TextAppearance.AppCompat.Medium"/>

    <Button
        android:id="@+id/button1"
        android:layout_width="95dp"
        android:layout_height="wrap_content"
        android:layout_marginBottom="8dp"
        android:layout_marginEnd="8dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="8dp"
        android:text="Button 1"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.501"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.498" />

    <Button
        android:id="@+id/button2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginBottom="80dp"
        android:layout_marginEnd="8dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="8dp"
        android:text="Button 2"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.762" />

    <Button
        android:id="@+id/button3"
        android:layout_width="101dp"
        android:layout_height="48dp"
        android:layout_marginBottom="8dp"
        android:layout_marginEnd="8dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="8dp"
        android:onClick="clickButton"
        android:text="Button 3"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.502"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.774" />

</androidx.constraintlayout.widget.ConstraintLayout>
 */


// #XML DOSYASI ####################
/*

        binding.button1.setOnClickListener {
            Toast.makeText(this,"button 1 clicked", Toast.LENGTH_SHORT).show()
        }

        binding.button2.setOnClickListener(this)

        // add button dynamically
        val button4 = Button(this).apply {
            text = "Button 4 added dynamically"
            layoutParams = ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                // Kısıtlamaları burada belirleyin

                setX(250f)
                setY(500f)
            }

            id = View.generateViewId()
        }
        binding.main.addView(button4)

        button4.setOnClickListener{
            val myToast = Toast.makeText(this,"button 4 clicked", Toast.LENGTH_SHORT)
            myToast.show()
        }

    }// on create the end

    override fun onClick(v: View?) {
       v?.let {
           when(v.id){
               R.id.button2 ->
                   Toast.makeText(this,"button 2 clicked",Toast.LENGTH_SHORT).show()
           }
       }
    } // end of the on click



    fun clickButton(v: View){
        val mToast = Toast.makeText(applicationContext,"button 3 clicked", Toast.LENGTH_SHORT)
        mToast.show()
    }
 */