package com.yandex.metrica.profile;

import com.yandex.metrica.impl.p022ob.C2557Df;
import com.yandex.metrica.impl.p022ob.C2640Gn;
import com.yandex.metrica.impl.p022ob.C2689Im;
import com.yandex.metrica.impl.p022ob.C2815Nn;
import com.yandex.metrica.impl.p022ob.C3478no;
import com.yandex.metrica.impl.p022ob.C3703wf;
import com.yandex.metrica.impl.p022ob.C3729xf;
import p000.AbstractC7222ym;

/* loaded from: classes2.dex */
public class Attribute {
    public static BirthDateAttribute birthDate() {
        return new BirthDateAttribute();
    }

    public static BooleanAttribute customBoolean(String str) {
        return new BooleanAttribute(str, new C3703wf(), new C3729xf(new C2640Gn(100)));
    }

    public static CounterAttribute customCounter(String str) {
        return new CounterAttribute(str, new C3703wf(), new C3729xf(new C2640Gn(100)));
    }

    public static NumberAttribute customNumber(String str) {
        return new NumberAttribute(str, new C3703wf(), new C3729xf(new C2640Gn(100)));
    }

    public static StringAttribute customString(String str) {
        return new StringAttribute(str, new C2815Nn(200, AbstractC7222ym.m26234k("String attribute \"", str, "\""), C2689Im.m14369g()), new C3703wf(), new C3729xf(new C2640Gn(100)));
    }

    public static GenderAttribute gender() {
        return new GenderAttribute();
    }

    public static NameAttribute name() {
        return new NameAttribute("appmetrica_name", new C2815Nn(100, "Name attribute"), new C3478no(), new C2557Df());
    }

    public static NotificationsEnabledAttribute notificationsEnabled() {
        return new NotificationsEnabledAttribute("appmetrica_notifications_enabled", new C3478no(), new C2557Df());
    }
}
