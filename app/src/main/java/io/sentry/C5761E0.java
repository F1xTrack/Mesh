package io.sentry;

import com.huawei.hms.adapter.internal.CommonCode;
import com.p019vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
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

/* renamed from: io.sentry.E0 */
/* loaded from: classes2.dex */
public final class C5761E0 implements InterfaceC6058l0 {

    /* renamed from: A */
    public final HashMap f33235A;

    /* renamed from: C */
    public ConcurrentHashMap f33237C;

    /* renamed from: a */
    public final File f33238a;

    /* renamed from: b */
    public final Callable f33239b;

    /* renamed from: c */
    public int f33240c;

    /* renamed from: e */
    public String f33242e;

    /* renamed from: f */
    public String f33243f;

    /* renamed from: g */
    public String f33244g;

    /* renamed from: h */
    public String f33245h;

    /* renamed from: i */
    public String f33246i;

    /* renamed from: j */
    public boolean f33247j;

    /* renamed from: k */
    public String f33248k;

    /* renamed from: m */
    public String f33250m;

    /* renamed from: n */
    public String f33251n;

    /* renamed from: o */
    public String f33252o;

    /* renamed from: p */
    public final ArrayList f33253p;

    /* renamed from: q */
    public String f33254q;

    /* renamed from: r */
    public String f33255r;

    /* renamed from: s */
    public String f33256s;

    /* renamed from: t */
    public String f33257t;

    /* renamed from: u */
    public String f33258u;

    /* renamed from: v */
    public String f33259v;

    /* renamed from: w */
    public String f33260w;

    /* renamed from: x */
    public String f33261x;

    /* renamed from: y */
    public String f33262y;

    /* renamed from: z */
    public Date f33263z;

    /* renamed from: l */
    public List f33249l = new ArrayList();

    /* renamed from: B */
    public String f33236B = null;

    /* renamed from: d */
    public String f33241d = Locale.getDefault().toString();

    public C5761E0(File file, Date date, ArrayList arrayList, String str, String str2, String str3, String str4, int i, String str5, Callable callable, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, String str12, String str13, HashMap map) {
        this.f33238a = file;
        this.f33263z = date;
        this.f33248k = str5;
        this.f33239b = callable;
        this.f33240c = i;
        this.f33242e = str6 != null ? str6 : "";
        this.f33243f = str7 != null ? str7 : "";
        this.f33246i = str8 != null ? str8 : "";
        this.f33247j = bool != null ? bool.booleanValue() : false;
        this.f33250m = str9 != null ? str9 : "0";
        this.f33244g = "";
        this.f33245h = ConstantDeviceInfo.APP_PLATFORM;
        this.f33251n = ConstantDeviceInfo.APP_PLATFORM;
        this.f33252o = str10 != null ? str10 : "";
        this.f33253p = arrayList;
        this.f33254q = str.isEmpty() ? "unknown" : str;
        this.f33255r = str4;
        this.f33256s = "";
        this.f33257t = str11 != null ? str11 : "";
        this.f33258u = str2;
        this.f33259v = str3;
        this.f33260w = UUID.randomUUID().toString();
        this.f33261x = str12 != null ? str12 : "production";
        this.f33262y = str13;
        if (!str13.equals("normal") && !this.f33262y.equals("timeout") && !this.f33262y.equals("backgrounded")) {
            this.f33262y = "normal";
        }
        this.f33235A = map;
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        interfaceC5749A0.mo13828u("android_api_level").mo13825r(iLogger, Integer.valueOf(this.f33240c));
        interfaceC5749A0.mo13828u("device_locale").mo13825r(iLogger, this.f33241d);
        interfaceC5749A0.mo13828u("device_manufacturer").mo13811d(this.f33242e);
        interfaceC5749A0.mo13828u(AnalyticsBaseParamsConstantsKt.DEVICE_MODEL).mo13811d(this.f33243f);
        interfaceC5749A0.mo13828u("device_os_build_number").mo13811d(this.f33244g);
        interfaceC5749A0.mo13828u("device_os_name").mo13811d(this.f33245h);
        interfaceC5749A0.mo13828u("device_os_version").mo13811d(this.f33246i);
        interfaceC5749A0.mo13828u("device_is_emulator").mo13815h(this.f33247j);
        interfaceC5749A0.mo13828u("architecture").mo13825r(iLogger, this.f33248k);
        interfaceC5749A0.mo13828u("device_cpu_frequencies").mo13825r(iLogger, this.f33249l);
        interfaceC5749A0.mo13828u("device_physical_memory_bytes").mo13811d(this.f33250m);
        interfaceC5749A0.mo13828u("platform").mo13811d(this.f33251n);
        interfaceC5749A0.mo13828u("build_id").mo13811d(this.f33252o);
        interfaceC5749A0.mo13828u("transaction_name").mo13811d(this.f33254q);
        interfaceC5749A0.mo13828u("duration_ns").mo13811d(this.f33255r);
        interfaceC5749A0.mo13828u("version_name").mo13811d(this.f33257t);
        interfaceC5749A0.mo13828u("version_code").mo13811d(this.f33256s);
        ArrayList arrayList = this.f33253p;
        if (!arrayList.isEmpty()) {
            interfaceC5749A0.mo13828u("transactions").mo13825r(iLogger, arrayList);
        }
        interfaceC5749A0.mo13828u(CommonCode.MapKey.TRANSACTION_ID).mo13811d(this.f33258u);
        interfaceC5749A0.mo13828u("trace_id").mo13811d(this.f33259v);
        interfaceC5749A0.mo13828u("profile_id").mo13811d(this.f33260w);
        interfaceC5749A0.mo13828u("environment").mo13811d(this.f33261x);
        interfaceC5749A0.mo13828u("truncation_reason").mo13811d(this.f33262y);
        if (this.f33236B != null) {
            interfaceC5749A0.mo13828u("sampled_profile").mo13811d(this.f33236B);
        }
        interfaceC5749A0.mo13828u("measurements").mo13825r(iLogger, this.f33235A);
        interfaceC5749A0.mo13828u("timestamp").mo13825r(iLogger, this.f33263z);
        ConcurrentHashMap concurrentHashMap = this.f33237C;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC6008d.m21773c(this.f33237C, str, interfaceC5749A0, str, iLogger);
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
