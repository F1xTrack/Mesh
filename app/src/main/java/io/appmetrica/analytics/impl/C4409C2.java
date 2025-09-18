package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.C2 */
/* loaded from: classes2.dex */
public final class C4409C2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4889W1 fromModel(C4459E2 c4459e2) {
        C4889W1 c4889w1 = new C4889W1();
        EnumC4434D2 enumC4434D2 = c4459e2.f30048a;
        if (enumC4434D2 != null) {
            int iOrdinal = enumC4434D2.ordinal();
            if (iOrdinal == 0) {
                c4889w1.f30890a = 1;
            } else if (iOrdinal == 1) {
                c4889w1.f30890a = 2;
            } else if (iOrdinal == 2) {
                c4889w1.f30890a = 3;
            } else if (iOrdinal == 3) {
                c4889w1.f30890a = 4;
            } else if (iOrdinal == 4) {
                c4889w1.f30890a = 5;
            }
        }
        Boolean bool = c4459e2.f30049b;
        if (bool != null) {
            if (bool.booleanValue()) {
                c4889w1.f30891b = 1;
            } else {
                c4889w1.f30891b = 0;
            }
        }
        return c4889w1;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4459E2 toModel(C4889W1 c4889w1) {
        EnumC4434D2 enumC4434D2;
        int i = c4889w1.f30890a;
        Boolean bool = null;
        if (i == 1) {
            enumC4434D2 = EnumC4434D2.ACTIVE;
        } else if (i == 2) {
            enumC4434D2 = EnumC4434D2.WORKING_SET;
        } else if (i == 3) {
            enumC4434D2 = EnumC4434D2.FREQUENT;
        } else if (i != 4) {
            enumC4434D2 = i != 5 ? null : EnumC4434D2.RESTRICTED;
        } else {
            enumC4434D2 = EnumC4434D2.RARE;
        }
        int i2 = c4889w1.f30891b;
        if (i2 == 0) {
            bool = Boolean.FALSE;
        } else if (i2 == 1) {
            bool = Boolean.TRUE;
        }
        return new C4459E2(enumC4434D2, bool);
    }
}
