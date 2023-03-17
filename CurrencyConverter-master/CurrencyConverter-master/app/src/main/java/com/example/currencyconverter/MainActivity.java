package com.example.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Currency;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    String[] countryNames;
    private Spinner countryNameSP;
    private TextView totalCurrencyTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryNames = getResources().getStringArray(R.array.countryNames);

        countryNameSP = findViewById(R.id.countryNameSP);
        totalCurrencyTV = findViewById(R.id.totalCurrencyTV);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,R.layout.spinner_sample_view,R.id.spinnerTextView,countryNames);
        countryNameSP.setAdapter(arrayAdapter);

        getCurrencyUpdate();
    }

    public void setTotalCurrencyTV(TextView totalCurrencyTV) {
        this.totalCurrencyTV = totalCurrencyTV;
    }

    private void getCurrencyUpdate() {

        Service service = RetrofitClass.getRetrofitInstance().create(Service.class);

        String url = String.format("");
        Call<Currency> currencyCall = service.getCurrency();
        currencyCall.enqueue(new Callback<Currency>() {
            @Override
            public void onResponse(Call<Currency> call, Response<Currency> response) {

                if(response.code() == 200){
                    Currency currency = response.body();


                }

            }


            @Override
            public void onFailure(Call<Currency> call, Throwable t) {

            }
        });

    }
}
