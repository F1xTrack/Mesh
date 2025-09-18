package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C4509G4;
import io.appmetrica.analytics.impl.C4785Rh;
import io.appmetrica.analytics.impl.C4919X7;
import io.appmetrica.analytics.impl.C4943Y7;
import io.appmetrica.analytics.impl.C4957Yl;
import io.appmetrica.analytics.impl.C5004ak;
import io.appmetrica.analytics.impl.C5465t6;
import io.appmetrica.analytics.impl.C5629zk;
import io.appmetrica.analytics.impl.InterfaceC5007an;

/* loaded from: classes2.dex */
public class GenderAttribute {

    /* renamed from: a */
    private final C5465t6 f33175a = new C5465t6("appmetrica_gender", new C4943Y7(), new C5629zk());

    public enum Gender {
        MALE("M"),
        FEMALE("F"),
        OTHER("O");


        /* renamed from: a */
        private final String f33177a;

        Gender(String str) {
            this.f33177a = str;
        }

        public String getStringValue() {
            return this.f33177a;
        }
    }

    public UserProfileUpdate<? extends InterfaceC5007an> withValue(Gender gender) {
        String str = this.f33175a.f32620c;
        String stringValue = gender.getStringValue();
        C4919X7 c4919x7 = new C4919X7();
        C5465t6 c5465t6 = this.f33175a;
        return new UserProfileUpdate<>(new C4957Yl(str, stringValue, c4919x7, c5465t6.f32618a, new C4509G4(c5465t6.f32619b)));
    }

    public UserProfileUpdate<? extends InterfaceC5007an> withValueIfUndefined(Gender gender) {
        String str = this.f33175a.f32620c;
        String stringValue = gender.getStringValue();
        C4919X7 c4919x7 = new C4919X7();
        C5465t6 c5465t6 = this.f33175a;
        return new UserProfileUpdate<>(new C4957Yl(str, stringValue, c4919x7, c5465t6.f32618a, new C5004ak(c5465t6.f32619b)));
    }

    public UserProfileUpdate<? extends InterfaceC5007an> withValueReset() {
        C5465t6 c5465t6 = this.f33175a;
        return new UserProfileUpdate<>(new C4785Rh(0, c5465t6.f32620c, c5465t6.f32618a, c5465t6.f32619b));
    }
}
