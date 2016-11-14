package com.example.bradcampbell.kapt2autovaluebug

import com.google.auto.value.AutoValue

@AutoValue
abstract class MyAutoValueClass {
  abstract fun test(): Int

  /** Can be any override method */
  override fun hashCode(): Int {
    return super.hashCode()
  }
}
