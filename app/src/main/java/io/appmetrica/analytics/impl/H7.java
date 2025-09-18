package io.appmetrica.analytics.impl;

import defpackage.AbstractC1705Vq;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class H7 {
    public final Map a;
    public final String b;
    public final String c;

    public H7(String str, HashMap map, String str2) {
        this.b = str;
        this.a = map;
        this.c = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeferredDeeplinkState{mParameters=");
        sb.append(this.a);
        sb.append(", mDeeplink='");
        sb.append(this.b);
        sb.append("', mUnparsedReferrer='");
        return AbstractC1705Vq.l(sb, this.c, "'}");
    }
}
