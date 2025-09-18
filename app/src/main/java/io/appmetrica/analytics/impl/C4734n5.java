package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* renamed from: io.appmetrica.analytics.impl.n5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4734n5 implements xn {
    public final List a;

    public C4734n5(List<? extends Pair<String, ? extends xn>> list) {
        this.a = list;
    }

    @Override // io.appmetrica.analytics.impl.xn
    public final String a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            String strA = ((xn) ((Pair) it.next()).b).a();
            if (strA != null && strA.length() > 0) {
                return strA;
            }
        }
        return null;
    }

    @Override // io.appmetrica.analytics.impl.xn
    public final void a(String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((xn) ((Pair) it.next()).b).a(str);
        }
    }
}
