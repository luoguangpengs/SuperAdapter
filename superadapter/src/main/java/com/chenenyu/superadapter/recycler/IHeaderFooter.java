package com.chenenyu.superadapter.recycler;

import android.view.View;

/**
 * Interface that contains methods for header and footer.
 * Created by Cheney on 16/1/12.
 */
interface IHeaderFooter {
    View getHeaderView();

    View getFooterView();

    void addHeaderView(View header);

    void addFooterView(View footer);

    boolean removeHeaderView();

    boolean removeFooterView();

    boolean hasHeaderView();

    boolean hasFooterView();

    boolean isHeaderView(int position);

    boolean isFooterView(int position);
}
