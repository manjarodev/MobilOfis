package com.app.network.viewmodel;

import com.app.network.helper.Session;
import com.app.network.repository.HomeRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<HomeRepository> repositoryProvider;

  private final Provider<Session> _sessionProvider;

  public HomeViewModel_Factory(Provider<HomeRepository> repositoryProvider,
      Provider<Session> _sessionProvider) {
    this.repositoryProvider = repositoryProvider;
    this._sessionProvider = _sessionProvider;
  }

  @Override
  public HomeViewModel get() {
    return newInstance(repositoryProvider.get(), _sessionProvider.get());
  }

  public static HomeViewModel_Factory create(Provider<HomeRepository> repositoryProvider,
      Provider<Session> _sessionProvider) {
    return new HomeViewModel_Factory(repositoryProvider, _sessionProvider);
  }

  public static HomeViewModel newInstance(HomeRepository repository, Session _session) {
    return new HomeViewModel(repository, _session);
  }
}
