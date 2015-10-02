package com.bignerdranch.android.criminalintent;


import android.support.v4.app.Fragment;

/**
 * Created by garci_000 on 9/27/2015.
 */
public class CrimeListActivity extends SingleFragmentActivity
{
    @Override
    protected Fragment createFragment()
    {
        return new CrimeListFragment();
    }
}
