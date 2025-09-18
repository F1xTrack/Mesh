package com.yandex.metrica.profile;

import com.yandex.metrica.impl.p022ob.C2507Bf;
import com.yandex.metrica.impl.p022ob.C2532Cf;
import com.yandex.metrica.impl.p022ob.C2557Df;
import com.yandex.metrica.impl.p022ob.C2582Ef;
import com.yandex.metrica.impl.p022ob.C2690In;
import com.yandex.metrica.impl.p022ob.C3478no;
import com.yandex.metrica.impl.p022ob.C3599sf;
import com.yandex.metrica.impl.p022ob.C3677vf;
import com.yandex.metrica.impl.p022ob.InterfaceC2657Hf;

/* loaded from: classes2.dex */
public class GenderAttribute {

    /* renamed from: a */
    public final C3677vf f25507a = new C3677vf("appmetrica_gender", new C3478no(), new C2557Df());

    public enum Gender {
        MALE("M"),
        FEMALE("F"),
        OTHER("O");

        private final String mStringValue;

        Gender(String str) {
            this.mStringValue = str;
        }

        public String getStringValue() {
            return this.mStringValue;
        }
    }

    public UserProfileUpdate<? extends InterfaceC2657Hf> withValue(Gender gender) {
        C3677vf c3677vf = this.f25507a;
        return new UserProfileUpdate<>(new C2582Ef(c3677vf.m16975a(), gender.getStringValue(), new C2690In(), c3677vf.m16976b(), new C3599sf(c3677vf.m16977c())));
    }

    public UserProfileUpdate<? extends InterfaceC2657Hf> withValueIfUndefined(Gender gender) {
        C3677vf c3677vf = this.f25507a;
        return new UserProfileUpdate<>(new C2582Ef(c3677vf.m16975a(), gender.getStringValue(), new C2690In(), c3677vf.m16976b(), new C2532Cf(c3677vf.m16977c())));
    }

    public UserProfileUpdate<? extends InterfaceC2657Hf> withValueReset() {
        C3677vf c3677vf = this.f25507a;
        return new UserProfileUpdate<>(new C2507Bf(0, c3677vf.m16975a(), c3677vf.m16976b(), c3677vf.m16977c()));
    }
}
