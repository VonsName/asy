package com.github.qingmei2.sample.ui.main.home

import com.github.qingmei2.mvi.base.action.IAction

sealed class HomeAction : IAction {

    object InitialAction : HomeAction()

    object SwipeRefreshAction : HomeAction()

    data class ScrollStateChangedAction(val state: Int) : HomeAction()

    object ScrollToTopAction : HomeAction()
}