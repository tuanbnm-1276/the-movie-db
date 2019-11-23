package vn.sunasterisk.themoviedb.ui.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import vn.sunasterisk.themoviedb.utils.SingleLiveEvent

abstract class BaseViewModel : ViewModel() {

    // loading flag
    val isLoading = MutableLiveData<Boolean>().apply { value = true }

    // error message
    val errorMessage = MutableLiveData<String>()

    // optional flag
    val noInternetConnectionEvent = SingleLiveEvent<Unit>()
    val connectTimeOutEvent = SingleLiveEvent<Unit>()
    val forceUpdateAppEvent = SingleLiveEvent<Unit>()
    val serverMaintainEvent = SingleLiveEvent<Unit>()



    open fun showError(e: Throwable){
        errorMessage.value = e.message
    }

    fun showLoading(){
        isLoading.value = true
    }

    fun hideLoading(){
        isLoading.value = false
    }

    override fun onCleared() {
        super.onCleared()
    }
}
