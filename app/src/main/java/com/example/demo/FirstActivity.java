package com.example.demo;

import android.content.Context;
import android.media.Image;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.CommonPagerTitleView;

import java.util.ArrayList;
import java.util.List;

public class FirstActivity extends AppCompatActivity {

//    private int imgIds[] = {,
//
//            R.drawable.aixin, R.drawable.huangguan, R.drawable.huangguan2, R.drawable.jiezhi,R.drawable.xiezi,
//            R.drawable.yifu, R.drawable.huazhuangp, R.drawable.youxiji,R.drawable.zhuanlun, R.drawable.zuanshi,
//
//            R.drawable.aixin, R.drawable.huangguan, R.drawable.huangguan2, R.drawable.jiezhi,R.drawable.xiezi,
//            R.drawable.yifu, R.drawable.huazhuangp, R.drawable.youxiji,R.drawable.zhuanlun, R.drawable.zuanshi,};
//    private List<View> viewList = new ArrayList<>();
//    private List<String> mDataList =new ArrayList<>();
//    int currentPosition;
    private float mPosX,mPosY,mCurPosX,mCurPosY;
    private RingView ringView;
    private ImageView leftImage,centerImage,rightImage;
    private int imgIds[]={R.drawable.aixin, R.drawable.huangguan, R.drawable.huangguan2, R.drawable.jiezhi,R.drawable.xiezi,
                R.drawable.yifu, R.drawable.huazhuangp, R.drawable.youxiji,R.drawable.zhuanlun, R.drawable.zuanshi};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
//        final ViewPager viewPager = (ViewPager) findViewById(R.id.first_viewpager);
//        for (int i = 0; i < imgIds.length; i++) {
//            View rootView = View.inflate(FirstActivity.this, R.layout.pager_item, null);
//            ImageView imageView = (ImageView) rootView.findViewById(R.id.pager_iv);
//            imageView.setImageResource(imgIds[i]);
//            viewList.add(i, rootView);
//        }
//        viewPager.setAdapter(new MyAdapter());
//        viewPager.setOffscreenPageLimit(30);
//        viewPager.setPageMargin(0);
//        viewPager.setCurrentItem(13);
//        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
//            private int leftOrRight = 0;
//            private int mViewPagerIndex ;
//            @Override
//            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//
//
//            }
//
//            @Override
//            public void onPageSelected(int position) {
//
//                currentPosition = position;
//            }
//
//            @Override
//            public void onPageScrollStateChanged(int state) {
//                if(state==1){//state有三种状态下文会将，当手指刚触碰屏幕时state的值为1，我们就在这个时候给mViewPagerIndex 赋值。
//                    mViewPagerIndex = viewPager.getCurrentItem();
//                }
//
//                if (state != ViewPager.SCROLL_STATE_IDLE) return;
//                if (currentPosition <=9 ) {
//                    viewPager.setCurrentItem(currentPosition+10,false);
//                } else if (currentPosition >= 20) {
//                    viewPager.setCurrentItem(currentPosition-10,false);
//                }
//            }
//
//
//        });
//        final MagicIndicator magicIndicator = (MagicIndicator) findViewById(R.id.first_magic);
//
//        CommonNavigator commonNavigator = new CommonNavigator(this);
//        commonNavigator.setAdapter(new CommonNavigatorAdapter() {
//
//            @Override
//            public int getCount() {
//                return imgIds == null ? 0 : imgIds.length;
//            }
//
//            @Override
//            public IPagerTitleView getTitleView(Context context, final int i) {
//                final CommonPagerTitleView commonPagerTitleView = new CommonPagerTitleView(FirstActivity.this);
//                commonPagerTitleView.setContentView(R.layout.item_tab);
//
//                // 初始化
//                final ImageView titleImg = (ImageView) commonPagerTitleView.findViewById(R.id.tab_image);
//                titleImg.setImageResource(imgIds[i]);
//                commonPagerTitleView.setOnPagerTitleChangeListener(new CommonPagerTitleView.OnPagerTitleChangeListener() {
//
//                    @Override
//                    public void onSelected(int i, int i1) {
//
//                    }
//
//                    @Override
//                    public void onDeselected(int i, int i1) {
//
//                    }
//
//                    @Override
//                    public void onLeave(int i, int i1, float v, boolean b) {
//                        titleImg.setScaleX(1.3f + (0.8f - 1.3f) *v );
//                        titleImg.setScaleY(1.3f + (0.8f - 1.3f) *v );
//                    }
//
//                    @Override
//                    public void onEnter(int i, int i1, float v, boolean b) {
//                        titleImg.setScaleX(0.8f + (1.3f - 0.8f) * v);
//                        titleImg.setScaleY(0.8f + (1.3f - 0.8f) * v);
//                    }
//
//
//
////                    @Override
////                    public void onLeave(int index, float leavePercent, boolean leftToRight) {
////
////                    }
////
////                    @Override
////                    public void onEnter(int index, float enterPercent, boolean leftToRight) {
////
////                    }
//                });
//
//                commonPagerTitleView.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//
//                    }
//                });
//
//                return commonPagerTitleView;
//            }
//
//
//            @Override
//            public IPagerIndicator getIndicator(Context context) {
//                return null;
//            }
//        });
//
//        magicIndicator.setNavigator(commonNavigator);
        ringView = (RingView)findViewById(R.id.first_ring);
        ringView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // TODO Auto-generated method stub
                switch (event.getAction()) {

                    case MotionEvent.ACTION_DOWN:
                        mPosX = event.getX();
                        mPosY = event.getY();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        mCurPosX = event.getX();
                        mCurPosY = event.getY();

                        break;
                    case MotionEvent.ACTION_UP:
//                        if (mCurPosY - mPosY > 0
//                                && (Math.abs(mCurPosY - mPosY) > 25)) {
//                            //向下滑動
//                            tiShi(mContext,"向下");
//
//                        } else if (mCurPosY - mPosY < 0
//                                && (Math.abs(mCurPosY - mPosY) > 25)) {
//                            //向上滑动
//                            tiShi(mContext,"向上");
//                        }
                        if (mCurPosX - mPosX > 0
                                && (Math.abs(mCurPosX - mPosX) > 25)) {
                            centerImage.setImageResource(imgIds[ringView.startRightAnimation(mPosX,mCurPosX)]);

                        } else if (mCurPosX - mPosX < 0
                                && (Math.abs(mCurPosX - mPosX) > 25)) {
                            centerImage.setImageResource(imgIds[ringView.startLeftAnimation(mPosX,mCurPosX)]);
                        }
                        break;
                }
                return true;
            }

        });
        leftImage = (ImageView)findViewById(R.id.first_image_1);
        centerImage = (ImageView)findViewById(R.id.first_image_2);
        rightImage = (ImageView)findViewById(R.id.first_image_3);

    }

//    private class MyAdapter extends PagerAdapter {
//
//
//        @Override
//        public int getCount() {
//            return viewList.size();
//        }
//
//        @Override
//        public boolean isViewFromObject(View view, Object object) {
//            return view == object;
//        }
//
//        @Override
//        public Object instantiateItem(ViewGroup container, int position) {
//            if (container.getChildAt(position)==null)
//            container.addView(viewList.get(position));
//            return viewList.get(position);
//        }
//
//        @Override
//        public void destroyItem(ViewGroup container, int position, Object object) {
//            container.removeView(viewList.get(position));
//        }
//
//    }



}
