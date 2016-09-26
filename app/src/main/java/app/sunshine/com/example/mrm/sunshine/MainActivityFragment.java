package app.sunshine.com.example.mrm.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
     String data[]={ "Mon 6/23 - Sunny - 31/17",
             "Tue 6/24 - Foggy - 21/8",
             "Wed 6/25 - Cloudy - 22/17",
             "Thurs 6/26 - Rainy - 18/11",
             "Fri 6/27 - Foggy - 21/10",
             "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
             "Sun 6/29 - Sunny - 20/7"};
    ArrayList<String> fakeData;
    ArrayAdapter<String> adapter;
    ListView list;


    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fakeData=new ArrayList<String>(Arrays.asList(data));
        View toolView =inflater.inflate(R.layout.fragment_main, container, false);
        fakeData=new ArrayList<String>(Arrays.asList(data));
        adapter=new ArrayAdapter<String>(getActivity(),R.layout.the_list_view_shap,R.id.the_Text,fakeData);
        list = (ListView) toolView.findViewById(R.id.myListV);
        list.setAdapter(adapter);

        return toolView;
    }
}
