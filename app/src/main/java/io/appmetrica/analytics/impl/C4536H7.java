package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;
import p000.AbstractC1374Vq;

/* renamed from: io.appmetrica.analytics.impl.H7 */
/* loaded from: classes2.dex */
public final class C4536H7 {

    /* renamed from: a */
    public final Map f30242a;

    /* renamed from: b */
    public final String f30243b;

    /* renamed from: c */
    public final String f30244c;

    public C4536H7(String str, HashMap map, String str2) {
        this.f30243b = str;
        this.f30242a = map;
        this.f30244c = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeferredDeeplinkState{mParameters=");
        sb.append(this.f30242a);
        sb.append(", mDeeplink='");
        sb.append(this.f30243b);
        sb.append("', mUnparsedReferrer='");
        return AbstractC1374Vq.m8593l(sb, this.f30244c, "'}");
    }
}
