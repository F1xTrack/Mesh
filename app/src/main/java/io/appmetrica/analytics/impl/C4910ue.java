package io.appmetrica.analytics.impl;

import defpackage.AbstractC7209tN0;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ue */
/* loaded from: classes2.dex */
public final class C4910ue implements N7 {
    public final He a;
    public final List<C4886te> b;

    public C4910ue(He he, List<C4886te> list) {
        this.a = he;
        this.b = list;
    }

    @Override // io.appmetrica.analytics.impl.N7
    public final List<C4886te> a() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.impl.N7
    public final Object b() {
        return this.a;
    }

    public final He c() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreloadInfoData{chosenPreloadInfo=");
        sb.append(this.a);
        sb.append(", candidates=");
        return AbstractC7209tN0.A(sb, this.b, '}');
    }
}
