package com.app.network.di;

import android.content.Context;
import com.app.network.helper.Session;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class SessionModule_ProvideSessionFactory implements Factory<Session> {
  private final SessionModule module;

  private final Provider<Context> contextProvider;

  public SessionModule_ProvideSessionFactory(SessionModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public Session get() {
    return provideSession(module, contextProvider.get());
  }

  public static SessionModule_ProvideSessionFactory create(SessionModule module,
      Provider<Context> contextProvider) {
    return new SessionModule_ProvideSessionFactory(module, contextProvider);
  }

  public static Session provideSession(SessionModule instance, Context context) {
    return Preconditions.checkNotNullFromProvides(instance.provideSession(context));
  }
}
