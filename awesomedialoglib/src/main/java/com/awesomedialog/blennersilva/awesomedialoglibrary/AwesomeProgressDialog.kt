package com.awesomedialog.blennersilva.awesomedialoglibrary

import android.content.Context
import android.graphics.PorterDuff
import androidx.core.content.ContextCompat
import android.widget.ProgressBar
import android.widget.RelativeLayout

import com.awesomedialog.blennersilva.awesomedialoglibrary.interfaces.Mode
import com.awesomedialog.blennersilva.awesomedialoglibrary.interfaces.setColorFilter

/**
 * Created by blennersilva on 23/08/17.
 */

class AwesomeProgressDialog(context: Context) : AwesomeDialogBuilder<AwesomeProgressDialog>(context) {

    private var progressBar: ProgressBar = findView(R.id.dialog_progress_bar)
    private var dialogBody: RelativeLayout = findView(R.id.dialog_body)

    override val layout: Int
        get() = R.layout.dialog_progress

    init {
        setColoredCircle(R.color.dialogProgressBackgroundColor)
        setProgressBarColor(R.color.white)
    }

    fun setDialogBodyBackgroundColor(color: Int): AwesomeProgressDialog {
        dialogBody.background.setColorFilter(ContextCompat.getColor(context!!, color), Mode.SRC_IN)
        return this
    }

    fun setProgressBarColor(color: Int): AwesomeProgressDialog {
        progressBar.indeterminateDrawable?.setColorFilter(ContextCompat.getColor(context!!, color), Mode.SRC_IN)
        return this
    }
}
