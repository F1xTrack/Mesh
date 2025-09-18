package com.yandex.metrica.profile;

import com.yandex.metrica.impl.p022ob.C2507Bf;
import com.yandex.metrica.impl.p022ob.C2532Cf;
import com.yandex.metrica.impl.p022ob.C2640Gn;
import com.yandex.metrica.impl.p022ob.C3599sf;
import com.yandex.metrica.impl.p022ob.C3677vf;
import com.yandex.metrica.impl.p022ob.C3703wf;
import com.yandex.metrica.impl.p022ob.C3729xf;
import com.yandex.metrica.impl.p022ob.C3781zf;
import com.yandex.metrica.impl.p022ob.InterfaceC2657Hf;

/* loaded from: classes2.dex */
public final class NumberAttribute {

    /* renamed from: a */
    public final C3677vf f25508a;

    public NumberAttribute(String str, C3703wf c3703wf, C3729xf c3729xf) {
        this.f25508a = new C3677vf(str, c3703wf, c3729xf);
    }

    public UserProfileUpdate<? extends InterfaceC2657Hf> withValue(double d) {
        return new UserProfileUpdate<>(new C3781zf(this.f25508a.m16975a(), d, new C3703wf(), new C3599sf(new C3729xf(new C2640Gn(100)))));
    }

    public UserProfileUpdate<? extends InterfaceC2657Hf> withValueIfUndefined(double d) {
        return new UserProfileUpdate<>(new C3781zf(this.f25508a.m16975a(), d, new C3703wf(), new C2532Cf(new C3729xf(new C2640Gn(100)))));
    }

    public UserProfileUpdate<? extends InterfaceC2657Hf> withValueReset() {
        return new UserProfileUpdate<>(new C2507Bf(1, this.f25508a.m16975a(), new C3703wf(), new C3729xf(new C2640Gn(100))));
    }
}
