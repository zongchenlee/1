package fragment;

import software.mlee.rev1.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment_01 extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		View 	view	= inflater.inflate(R.layout.fragment_01, container, false);
		Button 	btn1	= (Button)view.findViewById(R.id.fragment_btn1);
		
		btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
			}
		});
		
		return view;
	}
	

	
}
