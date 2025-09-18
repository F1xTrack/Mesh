package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C4361A4;
import io.appmetrica.analytics.impl.C4368Ab;
import io.appmetrica.analytics.impl.C4370Ad;
import io.appmetrica.analytics.impl.C4509G4;
import io.appmetrica.analytics.impl.C4785Rh;
import io.appmetrica.analytics.impl.C5004ak;
import io.appmetrica.analytics.impl.C5245kb;
import io.appmetrica.analytics.impl.C5465t6;
import io.appmetrica.analytics.impl.InterfaceC5007an;

/* loaded from: classes2.dex */
public final class NumberAttribute {

    /* renamed from: a */
    private final C5465t6 f33178a;

    public NumberAttribute(String str, C5245kb c5245kb, C4368Ab c4368Ab) {
        this.f33178a = new C5465t6(str, c5245kb, c4368Ab);
    }

    public UserProfileUpdate<? extends InterfaceC5007an> withValue(double d) {
        return new UserProfileUpdate<>(new C4370Ad(this.f33178a.f32620c, d, new C5245kb(), new C4509G4(new C4368Ab(new C4361A4(100)))));
    }

    public UserProfileUpdate<? extends InterfaceC5007an> withValueIfUndefined(double d) {
        return new UserProfileUpdate<>(new C4370Ad(this.f33178a.f32620c, d, new C5245kb(), new C5004ak(new C4368Ab(new C4361A4(100)))));
    }

    public UserProfileUpdate<? extends InterfaceC5007an> withValueReset() {
        return new UserProfileUpdate<>(new C4785Rh(1, this.f33178a.f32620c, new C5245kb(), new C4368Ab(new C4361A4(100))));
    }
}
