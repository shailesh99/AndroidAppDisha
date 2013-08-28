package com.shatuh.disha;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;

public class SectionsPagerAdapter extends FragmentPagerAdapter implements ActionBar.TabListener,
		ViewPager.OnPageChangeListener {

	public Fragment fragment = null;
	private final ViewPager mViewPager;
	private final ActionBar mActionBar;

	public SectionsPagerAdapter(FragmentActivity fm, ViewPager pager) {
		super(fm.getSupportFragmentManager());
		mViewPager = pager;
		mViewPager.setAdapter(this);
		mViewPager.setOnPageChangeListener(this);

		mActionBar = fm.getActionBar();
		mActionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		mActionBar.setDisplayShowHomeEnabled(false);
		mActionBar.setDisplayShowTitleEnabled(false);

		ActionBar.Tab tabMap = mActionBar.newTab().setText("Transit Directions");
		ActionBar.Tab tabRickshaw = mActionBar.newTab().setText("Rickshaw Meter");
		ActionBar.Tab tabNews = mActionBar.newTab().setText("Newspapers");

		tabMap.setTabListener(this);
		tabRickshaw.setTabListener(this);
		tabNews.setTabListener(this);

		mActionBar.addTab(tabMap);
		mActionBar.addTab(tabRickshaw);
		mActionBar.addTab(tabNews);
	}

	@Override
	public Fragment getItem(int position) {
		switch (position) {
		case 0:
			fragment = new MapFragment();
			break;
		case 1:
			fragment = new RickshawFragment();
			break;
		case 2:
			fragment = new NewsFragment();
			break;
		}
		return fragment;
	}

	@Override
	public int getCount() {
		// Show 2 total pages.
		return 3;
	}

	// @Override
	// public CharSequence getPageTitle(int position) {
	// switch (position) {
	// case 0:
	// return "Transit Directions";
	// case 1:
	// return "Rickshaw Meter";
	// }
	// return null;
	// }

	// --------------------------------------------------------------------------------------

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// Log.v("mActionBar", "In onTabSelected!");
		try {
			mViewPager.setCurrentItem(tab.getPosition());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub

	}

	// -----------------------------------------------------------------------------------------

	@Override
	public void onPageScrollStateChanged(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPageSelected(int position) {
		// Log.v("mViewPager", "In onPageSelected!");
		mActionBar.setSelectedNavigationItem(position);
	}

}
