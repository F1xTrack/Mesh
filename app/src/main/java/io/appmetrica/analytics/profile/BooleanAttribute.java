package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C4509G4;
import io.appmetrica.analytics.impl.C4785Rh;
import io.appmetrica.analytics.impl.C5004ak;
import io.appmetrica.analytics.impl.C5337o3;
import io.appmetrica.analytics.impl.C5465t6;
import io.appmetrica.analytics.impl.InterfaceC5007an;
import io.appmetrica.analytics.impl.InterfaceC5236k2;
import io.appmetrica.analytics.impl.InterfaceC5357on;

/* loaded from: classes2.dex */
public class BooleanAttribute {

    /* renamed from: a */
    private final C5465t6 f33173a;

    public BooleanAttribute(String str, InterfaceC5357on interfaceC5357on, InterfaceC5236k2 interfaceC5236k2) {
        this.f33173a = new C5465t6(str, interfaceC5357on, interfaceC5236k2);
    }

    public UserProfileUpdate<? extends InterfaceC5007an> withValue(boolean z) {
        C5465t6 c5465t6 = this.f33173a;
        return new UserProfileUpdate<>(new C5337o3(c5465t6.f32620c, z, c5465t6.f32618a, new C4509G4(c5465t6.f32619b)));
    }

    public UserProfileUpdate<? extends InterfaceC5007an> withValueIfUndefined(boolean z) {
        C5465t6 c5465t6 = this.f33173a;
        return new UserProfileUpdate<>(new C5337o3(c5465t6.f32620c, z, c5465t6.f32618a, new C5004ak(c5465t6.f32619b)));
    }

    public UserProfileUpdate<? extends InterfaceC5007an> withValueReset() {
        C5465t6 c5465t6 = this.f33173a;
        return new UserProfileUpdate<>(new C4785Rh(3, c5465t6.f32620c, c5465t6.f32618a, c5465t6.f32619b));
    }
}
