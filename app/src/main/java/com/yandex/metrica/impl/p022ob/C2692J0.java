package com.yandex.metrica.impl.p022ob;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.J0 */
/* loaded from: classes2.dex */
public final class C2692J0 {

    /* renamed from: a */
    private static final Set<Integer> f21474a;

    /* renamed from: b */
    private static final EnumSet<EnumC3377k1> f21475b;

    /* renamed from: c */
    private static final EnumSet<EnumC3377k1> f21476c;

    /* renamed from: d */
    private static final EnumSet<EnumC3377k1> f21477d;

    /* renamed from: e */
    private static final EnumSet<EnumC3377k1> f21478e;

    /* renamed from: f */
    private static final EnumSet<EnumC3377k1> f21479f;

    /* renamed from: g */
    private static final EnumSet<EnumC3377k1> f21480g;

    /* renamed from: h */
    private static final EnumSet<EnumC3377k1> f21481h;

    /* renamed from: i */
    public static final List<Integer> f21482i;

    /* renamed from: j */
    public static final List<Integer> f21483j;

    static {
        Integer[] numArr = {Integer.valueOf(EnumC3377k1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF.m16250b()), Integer.valueOf(EnumC3377k1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF.m16250b()), Integer.valueOf(EnumC3377k1.EVENT_TYPE_EXCEPTION_USER.m16250b()), Integer.valueOf(EnumC3377k1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF.m16250b()), Integer.valueOf(EnumC3377k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE.m16250b()), Integer.valueOf(EnumC3377k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT.m16250b()), Integer.valueOf(EnumC3377k1.EVENT_TYPE_ANR.m16250b())};
        HashSet hashSet = new HashSet();
        for (int i = 0; i < 7; i++) {
            hashSet.add(numArr[i]);
        }
        f21474a = Collections.unmodifiableSet(hashSet);
        EnumC3377k1 enumC3377k1 = EnumC3377k1.EVENT_TYPE_UNDEFINED;
        EnumC3377k1 enumC3377k12 = EnumC3377k1.EVENT_TYPE_SEND_REFERRER;
        EnumC3377k1 enumC3377k13 = EnumC3377k1.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        EnumC3377k1 enumC3377k14 = EnumC3377k1.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        EnumC3377k1 enumC3377k15 = EnumC3377k1.EVENT_TYPE_ACTIVATION;
        EnumC3377k1 enumC3377k16 = EnumC3377k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH;
        EnumC3377k1 enumC3377k17 = EnumC3377k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        EnumC3377k1 enumC3377k18 = EnumC3377k1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF;
        f21475b = EnumSet.of(enumC3377k1, EnumC3377k1.EVENT_TYPE_PURGE_BUFFER, enumC3377k12, enumC3377k13, enumC3377k14, enumC3377k15, enumC3377k16, enumC3377k17, enumC3377k18);
        EnumC3377k1 enumC3377k19 = EnumC3377k1.EVENT_TYPE_SET_USER_INFO;
        EnumC3377k1 enumC3377k110 = EnumC3377k1.EVENT_TYPE_REPORT_USER_INFO;
        EnumC3377k1 enumC3377k111 = EnumC3377k1.EVENT_TYPE_INIT;
        EnumC3377k1 enumC3377k112 = EnumC3377k1.EVENT_TYPE_APP_UPDATE;
        f21476c = EnumSet.of(enumC3377k19, enumC3377k110, EnumC3377k1.EVENT_TYPE_IDENTITY, enumC3377k1, enumC3377k111, enumC3377k112, enumC3377k12, EnumC3377k1.EVENT_TYPE_ALIVE, EnumC3377k1.EVENT_TYPE_STARTUP, enumC3377k13, enumC3377k14, enumC3377k15, enumC3377k16, enumC3377k17, enumC3377k18, EnumC3377k1.EVENT_TYPE_WEBVIEW_SYNC);
        EnumC3377k1 enumC3377k113 = EnumC3377k1.EVENT_TYPE_UPDATE_FOREGROUND_TIME;
        EnumC3377k1 enumC3377k114 = EnumC3377k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        f21477d = EnumSet.of(enumC3377k113, enumC3377k19, enumC3377k110, enumC3377k114);
        EnumC3377k1 enumC3377k115 = EnumC3377k1.EVENT_TYPE_EXCEPTION_UNHANDLED;
        EnumC3377k1 enumC3377k116 = EnumC3377k1.EVENT_TYPE_REGULAR;
        f21478e = EnumSet.of(enumC3377k115, enumC3377k114, EnumC3377k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT, EnumC3377k1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, EnumC3377k1.EVENT_TYPE_EXCEPTION_USER, EnumC3377k1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, EnumC3377k1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, enumC3377k16, enumC3377k17, EnumC3377k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH, EnumC3377k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, EnumC3377k1.EVENT_TYPE_CURRENT_SESSION_CRASHPAD_CRASH_PROTOBUF, enumC3377k18, enumC3377k116);
        f21479f = EnumSet.of(EnumC3377k1.EVENT_TYPE_DIAGNOSTIC, EnumC3377k1.EVENT_TYPE_DIAGNOSTIC_STATBOX, EnumC3377k1.EVENT_TYPE_DIAGNOSTIC_DISABLE_STAT_SENDING, EnumC3377k1.EVENT_TYPE_APPMETRICA_DIAGNOSTICS);
        f21480g = EnumSet.of(enumC3377k116);
        f21481h = EnumSet.of(enumC3377k16, enumC3377k17, enumC3377k18);
        f21482i = Arrays.asList(Integer.valueOf(enumC3377k111.m16250b()), Integer.valueOf(EnumC3377k1.EVENT_TYPE_FIRST_ACTIVATION.m16250b()), Integer.valueOf(enumC3377k12.m16250b()), Integer.valueOf(enumC3377k112.m16250b()));
        f21483j = Arrays.asList(Integer.valueOf(EnumC3377k1.EVENT_TYPE_CLEANUP.m16250b()));
    }

