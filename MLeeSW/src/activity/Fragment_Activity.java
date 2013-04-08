package activity;

import java.util.ArrayList;
import java.util.List;

import fragment.Fragment_01;
import fragment.Fragment_02;
import fragment.Fragment_03;
import fragment.Fragment_04;
import software.mlee.rev1.R;
import Adapter.StatePagerAdapter;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.WindowManager;

public class Fragment_Activity extends FragmentActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.fragmentactivity);
		
		
	}
}
