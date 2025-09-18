package io.appmetrica.analytics.impl;

import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.dj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4508dj implements Na {
    public final /* synthetic */ String a;
    public final /* synthetic */ Map b;

    public C4508dj(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    @Override // io.appmetrica.analytics.impl.Na
    public final void a(Oa oa) {
        oa.reportEvent(this.a, this.b);
    }
}
