package ebinjoy999.app.screens.home

import dagger.Module
import dagger.Provides
import ebinjoy999.app.api.ApiHelper
import ebinjoy999.app.screens.home.presenter.HomeActivityPresenter
import ebinjoy999.app.screens.home.presenter.HomeActivityPresenterImpl
import ebinjoy999.app.screens.home.view.HomeActivity
import ebinjoy999.app.screens.home.scope.HomeActivityScope
import ebinjoy999.app.screens.home.view.HomeActivityView
import io.reactivex.disposables.CompositeDisposable

/**
 * Created by ebinjoy999 on 01/06/19.
 */

@Module
class HomeActivityModule {
    var homeActivity: HomeActivity
    constructor(homeActivity: HomeActivity) {
        this.homeActivity = homeActivity
    }

    @Provides
    @HomeActivityScope
    fun getHomeActivityPresenter( mApiHelper: ApiHelper): HomeActivityPresenterImpl<HomeActivityView> {
        return HomeActivityPresenterImpl<HomeActivityView>();
    }

    @Provides
    @HomeActivityScope
    internal fun provideCompositeDisposable(): CompositeDisposable {
        return CompositeDisposable()
    }
}