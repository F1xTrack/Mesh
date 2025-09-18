package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ef, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4529ef {
    public static final Map a;
    public static final SparseArray b;
    public static final Map c;
    public static final Map d;

    static {
        HashMap map = new HashMap();
        Yj yj = Yj.FOREGROUND;
        map.put(yj, 0);
        Yj yj2 = Yj.BACKGROUND;
        map.put(yj2, 1);
        a = Collections.unmodifiableMap(map);
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, yj);
        sparseArray.put(1, yj2);
        b = sparseArray;
        HashMap map2 = new HashMap();
        Wa wa = Wa.EVENT_TYPE_INIT;
        map2.put(wa, 1);
        Wa wa2 = Wa.EVENT_TYPE_REGULAR;
        map2.put(wa2, 4);
        Wa wa3 = Wa.EVENT_TYPE_SEND_REFERRER;
        map2.put(wa3, 5);
        Wa wa4 = Wa.EVENT_TYPE_ALIVE;
        map2.put(wa4, 7);
        Wa wa5 = Wa.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        map2.put(wa5, 26);
        Wa wa6 = Wa.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT;
        map2.put(wa6, 26);
        Wa wa7 = Wa.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        map2.put(wa7, 26);
        Wa wa8 = Wa.EVENT_TYPE_ANR;
        map2.put(wa8, 25);
        Wa wa9 = Wa.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        map2.put(wa9, 26);
        Wa wa10 = Wa.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        map2.put(wa10, 26);
        Wa wa11 = Wa.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        map2.put(wa11, 27);
        Wa wa12 = Wa.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        map2.put(wa12, 27);
        Wa wa13 = Wa.EVENT_TYPE_FIRST_ACTIVATION;
        map2.put(wa13, 13);
        Wa wa14 = Wa.EVENT_TYPE_START;
        map2.put(wa14, 2);
        Wa wa15 = Wa.EVENT_TYPE_APP_OPEN;
        map2.put(wa15, 16);
        Wa wa16 = Wa.EVENT_TYPE_APP_UPDATE;
        map2.put(wa16, 17);
        Wa wa17 = Wa.EVENT_TYPE_PERMISSIONS;
        map2.put(wa17, 18);
        Wa wa18 = Wa.EVENT_TYPE_APP_FEATURES;
        map2.put(wa18, 19);
        Wa wa19 = Wa.EVENT_TYPE_SEND_USER_PROFILE;
        map2.put(wa19, 20);
        Wa wa20 = Wa.EVENT_TYPE_SEND_REVENUE_EVENT;
        map2.put(wa20, 21);
        Wa wa21 = Wa.EVENT_TYPE_SEND_AD_REVENUE_EVENT;
        map2.put(wa21, 40);
        Wa wa22 = Wa.EVENT_TYPE_SEND_ECOMMERCE_EVENT;
        map2.put(wa22, 35);
        map2.put(Wa.EVENT_TYPE_CLEANUP, 29);
        Wa wa23 = Wa.EVENT_TYPE_WEBVIEW_SYNC;
        map2.put(wa23, 38);
        Wa wa24 = Wa.EVENT_CLIENT_EXTERNAL_ATTRIBUTION;
        map2.put(wa24, 42);
        c = Collections.unmodifiableMap(map2);
        HashMap map3 = new HashMap();
        C4880t8 c4880t8 = new C4880t8();
        C5024z8 c5024z8 = new C5024z8(new D8());
        C4904u8 c4904u8 = new C4904u8();
        C4875t3 c4875t3 = new C4875t3(new D8());
        Lm lm = new Lm(new D8());
        C4429af c4429af = new C4429af();
        R8 r8A = S8.a();
        r8A.b = c4429af;
        r8A.c = c4429af;
        S8 s8 = new S8(r8A);
        R8 r8A2 = S8.a();
        r8A2.b = c5024z8;
        S8 s82 = new S8(r8A2);
        R8 r8A3 = S8.a();
        r8A3.b = c4875t3;
        S8 s83 = new S8(r8A3);
        R8 r8A4 = S8.a();
        r8A4.b = lm;
        S8 s84 = new S8(r8A4);
        R8 r8A5 = S8.a();
        r8A5.a = c4880t8;
        S8 s85 = new S8(r8A5);
        R8 r8A6 = S8.a();
        r8A6.b = new qn(new C5024z8());
        S8 s86 = new S8(r8A6);
        map3.put(wa2, s82);
        R8 r8A7 = S8.a();
        r8A7.b = new C4479cf();
        map3.put(wa3, new S8(r8A7));
        R8 r8A8 = S8.a();
        r8A8.a = c4880t8;
        r8A8.b = c4904u8;
        r8A8.e = new U7();
        r8A8.f = new V7();
        map3.put(wa4, new S8(r8A8));
        map3.put(wa9, s8);
        map3.put(wa10, s8);
        map3.put(wa11, s83);
        map3.put(wa12, s83);
        map3.put(wa5, s83);
        map3.put(wa6, s83);
        map3.put(wa7, s83);
        map3.put(wa8, s83);
        R8 r8A9 = S8.a();
        r8A9.a = new C4880t8();
        r8A9.b = c4875t3;
        map3.put(wa14, new S8(r8A9));
        Wa wa25 = Wa.EVENT_TYPE_CUSTOM_EVENT;
        R8 r8A10 = S8.a();
        r8A10.d = new C4504df();
        map3.put(wa25, new S8(r8A10));
        map3.put(wa15, s82);
        map3.put(wa17, s85);
        map3.put(wa18, s85);
        map3.put(wa19, s83);
        map3.put(wa20, s83);
        map3.put(wa21, s83);
        map3.put(wa22, s84);
        map3.put(wa, s86);
        map3.put(wa16, s86);
        map3.put(wa13, s82);
        map3.put(wa23, s82);
        map3.put(wa24, s83);
        d = Collections.unmodifiableMap(map3);
    }

    public static C4571g9 a(Long l, Long l2, Boolean bool) {
        C4571g9 c4571g9 = new C4571g9();
        if (l != null) {
            c4571g9.a = l.longValue();
            c4571g9.b = ((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(l.longValue() * 1000) / 1000;
        }
        if (l2 != null) {
            c4571g9.c = l2.longValue();
        }
        if (bool != null) {
            c4571g9.d = bool.booleanValue();
        }
        return c4571g9;
    }

    public static void a(C4523e9 c4523e9) {
        C4473c9[] c4473c9Arr = c4523e9.c;
        if (c4473c9Arr != null) {
            for (C4473c9 c4473c9 : c4473c9Arr) {
            }
        }
    }
}
