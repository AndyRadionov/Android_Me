package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;


/**
 * @author Andrey Radionov
 */

public class MasterListFragment extends Fragment {

    public MasterListFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_master_list, container, false);

        GridView allImagesView = (GridView) rootView.findViewById(R.id.all_images_view);
        MasterListAdapter adapter = new MasterListAdapter(getActivity(), AndroidImageAssets.getAll());
        allImagesView.setAdapter(adapter);

        return rootView;
    }
}
