package io.sentry;

import com.huawei.hms.adapter.internal.CommonCode;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class E0 implements InterfaceC5141l0 {
    public final HashMap A;
    public ConcurrentHashMap C;
    public final File a;
    public final Callable b;
    public int c;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public boolean j;
    public String k;
    public String m;
    public String n;
    public String o;
    public final ArrayList p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public String w;
    public String x;
    public String y;
    public Date z;
    public List l = new ArrayList();
    public String B = null;
    public String d = Locale.getDefault().toString();

    public E0(File file, Date date, ArrayList arrayList, String str, String str2, String str3, String str4, int i, String str5, Callable callable, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, String str12, String str13, HashMap map) {
        this.a = file;
        this.z = date;
        this.k = str5;
        this.b = callable;
        this.c = i;
        this.e = str6 != null ? str6 : "";
        this.f = str7 != null ? str7 : "";
        this.i = str8 != null ? str8 : "";
        this.j = bool != null ? bool.booleanValue() : false;
        this.m = str9 != null ? str9 : "0";
        this.g = "";
        this.h = ConstantDeviceInfo.APP_PLATFORM;
        this.n = ConstantDeviceInfo.APP_PLATFORM;
        this.o = str10 != null ? str10 : "";
        this.p = arrayList;
        this.q = str.isEmpty() ? "unknown" : str;
        this.r = str4;
        this.s = "";
        this.t = str11 != null ? str11 : "";
        this.u = str2;
        this.v = str3;
        this.w = UUID.randomUUID().toString();
        this.x = str12 != null ? str12 : "production";
        this.y = str13;
        if (!str13.equals("normal") && !this.y.equals("timeout") && !this.y.equals("backgrounded")) {
            this.y = "normal";
        }
        this.A = map;
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        a0.u("android_api_level").r(iLogger, Integer.valueOf(this.c));
        a0.u("device_locale").r(iLogger, this.d);
        a0.u("device_manufacturer").d(this.e);
        a0.u(AnalyticsBaseParamsConstantsKt.DEVICE_MODEL).d(this.f);
        a0.u("device_os_build_number").d(this.g);
        a0.u("device_os_name").d(this.h);
        a0.u("device_os_version").d(this.i);
        a0.u("device_is_emulator").h(this.j);
        a0.u("architecture").r(iLogger, this.k);
        a0.u("device_cpu_frequencies").r(iLogger, this.l);
        a0.u("device_physical_memory_bytes").d(this.m);
        a0.u("platform").d(this.n);
        a0.u("build_id").d(this.o);
        a0.u("transaction_name").d(this.q);
        a0.u("duration_ns").d(this.r);
        a0.u("version_name").d(this.t);
        a0.u("version_code").d(this.s);
        ArrayList arrayList = this.p;
        if (!arrayList.isEmpty()) {
            a0.u("transactions").r(iLogger, arrayList);
        }
        a0.u(CommonCode.MapKey.TRANSACTION_ID).d(this.u);
        a0.u("trace_id").d(this.v);
        a0.u("profile_id").d(this.w);
        a0.u("environment").d(this.x);
        a0.u("truncation_reason").d(this.y);
        if (this.B != null) {
            a0.u("sampled_profile").d(this.B);
        }
        a0.u("measurements").r(iLogger, this.A);
        a0.u("timestamp").r(iLogger, this.z);
        ConcurrentHashMap concurrentHashMap = this.C;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC5116d.c(this.C, str, a0, str, iLogger);
            }
        }
        a0.j();
    }
}
