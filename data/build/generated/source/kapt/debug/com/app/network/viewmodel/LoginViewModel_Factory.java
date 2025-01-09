package com.app.network.viewmodel;

import com.app.network.helper.Session;
import com.app.network.repository.LoginRepository;
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
public final class LoginViewModel_Factory implements Factory<LoginViewModel> {
  private final Provider<LoginRepository> repositoryProvider;

  private final Provider<Session> _sessionProvider;

  public LoginViewModel_Factory(Provider<LoginRepository> repositoryProvider,
      Provider<Session> _sessionProvider) {
    this.repositoryProvider = repositoryProvider;
    this._sessionProvider = _sessionProvider;
  }

  @Override
  public LoginViewModel get() {
    return newInstance(repositoryProvider.get(), _sessionProvider.get());
  }

  public static LoginViewModel_Factory create(Provider<LoginRepository> repositoryProvider,
      Provider<Session> _sessionProvider) {
    return new LoginViewModel_Factory(repositoryProvider, _sessionProvider);
  }

  public static LoginViewModel newInstance(LoginRepository repository, Session _session) {
    return new LoginViewModel(repository, _session);
  }
}
