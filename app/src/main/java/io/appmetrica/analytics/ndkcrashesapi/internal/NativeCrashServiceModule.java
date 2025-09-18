package io.appmetrica.analytics.ndkcrashesapi.internal;

import android.content.Context;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH&¢\u0006\u0004\b\u0017\u0010\u0003¨\u0006\u0018"}, m22267d2 = {"Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrashServiceModule;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrashServiceConfig;", "config", "LTf1;", "init", "(Landroid/content/Context;Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrashServiceConfig;)V", "Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrashHandler;", "handler", "setDefaultCrashHandler", "(Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrashHandler;)V", "", "Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrash;", "getAllCrashes", "()Ljava/util/List;", "", CommonUrlParts.UUID, "markCrashCompleted", "(Ljava/lang/String;)V", "deleteCompletedCrashes", "ndkcrashes-api_release"}, m22268k = 1, m22269mv = {1, 6, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public abstract class NativeCrashServiceModule {
    public abstract void deleteCompletedCrashes();

    public abstract List<NativeCrash> getAllCrashes();

    public abstract void init(Context context, NativeCrashServiceConfig config);

    public abstract void markCrashCompleted(String uuid);

    public abstract void setDefaultCrashHandler(NativeCrashHandler handler);
}
