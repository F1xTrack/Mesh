package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.hf */
/* loaded from: classes2.dex */
public final class C5174hf implements InterfaceC5357on {
    @Override // io.appmetrica.analytics.impl.InterfaceC5357on
    /* renamed from: a */
    public final C5307mn mo19211a(Object obj) {
        Integer num = (Integer) obj;
        if (num == null || num.intValue() > 0) {
            return new C5307mn(this, true, "");
        }
        return new C5307mn(this, false, "Invalid quantity value " + num);
    }
}
