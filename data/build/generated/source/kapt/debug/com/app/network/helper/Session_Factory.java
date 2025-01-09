package com.app.network.helper;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Session_Factory implements Factory<Session> {
  private final Provider<Context> contextProvider;

  public Session_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public Session get() {
    return newInstance(contextProvider.get());
  }

  public static Session_Factory create(Provider<Context> contextProvider) {
    return new Session_Factory(contextProvider);
  }

  public static Session newInstance(Context context) {
    return new Session(context);
  }
}
