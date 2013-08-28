package com.shatuh.disha;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;

public class MainActivity extends FragmentActivity {

	SectionsPagerAdapter mSectionsPagerAdapter;
	ViewPager mViewPager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mViewPager = (ViewPager) findViewById(R.id.pager);
		mSectionsPagerAdapter = new SectionsPagerAdapter(this, mViewPager);

		// ActionBar bar = getActionBar();
		// bar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		//
		// ActionBar.Tab tabMap = bar.newTab().setText("Transit Directions");
		// ActionBar.Tab tabRickshaw = bar.newTab().setText("Rickshaw Meter");
		//
		// tabMap.setTabListener(mSectionsPagerAdapter);
		// tabRickshaw.setTabListener(mSectionsPagerAdapter);
		//
		// bar.addTab(tabMap);
		// bar.addTab(tabRickshaw);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
