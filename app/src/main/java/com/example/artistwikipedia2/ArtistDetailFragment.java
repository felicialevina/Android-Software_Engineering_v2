package com.example.artistwikipedia2;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.artistwikipedia2.dummy.DummyContent;

/**
 * A fragment representing a single Artist detail screen.
 * This fragment is either contained in a {@link ArtistListActivity}
 * in two-pane mode (on tablets) or a {@link ArtistDetailActivity}
 * on handsets.
 */
public class ArtistDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private DummyContent.DummyItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ArtistDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = DummyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.content);
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.artist_detail, container, false);

        // Show the dummy content as text in a TextView.
        if (mItem != null) {
            if (mItem.id.equals("1")){
                rootView = inflater.inflate(R.layout.ariana,container,false);
            }
            if (mItem.id.equals("2")){
                rootView = inflater.inflate(R.layout.blackpink,container,false);
            }
            if (mItem.id.equals("3")){
                rootView = inflater.inflate(R.layout.bts,container,false);
            }
            if (mItem.id.equals("4")){
                rootView = inflater.inflate(R.layout.coldplay,container,false);
            }
            if (mItem.id.equals("5")){
                rootView = inflater.inflate(R.layout.halsey,container,false);
            }
            if (mItem.id.equals("6")){
                rootView = inflater.inflate(R.layout.maroon5,container,false);
            }
            if (mItem.id.equals("7")){
                rootView = inflater.inflate(R.layout.onedirection,container,false);
            }
            if (mItem.id.equals("8")){
                rootView = inflater.inflate(R.layout.sf9,container,false);
            }
        }
        return rootView;
    }
}