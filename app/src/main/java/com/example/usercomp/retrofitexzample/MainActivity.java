package com.example.usercomp.retrofitexzample;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;


    public class MainActivity extends AppCompatActivity {

        RecyclerView recyclerView;
        List<Customer> customers;
        ProgressDialog proDialog;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager manager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(manager);

        proDialog = new ProgressDialog(MainActivity.this);
        proDialog.setMessage("Please wait...");
        proDialog.setCancelable(false);
        proDialog.show();



        Request.getApi().getData("X8PBNzZE7h7f6BtDuiJn0bLbtYjFpI7r").enqueue(new Callback<MyCustomers>() {
            @Override
            public void onResponse(Call<MyCustomers> call, Response<MyCustomers> response) {

                    if (response != null) {
                        customers = new ArrayList<Customer>();
                        customers = response.body().getCustomers();
//                            JSONArray customersJsonArr = JsonResponse.getJSONArray("customers");
//                            for (int i=0; i<customersJsonArr.length(); i++)
//                            {
//                                JSONObject JSONobj = customersJsonArr.getJSONObject(i);
//                                Customer customer = new Customer();
//
//                                customer.setSite( JSONobj.has("site") ? JSONobj.getString("site") : "" );;
//                                customer.setEmail( JSONobj.has("email") ? JSONobj.getString("email") : "" );
//                                customer.setPatronymic( JSONobj.has("patronymic") ? JSONobj.getString("patronymic") : "" );
//                                customer.setLastName( JSONobj.has("lastName") ? JSONobj.getString("lastName") : "" );
//                                customer.setFirstName( JSONobj.has("firstName") ? JSONobj.getString("firstName") : "" );
//                                customer.setId(JSONobj.getInt("id"));
//
//                                if (JSONobj.has("createdAt")) {
//                                    String date = JSONobj.getString("createdAt");
//                                    java.text.DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//                                    try {
//                                        customer.setCreatedAt(format.parse(date));
//                                    } catch (Exception e) {
//
//                                    }
//                                }
//
//                                if (JSONobj.has("birthday")) {
//                                    String date = JSONobj.getString("birthday");
//                                    java.text.DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//                                    try {
//                                        customer.setBirthday(format.parse(date));
//                                    } catch (Exception e) {
//
//                                    }
//                                }
//
//
//                                customers.add(customer);
//
                        if (proDialog.isShowing()) proDialog.dismiss();



                    } else {
                        Log.e("ServiceHandler", "No data received from HTTP Request");
                    }

                    EditCostumer listener = new EditCostumer() {
                        @Override
                        public void onCostumerEdit(Customer costumer) {
                            Log.i("TAG", costumer.toString());
                        }
                    };

                    MyAdapter adapter = new MyAdapter(MainActivity.this,customers,listener);
                    recyclerView.setAdapter(adapter);

            }

            @Override
            public void onFailure(Call<MyCustomers> call, Throwable t) {
                TextView tv = (TextView) findViewById(R.id.hello);
                tv.setText("Error");
                proDialog.dismiss();

            }
        });

    }
        public interface EditCostumer {

            public void onCostumerEdit(Customer costumer);
        }
}
