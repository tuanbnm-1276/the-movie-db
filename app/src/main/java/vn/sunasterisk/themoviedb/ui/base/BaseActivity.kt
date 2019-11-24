package vn.sunasterisk.themoviedb.ui.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import vn.sunasterisk.themoviedb.BR

abstract class BaseActivity<ViewBinding : ViewDataBinding, ViewModel : BaseViewModel> :
    AppCompatActivity() {

    lateinit var viewBinding: ViewBinding
    abstract val viewModel: ViewModel

    @get: LayoutRes
    abstract val layoutId: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViewBinding()
        initView();
    }

    abstract fun initView()

    private fun initViewBinding() {
        viewBinding = DataBindingUtil.setContentView(this, layoutId)
        viewBinding.setVariable(BR.viewModel, viewModel)
    }
}
