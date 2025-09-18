package io.appmetrica.analytics.impl;

import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.dj */
/* loaded from: classes2.dex */
public final class C5078dj implements InterfaceC4683Na {

    /* renamed from: a */
    public final /* synthetic */ String f31491a;

    /* renamed from: b */
    public final /* synthetic */ Map f31492b;

    public C5078dj(String str, Map map) {
        this.f31491a = str;
        this.f31492b = map;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4683Na
    /* renamed from: a */
    public final void mo19451a(InterfaceC4707Oa interfaceC4707Oa) {
        interfaceC4707Oa.reportEvent(this.f31491a, this.f31492b);
    }
}
