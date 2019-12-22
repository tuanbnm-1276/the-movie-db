package vn.sunasterisk.themoviedb.ui.screen.main

import org.koin.androidx.viewmodel.ext.android.viewModel
import vn.sunasterisk.themoviedb.R
import vn.sunasterisk.themoviedb.databinding.ActivityMainBinding
import vn.sunasterisk.themoviedb.ui.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    override val viewModel: MainViewModel by viewModel()

    override val layoutId: Int = R.layout.activity_main

    override fun initView() {

    }

}
