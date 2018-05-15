package fragments;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import startprogramy.studio.com.startprogramy.Empresa;

import startprogramy.studio.com.startprogramy.R;

import java.util.ArrayList;
import java.util.List;

import classes.Category;


public class Guia extends Fragment {

    public RecyclerView recyclerView;
    public LinearLayoutManager mLayoutManagerLinear;
    public CustomAdapter adapter;

    public List<Category> lCategories = new ArrayList<>();

    public Guia(){}

    public static Guia newInstance(int idcid) {
        Guia fragment = new Guia();
        Bundle args = new Bundle();
        args.putInt("idcid", idcid);
        fragment.setArguments(args);
        return fragment;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_guia, container, false);
        final int idcid = getArguments().getInt("idcid");

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);

        mLayoutManagerLinear = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManagerLinear);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setHasFixedSize(true);

        lCategories.add(new Category(1,"Restaurante", R.mipmap.iconsrestaurante50));
        lCategories.add(new Category(2,"Academia", R.mipmap.iconsacademia50));
        lCategories.add(new Category(3,"Super Mercado", R.mipmap.icmercado50));
        lCategories.add(new Category(4,"Clinicas", R.mipmap.icclinica64));
        lCategories.add(new Category(5,"Faculdades", R.mipmap.icfaculdade50));
        lCategories.add(new Category(6,"PetShop", R.mipmap.icpet50));
        lCategories.add(new Category(7,"Cinemas", R.mipmap.iccinema50));
        lCategories.add(new Category(8,"Escolas", R.mipmap.icescola50));
        lCategories.add(new Category(10,"Outros", R.mipmap.icoutros64));



        atualizaRecyclerView();

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    public void atualizaRecyclerView() {
        adapter = new CustomAdapter(getActivity(), lCategories);
        recyclerView.setAdapter(adapter);
    }

    /***
     *  Adapter do RecyclerView
     *  ***/
    public class CustomAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        private final List<Category> lCategories;
        private final Context context;

        public CustomAdapter(Context context, List<Category> lCategories) {
            this.context = context;
            this.lCategories = lCategories;
        }

        @Override
        public int getItemCount() {
            return this.lCategories != null ? this.lCategories.size() : 0;
        }

        @Override
        public int getItemViewType(int position) {
            return 1;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.list_item_category, viewGroup, false);
            ContratacaoViewHolder holder = new ContratacaoViewHolder(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
            final Category category = lCategories.get(position);
            ContratacaoViewHolder fholder = (ContratacaoViewHolder) holder;

            if(position==0){
                fholder.llGeneral.setBackground(ContextCompat.getDrawable(context,R.drawable.style_category_first));
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );
                params.setMargins(converteDpToPx(12), converteDpToPx(1), converteDpToPx(12), converteDpToPx(0));
                fholder.llGeneral.setLayoutParams(params);
            }
            else if(position == lCategories.size()-1){
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
            }
            fholder.ivCategory.setImageResource(category.getImage());
            fholder.tvCategory.setText(category.getName());

            fholder.llGeneral.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Intent i = new Intent(getActivity(), Empresa.class);
                    i.putExtra("COD_CATEGORY", category.getId());
                    getActivity().startActivity(i);
                }
            });
        }

        public class ContratacaoViewHolder extends RecyclerView.ViewHolder {
            private final LinearLayout llGeneral;
            private final ImageView ivCategory;
            private final TextView tvCategory;

            public ContratacaoViewHolder(View itemView) {
                super(itemView);
                llGeneral = (LinearLayout) itemView.findViewById(R.id.llGeneral);
                ivCategory = (ImageView) itemView.findViewById(R.id.ivCategory);
                tvCategory = (TextView) itemView.findViewById(R.id.tvCategory);
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
