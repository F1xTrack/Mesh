package io.appmetrica.analytics.impl;

import p000.C6838sg;

/* renamed from: io.appmetrica.analytics.impl.yd */
/* loaded from: classes2.dex */
public final class C5597yd {
    /* renamed from: a */
    public static final C5568x9 m21217a(C5597yd c5597yd, EnumC4514G9 enumC4514G9) {
        int i;
        c5597yd.getClass();
        C5568x9 c5568x9 = new C5568x9();
        switch (enumC4514G9) {
            case UNKNOWN:
                i = 0;
                break;
            case APPSFLYER:
                i = 1;
                break;
            case ADJUST:
                i = 2;
                break;
            case KOCHAVA:
                i = 3;
                break;
            case TENJIN:
                i = 4;
                break;
            case AIRBRIDGE:
                i = 5;
                break;
            case SINGULAR:
                i = 6;
                break;
            default:
                throw new C6838sg();
        }
        c5568x9.f32817a = i;
        return c5568x9;
    }
}
