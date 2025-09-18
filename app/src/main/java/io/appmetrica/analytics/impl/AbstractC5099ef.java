package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ef */
/* loaded from: classes2.dex */
public abstract class AbstractC5099ef {

    /* renamed from: a */
    public static final Map f31598a;

    /* renamed from: b */
    public static final SparseArray f31599b;

    /* renamed from: c */
    public static final Map f31600c;

    /* renamed from: d */
    public static final Map f31601d;

    static {
        HashMap map = new HashMap();
        EnumC4955Yj enumC4955Yj = EnumC4955Yj.FOREGROUND;
        map.put(enumC4955Yj, 0);
        EnumC4955Yj enumC4955Yj2 = EnumC4955Yj.BACKGROUND;
        map.put(enumC4955Yj2, 1);
        f31598a = Collections.unmodifiableMap(map);
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, enumC4955Yj);
        sparseArray.put(1, enumC4955Yj2);
        f31599b = sparseArray;
        HashMap map2 = new HashMap();
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_INIT;
        map2.put(enumC4898Wa, 1);
        EnumC4898Wa enumC4898Wa2 = EnumC4898Wa.EVENT_TYPE_REGULAR;
        map2.put(enumC4898Wa2, 4);
        EnumC4898Wa enumC4898Wa3 = EnumC4898Wa.EVENT_TYPE_SEND_REFERRER;
        map2.put(enumC4898Wa3, 5);
        EnumC4898Wa enumC4898Wa4 = EnumC4898Wa.EVENT_TYPE_ALIVE;
        map2.put(enumC4898Wa4, 7);
        EnumC4898Wa enumC4898Wa5 = EnumC4898Wa.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        map2.put(enumC4898Wa5, 26);
        EnumC4898Wa enumC4898Wa6 = EnumC4898Wa.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT;
        map2.put(enumC4898Wa6, 26);
        EnumC4898Wa enumC4898Wa7 = EnumC4898Wa.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        map2.put(enumC4898Wa7, 26);
        EnumC4898Wa enumC4898Wa8 = EnumC4898Wa.EVENT_TYPE_ANR;
        map2.put(enumC4898Wa8, 25);
        EnumC4898Wa enumC4898Wa9 = EnumC4898Wa.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        map2.put(enumC4898Wa9, 26);
        EnumC4898Wa enumC4898Wa10 = EnumC4898Wa.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        map2.put(enumC4898Wa10, 26);
        EnumC4898Wa enumC4898Wa11 = EnumC4898Wa.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        map2.put(enumC4898Wa11, 27);
        EnumC4898Wa enumC4898Wa12 = EnumC4898Wa.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        map2.put(enumC4898Wa12, 27);
        EnumC4898Wa enumC4898Wa13 = EnumC4898Wa.EVENT_TYPE_FIRST_ACTIVATION;
        map2.put(enumC4898Wa13, 13);
        EnumC4898Wa enumC4898Wa14 = EnumC4898Wa.EVENT_TYPE_START;
        map2.put(enumC4898Wa14, 2);
        EnumC4898Wa enumC4898Wa15 = EnumC4898Wa.EVENT_TYPE_APP_OPEN;
        map2.put(enumC4898Wa15, 16);
        EnumC4898Wa enumC4898Wa16 = EnumC4898Wa.EVENT_TYPE_APP_UPDATE;
        map2.put(enumC4898Wa16, 17);
        EnumC4898Wa enumC4898Wa17 = EnumC4898Wa.EVENT_TYPE_PERMISSIONS;
        map2.put(enumC4898Wa17, 18);
        EnumC4898Wa enumC4898Wa18 = EnumC4898Wa.EVENT_TYPE_APP_FEATURES;
        map2.put(enumC4898Wa18, 19);
        EnumC4898Wa enumC4898Wa19 = EnumC4898Wa.EVENT_TYPE_SEND_USER_PROFILE;
        map2.put(enumC4898Wa19, 20);
        EnumC4898Wa enumC4898Wa20 = EnumC4898Wa.EVENT_TYPE_SEND_REVENUE_EVENT;
        map2.put(enumC4898Wa20, 21);
        EnumC4898Wa enumC4898Wa21 = EnumC4898Wa.EVENT_TYPE_SEND_AD_REVENUE_EVENT;
        map2.put(enumC4898Wa21, 40);
        EnumC4898Wa enumC4898Wa22 = EnumC4898Wa.EVENT_TYPE_SEND_ECOMMERCE_EVENT;
        map2.put(enumC4898Wa22, 35);
        map2.put(EnumC4898Wa.EVENT_TYPE_CLEANUP, 29);
        EnumC4898Wa enumC4898Wa23 = EnumC4898Wa.EVENT_TYPE_WEBVIEW_SYNC;
        map2.put(enumC4898Wa23, 38);
        EnumC4898Wa enumC4898Wa24 = EnumC4898Wa.EVENT_CLIENT_EXTERNAL_ATTRIBUTION;
        map2.put(enumC4898Wa24, 42);
        f31600c = Collections.unmodifiableMap(map2);
        HashMap map3 = new HashMap();
        C5467t8 c5467t8 = new C5467t8();
        C5617z8 c5617z8 = new C5617z8(new C4440D8());
        C5492u8 c5492u8 = new C5492u8();
        C5462t3 c5462t3 = new C5462t3(new C4440D8());
        C4647Lm c4647Lm = new C4647Lm(new C4440D8());
        C4999af c4999af = new C4999af();
        C4776R8 c4776r8M19800a = C4800S8.m19800a();
        c4776r8M19800a.f30680b = c4999af;
        c4776r8M19800a.f30681c = c4999af;
        C4800S8 c4800s8 = new C4800S8(c4776r8M19800a);
        C4776R8 c4776r8M19800a2 = C4800S8.m19800a();
        c4776r8M19800a2.f30680b = c5617z8;
        C4800S8 c4800s82 = new C4800S8(c4776r8M19800a2);
        C4776R8 c4776r8M19800a3 = C4800S8.m19800a();
        c4776r8M19800a3.f30680b = c5462t3;
        C4800S8 c4800s83 = new C4800S8(c4776r8M19800a3);
        C4776R8 c4776r8M19800a4 = C4800S8.m19800a();
        c4776r8M19800a4.f30680b = c4647Lm;
        C4800S8 c4800s84 = new C4800S8(c4776r8M19800a4);
        C4776R8 c4776r8M19800a5 = C4800S8.m19800a();
        c4776r8M19800a5.f30679a = c5467t8;
        C4800S8 c4800s85 = new C4800S8(c4776r8M19800a5);
        C4776R8 c4776r8M19800a6 = C4800S8.m19800a();
        c4776r8M19800a6.f30680b = new C5407qn(new C5617z8());
        C4800S8 c4800s86 = new C4800S8(c4776r8M19800a6);
        map3.put(enumC4898Wa2, c4800s82);
        C4776R8 c4776r8M19800a7 = C4800S8.m19800a();
        c4776r8M19800a7.f30680b = new C5049cf();
        map3.put(enumC4898Wa3, new C4800S8(c4776r8M19800a7));
        C4776R8 c4776r8M19800a8 = C4800S8.m19800a();
        c4776r8M19800a8.f30679a = c5467t8;
        c4776r8M19800a8.f30680b = c5492u8;
        c4776r8M19800a8.f30683e = new C4847U7();
        c4776r8M19800a8.f30684f = new C4871V7();
        map3.put(enumC4898Wa4, new C4800S8(c4776r8M19800a8));
        map3.put(enumC4898Wa9, c4800s8);
        map3.put(enumC4898Wa10, c4800s8);
        map3.put(enumC4898Wa11, c4800s83);
        map3.put(enumC4898Wa12, c4800s83);
        map3.put(enumC4898Wa5, c4800s83);
        map3.put(enumC4898Wa6, c4800s83);
        map3.put(enumC4898Wa7, c4800s83);
        map3.put(enumC4898Wa8, c4800s83);
        C4776R8 c4776r8M19800a9 = C4800S8.m19800a();
        c4776r8M19800a9.f30679a = new C5467t8();
        c4776r8M19800a9.f30680b = c5462t3;
        map3.put(enumC4898Wa14, new C4800S8(c4776r8M19800a9));
        EnumC4898Wa enumC4898Wa25 = EnumC4898Wa.EVENT_TYPE_CUSTOM_EVENT;
        C4776R8 c4776r8M19800a10 = C4800S8.m19800a();
        c4776r8M19800a10.f30682d = new C5074df();
        map3.put(enumC4898Wa25, new C4800S8(c4776r8M19800a10));
        map3.put(enumC4898Wa15, c4800s82);
        map3.put(enumC4898Wa17, c4800s85);
        map3.put(enumC4898Wa18, c4800s85);
        map3.put(enumC4898Wa19, c4800s83);
        map3.put(enumC4898Wa20, c4800s83);
        map3.put(enumC4898Wa21, c4800s83);
        map3.put(enumC4898Wa22, c4800s84);
        map3.put(enumC4898Wa, c4800s86);
        map3.put(enumC4898Wa16, c4800s86);
        map3.put(enumC4898Wa13, c4800s82);
        map3.put(enumC4898Wa23, c4800s82);
        map3.put(enumC4898Wa24, c4800s83);
        f31601d = Collections.unmodifiableMap(map3);
    }

    /* renamed from: a */
    public static C5143g9 m20348a(Long l, Long l2, Boolean bool) {
        C5143g9 c5143g9 = new C5143g9();
        if (l != null) {
            c5143g9.f31754a = l.longValue();
            c5143g9.f31755b = ((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(l.longValue() * 1000) / 1000;
        }
        if (l2 != null) {
            c5143g9.f31756c = l2.longValue();
        }
        if (bool != null) {
            c5143g9.f31757d = bool.booleanValue();
        }
        return c5143g9;
    }

    /* renamed from: a */
    public static void m20349a(C5093e9 c5093e9) {
        C5043c9[] c5043c9Arr = c5093e9.f31574c;
        if (c5043c9Arr != null) {
            for (C5043c9 c5043c9 : c5043c9Arr) {
            }
        }
    }
}
