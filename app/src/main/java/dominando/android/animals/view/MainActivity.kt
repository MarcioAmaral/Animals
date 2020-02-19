package dominando.android.animals.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import dominando.android.animals.R

class MainActivity : AppCompatActivity() {

    private lateinit var navControler: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Cria o <- link(seta) onTop para retornar na tela Destino
        navControler = Navigation.findNavController(this, R.id.fragment)
        NavigationUI.setupActionBarWithNavController(this, navControler)
    }

    //Qnado clicar <- tras de volta para a tela Origem
    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navControler, null)
    }
}
