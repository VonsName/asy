package com.github.qingmei2.sample.ui.main.repos

import androidx.paging.PagedList
import com.github.qingmei2.mvi.base.viewstate.IViewState
import com.github.qingmei2.sample.entity.Repo

data class ReposViewState(
    val error: Throwable?,
    val isRefreshing: Boolean,
    val uiEvent: ReposUIEvent?
) : IViewState {

    companion object {

        fun idle(): ReposViewState {
            return ReposViewState(
                error = null,
                isRefreshing = false,
                uiEvent = null
            )
        }
    }
}

sealed class ReposUIEvent {

    data class InitialSuccess(val pageList: PagedList<Repo>) : ReposUIEvent()
    data class FloatActionButtonEvent(val visible: Boolean) : ReposUIEvent()
    object ScrollToTopEvent : ReposUIEvent()
}