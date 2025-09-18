package com.p018my.tracker.obfuscated;

import android.os.Handler;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.p018my.tracker.MyTracker;
import com.p018my.tracker.MyTrackerConfig;
import com.p018my.tracker.MyTrackerParams;
import com.p018my.tracker.config.AntiFraudConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.URI;
import p000.AbstractC7222ym;

/* renamed from: com.my.tracker.obfuscated.z2 */
/* loaded from: classes2.dex */
public final class C2395z2 {

    /* renamed from: a */
    private final MyTrackerParams f20174a = new MyTrackerParams();

    /* renamed from: b */
    private String f20175b = "";

    /* renamed from: c */
    private AntiFraudConfig f20176c = AntiFraudConfig.newBuilder().build();

    /* renamed from: d */
    private volatile boolean f20177d = true;

    /* renamed from: e */
    private volatile int f20178e = 0;

    /* renamed from: f */
    private volatile boolean f20179f = true;

    /* renamed from: g */
    private volatile boolean f20180g = true;

    /* renamed from: h */
    private volatile boolean f20181h = true;

    /* renamed from: i */
    private volatile boolean f20182i = true;

    /* renamed from: j */
    private volatile int f20183j = 30;

    /* renamed from: k */
    private volatile int f20184k = 0;

    /* renamed from: l */
    private volatile int f20185l = 900;

    /* renamed from: m */
    private volatile String f20186m = null;

    /* renamed from: n */
    private volatile String f20187n = null;

    /* renamed from: o */
    private volatile MyTrackerConfig.InstalledPackagesProvider f20188o = null;

    /* renamed from: p */
    private volatile MyTrackerConfig.OkHttpClientProvider f20189p = null;

    /* renamed from: q */
    private volatile String f20190q = "";

    /* renamed from: r */
    private volatile String f20191r = "";

    /* renamed from: s */
    private volatile String f20192s = "";

    /* renamed from: t */
    private volatile String f20193t = "";

    /* renamed from: u */
    private volatile String f20194u = "";

    /* renamed from: v */
    private volatile MyTracker.AttributionListener f20195v = null;

    /* renamed from: w */
    private volatile Handler f20196w = null;

    /* renamed from: com.my.tracker.obfuscated.z2$a */
    public static class a {

        /* renamed from: a */
        public final String f20197a;

        /* renamed from: b */
        public final int f20198b;

        /* renamed from: c */
        public final int f20199c;

        /* renamed from: d */
        public final int f20200d;

        /* renamed from: e */
        public final int f20201e;

        /* renamed from: f */
        public final boolean f20202f;

        /* renamed from: g */
        public final boolean f20203g;

        /* renamed from: h */
        public final boolean f20204h;

        /* renamed from: i */
        public final boolean f20205i;

        /* renamed from: j */
        public final boolean f20206j;

        /* renamed from: k */
        public final MyTrackerParams.C2285a f20207k;

        /* renamed from: l */
        public final AntiFraudConfig f20208l;

        /* renamed from: m */
        public final MyTrackerConfig.InstalledPackagesProvider f20209m;

        public a(String str, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, MyTrackerParams.C2285a c2285a, AntiFraudConfig antiFraudConfig, MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider) {
            this.f20197a = str;
            this.f20198b = i;
            this.f20199c = i2;
            this.f20200d = i3;
            this.f20201e = i4;
            this.f20202f = z;
            this.f20203g = z2;
            this.f20204h = z3;
            this.f20205i = z4;
            this.f20206j = z5;
            this.f20207k = c2285a;
            this.f20208l = antiFraudConfig;
            this.f20209m = installedPackagesProvider;
        }
    }

    private C2395z2() {
        m13583y();
    }

    /* renamed from: x */
    public static C2395z2 m13582x() {
        return new C2395z2();
    }

    /* renamed from: y */
    private void m13583y() {
        m13581d("tracker-api.vk-analytics.ru");
    }

    /* renamed from: a */
    public AntiFraudConfig m13584a() {
        return this.f20176c;
    }

    /* renamed from: b */
    public String m13592b() {
        return this.f20186m;
    }

