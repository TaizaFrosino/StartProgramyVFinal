package startprogramy.studio.com.startprogramy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import java.util.ArrayList;
import java.util.List;

import classes.*;
import classes.AdvertisingEmpresa;
import fragments.Inicio;

public class DetalheEmpresa extends AppCompatActivity {

    public RecyclerView recyclerView;
    public Inicio.CustomAdapter adapter;

    List<AdvertisingEmpresa> lstAdvertisingEmpresa;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_empresa);




        lstAdvertisingEmpresa = new ArrayList<>();
        lstAdvertisingEmpresa.add(new AdvertisingEmpresa("Pizza Calabresa","Categoria", "Descrição",R.mipmap.pizza));
        lstAdvertisingEmpresa.add(new AdvertisingEmpresa("Pizza de Queijo Mussarela","Categoria", "Descrição",R.mipmap.pizza2));
        lstAdvertisingEmpresa.add(new AdvertisingEmpresa("Pizza Portuguesa","Categoria", "Descrição",R.mipmap.pizza1));
        lstAdvertisingEmpresa.add(new AdvertisingEmpresa("Pizza Nordestina","Categoria", "Descrição",R.mipmap.pizzaria));
        lstAdvertisingEmpresa.add(new AdvertisingEmpresa("Pizza","Categoria", "Descrição",R.mipmap.pizza));
        lstAdvertisingEmpresa.add(new AdvertisingEmpresa("Pizza","Categoria", "Descrição",R.mipmap.pizza2));
        lstAdvertisingEmpresa.add(new AdvertisingEmpresa("Pizza","Categoria", "Descrição",R.mipmap.pizza1));
        lstAdvertisingEmpresa.add(new AdvertisingEmpresa("Pizza","Categoria", "Descrição",R.mipmap.pizzaria));


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView_id_detalhe);

        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstAdvertisingEmpresa);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setAdapter(myAdapter);







    }






}





