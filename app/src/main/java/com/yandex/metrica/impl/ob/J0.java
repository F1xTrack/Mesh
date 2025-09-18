package com.yandex.metrica.impl.ob;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class J0 {
    private static final Set<Integer> a;
    private static final EnumSet<EnumC2865k1> b;
    private static final EnumSet<EnumC2865k1> c;
    private static final EnumSet<EnumC2865k1> d;
    private static final EnumSet<EnumC2865k1> e;
    private static final EnumSet<EnumC2865k1> f;
    private static final EnumSet<EnumC2865k1> g;
    private static final EnumSet<EnumC2865k1> h;
    public static final List<Integer> i;
    public static final List<Integer> j;

    static {
        Integer[] numArr = {Integer.valueOf(EnumC2865k1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF.b()), Integer.valueOf(EnumC2865k1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF.b()), Integer.valueOf(EnumC2865k1.EVENT_TYPE_EXCEPTION_USER.b()), Integer.valueOf(EnumC2865k1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF.b()), Integer.valueOf(EnumC2865k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE.b()), Integer.valueOf(EnumC2865k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT.b()), Integer.valueOf(EnumC2865k1.EVENT_TYPE_ANR.b())};
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < 7; i2++) {
            hashSet.add(numArr[i2]);
        }
        a = Collections.unmodifiableSet(hashSet);
        EnumC2865k1 enumC2865k1 = EnumC2865k1.EVENT_TYPE_UNDEFINED;
        EnumC2865k1 enumC2865k12 = EnumC2865k1.EVENT_TYPE_SEND_REFERRER;
        EnumC2865k1 enumC2865k13 = EnumC2865k1.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        EnumC2865k1 enumC2865k14 = EnumC2865k1.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        EnumC2865k1 enumC2865k15 = EnumC2865k1.EVENT_TYPE_ACTIVATION;
        EnumC2865k1 enumC2865k16 = EnumC2865k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH;
        EnumC2865k1 enumC2865k17 = EnumC2865k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        EnumC2865k1 enumC2865k18 = EnumC2865k1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF;
        b = EnumSet.of(enumC2865k1, EnumC2865k1.EVENT_TYPE_PURGE_BUFFER, enumC2865k12, enumC2865k13, enumC2865k14, enumC2865k15, enumC2865k16, enumC2865k17, enumC2865k18);
        EnumC2865k1 enumC2865k19 = EnumC2865k1.EVENT_TYPE_SET_USER_INFO;
        EnumC2865k1 enumC2865k110 = EnumC2865k1.EVENT_TYPE_REPORT_USER_INFO;
        EnumC2865k1 enumC2865k111 = EnumC2865k1.EVENT_TYPE_INIT;
        EnumC2865k1 enumC2865k112 = EnumC2865k1.EVENT_TYPE_APP_UPDATE;
        c = EnumSet.of(enumC2865k19, enumC2865k110, EnumC2865k1.EVENT_TYPE_IDENTITY, enumC2865k1, enumC2865k111, enumC2865k112, enumC2865k12, EnumC2865k1.EVENT_TYPE_ALIVE, EnumC2865k1.EVENT_TYPE_STARTUP, enumC2865k13, enumC2865k14, enumC2865k15, enumC2865k16, enumC2865k17, enumC2865k18, EnumC2865k1.EVENT_TYPE_WEBVIEW_SYNC);
        EnumC2865k1 enumC2865k113 = EnumC2865k1.EVENT_TYPE_UPDATE_FOREGROUND_TIME;
        EnumC2865k1 enumC2865k114 = EnumC2865k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        d = EnumSet.of(enumC2865k113, enumC2865k19, enumC2865k110, enumC2865k114);
        EnumC2865k1 enumC2865k115 = EnumC2865k1.EVENT_TYPE_EXCEPTION_UNHANDLED;
        EnumC2865k1 enumC2865k116 = EnumC2865k1.EVENT_TYPE_REGULAR;
        e = EnumSet.of(enumC2865k115, enumC2865k114, EnumC2865k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT, EnumC2865k1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, EnumC2865k1.EVENT_TYPE_EXCEPTION_USER, EnumC2865k1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, EnumC2865k1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, enumC2865k16, enumC2865k17, EnumC2865k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH, EnumC2865k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, EnumC2865k1.EVENT_TYPE_CURRENT_SESSION_CRASHPAD_CRASH_PROTOBUF, enumC2865k18, enumC2865k116);
        f = EnumSet.of(EnumC2865k1.EVENT_TYPE_DIAGNOSTIC, EnumC2865k1.EVENT_TYPE_DIAGNOSTIC_STATBOX, EnumC2865k1.EVENT_TYPE_DIAGNOSTIC_DISABLE_STAT_SENDING, EnumC2865k1.EVENT_TYPE_APPMETRICA_DIAGNOSTICS);
        g = EnumSet.of(enumC2865k116);
        h = EnumSet.of(enumC2865k16, enumC2865k17, enumC2865k18);
        i = Arrays.asList(Integer.valueOf(enumC2865k111.b()), Integer.valueOf(EnumC2865k1.EVENT_TYPE_FIRST_ACTIVATION.b()), Integer.valueOf(enumC2865k12.b()), Integer.valueOf(enumC2865k112.b()));
        j = Arrays.asList(Integer.valueOf(EnumC2865k1.EVENT_TYPE_CLEANUP.b()));
    }

    public static boolean a(EnumC2865k1 enumC2865k1) {
        return !b.contains(enumC2865k1);
    }

    public static boolean b(EnumC2865k1 enumC2865k1) {
        return !c.contains(enumC2865k1);
    }

    public static boolean c(int i2) {
        return e.contains(EnumC2865k1.a(i2));
    }

    public static boolean d(int i2) {
        return !h.contains(EnumC2865k1.a(i2));
    }

    public static boolean e(int i2) {
        return g.contains(EnumC2865k1.a(i2));
    }

    public static boolean f(int i2) {
        return a.contains(Integer.valueOf(i2));
    }

    public static boolean a(int i2) {
        return f.contains(EnumC2865k1.a(i2));
    }

    public static boolean b(int i2) {
        return d.contains(EnumC2865k1.a(i2));
    }

    public static C2864k0 c(String str, Im im) {
        return a(str, EnumC2865k1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF, im);
    }

    public static C2864k0 a(String str, Im im) {
        return a(str, EnumC2865k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, im);
    }

    public static C2864k0 b(String str, Im im) {
        return a(str, EnumC2865k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, im);
    }

    private static C2864k0 a(String str, EnumC2865k1 enumC2865k1, Im im) {
        S s = new S("", "", enumC2865k1.b(), 0, im);
        if (str != null) {
            s.i(str);
        }
        return s;
    }

    public static C2864k0 a() {
        C2864k0 c2864k0 = new C2864k0();
        c2864k0.e = EnumC2865k1.EVENT_TYPE_DIAGNOSTIC_DISABLE_STAT_SENDING.b();
        try {
            c2864k0.b = new JSONObject().put("stat_sending", new JSONObject().put("disabled", true)).toString();
        } catch (Throwable unused) {
        }
        return c2864k0;
    }

    public static C2864k0 a(String str, byte[] bArr, Im im) {
        return new S(bArr, str, EnumC2865k1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF.b(), im);
    }

    public static C2864k0 a(String str, String str2, boolean z, Im im) {
        HashMap map = new HashMap();
        map.put("type", str);
        map.put("link", str2);
        map.put("auto", Boolean.valueOf(z));
        return new S(C3240ym.g(map), "", EnumC2865k1.EVENT_TYPE_APP_OPEN.b(), 0, im);
    }
}
