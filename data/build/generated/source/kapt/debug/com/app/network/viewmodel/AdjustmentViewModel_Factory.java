package com.app.network.viewmodel;

import com.app.network.helper.Session;
import com.app.network.repository.AdjustmentRepository;
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
public final class AdjustmentViewModel_Factory implements Factory<AdjustmentViewModel> {
  private final Provider<AdjustmentRepository> repositoryProvider;

  private final Provider<Session> _sessionProvider;

  public AdjustmentViewModel_Factory(Provider<AdjustmentRepository> repositoryProvider,
      Provider<Session> _sessionProvider) {
    this.repositoryProvider = repositoryProvider;
    this._sessionProvider = _sessionProvider;
  }

  @Override
  public AdjustmentViewModel get() {
    return newInstance(repositoryProvider.get(), _sessionProvider.get());
  }

  public static AdjustmentViewModel_Factory create(
      Provider<AdjustmentRepository> repositoryProvider, Provider<Session> _sessionProvider) {
    return new AdjustmentViewModel_Factory(repositoryProvider, _sessionProvider);
  }

  public static AdjustmentViewModel newInstance(AdjustmentRepository repository, Session _session) {
    return new AdjustmentViewModel(repository, _session);
  }
}
