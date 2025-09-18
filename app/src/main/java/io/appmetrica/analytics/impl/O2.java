package io.appmetrica.analytics.impl;

/* loaded from: classes2.dex */
public final class O2 implements on {
    @Override // io.appmetrica.analytics.impl.on
    public final mn a(Object obj) {
        C4462bn[] c4462bnArr = ((en) obj).a;
        return (c4462bnArr == null || c4462bnArr.length == 0) ? new mn(this, false, "attributes list is empty") : new mn(this, true, "");
    }
}
