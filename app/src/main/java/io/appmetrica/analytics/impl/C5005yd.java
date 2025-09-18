package io.appmetrica.analytics.impl;

import defpackage.C7074sg;

/* renamed from: io.appmetrica.analytics.impl.yd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5005yd {
    public static final C4977x9 a(C5005yd c5005yd, G9 g9) {
        int i;
        c5005yd.getClass();
        C4977x9 c4977x9 = new C4977x9();
        switch (g9) {
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
                throw new C7074sg();
        }
        c4977x9.a = i;
        return c4977x9;
    }
}
