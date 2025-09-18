package com.yandex.metrica.profile;

import com.yandex.metrica.impl.p022ob.C3651uf;
import com.yandex.metrica.impl.p022ob.C3677vf;
import com.yandex.metrica.impl.p022ob.C3703wf;
import com.yandex.metrica.impl.p022ob.C3729xf;
import com.yandex.metrica.impl.p022ob.InterfaceC2657Hf;

/* loaded from: classes2.dex */
public final class CounterAttribute {

    /* renamed from: a */
    public final C3677vf f25506a;

    public CounterAttribute(String str, C3703wf c3703wf, C3729xf c3729xf) {
        this.f25506a = new C3677vf(str, c3703wf, c3729xf);
    }

    public UserProfileUpdate<? extends InterfaceC2657Hf> withDelta(double d) {
        return new UserProfileUpdate<>(new C3651uf(this.f25506a.m16975a(), d));
    }
}
