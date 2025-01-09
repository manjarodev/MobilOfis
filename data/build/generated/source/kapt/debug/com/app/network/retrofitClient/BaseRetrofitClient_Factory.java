package com.app.network.retrofitClient;

import com.app.network.helper.Session;
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
public final class BaseRetrofitClient_Factory implements Factory<BaseRetrofitClient> {
  private final Provider<Session> sessionProvider;

  public BaseRetrofitClient_Factory(Provider<Session> sessionProvider) {
    this.sessionProvider = sessionProvider;
  }

  @Override
  public BaseRetrofitClient get() {
    return newInstance(sessionProvider.get());
  }

  public static BaseRetrofitClient_Factory create(Provider<Session> sessionProvider) {
    return new BaseRetrofitClient_Factory(sessionProvider);
  }

  public static BaseRetrofitClient newInstance(Session session) {
    return new BaseRetrofitClient(session);
  }
}
