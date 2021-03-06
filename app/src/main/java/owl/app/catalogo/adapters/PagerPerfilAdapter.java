package owl.app.catalogo.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import owl.app.catalogo.fragments.DeseosFragment;
import owl.app.catalogo.fragments.MisComprasFragment;
import owl.app.catalogo.fragments.PerfilFragment;

public class PagerPerfilAdapter extends FragmentStatePagerAdapter {

    private  int numberOfTabs;

   public PagerPerfilAdapter(FragmentManager fm , int numberOfTabs){
       super(fm);
       this.numberOfTabs = numberOfTabs;

   }

    @Override
    public Fragment getItem(int i) {

       switch (i){

           case 0: return new PerfilFragment();

           case 1: return new MisComprasFragment();

           case 2: return  new DeseosFragment();

           default:   return null;
       }


    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
