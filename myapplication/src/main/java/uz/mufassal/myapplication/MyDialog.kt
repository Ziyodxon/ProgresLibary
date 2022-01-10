package uz.mufassal.myapplication

import android.app.ProgressDialog
import android.content.Context
import java.util.logging.Handler

object MyDialog {

    fun showDialog(context : Context ,title : String ,timeout : Int){
        var show = ProgressDialog(context)
        show.setMessage(title)
        show.show()

        android.os.Handler().postDelayed({
            show.dismiss()
        } , timeout.toLong())

    }

}