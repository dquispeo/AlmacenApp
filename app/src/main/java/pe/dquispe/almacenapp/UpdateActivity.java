package pe.dquispe.almacenapp;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.text.NumberFormat;
import java.util.Locale;

import pe.dquispe.almacenapp.models.Producto;
import pe.dquispe.almacenapp.services.ApiService;
import pe.dquispe.almacenapp.services.ApiServiceGenerator;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UpdateActivity extends AppCompatActivity {

    private static final String TAG = UpdateActivity.class.getSimpleName();

    private Long id;

    private ImageView fotoImage;
    private EditText nombreText, detallesText, precioText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

    }



}
