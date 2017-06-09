package com.example.qosmio.todo;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.icu.text.DateFormat;
//import android.icu.text.SimpleDateFormat;
//import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
 import java.util.Calendar;
import java.text.SimpleDateFormat;

import com.example.qosmio.todo.Models.todo;

/**
 * Created by Qosmio on 12/10/2016.
 */

public class customDialog extends DialogFragment {

    LayoutInflater inflater;
    View v;
    EditText titleText;
    EditText descriptionText;
    MainActivity ma = new MainActivity();
    todo td = new todo();


    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        inflater = getActivity().getLayoutInflater();
        v = inflater.inflate(R.layout.addtododialog,null);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Add new Todo");
        builder.setView(v).setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Calendar c = Calendar.getInstance();
                //String date = "" + c.get(Calendar.DATE) + " "+c.get(Calendar.MONTH)+ ", " + c.get(Calendar.YEAR);
                SimpleDateFormat df = new SimpleDateFormat("EEE, d MMM yyyy");
                String date = df.format(Calendar.getInstance().getTime());
                titleText = (EditText) v.findViewById(R.id.username);
                descriptionText = (EditText) v.findViewById(R.id.password);
                td.setTitle(titleText.getText().toString());
                td.setDescription(descriptionText.getText().toString());
                td.setDateTime(date);

                //System.out.println("TITLE: " + titleText.getText().toString());
                ma.todoList.add(td);
               ma.cl.notifyDataSetChanged();

            }
        });
        return builder.create();
    }
}
