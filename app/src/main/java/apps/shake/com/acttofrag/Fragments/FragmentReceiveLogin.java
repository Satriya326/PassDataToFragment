package apps.shake.com.acttofrag.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import apps.shake.com.acttofrag.MainActivity;
import apps.shake.com.acttofrag.R;

public class FragmentReceiveLogin extends Fragment {

    private Button goToFrag1, goToFrag2, goToFrag3, goToSecondAct;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_receive_login, container, false);

        goToFrag1 = view.findViewById(R.id.submit);
        goToFrag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Going To Fragment1 1",Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).setViewPager(0);
            }
        });

        return view;
    }


}
