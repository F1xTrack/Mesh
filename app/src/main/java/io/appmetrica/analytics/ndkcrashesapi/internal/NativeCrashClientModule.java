package io.appmetrica.analytics.ndkcrashesapi.internal;

import android.content.Context;
import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m22267d2 = {"Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrashClientModule;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrashClientConfig;", "config", "LTf1;", "initHandling", "(Landroid/content/Context;Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrashClientConfig;)V", "", "metadata", "updateAppMetricaMetadata", "(Ljava/lang/String;)V", "ndkcrashes-api_release"}, m22268k = 1, m22269mv = {1, 6, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public abstract class NativeCrashClientModule {
    public abstract void initHandling(Context context, NativeCrashClientConfig config);

    public abstract void updateAppMetricaMetadata(String metadata);
}
