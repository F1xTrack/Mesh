package com.yandex.metrica.impl.ob;

import defpackage.AbstractC1705Vq;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.x0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3193x0 {
    public final Map<String, String> a;
    public final String b;
    public final String c;

    public C3193x0(String str, Map<String, String> map, String str2) {
        this.b = str;
        this.a = map;
        this.c = str2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeferredDeeplinkState{mParameters=");
        sb.append(this.a);
        sb.append(", mDeeplink='");
        sb.append(this.b);
        sb.append("', mUnparsedReferrer='");
        return AbstractC1705Vq.l(sb, this.c, "'}");
    }
}
