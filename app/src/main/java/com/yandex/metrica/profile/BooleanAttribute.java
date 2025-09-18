package com.yandex.metrica.profile;

import com.yandex.metrica.impl.p022ob.C2507Bf;
import com.yandex.metrica.impl.p022ob.C2532Cf;
import com.yandex.metrica.impl.p022ob.C3573rf;
import com.yandex.metrica.impl.p022ob.C3599sf;
import com.yandex.metrica.impl.p022ob.C3677vf;
import com.yandex.metrica.impl.p022ob.InterfaceC2657Hf;
import com.yandex.metrica.impl.p022ob.InterfaceC3521pf;
import com.yandex.metrica.impl.p022ob.InterfaceC3660uo;

/* loaded from: classes2.dex */
public class BooleanAttribute {

    /* renamed from: a */
    public final C3677vf f25505a;

    public BooleanAttribute(String str, InterfaceC3660uo interfaceC3660uo, InterfaceC3521pf interfaceC3521pf) {
        this.f25505a = new C3677vf(str, interfaceC3660uo, interfaceC3521pf);
    }

    public UserProfileUpdate<? extends InterfaceC2657Hf> withValue(boolean z) {
        C3677vf c3677vf = this.f25505a;
        return new UserProfileUpdate<>(new C3573rf(c3677vf.m16975a(), z, c3677vf.m16976b(), new C3599sf(c3677vf.m16977c())));
    }

    public UserProfileUpdate<? extends InterfaceC2657Hf> withValueIfUndefined(boolean z) {
        C3677vf c3677vf = this.f25505a;
        return new UserProfileUpdate<>(new C3573rf(c3677vf.m16975a(), z, c3677vf.m16976b(), new C2532Cf(c3677vf.m16977c())));
    }

    public UserProfileUpdate<? extends InterfaceC2657Hf> withValueReset() {
        C3677vf c3677vf = this.f25505a;
        return new UserProfileUpdate<>(new C2507Bf(3, c3677vf.m16975a(), c3677vf.m16976b(), c3677vf.m16977c()));
    }
}
