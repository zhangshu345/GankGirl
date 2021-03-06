package com.dalingge.gankio.module.girl.imagepager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

import com.dalingge.gankio.data.model.GankBean;

import java.util.List;

/**
 * FileName:ImagePagerAdapter.java
 * Description:
 * Author:dingboyang
 * Email:445850053@qq.com
 * Date:16/4/4
 */
public class ImagePagerAdapter extends FragmentStatePagerAdapter {

    private ViewPager viewPager;
    private List<GankBean> resultsBeanList;
    private int index;
    public ImagePagerAdapter(FragmentManager fm, ViewPager viewPager, List<GankBean> resultsBeanList, int index) {
        super(fm);
        this.viewPager=viewPager;
        this.resultsBeanList=resultsBeanList;
        this.index=index;
    }

    @Override
    public int getCount() {
        return resultsBeanList.size();
    }

    @Override
    public Fragment getItem(int position) {
        return ImageViewFragment.newFragment(
                resultsBeanList.get(position).url,
                position == index);
    }

    public ImageViewFragment getCurrent() {
        return (ImageViewFragment) instantiateItem(viewPager, viewPager.getCurrentItem());
    }
}
