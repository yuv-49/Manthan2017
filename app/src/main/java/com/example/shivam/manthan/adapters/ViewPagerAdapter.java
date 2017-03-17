package com.example.shivam.manthan.adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.shivam.manthan.R;

/**
 * Created by Shivam on 16-03-2017.
 */

public class ViewPagerAdapter extends PagerAdapter {
    private Context context;
    private LayoutInflater layoutInflater;
    private Integer[] images = {R.drawable.gallery,R.drawable.photo,R.drawable.fun,R.drawable.mat,R.drawable.redix,
            R.drawable.tech};
    public ViewPagerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.custom_view_pager,null);
        ImageView imageView =(ImageView)view.findViewById(R.id.imageViewPager);
        imageView.setImageResource(images[position]);
        ViewPager vp = (ViewPager)container;
        vp.addView(view,0);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        ViewPager vp = (ViewPager)container;
        View view = (View)object;
        vp.removeView(view);

    }
}
