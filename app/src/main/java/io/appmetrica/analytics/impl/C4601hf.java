package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.hf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4601hf implements on {
    @Override // io.appmetrica.analytics.impl.on
    public final mn a(Object obj) {
        Integer num = (Integer) obj;
        if (num == null || num.intValue() > 0) {
            return new mn(this, true, "");
        }
        return new mn(this, false, "Invalid quantity value " + num);
    }
}
