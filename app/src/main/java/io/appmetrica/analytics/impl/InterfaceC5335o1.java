package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

/* renamed from: io.appmetrica.analytics.impl.o1 */
/* loaded from: classes2.dex */
public interface InterfaceC5335o1 {
    /* renamed from: a */
    /* synthetic */ void mo19249a(Intent intent);

    /* renamed from: a */
    /* synthetic */ void mo19250a(Intent intent, int i);

    /* renamed from: a */
    /* synthetic */ void mo19251a(Intent intent, int i, int i2);

    /* renamed from: a */
    void mo19253a(InterfaceC5310n1 interfaceC5310n1);

    /* renamed from: b */
    /* synthetic */ void mo19255b(Intent intent);

    /* renamed from: c */
    /* synthetic */ void mo19257c(Intent intent);

    /* synthetic */ void onConfigurationChanged(Configuration configuration);

    /* synthetic */ void onCreate();

    /* synthetic */ void onDestroy();

    void pauseUserSession(Bundle bundle);

    void reportData(int i, Bundle bundle);

    void resumeUserSession(Bundle bundle);
}
