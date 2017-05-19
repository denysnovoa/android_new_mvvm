package com.androidmvvm.denysnovoa.android_new_mvvm.extensions

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

fun ViewGroup.inflate(layaoutRes: Int): View {
    return LayoutInflater.from(context).inflate(layaoutRes, this, false)
}