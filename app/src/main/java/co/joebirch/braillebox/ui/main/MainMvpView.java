package co.joebirch.braillebox.ui.main;

import co.joebirch.braillebox.ui.base.MvpView;

interface MainMvpView extends MvpView {

    void showSequence(String sequence);

    void resetSolenoids();

}