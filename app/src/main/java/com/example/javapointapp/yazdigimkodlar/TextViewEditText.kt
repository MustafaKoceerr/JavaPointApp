package com.example.javapointapp.yazdigimkodlar

class TextViewEditText {

}


/*
  binding.button.setOnClickListener {
            val inputString = binding.editText.text.toString()
            if (inputString.isBlank())
                Toast.makeText(this,"please input data, edit text cannot be blank",Toast.LENGTH_SHORT).show()
            else
                binding.textViewShow.setText(inputString)
        }


        binding.textViewReset.setOnClickListener {
            if (binding.textViewShow.text.toString().isBlank())
                Toast.makeText(this,"clicked on reset textView,\n output textView already reset",Toast.LENGTH_LONG).show()
            else
                binding.textViewShow.setText("")
        }


        binding.editText.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                Toast.makeText(applicationContext,"executed before making any change over EditText",Toast.LENGTH_SHORT).show()
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                Toast.makeText(applicationContext,"executed while making any change over EditText",Toast.LENGTH_SHORT).show()
            }

            override fun afterTextChanged(s: Editable?) {
                Toast.makeText(applicationContext,"executed after change made over EditText",Toast.LENGTH_SHORT).show()
            }

        })
 */


// XML KISMI ##############################
/*
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/textView1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentTop="true"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="12dp"
        android:text="TextView and EditText"
        android:gravity="center"
        android:textAppearance="@style/Base.TextAppearance.AppCompat.Large"/>

    <TextView
        android:id="@+id/textViewInput"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@+id/textView1"
        android:layout_marginTop="90dp"
        android:layout_marginLeft="20dp"
        android:layout_marginStart="20dp"
        android:textSize="16sp"
        android:text="Provide Input" />

    <TextView
        android:id="@+id/textViewDisplay"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@+id/textViewInput"
        android:layout_marginTop="50dp"
        android:layout_marginLeft="20dp"
        android:layout_marginStart="20dp"
        android:textSize="16sp"
        android:text="Display Output" />

    <EditText
        android:id="@+id/editText"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignBaseline="@+id/textViewInput"
        android:layout_alignBottom="@+id/textViewInput"
        android:layout_alignParentEnd="true"
        android:layout_alignParentRight="true"
        android:layout_marginEnd="21dp"
        android:layout_marginRight="21dp"
        android:ems="10"
        android:inputType="textPersonName"
        android:minHeight="48dp"
        android:text=""
        tools:ignore="SpeakableTextPresentCheck" />

    <TextView
        android:id="@+id/textViewShow"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignLeft="@+id/editText"
        android:layout_alignStart="@+id/editText"
        android:layout_alignTop="@+id/textViewDisplay"
        android:textSize="16sp"
        android:text="TextView" />

    <Button
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@+id/textViewShow"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="112dp"
        android:text="Click Button" />

    <TextView
        android:id="@+id/textViewReset"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignEnd="@+id/editText"
        android:layout_alignRight="@+id/editText"
        android:layout_centerVertical="true"
        android:text="reset output text" />

</RelativeLayout>
 */