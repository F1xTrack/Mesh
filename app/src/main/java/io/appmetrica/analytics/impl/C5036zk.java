package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.zk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5036zk implements InterfaceC4659k2 {
    @Override // io.appmetrica.analytics.impl.InterfaceC4659k2
    public final C4462bn a(Zm zm, C4462bn c4462bn) {
        ((HashMap) zm.a.get(c4462bn.b)).put(new String(c4462bn.a), c4462bn);
        return c4462bn;
    }
}
