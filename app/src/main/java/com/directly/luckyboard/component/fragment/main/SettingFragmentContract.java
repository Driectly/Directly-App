package com.directly.luckyboard.component.fragment.main;

import com.directly.luckyboard.base.presenter.AbstractPresenter;
import com.directly.luckyboard.base.view.BaseView;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/17 15:14
 */

public class SettingFragmentContract {

    interface View extends BaseView {
        void showSetting();
    }

    interface Presenter extends AbstractPresenter<View> {
        void setting();
    }
}
