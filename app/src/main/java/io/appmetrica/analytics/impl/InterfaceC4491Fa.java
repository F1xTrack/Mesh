package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.location.Location;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.ExternalAttribution;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Fa */
/* loaded from: classes2.dex */
public interface InterfaceC4491Fa extends InterfaceC4367Aa, InterfaceC5446sc {
    /* renamed from: a */
    void mo19402a(Activity activity);

    @Override // io.appmetrica.analytics.impl.InterfaceC5446sc
    /* renamed from: a */
    /* synthetic */ void mo19312a(Location location);

    /* renamed from: a */
    void mo19403a(AnrListener anrListener);

    /* renamed from: a */
    void mo19404a(ExternalAttribution externalAttribution);

    /* renamed from: a */
    void mo19405a(C4430Cn c4430Cn);

    /* renamed from: a */
    void mo19406a(EnumC5333o enumC5333o);

    @Override // io.appmetrica.analytics.impl.InterfaceC4367Aa
    /* renamed from: a */
    /* synthetic */ void mo19186a(String str);

    @Override // io.appmetrica.analytics.impl.InterfaceC5446sc
    /* renamed from: a */
    /* synthetic */ void mo19314a(String str, String str2);

    /* renamed from: a */
    void mo19407a(String str, boolean z);

    @Override // io.appmetrica.analytics.impl.InterfaceC5446sc
    /* renamed from: a */
    /* synthetic */ void mo19315a(boolean z);

    /* renamed from: b */
    void mo19408b(Activity activity);

    /* renamed from: b */
    void mo19409b(String str);

    @Override // io.appmetrica.analytics.impl.InterfaceC4367Aa
    /* renamed from: b */
    /* synthetic */ void mo19187b(String str, String str2);

    @Override // io.appmetrica.analytics.impl.InterfaceC4367Aa
    /* renamed from: b */
    /* synthetic */ boolean mo19188b();

    /* renamed from: c */
    void mo19410c();

    /* renamed from: g */
    List<String> mo19411g();
}
