package com.chikeandroid.debtmanager20.addeditdebt;

import com.chikeandroid.debtmanager20.base.BasePresenter;
import com.chikeandroid.debtmanager20.base.BaseView;

/**
 * Created by Chike on 3/16/2017.
 */

public interface AddEditDebtContract {

    interface View extends BaseView<Presenter> {

        boolean isActive();

        void showErroSavingDebt();

        void showDebts();

        void showEmptyDebtError();

    }

    interface Presenter extends BasePresenter {

        void saveDebt(String name, String phoneNumber, double amount, String note, long createdDate,
                      long dueDate, int debtType, int status);


    }
}