package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.Ab */
/* loaded from: classes2.dex */
public final class C4368Ab implements InterfaceC5236k2 {

    /* renamed from: a */
    public final C4361A4 f29851a;

    public C4368Ab(C4361A4 c4361a4) {
        this.f29851a = c4361a4;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5236k2
    /* renamed from: a */
    public final C5032bn mo19189a(C4982Zm c4982Zm, C5032bn c5032bn) {
        int i = c4982Zm.f31230b;
        int i2 = this.f29851a.f29844a;
        if (i == i2) {
            if (((C5032bn) ((HashMap) c4982Zm.f31229a.get(c5032bn.f31343b)).get(new String(c5032bn.f31342a))) != null) {
                ((HashMap) c4982Zm.f31229a.get(c5032bn.f31343b)).put(new String(c5032bn.f31342a), c5032bn);
            }
        } else if (i < i2) {
            ((HashMap) c4982Zm.f31229a.get(c5032bn.f31343b)).put(new String(c5032bn.f31342a), c5032bn);
            c4982Zm.f31230b++;
        }
        return c5032bn;
    }
}
