package com.splash.asusa455l.splash;
//12/08/2019
//10116037
//dwi lidya utami
//if-1

import android.content.Context;
import android.graphics.Color;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

//12/08/2019
//10116037
//dwi lidya utami
//if-1
public class SlideAdapter extends PagerAdapter {
    Context context;
    LayoutInflater inflater;

    //list of images
    public int[] images1= {
            R.drawable.image1,
            R.drawable.image_2,
            R.drawable.image_3,
            R.drawable.image_4,


    };

//list of titles
    public String[] title1= {
            "UNIKOM",
            "HOME",
            "DAFTAR KONTAK",
            "KONTAK",

} ;
    // list of description
    public String[] description1= {
            "Description 1",
            "Description 2",
            "Description 3",
            "Description 4",

    } ;

    //list of background colors
    public int[] backgroundcolors1={
            Color.rgb(55,55,55),
            Color.rgb(239,85,85),
            Color.rgb(110,49,89),
            Color.rgb(1,188,212),



    } ;
public SlideAdapter(Context context){
    this.context = context;
}
    @Override
    public int getCount() {
        return title1.length;
    }

    @Override
    public boolean isViewFromObject( View view, Object object) {
        return (view==(LinearLayout)object);

    }


    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater =(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view =inflater.inflate(R.layout.slide,container,false);
        LinearLayout layoutslide = view.findViewById(R.id.slideLinearLayout) ;
        ImageView imgslde =(ImageView)view.findViewById(R.id.slideimg);
        TextView txttitle= (TextView) view.findViewById(R.id.txttitle);
        TextView description= (TextView) view.findViewById(R.id.txtdescription);
        layoutslide.setBackgroundColor(backgroundcolors1[position]);
        imgslde.setImageResource(images1[position]);
        txttitle.setText(title1[position]);
        description.setText(description1[position]);
        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position,Object object) {
        container.removeView((LinearLayout)object);
    }
}
