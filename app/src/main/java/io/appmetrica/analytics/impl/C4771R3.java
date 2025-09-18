package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.R3 */
/* loaded from: classes2.dex */
public final class C4771R3 extends AbstractC4704O7 {
    @Override // io.appmetrica.analytics.impl.AbstractC4704O7
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean mo19235a(C4556I3 c4556i3, C4556I3 c4556i32) {
        if (!AbstractC5182hn.m20514a(c4556i32.f30267a)) {
            if (AbstractC5182hn.m20514a(c4556i3.f30267a)) {
                return false;
            }
            EnumC4728P7 enumC4728P7 = c4556i3.f30268b;
            if (enumC4728P7 == EnumC4728P7.f30605c) {
                if (((Number) this.f30550a.m20862a(enumC4728P7)).intValue() < ((Number) this.f30550a.m20862a(c4556i32.f30268b)).intValue()) {
                    return false;
                }
            } else if (((Number) this.f30550a.m20862a(enumC4728P7)).intValue() <= ((Number) this.f30550a.m20862a(c4556i32.f30268b)).intValue()) {
                return false;
            }
        }
        return true;
    }
}