    /* renamed from: c */
    public Handler m13596c() {
        return this.f20196w;
    }

    /* renamed from: d */
    public MyTracker.AttributionListener m13600d() {
        return this.f20195v;
    }

    /* renamed from: e */
    public int m13603e() {
        return this.f20185l;
    }

    /* renamed from: f */
    public int m13606f() {
        return this.f20184k;
    }

    /* renamed from: g */
    public String m13607g() {
        return this.f20175b;
    }

    /* renamed from: h */
    public String m13608h() {
        return this.f20191r;
    }

    /* renamed from: i */
    public int m13609i() {
        return this.f20183j;
    }

    /* renamed from: j */
    public int m13610j() {
        return this.f20178e;
    }

    /* renamed from: k */
    public String m13611k() {
        return this.f20193t;
    }

    /* renamed from: l */
    public String m13612l() {
        return this.f20192s;
    }

    /* renamed from: m */
    public MyTrackerParams m13613m() {
        return this.f20174a;
    }

    /* renamed from: n */
    public MyTrackerConfig.OkHttpClientProvider m13614n() {
        return this.f20189p;
    }

    /* renamed from: o */
    public a m13615o() {
        return new a(this.f20175b, this.f20183j, this.f20185l, this.f20184k, this.f20178e, this.f20177d, this.f20179f, this.f20180g, this.f20181h, this.f20182i, this.f20174a.m12752a(), this.f20176c, this.f20188o);
    }

    /* renamed from: p */
    public String m13616p() {
        return this.f20194u;
    }

    /* renamed from: q */
    public String m13617q() {
        return this.f20190q;
    }

    /* renamed from: r */
    public String m13618r() {
        return this.f20187n;
    }

    /* renamed from: s */
    public boolean m13619s() {
        return this.f20180g;
    }

    /* renamed from: t */
    public boolean m13620t() {
        return this.f20179f;
    }

    /* renamed from: u */
    public boolean m13621u() {
        return this.f20177d;
    }

    /* renamed from: v */
    public boolean m13622v() {
        return this.f20181h;
    }

    /* renamed from: w */
    public boolean m13623w() {
        return this.f20182i;
    }

    /* renamed from: z */
    public void m13624z() {
        this.f20187n = "com.my.games.vendorapp";
    }

    /* renamed from: a */
    public void m13589a(AntiFraudConfig antiFraudConfig) {
        this.f20176c = antiFraudConfig;
    }

    /* renamed from: b */
    public void m13593b(int i) {
        if (i > 432000) {
            AbstractC2391y2.m13568a("Invalid forcingPeriod value " + i + ", forcingPeriod set to max 432000");
            this.f20184k = 432000;
            return;
        }
        if (i < 0) {
            AbstractC2391y2.m13568a("Invalid forcingPeriod value " + i + ", forcingPeriod set to min 0");
            i = 0;
        }
        this.f20184k = i;
    }

    /* renamed from: c */
    public void m13597c(int i) {
        StringBuilder sb;
        String str;
        int i2 = 7200;
        if (i <= 7200) {
            i2 = 30;
            if (i < 30) {
                sb = new StringBuilder("Invalid launchTimeout value ");
                sb.append(i);
                str = ", timeout set to min 30";
            }
            this.f20183j = i;
        }
        sb = new StringBuilder("Invalid launchTimeout value ");
        sb.append(i);
        str = ", timeout set to max 7200";
        sb.append(str);
        AbstractC2391y2.m13568a(sb.toString());
        i = i2;
        this.f20183j = i;
    }

    /* renamed from: d */
    public void m13601d(int i) {
        this.f20178e = i;
    }

    /* renamed from: e */
    public void m13605e(boolean z) {
        this.f20182i = z;
    }

    /* renamed from: a */
    public void m13590a(String str) {
        this.f20186m = str;
    }

    /* renamed from: b */
    public void m13594b(String str) {
        this.f20175b = str;
    }

