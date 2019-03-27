package net.lzzy.cinemanager.fragments;


import net.lzzy.cinemanager.R;

/**
 *
 * @author lzzy_gxy
 * @date 2019/3/26
 * Description:
 */
public class OrdersFragment extends BaseFragment {

    @Override
    protected void populate() {
        find(R.id.fragment_order_edt);
    }

    @Override
    public int getLayoutRes() {
        return R.layout.fragment_orders;
    }
}
