package ru.ok.tracer;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import defpackage.AbstractC7287tn0;
import defpackage.AbstractC8449zu;
import defpackage.LB;
import defpackage.NN;
import defpackage.O90;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import ru.ok.tracer.base.apptoken.AppTokenUtils;
import ru.ok.tracer.base.builduuid.BuildUuidUtils;
import ru.ok.tracer.base.compat.PackageInfoCompat;
import ru.ok.tracer.base.compat.PackageManagerCompat;
import ru.ok.tracer.base.http.HttpClient;
import ru.ok.tracer.session.SessionState;
import ru.ok.tracer.session.SessionStateStorage;
import ru.ok.tracer.session.TagsStorage;
import ru.ok.tracer.utils.Logger;
import ru.ok.tracer.utils.config.ConfigStorage;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u00020\u00062\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\fJ%\u0010\u0012\u001a\u00020\u00062\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0010J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019R$\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8\u0006@BX\u0086.¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00168\u0006@BX\u0086.¢\u0006\f\n\u0004\b\u0017\u0010!\u001a\u0004\b\"\u0010#R$\u0010%\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020$8\u0006@BX\u0086.¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R$\u0010*\u001a\u00020)2\u0006\u0010\u001c\u001a\u00020)8\u0006@BX\u0086.¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001b\u00106\u001a\u0002018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109RB\u0010<\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020;0\r2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020;0\r8F@@X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010\u0010R\u0013\u0010C\u001a\u0004\u0018\u00010\u00048G¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lru/ok/tracer/Tracer;", "", "<init>", "()V", "", "userId", "LTf1;", "setUserId", "(Ljava/lang/String;)V", "key", "value", "setKey", "(Ljava/lang/String;Ljava/lang/String;)V", "", "map", "setKeys", "(Ljava/util/Map;)V", "setCustomProperty", "setCustomProperties", "Lru/ok/tracer/session/SessionState;", "getLastSessionState", "()Lru/ok/tracer/session/SessionState;", "Landroid/content/Context;", "context", "init$tracer_commons_release", "(Landroid/content/Context;)V", "init", "Lru/ok/tracer/TracerApplicationInfo;", "<set-?>", "applicationInfo", "Lru/ok/tracer/TracerApplicationInfo;", "getApplicationInfo", "()Lru/ok/tracer/TracerApplicationInfo;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lru/ok/tracer/session/SessionStateStorage;", "stateStorage", "Lru/ok/tracer/session/SessionStateStorage;", "getStateStorage", "()Lru/ok/tracer/session/SessionStateStorage;", "Lru/ok/tracer/session/TagsStorage;", "tagsStorage", "Lru/ok/tracer/session/TagsStorage;", "getTagsStorage", "()Lru/ok/tracer/session/TagsStorage;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInitialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lru/ok/tracer/base/http/HttpClient;", "httpClient$delegate", "Lkotlin/Lazy;", "getHttpClient", "()Lru/ok/tracer/base/http/HttpClient;", "httpClient", "Ljava/util/concurrent/ConcurrentHashMap;", "mutableCustomProperties", "Ljava/util/concurrent/ConcurrentHashMap;", "Lru/ok/tracer/TracerFeature;", "Lru/ok/tracer/TracerConfiguration;", "runtimeConfigs", "Ljava/util/Map;", "getRuntimeConfigs", "()Ljava/util/Map;", "setRuntimeConfigs$tracer_commons_release", "getAppToken", "()Ljava/lang/String;", "appToken", "tracer-commons_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes2.dex */
public final class Tracer {
    private static TracerApplicationInfo applicationInfo;
    private static Context context;
    private static SessionStateStorage stateStorage;
    private static TagsStorage tagsStorage;
    public static final Tracer INSTANCE = new Tracer();
    private static final AtomicBoolean isInitialized = new AtomicBoolean();

    /* renamed from: httpClient$delegate, reason: from kotlin metadata */
    private static final Lazy httpClient = LB.b(Tracer$httpClient$2.INSTANCE);
    private static final ConcurrentHashMap<String, String> mutableCustomProperties = new ConcurrentHashMap<>();
    private static volatile Map<TracerFeature, ? extends TracerConfiguration> runtimeConfigs = NN.a;

    private Tracer() {
    }

    public static final SessionState getLastSessionState() {
        try {
            return INSTANCE.getStateStorage().getPrevSessionState();
        } catch (Exception unused) {
            return null;
        }
    }

