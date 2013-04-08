package Adapter;

import java.util.ArrayList;
import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class StatePagerAdapter extends FragmentStatePagerAdapter {
	private List<Fragment> fragmentList = new ArrayList<Fragment>();

	public StatePagerAdapter(FragmentManager fragmentManager) {
		super(fragmentManager);
	}

	public void setListFragment(List<Fragment> fList) {
		fragmentList = fList;
	}
	
	@Override
	public Fragment getItem(int arg0) {
		return fragmentList.get(arg0);
	}

	@Override
	public int getCount() {
		return fragmentList.size();
	}

}
