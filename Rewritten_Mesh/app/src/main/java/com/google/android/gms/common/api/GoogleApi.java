package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient;
import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.UnregisterListenerMethod;
import com.google.android.gms.common.api.internal.zaae;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zabv;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.common.internal.AccountType;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Collection;
import java.util.Collections;
import p000.S81;

/* loaded from: classes.dex */
public abstract class GoogleApi<O extends Api.ApiOptions> implements HasApiKey<O> {
    protected final GoogleApiManager zaa;
    private final Context zab;
    private final String zac;
    private final Api zad;
    private final Api.ApiOptions zae;
    private final ApiKey zaf;
    private final Looper zag;
    private final int zah;
    private final GoogleApiClient zai;
    private final StatusExceptionMapper zaj;

    @KeepForSdk
    public static class Settings {

        @KeepForSdk
        public static final Settings DEFAULT_SETTINGS = new Builder().build();
        public final StatusExceptionMapper zaa;
        public final Looper zab;

        @KeepForSdk
        public static class Builder {
            private StatusExceptionMapper zaa;
            private Looper zab;

            @KeepForSdk
            public Builder() {
            }

            @KeepForSdk
            public Settings build() {
                if (this.zaa == null) {
                    this.zaa = new ApiExceptionMapper();
                }
                if (this.zab == null) {
                    this.zab = Looper.getMainLooper();
                }
                return new Settings(this.zaa, this.zab);
            }

            @KeepForSdk
            public Builder setLooper(Looper looper) {
                Preconditions.checkNotNull(looper, "Looper must not be null.");
                this.zab = looper;
                return this;
            }

            @KeepForSdk
            public Builder setMapper(StatusExceptionMapper statusExceptionMapper) {
                Preconditions.checkNotNull(statusExceptionMapper, "StatusExceptionMapper must not be null.");
                this.zaa = statusExceptionMapper;
                return this;
            }
        }

        @KeepForSdk
        private Settings(StatusExceptionMapper statusExceptionMapper, Account account, Looper looper) {
            this.zaa = statusExceptionMapper;
            this.zab = looper;
        }

        public /* synthetic */ Settings(StatusExceptionMapper statusExceptionMapper, Account account, Looper looper, zae zaeVar) {
            this(statusExceptionMapper, null, looper);
        }
    }

    @KeepForSdk
    public GoogleApi(Activity activity, Api<O> api, O o, Settings settings) {
        this(activity, activity, api, o, settings);
    }

    private final BaseImplementation.ApiMethodImpl zad(int i, BaseImplementation.ApiMethodImpl apiMethodImpl) {
        apiMethodImpl.zak();
        this.zaa.zau(this, i, apiMethodImpl);
        return apiMethodImpl;
    }

    private final Task zae(int i, TaskApiCall taskApiCall) {
        S81 s81 = new S81();
        this.zaa.zav(this, i, taskApiCall, s81, this.zaj);
        return s81.f10598a;
    }

    @KeepForSdk
    public GoogleApiClient asGoogleApiClient() {
        return this.zai;
    }

    @KeepForSdk
    public ClientSettings.Builder createClientSettingsBuilder() {
        GoogleSignInAccount googleSignInAccount;
        GoogleSignInAccount googleSignInAccount2;
        ClientSettings.Builder builder = new ClientSettings.Builder();
        Api.ApiOptions apiOptions = this.zae;
        Account account = null;
        if (!(apiOptions instanceof Api.ApiOptions.HasGoogleSignInAccountOptions) || (googleSignInAccount2 = ((Api.ApiOptions.HasGoogleSignInAccountOptions) apiOptions).getGoogleSignInAccount()) == null) {
            Api.ApiOptions apiOptions2 = this.zae;
            if (apiOptions2 instanceof Api.ApiOptions.HasAccountOptions) {
                account = ((Api.ApiOptions.HasAccountOptions) apiOptions2).getAccount();
            }
        } else {
            String str = googleSignInAccount2.f18009d;
            if (str != null) {
                account = new Account(str, AccountType.GOOGLE);
            }
        }
        builder.zab(account);
        Api.ApiOptions apiOptions3 = this.zae;
        Collection collectionEmptySet = (!(apiOptions3 instanceof Api.ApiOptions.HasGoogleSignInAccountOptions) || (googleSignInAccount = ((Api.ApiOptions.HasGoogleSignInAccountOptions) apiOptions3).getGoogleSignInAccount()) == null) ? Collections.emptySet() : googleSignInAccount.m11103i0();
        builder.zaa(collectionEmptySet);
        builder.zac(this.zab.getClass().getName());
        builder.setRealClientPackageName(this.zab.getPackageName());
        return builder;
    }

