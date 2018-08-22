package don.com.optionmenu

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*
import android.text.Html


class MainActivity : AppCompatActivity() {


    //declare item
    lateinit var item1: MenuItem
    lateinit var item2: MenuItem

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onPrepareOptionsMenu(menu: Menu): Boolean {
        item1 = menu.findItem(R.id.action_settings)
        item2 = menu.findItem(R.id.action_other)
        return super.onPrepareOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item.itemId
        if (id == R.id.action_settings) {
            item1.setTitle(Html.fromHtml("<font color='#ff3824'>Settings</font>"))
            item2.title = Html.fromHtml("<font color='#000000'>OTHERS</font>")
            return true
        } else if (id == R.id.action_other) {
            item2.title = Html.fromHtml("<font color='#ff3824'>OTHERS</font>")
            item1.setTitle(Html.fromHtml("<font color='#000000'>Settings</font>"))
            return true
        } else
            return super.onOptionsItemSelected(item)
    }

}
