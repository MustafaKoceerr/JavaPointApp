package com.example.javapointapp.yazdigimkodlar

class CustomToastKaldirildiKullanma {
}

/*

        val inflater = layoutInflater
        val layout = inflater.inflate(R.layout.custom_toast, null) as LinearLayout


        binding.button.setOnClickListener {
            val myToast = Toast(applicationContext)
            myToast.duration = Toast.LENGTH_LONG
            myToast.setGravity(Gravity.CENTER_VERTICAL,0,0)
            myToast.view = layout
            myToast.show()
        }
 */

// XML KISMI ##############################

// custom_toast.xml  dosyası
/*
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:id="@+id/customToastMain"
    android:orientation="vertical">

    <ImageView
        android:layout_gravity="center"

        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:id="@+id/custom_toast_image"
        android:contentDescription="logo image"
        android:src="@drawable/details_icon"
        />

    <TextView
        android:layout_gravity="center"

        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:id="@+id/custom_toast_message"
        android:contentDescription="To"
        android:text="JavaTpoint custom Toast"/>


</LinearLayout>

 */

// activity_main.xml  dosyası
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

<Button
    android:id="@+id/button"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_marginBottom="8dp"
    android:layout_marginStart="8dp"
    android:layout_marginTop="8dp"
    android:layout_marginEnd="8dp"
    android:text="click for custom toast"
    app:layout_constraintBottom_toBottomOf="parent"
    app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintTop_toTopOf="parent"
    app:layout_constraintVertical_bias="0.266"

    />
</androidx.constraintlayout.widget.ConstraintLayout>
 */


