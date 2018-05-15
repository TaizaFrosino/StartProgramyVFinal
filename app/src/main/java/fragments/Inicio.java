package fragments;


import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;


import java.util.ArrayList;
import java.util.List;

import classes.Advertising;
import de.hdodenhof.circleimageview.CircleImageView;
import startprogramy.studio.com.startprogramy.R;


public class Inicio extends Fragment {

    public ViewFlipper vFlipper;
    public RecyclerView recyclerView;
    public LinearLayoutManager mLayoutManagerLinear;
    public CustomAdapter adapter;

    public List<Advertising> ladversing = new ArrayList<>();



    public static Inicio newInstance(int idcid) {
        Inicio fragment = new Inicio();
        Bundle args = new Bundle();
        args.putInt("idcid", idcid);
        fragment.setArguments(args);
        return fragment;

    }

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_inicio, container, false);
        final int idcid = getArguments().getInt("idcid");

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView_id_inicio);
        vFlipper = (ViewFlipper) view.findViewById(R.id.v_flipper);
        int images[] = {R.mipmap.americanas, R.mipmap.coca, R.mipmap.americanas};

        for(int image:images){
            flipperImages(image);
        }



        mLayoutManagerLinear = new LinearLayoutManager(getActivity());
        adapter = new CustomAdapter(this.getActivity(),ladversing);
        recyclerView.setLayoutManager(new GridLayoutManager(this.getActivity(),2));
        recyclerView.setAdapter(adapter);

        ladversing.add(new Advertising("Restaurante","Categorie Book", "Description Book", R.mipmap.pizza1));
        ladversing.add(new Advertising("Restaurante","Categorie Book", "Description Book", R.mipmap.subw));
        ladversing.add(new Advertising("Restaurante","Categorie Book", "Description Book", R.mipmap.sanduiche));
        ladversing.add(new Advertising("Restaurante","Categorie Book", "Description Book", R.mipmap.pizza2));
        ladversing.add(new Advertising("Restaurante","Categorie Book", "Description Book", R.mipmap.polo));
        ladversing.add(new Advertising("Restaurante","Categorie Book", "Description Book", R.mipmap.fusion));
        ladversing.add(new Advertising("Restaurante","Categorie Book", "Description Book", R.mipmap.saude1));
        ladversing.add(new Advertising("Restaurante","Categorie Book", "Description Book", R.mipmap.xbox));
        ladversing.add(new Advertising("Restaurante","Categorie Book", "Description Book", R.mipmap.galaxys8));
        ladversing.add(new Advertising("Restaurante","Categorie Book", "Description Book", R.mipmap.tenis));
        ladversing.add(new Advertising("Restaurante","Categorie Book", "Description Book", R.mipmap.calca));
        ladversing.add(new Advertising("Restaurante","Categorie Book", "Description Book", R.mipmap.som));


        atualizaRecyclerView();

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    public void atualizaRecyclerView() {
        adapter = new CustomAdapter(getActivity(), ladversing);
        recyclerView.setAdapter(adapter);
    }

    public void flipperImages(int image){
        ImageView imageView = new ImageView(this.getActivity());
        imageView.setBackgroundResource(image);

        vFlipper.addView(imageView);
        vFlipper.setFlipInterval(3000);
        vFlipper.setAutoStart(true);

        vFlipper.setInAnimation(this.getActivity(), android.R.anim.slide_in_left);
        vFlipper.setOutAnimation(this.getActivity(), android.R.anim.slide_out_right);

    }
    /***
     *  Adapter do RecyclerView
     *  ***/

    public class CustomAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        private final List<Advertising> ladvertisings;
        private final Context context;

        public CustomAdapter(Context context, List<Advertising> ladvertisings) {
            this.context = context;
            this.ladvertisings = ladvertisings;
        }

        @Override
        public int getItemCount() {
            return this.ladvertisings != null ? this.ladvertisings.size() : 0;
        }

        @Override
        public int getItemViewType(int position) {
            return 1;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.card_view_item, viewGroup, false);
            MyViewHolder holder = new MyViewHolder(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
            final Advertising advertisings = ladvertisings.get(position);
            MyViewHolder fholder = (MyViewHolder) holder;

            fholder.tv_advertisings_title.setText(advertisings.getTitle());
            fholder.img_advertisings_thumbnail.setImageResource(advertisings.getThumbnail());



            fholder.cardView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {/*
                   Intent i = new Intent(getActivity(), Empresa.class);
                    i.putExtra("COD_CATEGORY", category.getId());
                    getActivity().startActivity(i);
               */ }
            });
        }

        public class MyViewHolder extends RecyclerView.ViewHolder {
            private final TextView tv_advertisings_title;
            private final ImageView img_advertisings_thumbnail;
            private final CardView cardView;


            public MyViewHolder(View itemView) {
                super(itemView);
                tv_advertisings_title = (TextView) itemView.findViewById(R.id.tv_advertisings_title);
                img_advertisings_thumbnail = (ImageView) itemView.findViewById(R.id.img_advertisings_thumbnail);
                cardView = (CardView) itemView.findViewById(R.id.card_view_inicio);

            }
        }



        }
    }