    public static final void setCustomProperties(Map<String, String> map) {
        O90.f(map, "map");
        try {
            INSTANCE.getStateStorage().setCustomProperties$tracer_commons_release(map);
        } catch (Exception unused) {
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value != null) {
                mutableCustomProperties.put(key, value);
            } else {
                mutableCustomProperties.remove(key);
            }
        }
    }

    public static final void setCustomProperty(String key, String value) {
        O90.f(key, "key");
        try {
            INSTANCE.getStateStorage().setCustomProperties$tracer_commons_release(AbstractC7287tn0.c(new Pair(key, value)));
        } catch (Exception unused) {
        }
        if (value != null) {
            mutableCustomProperties.put(key, value);
        } else {
            mutableCustomProperties.remove(key);
        }
    }

    public static final void setKey(String key, String value) {
        O90.f(key, "key");
        setKeys(AbstractC7287tn0.c(new Pair(key, value)));
    }

    public static final void setKeys(Map<String, String> map) {
        O90.f(map, "map");
        try {
            INSTANCE.getTagsStorage().setKeys$tracer_commons_release(map);
        } catch (Exception unused) {
        }
    }

    public static final void setUserId(String userId) {
        try {
            INSTANCE.getStateStorage().setUserId$tracer_commons_release(userId);
        } catch (Exception unused) {
        }
    }

    public final String getAppToken() {
        String overrideAppToken = CoreTracerConfiguration.INSTANCE.get().getOverrideAppToken();
        return overrideAppToken == null ? AppTokenUtils.getAppToken(getContext()) : overrideAppToken;
    }

    public final TracerApplicationInfo getApplicationInfo() {
        TracerApplicationInfo tracerApplicationInfo = applicationInfo;
        if (tracerApplicationInfo != null) {
            return tracerApplicationInfo;
        }
        O90.o("applicationInfo");
        throw null;
    }

    public final Context getContext() {
        Context context2 = context;
        if (context2 != null) {
            return context2;
        }
        O90.o("context");
        throw null;
    }

    public final HttpClient getHttpClient() {
        return (HttpClient) httpClient.getValue();
    }

    public final Map<TracerFeature, TracerConfiguration> getRuntimeConfigs() {
        if (isInitialized.get()) {
            return runtimeConfigs;
        }
        throw new IllegalStateException("Tracer is not initialized");
    }

    public final SessionStateStorage getStateStorage() {
        SessionStateStorage sessionStateStorage = stateStorage;
        if (sessionStateStorage != null) {
            return sessionStateStorage;
        }
        O90.o("stateStorage");
        throw null;
    }

    public final TagsStorage getTagsStorage() {
        TagsStorage tagsStorage2 = tagsStorage;
        if (tagsStorage2 != null) {
            return tagsStorage2;
        }
        O90.o("tagsStorage");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void init$tracer_commons_release(Context context2) throws PackageManager.NameNotFoundException {
        O90.f(context2, "context");
        if (isInitialized.getAndSet(true)) {
            throw new IllegalStateException("Tracer already initialized!");
        }
        context = context2;
        PackageManager packageManager = context2.getPackageManager();
        O90.e(packageManager, "context.packageManager");
        String packageName = context2.getPackageName();
        O90.e(packageName, "context.packageName");
        PackageInfo packageInfoCompat = PackageManagerCompat.getPackageInfoCompat(packageManager, packageName, 0);
        String str = packageInfoCompat.packageName;
        O90.e(str, "packageInfo.packageName");
        String str2 = packageInfoCompat.versionName;
        O90.e(str2, "packageInfo.versionName");
        applicationInfo = new TracerApplicationInfo(str, str2, PackageInfoCompat.getLongVersionCodeCompat(packageInfoCompat), BuildUuidUtils.getBuildUuid(context2));
        ConfigStorage.INSTANCE.init$tracer_commons_release(new Tracer$init$1(context2));
        stateStorage = new SessionStateStorage(context2);
        tagsStorage = new TagsStorage(context2);
        Logger.d$default("Tracer initialized!", null, 2, null);
        Context applicationContext = context2.getApplicationContext();
        O90.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new TracerActivityLifecycleCallbacks(getStateStorage()));
        if (context2 instanceof HasTracerConfiguration) {
            try {
                List<TracerConfiguration> tracerConfiguration = ((HasTracerConfiguration) context2).getTracerConfiguration();
                int iB = AbstractC7287tn0.b(AbstractC8449zu.k(tracerConfiguration));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj : tracerConfiguration) {
                    linkedHashMap.put(((TracerConfiguration) obj).getFeature(), obj);
                }
                runtimeConfigs = linkedHashMap;
            } catch (Exception unused) {
            }
        } else {
            Logger.w$default("Application does not implement HasTracerConfiguration", null, 2, null);
        }
        Map<String, String> initialKeys$tracer_commons_release = CoreTracerConfiguration.INSTANCE.get().getInitialKeys$tracer_commons_release();
        if (initialKeys$tracer_commons_release.isEmpty()) {
            return;
        }
        getTagsStorage().setKeys$tracer_commons_release(initialKeys$tracer_commons_release);
    }

    public final void setRuntimeConfigs$tracer_commons_release(Map<TracerFeature, ? extends TracerConfiguration> map) {
        O90.f(map, "<set-?>");
        runtimeConfigs = map;
    }
}
