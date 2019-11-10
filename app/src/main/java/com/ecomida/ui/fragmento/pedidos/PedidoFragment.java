package com.ecomida.ui.fragmento.pedidos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.ecomida.R;

public class PedidoFragment extends Fragment {

    private PedidoViewModel pedidoViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        pedidoViewModel =
                ViewModelProviders.of(this).get(PedidoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_pedido, container, false);
        final TextView textView = root.findViewById(R.id.text_pedido);
        pedidoViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}