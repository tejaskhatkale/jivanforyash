//import android.content.Context
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//import androidx.annotation.LayoutRes
//import android.widget.ArrayAdapter
//import androidx.appcompat.app.AppCompatActivity
//import com.beingdeveloper.jivanseva.R
//
//class Spinner : AppCompatActivity()   {
//
//    override  fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_spinner)
//
//        // Dropdown options
//        val positionOptions = listOf("Manager", "Developer", "Designer", "Intern")
//        val genderOptions = listOf("Male", "Female", "Other")
//
//        // Setup position spinner
//        val spinnerPosition = findViewById<Spinner>(R.id.spinnerPosition)
//        val positionAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, positionOptions)
//        positionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//        spinnerPosition.adapter = positionAdapter
//
//        // Setup gender spinner
//        val spinnerGender = findViewById<Spinner>(R.id.spinnerGender)
//        val genderAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, genderOptions)
//        genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//        spinnerGender.adapter = genderAdapter
//    }
//}