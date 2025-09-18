package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class Ab implements InterfaceC4659k2 {
    public final A4 a;

    public Ab(A4 a4) {
        this.a = a4;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4659k2
    public final C4462bn a(Zm zm, C4462bn c4462bn) {
        int i = zm.b;
        int i2 = this.a.a;
        if (i == i2) {
            if (((C4462bn) ((HashMap) zm.a.get(c4462bn.b)).get(new String(c4462bn.a))) != null) {
                ((HashMap) zm.a.get(c4462bn.b)).put(new String(c4462bn.a), c4462bn);
            }
        } else if (i < i2) {
            ((HashMap) zm.a.get(c4462bn.b)).put(new String(c4462bn.a), c4462bn);
            zm.b++;
        }
        return c4462bn;
    }
}
