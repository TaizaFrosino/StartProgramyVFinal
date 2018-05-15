package fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import classes.Event;
import startprogramy.studio.com.startprogramy.R;


public class Eventos extends Fragment {
    public RecyclerView recyclerView;
    public LinearLayoutManager mLayoutManagerLinear;
    public CustomAdapter adapter;

    public List<Event> lEventos= new ArrayList<>();



    public static Eventos newInstance(int idcid) {
        Eventos fragment = new Eventos();
        Bundle args = new Bundle();
        args.putInt("idcid", idcid);
        fragment.setArguments(args);
        return fragment;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_eventos, container, false);
        final int idcid = getArguments().getInt("idcid");


        recyclerView = (RecyclerView) v.findViewById(R.id.rv_eventos);

        mLayoutManagerLinear = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManagerLinear);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setHasFixedSize(true);


        lEventos.add(new Event(1, R.mipmap.ic_launcher,"Restaurante", "Um restaurtante muito bom"));
        lEventos.add(new Event(1, R.mipmap.ic_launcher,"Restaurante", "Um restaurtante muito bom"));
        lEventos.add(new Event(1, R.mipmap.ic_launcher,"Restaurante", "Um restaurtante muito bom"));
        lEventos.add(new Event(1, R.mipmap.ic_launcher,"Restaurante", "Um restaurtante muito bom"));
        lEventos.add(new Event(1, R.mipmap.ic_launcher,"Restaurante", "Um restaurtante muito bom"));
        lEventos.add(new Event(1, R.mipmap.ic_launcher,"Restaurante", "Um restaurtante muito bom"));
        lEventos.add(new Event(1, R.mipmap.ic_launcher,"Restaurante", "Um restaurtante muito bom"));
        lEventos.add(new Event(1, R.mipmap.ic_launcher,"Restaurante", "Um restaurtante muito bom"));
        lEventos.add(new Event(1, R.mipmap.ic_launcher,"Restaurante", "Um restaurtante muito bom"));
        lEventos.add(new Event(1, R.mipmap.ic_launcher,"Restaurante", "Um restaurtante muito bom"));
        lEventos.add(new Event(1, R.mipmap.ic_launcher,"Restaurante", "Um restaurtante muito bom"));
        lEventos.add(new Event(1, R.mipmap.ic_launcher,"Restaurante", "Um restaurtante muito bom"));






        atualizaRecyclerView();

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    public void atualizaRecyclerView() {
        adapter = new CustomAdapter(getActivity(), lEventos);
        recyclerView.setAdapter(adapter);
    }

    /***
     *  Adapter do RecyclerView
     *  ***/
    public class CustomAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        private final List<Event> lEventos;
        private final Context context;

        public CustomAdapter(Context context, List<Event> lEventos) {
            this.context = context;
            this.lEventos = lEventos;
        }

        @Override
        public int getItemCount() {
            return this.lEventos != null ? this.lEventos.size() : 0;
        }

        @Override
        public int getItemViewType(int position) {
            return 1;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.list_evento, viewGroup, false);
            ContratacaoViewHolder holder = new ContratacaoViewHolder(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
            final Event event = lEventos.get(position);
            ContratacaoViewHolder fholder = (ContratacaoViewHolder) holder;

            /*if(position==0){
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
            }*/

            fholder.ivEventos.setImageResource(event.getFotoEvento());
            fholder.tvEventos.setText(event.getEvento());
            fholder.tv_desc_Eventos.setText((event.getDescricao()));


        }

        public class ContratacaoViewHolder extends RecyclerView.ViewHolder {
            private final ImageView ivEventos;
            private final TextView tvEventos;
            private final TextView tv_desc_Eventos;

            public ContratacaoViewHolder(View itemView) {
                super(itemView);
                ivEventos = (ImageView) itemView.findViewById(R.id.ivEventos);
                tvEventos = (TextView) itemView.findViewById(R.id.tvEventos);
                tv_desc_Eventos = (TextView) itemView.findViewById(R.id.tv_desc_Eventos);
            }
        }

    }
}
