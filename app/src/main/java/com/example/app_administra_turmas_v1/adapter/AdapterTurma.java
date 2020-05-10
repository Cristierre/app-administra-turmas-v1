package com.example.app_administra_turmas_v1.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.app_administra_turmas_v1.R;
import com.example.app_administra_turmas_v1.entities.Turma;

import java.util.List;

public class AdapterTurma extends BaseAdapter {
    private List<Turma> listaTurma;
    private LayoutInflater inflater;

    public AdapterTurma(Context context, int support_simple_spinner_dropdown_item, List<Turma> lista) {
        this.listaTurma = lista;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return listaTurma.size();
    }

    @Override
    public Object getItem(int position) {
        return listaTurma.get(position);
    }

    @Override
    public long getItemId(int position) {
        return listaTurma.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ItemSuporte item;

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.componente_lista, null);
            item = new ItemSuporte();

            item.tvTurma = convertView.findViewById(R.id.tvlTurma);
            item.tvSala = convertView.findViewById(R.id.tvlSala);
            item.tvOnOf = convertView.findViewById(R.id.tvlOnOf);
            item.fundoTela = convertView.findViewById(R.id.layoutLista);

            convertView.setTag(item);

        }else {
            item = (ItemSuporte) convertView.getTag();
        }

        Turma turma = listaTurma.get(position);
        item.tvTurma.setText(turma.getTurma());
        item.tvSala.setText(turma.getSala());
        item.tvOnOf.setText(turma.getOnOf());

        if (position % 2 == 0){
            item.fundoTela.setBackgroundColor(Color.WHITE);
        }else{
            item.fundoTela.setBackgroundColor(0xa4c7dd);
        }


        return convertView;
    }

    private class ItemSuporte {
        TextView tvTurma, tvSala, tvOnOf;
        LinearLayout fundoTela;
    }
}
