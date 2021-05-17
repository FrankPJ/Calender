package com.szchoiceway.calendarviewproject.pager;


import android.support.v7.widget.LinearLayoutManager;

import com.szchoiceway.calendarviewproject.Article;
import com.szchoiceway.calendarviewproject.ArticleAdapter;
import com.szchoiceway.calendarviewproject.R;
import com.szchoiceway.calendarviewproject.base.fragment.BaseFragment;
import com.szchoiceway.calendarviewproject.group.GroupItemDecoration;
import com.szchoiceway.calendarviewproject.group.GroupRecyclerView;

public class PagerFragment extends BaseFragment {

    private GroupRecyclerView mRecyclerView;


    static PagerFragment newInstance() {
        return new PagerFragment();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_pager;
    }

    @Override
    protected void initView() {
        mRecyclerView = mRootView.findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        mRecyclerView.addItemDecoration(new GroupItemDecoration<String, Article>());
        mRecyclerView.setAdapter(new ArticleAdapter(mContext));
        mRecyclerView.notifyDataSetChanged();
    }

    @Override
    protected void initData() {

    }

    boolean isScrollTop() {
        return mRecyclerView != null && mRecyclerView.computeVerticalScrollOffset() == 0;
    }
}
