package com.azocar.cesar.searchonmysqlnodejs.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.azocar.cesar.searchonmysqlnodejs.Interface.IPersonClickListener;
import com.azocar.cesar.searchonmysqlnodejs.Model.Person;
import com.azocar.cesar.searchonmysqlnodejs.R;

import java.util.List;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.MyViewHolder> {


    Context context;
    List<Person> personList;

    public PersonAdapter(Context context, List<Person> personList) {
        this.context = context;
        this.personList = personList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.person_layout,viewGroup,false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.name.setText(personList.get(i).getName());
        myViewHolder.email.setText(personList.get(i).getEmail());
        myViewHolder.phone.setText(personList.get(i).getPhone());

        if(i % 2 == 0)
            myViewHolder.root_view.setCardBackgroundColor(Color.parseColor("#E1E1E1"));

        myViewHolder.setPersonClickListener(new IPersonClickListener() {
            @Override
            public void onPersonClick(View view, int position) {
                Toast.makeText(context, ""+ personList.get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        });

        //myViewHolder



    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    public class MyViewHolder extends  RecyclerView.ViewHolder implements View.OnClickListener {

        CardView root_view;
        TextView name,phone,email;

        IPersonClickListener personClickListener;

        public void setPersonClickListener(IPersonClickListener personClickListener) {
            this.personClickListener = personClickListener;
        }

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            root_view = (CardView)itemView.findViewById(R.id.root_view);

            name = (TextView)itemView.findViewById(R.id.tvName);
            phone = (TextView)itemView.findViewById(R.id.tvPhone);
            email = (TextView)itemView.findViewById(R.id.tvMail);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            personClickListener.onPersonClick(view,getAdapterPosition());
        }
    }
}
