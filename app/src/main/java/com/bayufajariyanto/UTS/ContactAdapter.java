package com.bayufajariyanto.UTS;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {

    private ArrayList<Data> dataList;

    public ContactAdapter(ArrayList<Data> dataList) {
        this.dataList = dataList;
    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_view, parent, false);
        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtAlamat.setText(dataList.get(position).getAlamat());
        holder.txtNoHp.setText(dataList.get(position).getNohp());
//        holder.txtGender.setText(dataList.get(position).getGender());
        if(dataList.get(position).getGender().equalsIgnoreCase("L")){
            holder.image.setImageResource(R.drawable.pria);
        }else{
            holder.image.setImageResource(R.drawable.wanita);
        }
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        private TextView txtNama, txtAlamat, txtNoHp, txtGender;

        public ContactViewHolder(View itemView) {
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama);
            txtAlamat = (TextView) itemView.findViewById(R.id.txt_alamat);
            txtNoHp = (TextView) itemView.findViewById(R.id.txt_nohp);
            image = (ImageView) itemView.findViewById(R.id.txt_gender);
        }
    }
}