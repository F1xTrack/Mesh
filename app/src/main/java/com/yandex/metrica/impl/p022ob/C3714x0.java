package com.yandex.metrica.impl.p022ob;

import java.util.Map;
import p000.AbstractC1374Vq;

/* renamed from: com.yandex.metrica.impl.ob.x0 */
/* loaded from: classes2.dex */
public class C3714x0 {

    /* renamed from: a */
    public final Map<String, String> f25216a;

    /* renamed from: b */
    public final String f25217b;

    /* renamed from: c */
    public final String f25218c;

    public C3714x0(String str, Map<String, String> map, String str2) {
        this.f25217b = str;
        this.f25216a = map;
        this.f25218c = str2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeferredDeeplinkState{mParameters=");
        sb.append(this.f25216a);
        sb.append(", mDeeplink='");
        sb.append(this.f25217b);
        sb.append("', mUnparsedReferrer='");
        return AbstractC1374Vq.m8593l(sb, this.f25218c, "'}");
    }
}