    /* renamed from: c */
    public void m13598c(String str) {
        String strSubstring;
        String host;
        try {
            if (TextUtils.isEmpty(str)) {
                AbstractC2391y2.m13574c("setProxyHost: reset proxy host to default = tracker-api.vk-analytics.ru");
                m13583y();
                return;
            }
            AbstractC2391y2.m13574c("setProxyHost: try to set proxy host = " + str);
            int iIndexOf = str.indexOf("://");
            if (iIndexOf > 0) {
                AbstractC2391y2.m13574c("setProxyHost: detected custom schema, will be suppressed");
                strSubstring = str.substring(iIndexOf + 3);
            } else {
                strSubstring = str;
            }
            URI uri = new URI(AbstractC2293a3.m12784a(strSubstring, null));
            if (uri.getUserInfo() != null) {
                AbstractC2391y2.m13574c("setProxyHost: detected custom userinfo, will be suppressed");
            }
            if (!TextUtils.isEmpty(uri.getPath())) {
                AbstractC2391y2.m13574c("setProxyHost: detected custom path, will be suppressed");
            }
            int port = uri.getPort();
            if (port != -1) {
                host = uri.getHost() + StringUtils.PROCESS_POSTFIX_DELIMITER + port;
            } else {
                host = uri.getHost();
            }
            if (host.startsWith("www.")) {
                AbstractC2391y2.m13574c("setProxyHost: proxyHost starts from 'www.' which is not recommended (check docs), continue anyway");
            }
            m13581d(host);
            AbstractC2391y2.m13574c("setProxyHost: proxy host = " + host + " successfully set");
        } catch (Throwable th) {
            StringBuilder sbM26240q = AbstractC7222ym.m26240q("setProxyHost: unable to set proxy host = ", str, " (reason: invalid url), using default = tracker-api.vk-analytics.ru,\norig error = ");
            sbM26240q.append(th.getMessage());
            AbstractC2391y2.m13574c(sbM26240q.toString());
            m13583y();
        }
    }

    /* renamed from: d */
    public void m13602d(boolean z) {
        this.f20181h = z;
    }

    /* renamed from: e */
    public void m13604e(String str) {
        this.f20187n = str;
    }

    /* renamed from: d */
    private void m13581d(String str) {
        this.f20190q = AbstractC2293a3.m12784a(str, "v3/");
        AbstractC2391y2.m13568a("trackerUrl set = " + this.f20190q);
        this.f20191r = AbstractC2293a3.m12785a("ip4", str, null);
        AbstractC2391y2.m13568a("ipv4TrackerUrl set = " + this.f20191r);
        this.f20194u = AbstractC2293a3.m12785a("ts", str, "mobile/v1");
        AbstractC2391y2.m13568a("timeSpentUrl set = " + this.f20194u);
        this.f20192s = AbstractC2293a3.m12785a("mlapi", str, null);
        this.f20193t = AbstractC2293a3.m12785a("beta-ml", str, null);
    }

    /* renamed from: a */
    public void m13586a(MyTracker.AttributionListener attributionListener, Handler handler) {
        this.f20195v = attributionListener;
        this.f20196w = handler;
    }

    /* renamed from: b */
    public void m13595b(boolean z) {
        this.f20179f = z;
    }

    /* renamed from: a */
    public void m13591a(boolean z) {
        this.f20180g = z;
    }

    /* renamed from: a */
    public void m13585a(int i) {
        StringBuilder sb;
        String str;
        int i2 = RemoteMessageConst.DEFAULT_TTL;
        if (i <= 86400) {
            i2 = 1;
            if (i < 1) {
                sb = new StringBuilder("Invalid bufferingPeriod value ");
                sb.append(i);
                str = ", bufferingPeriod set to min 1";
            }
            this.f20185l = i;
        }
        sb = new StringBuilder("Invalid bufferingPeriod value ");
        sb.append(i);
        str = ", bufferingPeriod set to max 86400";
        sb.append(str);
        AbstractC2391y2.m13568a(sb.toString());
        i = i2;
        this.f20185l = i;
    }

    /* renamed from: a */
    public void m13587a(MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider) {
        this.f20188o = installedPackagesProvider;
    }

    /* renamed from: a */
    public void m13588a(MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        this.f20189p = okHttpClientProvider;
    }

    /* renamed from: c */
    public void m13599c(boolean z) {
        this.f20177d = z;
    }
}
