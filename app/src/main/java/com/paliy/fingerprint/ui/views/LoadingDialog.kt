package com.paliy.fingerprint.ui.views

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import com.paliy.fingerprint.R

class LoadingDialog constructor(
    private val dialog: Dialog
) {

  private var isShown = false

  fun show() {
    if (!isShown) {
      dialog.show()
    }
    isShown = true
  }

  fun hide() {
    if (isShown) {
      dialog.hide()
    }
    isShown = false
  }

  companion object {
    fun create(context: Context, root: ViewGroup): LoadingDialog {
      val dialog = Dialog(context)
      val dialogView = LayoutInflater.from(context)
          .inflate(R.layout.loading_dialog, root, false)
      dialog.setContentView(dialogView)
      if (dialog.window != null) {
        dialog.window!!.setBackgroundDrawable(
            ColorDrawable(Color.TRANSPARENT))
      }
      return LoadingDialog(dialog)
    }
  }
}