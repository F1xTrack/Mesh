package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C4361A4;
import io.appmetrica.analytics.impl.C4368Ab;
import io.appmetrica.analytics.impl.C4933Xl;
import io.appmetrica.analytics.impl.C5245kb;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import p000.AbstractC7222ym;

/* loaded from: classes2.dex */
public final class Attribute {
    public static BirthDateAttribute birthDate() {
        return new BirthDateAttribute();
    }

    public static BooleanAttribute customBoolean(String str) {
        return new BooleanAttribute(str, new C5245kb(), new C4368Ab(new C4361A4(100)));
    }

    public static CounterAttribute customCounter(String str) {
        return new CounterAttribute(str, new C5245kb(), new C4368Ab(new C4361A4(100)));
    }

    public static NumberAttribute customNumber(String str) {
        return new NumberAttribute(str, new C5245kb(), new C4368Ab(new C4361A4(100)));
    }

    public static StringAttribute customString(String str) {
        return new StringAttribute(str, new C4933Xl(200, AbstractC7222ym.m26234k("String attribute \"", str, "\""), PublicLogger.getAnonymousInstance()), new C5245kb(), new C4368Ab(new C4361A4(100)));
    }

    public static GenderAttribute gender() {
        return new GenderAttribute();
    }

    public static NameAttribute name() {
        return new NameAttribute();
    }

    public static NotificationsEnabledAttribute notificationsEnabled() {
        return new NotificationsEnabledAttribute();
    }
}
