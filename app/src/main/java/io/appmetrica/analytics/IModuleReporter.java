package io.appmetrica.analytics;

/* loaded from: classes2.dex */
public interface IModuleReporter {
    void reportAdRevenue(AdRevenue adRevenue, boolean z);

    void reportEvent(ModuleEvent moduleEvent);

    void setSessionExtra(String str, byte[] bArr);
}
