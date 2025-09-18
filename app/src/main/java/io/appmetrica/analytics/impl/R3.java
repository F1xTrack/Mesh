package io.appmetrica.analytics.impl;

/* loaded from: classes2.dex */
public final class R3 extends O7 {
    @Override // io.appmetrica.analytics.impl.O7
    public final boolean a(I3 i3, I3 i32) {
        if (!hn.a(i32.a)) {
            if (hn.a(i3.a)) {
                return false;
            }
            P7 p7 = i3.b;
            if (p7 == P7.c) {
                if (((Number) this.a.a(p7)).intValue() < ((Number) this.a.a(i32.b)).intValue()) {
                    return false;
                }
            } else if (((Number) this.a.a(p7)).intValue() <= ((Number) this.a.a(i32.b)).intValue()) {
                return false;
            }
        }
        return true;
    }
}
