package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C4368Ab;
import io.appmetrica.analytics.impl.C4845U5;
import io.appmetrica.analytics.impl.C5245kb;
import io.appmetrica.analytics.impl.C5465t6;
import io.appmetrica.analytics.impl.InterfaceC5007an;

/* loaded from: classes2.dex */
public final class CounterAttribute {

    /* renamed from: a */
    private final C5465t6 f33174a;

    public CounterAttribute(String str, C5245kb c5245kb, C4368Ab c4368Ab) {
        this.f33174a = new C5465t6(str, c5245kb, c4368Ab);
    }

    public UserProfileUpdate<? extends InterfaceC5007an> withDelta(double d) {
        return new UserProfileUpdate<>(new C4845U5(this.f33174a.f32620c, d));
    }
}
