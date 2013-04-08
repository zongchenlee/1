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
import android.view.Menu;
import android.view.Window;

public class Main extends FragmentActivity{
	private ViewPager 			m_CPager;
	private StatePagerAdapter 	m_CAdapter;
	private List<Fragment>  	m_CFList = new ArrayList<Fragment>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main);
		
		Fragment_01 f1 = new Fragment_01();
		Fragment_02 f2 = new Fragment_02();
		Fragment_03 f3 = new Fragment_03();
		Fragment_04 f4 = new Fragment_04();
		m_CFList.add(f1);
		m_CFList.add(f2);
		m_CFList.add(f3);
		m_CFList.add(f4);
		
		m_CAdapter = new StatePagerAdapter(getSupportFragmentManager());
		m_CAdapter.setListFragment(m_CFList);
		
		m_CPager = (ViewPager)findViewById(R.id.pager);
		m_CPager.setAdapter(m_CAdapter);
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_01, menu);
		return true;
	}
 
}