    @KeepForSdk
    public Task disconnectService() {
        return this.zaa.zan(this);
    }

    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doBestEffortWrite(T t) {
        zad(2, t);
        return t;
    }

    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doRead(T t) {
        zad(0, t);
        return t;
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    @Deprecated
    public <A extends Api.AnyClient, T extends RegisterListenerMethod<A, ?>, U extends UnregisterListenerMethod<A, ?>> Task doRegisterEventListener(T t, U u) {
        Preconditions.checkNotNull(t);
        Preconditions.checkNotNull(u);
        Preconditions.checkNotNull(t.getListenerKey(), "Listener has already been released.");
        Preconditions.checkNotNull(u.getListenerKey(), "Listener has already been released.");
        Preconditions.checkArgument(Objects.equal(t.getListenerKey(), u.getListenerKey()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.zaa.zao(this, t, u, new Runnable() { // from class: com.google.android.gms.common.api.zad
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public Task doUnregisterEventListener(ListenerHolder.ListenerKey<?> listenerKey) {
        return doUnregisterEventListener(listenerKey, 0);
    }

    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doWrite(T t) {
        zad(1, t);
        return t;
    }

    public String getApiFallbackAttributionTag(Context context) {
        return null;
    }

    @Override // com.google.android.gms.common.api.HasApiKey
    public final ApiKey<O> getApiKey() {
        return this.zaf;
    }

    @KeepForSdk
    public O getApiOptions() {
        return (O) this.zae;
    }

    @KeepForSdk
    public Context getApplicationContext() {
        return this.zab;
    }

    @KeepForSdk
    public String getContextAttributionTag() {
        return this.zac;
    }

    @KeepForSdk
    @Deprecated
    public String getContextFeatureId() {
        return this.zac;
    }

    @KeepForSdk
    public Looper getLooper() {
        return this.zag;
    }

    @KeepForSdk
    public <L> ListenerHolder<L> registerListener(L l, String str) {
        return ListenerHolders.createListenerHolder(l, this.zag, str);
    }

    public final int zaa() {
        return this.zah;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Api.Client zab(Looper looper, zabq zabqVar) {
        ClientSettings clientSettingsBuild = createClientSettingsBuilder().build();
        Api.Client clientBuildClient = ((Api.AbstractClientBuilder) Preconditions.checkNotNull(this.zad.zaa())).buildClient(this.zab, looper, clientSettingsBuild, (ClientSettings) this.zae, (GoogleApiClient.ConnectionCallbacks) zabqVar, (GoogleApiClient.OnConnectionFailedListener) zabqVar);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (clientBuildClient instanceof BaseGmsClient)) {
            ((BaseGmsClient) clientBuildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag != null && (clientBuildClient instanceof NonGmsServiceBrokerClient)) {
            ((NonGmsServiceBrokerClient) clientBuildClient).zac(contextAttributionTag);
        }
        return clientBuildClient;
    }

    public final zact zac(Context context, Handler handler) {
        return new zact(context, handler, createClientSettingsBuilder().build());
    }

    @KeepForSdk
    @Deprecated
    public GoogleApi(Activity activity, Api<O> api, O o, StatusExceptionMapper statusExceptionMapper) {
        Settings.Builder builder = new Settings.Builder();
        builder.setMapper(statusExceptionMapper);
        builder.setLooper(activity.getMainLooper());
        this(activity, (Api) api, (Api.ApiOptions) o, builder.build());
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public <TResult, A extends Api.AnyClient> Task doBestEffortWrite(TaskApiCall<A, TResult> taskApiCall) {
        return zae(2, taskApiCall);
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public <TResult, A extends Api.AnyClient> Task doRead(TaskApiCall<A, TResult> taskApiCall) {
        return zae(0, taskApiCall);
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public Task doUnregisterEventListener(ListenerHolder.ListenerKey<?> listenerKey, int i) {
        Preconditions.checkNotNull(listenerKey, "Listener key cannot be null.");
        return this.zaa.zap(this, listenerKey, i);
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public <TResult, A extends Api.AnyClient> Task doWrite(TaskApiCall<A, TResult> taskApiCall) {
        return zae(1, taskApiCall);
    }

    private GoogleApi(Context context, Activity activity, Api api, Api.ApiOptions apiOptions, Settings settings) {
        String apiFallbackAttributionTag;
        Preconditions.checkNotNull(context, "Null context is not permitted.");
        Preconditions.checkNotNull(api, "Api must not be null.");
        Preconditions.checkNotNull(settings, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) Preconditions.checkNotNull(context.getApplicationContext(), "The provided context did not have an application context.");
        this.zab = context2;
        if (Build.VERSION.SDK_INT >= 30) {
            apiFallbackAttributionTag = context.getAttributionTag();
        } else {
            apiFallbackAttributionTag = getApiFallbackAttributionTag(context);
        }
        this.zac = apiFallbackAttributionTag;
        this.zad = api;
        this.zae = apiOptions;
        this.zag = settings.zab;
        ApiKey sharedApiKey = ApiKey.getSharedApiKey(api, apiOptions, apiFallbackAttributionTag);
        this.zaf = sharedApiKey;
        this.zai = new zabv(this);
        GoogleApiManager googleApiManagerZak = GoogleApiManager.zak(context2);
        this.zaa = googleApiManagerZak;
        this.zah = googleApiManagerZak.zaa();
        this.zaj = settings.zaa;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            zaae.zad(activity, googleApiManagerZak, sharedApiKey);
        }
        googleApiManagerZak.zaz(this);
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public <A extends Api.AnyClient> Task doRegisterEventListener(RegistrationMethods<A, ?> registrationMethods) {
        Preconditions.checkNotNull(registrationMethods);
        Preconditions.checkNotNull(registrationMethods.register.getListenerKey(), "Listener has already been released.");
        Preconditions.checkNotNull(registrationMethods.zaa.getListenerKey(), "Listener has already been released.");
        return this.zaa.zao(this, registrationMethods.register, registrationMethods.zaa, registrationMethods.zab);
    }

    @KeepForSdk
    @Deprecated
    public GoogleApi(Context context, Api<O> api, O o, Looper looper, StatusExceptionMapper statusExceptionMapper) {
        Settings.Builder builder = new Settings.Builder();
        builder.setLooper(looper);
        builder.setMapper(statusExceptionMapper);
        this(context, api, o, builder.build());
    }

    @KeepForSdk
    public GoogleApi(Context context, Api<O> api, O o, Settings settings) {
        this(context, (Activity) null, api, o, settings);
    }

    @KeepForSdk
    @Deprecated
    public GoogleApi(Context context, Api<O> api, O o, StatusExceptionMapper statusExceptionMapper) {
        Settings.Builder builder = new Settings.Builder();
        builder.setMapper(statusExceptionMapper);
        this(context, api, o, builder.build());
    }
}
