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


import java.util.ArrayList;
import java.util.List;

import classes.Advertising;
import de.hdodenhof.circleimageview.CircleImageView;
import startprogramy.studio.com.startprogramy.R;


public class Inicio extends Fragment {

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


        mLayoutManagerLinear = new LinearLayoutManager(getActivity());
        adapter = new CustomAdapter(this.getActivity(),ladversing);
        recyclerView.setLayoutManager(new GridLayoutManager(this.getActivity(),2));
        recyclerView.setAdapter(adapter);
      //  recyclerView.setLayoutManager(mLayoutManagerLinear);
      //  recyclerView.setItemAnimator(new DefaultItemAnimator());
      // recyclerView.setHasFixedSize(true);

        ladversing.add(new Advertising("Restaurante","Categorie Book", "Description Book", R.mipmap.pizza1, R.mipmap.pizza));
        ladversing.add(new Advertising("Restaurante","Categorie Book", "Description Book", R.mipmap.subw, R.mipmap.logosubway));
        ladversing.add(new Advertising("Restaurante","Categorie Book", "Description Book", R.mipmap.sanduiche, R.mipmap.sanduba));
        ladversing.add(new Advertising("Restaurante","Categorie Book", "Description Book", R.mipmap.pizza2, R.mipmap.pizzaria));
        ladversing.add(new Advertising("Restaurante","Categorie Book", "Description Book", R.mipmap.polo, R.mipmap.volks));
        ladversing.add(new Advertising("Restaurante","Categorie Book", "Description Book", R.mipmap.fusion, R.mipmap.ford));
        ladversing.add(new Advertising("Restaurante","Categorie Book", "Description Book", R.mipmap.saude1, R.mipmap.saude));
        ladversing.add(new Advertising("Restaurante","Categorie Book", "Description Book", R.mipmap.xbox, R.mipmap.microsoft));
        ladversing.add(new Advertising("Restaurante","Categorie Book", "Description Book", R.mipmap.galaxys8, R.mipmap.samsung));
        ladversing.add(new Advertising("Restaurante","Categorie Book", "Description Book", R.mipmap.tenis, R.mipmap.adida));
        ladversing.add(new Advertising("Restaurante","Categorie Book", "Description Book", R.mipmap.calca, R.mipmap.adidas));
        ladversing.add(new Advertising("Restaurante","Categorie Book", "Description Book", R.mipmap.som, R.mipmap.som1));


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

        /*    if(position==0){
                fholder.llGeneral.setBackground(ContextCompat.getDrawable(context,R.drawable.style_category_first));
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );
                params.setMargins(converteDpToPx(12), converteDpToPx(1), converteDpToPx(12), converteDpToPx(0));
                fholder.llGeneral.setLayoutParams(params);
            }
            else if(position == ladvertisings.size()-1){
                fholder.llGeneral.setBackground(ContextCompat.getDrawable(context,R.drawable.style_category_last));
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );
                params.setMargins(converteDpToPx(12), converteDpToPx(1), converteDpToPx(12), converteDpToPx(16));
                fholder.llGeneral.setLayoutParams(params);
            }
            else {
                fholder.llGeneral.setBackground(ContextCompat.getDrawable(context, R.drawable.style_category));
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );
                params.setMargins(converteDpToPx(12), converteDpToPx(1), converteDpToPx(12), converteDpToPx(0));
                fholder.llGeneral.setLayoutParams(params);
            }*/

            fholder.tv_advertisings_title.setText(advertisings.getTitle());
            //fholder.tv_id_inicio.setText(advertisings.getCategory());
            fholder.img_advertisings_thumbnail.setImageResource(advertisings.getThumbnail());
            fholder.imageCircle.setImageResource(advertisings.getImageCircle());


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
          //  private final TextView tv_id_inicio;
            private final ImageView img_advertisings_thumbnail;
            private final CardView cardView;
            private CircleImageView imageCircle;

            public MyViewHolder(View itemView) {
                super(itemView);
                tv_advertisings_title = (TextView) itemView.findViewById(R.id.tv_advertisings_title);
               // tv_id_inicio =  (TextView) itemView.findViewById(R.id.tv_id_inicio);
                img_advertisings_thumbnail = (ImageView) itemView.findViewById(R.id.img_advertisings_thumbnail);
                cardView = (CardView) itemView.findViewById(R.id.card_view_inicio);
                imageCircle = (CircleImageView) itemView.findViewById(R.id.civ_inicio);
            }
        }

        public int converteDpToPx(int dp){
            Resources r = context.getResources();
            return (int) TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP,
                    dp,
                    r.getDisplayMetrics()
            );
        }
    }
}


