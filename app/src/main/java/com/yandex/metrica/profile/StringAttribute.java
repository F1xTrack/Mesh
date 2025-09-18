package com.yandex.metrica.profile;

import com.yandex.metrica.impl.p022ob.C2507Bf;
import com.yandex.metrica.impl.p022ob.C2532Cf;
import com.yandex.metrica.impl.p022ob.C2582Ef;
import com.yandex.metrica.impl.p022ob.C2815Nn;
import com.yandex.metrica.impl.p022ob.C3599sf;
import com.yandex.metrica.impl.p022ob.C3677vf;
import com.yandex.metrica.impl.p022ob.InterfaceC2657Hf;
import com.yandex.metrica.impl.p022ob.InterfaceC3521pf;
import com.yandex.metrica.impl.p022ob.InterfaceC3660uo;

/* loaded from: classes2.dex */
public class StringAttribute {

    /* renamed from: a */
    public final C2815Nn f25509a;

    /* renamed from: b */
    public final C3677vf f25510b;

    public StringAttribute(String str, C2815Nn c2815Nn, InterfaceC3660uo interfaceC3660uo, InterfaceC3521pf interfaceC3521pf) {
        this.f25510b = new C3677vf(str, interfaceC3660uo, interfaceC3521pf);
        this.f25509a = c2815Nn;
    }

    public UserProfileUpdate<? extends InterfaceC2657Hf> withValue(String str) {
        C3677vf c3677vf = this.f25510b;
        return new UserProfileUpdate<>(new C2582Ef(c3677vf.m16975a(), str, this.f25509a, c3677vf.m16976b(), new C3599sf(c3677vf.m16977c())));
    }

    public UserProfileUpdate<? extends InterfaceC2657Hf> withValueIfUndefined(String str) {
        C3677vf c3677vf = this.f25510b;
        return new UserProfileUpdate<>(new C2582Ef(c3677vf.m16975a(), str, this.f25509a, c3677vf.m16976b(), new C2532Cf(c3677vf.m16977c())));
    }

    public UserProfileUpdate<? extends InterfaceC2657Hf> withValueReset() {
        C3677vf c3677vf = this.f25510b;
        return new UserProfileUpdate<>(new C2507Bf(0, c3677vf.m16975a(), c3677vf.m16976b(), c3677vf.m16977c()));
    }
}
