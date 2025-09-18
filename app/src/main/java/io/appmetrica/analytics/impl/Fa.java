package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.location.Location;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.ExternalAttribution;
import java.util.List;

/* loaded from: classes2.dex */
public interface Fa extends Aa, InterfaceC4860sc {
    void a(Activity activity);

    @Override // io.appmetrica.analytics.impl.InterfaceC4860sc
    /* synthetic */ void a(Location location);

    void a(AnrListener anrListener);

    void a(ExternalAttribution externalAttribution);

    void a(Cn cn);

    void a(EnumC4752o enumC4752o);

    @Override // io.appmetrica.analytics.impl.Aa
    /* synthetic */ void a(String str);

    @Override // io.appmetrica.analytics.impl.InterfaceC4860sc
    /* synthetic */ void a(String str, String str2);

    void a(String str, boolean z);

    @Override // io.appmetrica.analytics.impl.InterfaceC4860sc
    /* synthetic */ void a(boolean z);

    void b(Activity activity);

    void b(String str);

    @Override // io.appmetrica.analytics.impl.Aa
    /* synthetic */ void b(String str, String str2);

    @Override // io.appmetrica.analytics.impl.Aa
    /* synthetic */ boolean b();

    void c();

    List<String> g();
}
