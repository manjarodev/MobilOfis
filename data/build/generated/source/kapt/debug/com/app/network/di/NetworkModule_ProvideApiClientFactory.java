package com.app.network.di;

import com.app.network.helper.Session;
import com.app.network.retrofitClient.APIService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class NetworkModule_ProvideApiClientFactory implements Factory<APIService> {
  private final NetworkModule module;

  private final Provider<Session> sessionProvider;

  public NetworkModule_ProvideApiClientFactory(NetworkModule module,
      Provider<Session> sessionProvider) {
    this.module = module;
    this.sessionProvider = sessionProvider;
  }

  @Override
  public APIService get() {
    return provideApiClient(module, sessionProvider.get());
  }

  public static NetworkModule_ProvideApiClientFactory create(NetworkModule module,
      Provider<Session> sessionProvider) {
    return new NetworkModule_ProvideApiClientFactory(module, sessionProvider);
  }

  public static APIService provideApiClient(NetworkModule instance, Session session) {
    return Preconditions.checkNotNullFromProvides(instance.provideApiClient(session));
  }
}
