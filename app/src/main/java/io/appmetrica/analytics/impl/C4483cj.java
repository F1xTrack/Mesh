package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.cj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4483cj implements Na {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    public C4483cj(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // io.appmetrica.analytics.impl.Na
    public final void a(Oa oa) {
        oa.reportEvent(this.a, this.b);
    }
}