    /* renamed from: a */
    public static boolean m14399a(EnumC3377k1 enumC3377k1) {
        return !f21475b.contains(enumC3377k1);
    }

    /* renamed from: b */
    public static boolean m14402b(EnumC3377k1 enumC3377k1) {
        return !f21476c.contains(enumC3377k1);
    }

    /* renamed from: c */
    public static boolean m14404c(int i) {
        return f21478e.contains(EnumC3377k1.m16248a(i));
    }

    /* renamed from: d */
    public static boolean m14405d(int i) {
        return !f21481h.contains(EnumC3377k1.m16248a(i));
    }

    /* renamed from: e */
    public static boolean m14406e(int i) {
        return f21480g.contains(EnumC3377k1.m16248a(i));
    }

    /* renamed from: f */
    public static boolean m14407f(int i) {
        return f21474a.contains(Integer.valueOf(i));
    }

    /* renamed from: a */
    public static boolean m14398a(int i) {
        return f21479f.contains(EnumC3377k1.m16248a(i));
    }

    /* renamed from: b */
    public static boolean m14401b(int i) {
        return f21477d.contains(EnumC3377k1.m16248a(i));
    }

    /* renamed from: c */
    public static C3376k0 m14403c(String str, C2689Im c2689Im) {
        return m14395a(str, EnumC3377k1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF, c2689Im);
    }

    /* renamed from: a */
    public static C3376k0 m14394a(String str, C2689Im c2689Im) {
        return m14395a(str, EnumC3377k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, c2689Im);
    }

    /* renamed from: b */
    public static C3376k0 m14400b(String str, C2689Im c2689Im) {
        return m14395a(str, EnumC3377k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, c2689Im);
    }

    /* renamed from: a */
    private static C3376k0 m14395a(String str, EnumC3377k1 enumC3377k1, C2689Im c2689Im) {
        C2915S c2915s = new C2915S("", "", enumC3377k1.m16250b(), 0, c2689Im);
        if (str != null) {
            c2915s.m15104i(str);
        }
        return c2915s;
    }

    /* renamed from: a */
    public static C3376k0 m14393a() {
        C3376k0 c3376k0 = new C3376k0();
        c3376k0.f23831e = EnumC3377k1.EVENT_TYPE_DIAGNOSTIC_DISABLE_STAT_SENDING.m16250b();
        try {
            c3376k0.f23828b = new JSONObject().put("stat_sending", new JSONObject().put("disabled", true)).toString();
        } catch (Throwable unused) {
        }
        return c3376k0;
    }

    /* renamed from: a */
    public static C3376k0 m14397a(String str, byte[] bArr, C2689Im c2689Im) {
        return new C2915S(bArr, str, EnumC3377k1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF.m16250b(), c2689Im);
    }

    /* renamed from: a */
    public static C3376k0 m14396a(String str, String str2, boolean z, C2689Im c2689Im) {
        HashMap map = new HashMap();
        map.put("type", str);
        map.put("link", str2);
        map.put("auto", Boolean.valueOf(z));
        return new C2915S(C3762ym.m17305g(map), "", EnumC3377k1.EVENT_TYPE_APP_OPEN.m16250b(), 0, c2689Im);
    }
}
