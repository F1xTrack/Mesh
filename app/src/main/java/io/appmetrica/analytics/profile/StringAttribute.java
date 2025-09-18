package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C4509G4;
import io.appmetrica.analytics.impl.C4785Rh;
import io.appmetrica.analytics.impl.C4933Xl;
import io.appmetrica.analytics.impl.C4957Yl;
import io.appmetrica.analytics.impl.C5004ak;
import io.appmetrica.analytics.impl.C5465t6;
import io.appmetrica.analytics.impl.InterfaceC4551Hm;
import io.appmetrica.analytics.impl.InterfaceC5007an;
import io.appmetrica.analytics.impl.InterfaceC5236k2;
import io.appmetrica.analytics.impl.InterfaceC5357on;

/* loaded from: classes2.dex */
public class StringAttribute {

    /* renamed from: a */
    private final InterfaceC4551Hm f33179a;

    /* renamed from: b */
    private final C5465t6 f33180b;

    public StringAttribute(String str, C4933Xl c4933Xl, InterfaceC5357on interfaceC5357on, InterfaceC5236k2 interfaceC5236k2) {
        this.f33180b = new C5465t6(str, interfaceC5357on, interfaceC5236k2);
        this.f33179a = c4933Xl;
    }

    public UserProfileUpdate<? extends InterfaceC5007an> withValue(String str) {
        C5465t6 c5465t6 = this.f33180b;
        return new UserProfileUpdate<>(new C4957Yl(c5465t6.f32620c, str, this.f33179a, c5465t6.f32618a, new C4509G4(c5465t6.f32619b)));
    }

    public UserProfileUpdate<? extends InterfaceC5007an> withValueIfUndefined(String str) {
        C5465t6 c5465t6 = this.f33180b;
        return new UserProfileUpdate<>(new C4957Yl(c5465t6.f32620c, str, this.f33179a, c5465t6.f32618a, new C5004ak(c5465t6.f32619b)));
    }

    public UserProfileUpdate<? extends InterfaceC5007an> withValueReset() {
        C5465t6 c5465t6 = this.f33180b;
        return new UserProfileUpdate<>(new C4785Rh(0, c5465t6.f32620c, c5465t6.f32618a, c5465t6.f32619b));
    }
}
