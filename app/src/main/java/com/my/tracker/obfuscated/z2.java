package com.my.tracker.obfuscated;

import android.os.Handler;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.MyTrackerParams;
import com.my.tracker.config.AntiFraudConfig;
import defpackage.AbstractC8235ym;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.URI;

/* loaded from: classes2.dex */
public final class z2 {
    private final MyTrackerParams a = new MyTrackerParams();
    private String b = "";
    private AntiFraudConfig c = AntiFraudConfig.newBuilder().build();
    private volatile boolean d = true;
    private volatile int e = 0;
    private volatile boolean f = true;
    private volatile boolean g = true;
    private volatile boolean h = true;
    private volatile boolean i = true;
    private volatile int j = 30;
    private volatile int k = 0;
    private volatile int l = 900;
    private volatile String m = null;
    private volatile String n = null;
    private volatile MyTrackerConfig.InstalledPackagesProvider o = null;
    private volatile MyTrackerConfig.OkHttpClientProvider p = null;
    private volatile String q = "";
    private volatile String r = "";
    private volatile String s = "";
    private volatile String t = "";
    private volatile String u = "";
    private volatile MyTracker.AttributionListener v = null;
    private volatile Handler w = null;

    public static class a {
        public final String a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final boolean i;
        public final boolean j;
        public final MyTrackerParams.a k;
        public final AntiFraudConfig l;
        public final MyTrackerConfig.InstalledPackagesProvider m;

        public a(String str, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, MyTrackerParams.a aVar, AntiFraudConfig antiFraudConfig, MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider) {
            this.a = str;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = z;
            this.g = z2;
            this.h = z3;
            this.i = z4;
            this.j = z5;
            this.k = aVar;
            this.l = antiFraudConfig;
            this.m = installedPackagesProvider;
        }
    }

    private z2() {
        y();
    }

    public static z2 x() {
        return new z2();
    }

    private void y() {
        d("tracker-api.vk-analytics.ru");
    }

    public AntiFraudConfig a() {
        return this.c;
    }

    public String b() {
        return this.m;
    }

    public Handler c() {
        return this.w;
    }

    public MyTracker.AttributionListener d() {
        return this.v;
    }

    public int e() {
        return this.l;
    }

    public int f() {
        return this.k;
    }

    public String g() {
        return this.b;
    }

    public String h() {
        return this.r;
    }

    public int i() {
        return this.j;
    }

    public int j() {
        return this.e;
    }

    public String k() {
        return this.t;
    }

    public String l() {
        return this.s;
    }

    public MyTrackerParams m() {
        return this.a;
    }

    public MyTrackerConfig.OkHttpClientProvider n() {
        return this.p;
    }

    public a o() {
        return new a(this.b, this.j, this.l, this.k, this.e, this.d, this.f, this.g, this.h, this.i, this.a.a(), this.c, this.o);
    }

    public String p() {
        return this.u;
    }

    public String q() {
        return this.q;
    }

    public String r() {
        return this.n;
    }

    public boolean s() {
        return this.g;
    }

    public boolean t() {
        return this.f;
    }

    public boolean u() {
        return this.d;
    }

    public boolean v() {
        return this.h;
    }

    public boolean w() {
        return this.i;
    }

    public void z() {
        this.n = "com.my.games.vendorapp";
    }

    public void a(AntiFraudConfig antiFraudConfig) {
        this.c = antiFraudConfig;
    }

    public void b(int i) {
        if (i > 432000) {
            y2.a("Invalid forcingPeriod value " + i + ", forcingPeriod set to max 432000");
            this.k = 432000;
            return;
        }
        if (i < 0) {
            y2.a("Invalid forcingPeriod value " + i + ", forcingPeriod set to min 0");
            i = 0;
        }
        this.k = i;
    }

    public void c(int i) {
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
            this.j = i;
        }
        sb = new StringBuilder("Invalid launchTimeout value ");
        sb.append(i);
        str = ", timeout set to max 7200";
        sb.append(str);
        y2.a(sb.toString());
        i = i2;
        this.j = i;
    }

    public void d(int i) {
        this.e = i;
    }

    public void e(boolean z) {
        this.i = z;
    }

    public void a(String str) {
        this.m = str;
    }

    public void b(String str) {
        this.b = str;
    }

    public void c(String str) {
        String strSubstring;
        String host;
        try {
            if (TextUtils.isEmpty(str)) {
                y2.c("setProxyHost: reset proxy host to default = tracker-api.vk-analytics.ru");
                y();
                return;
            }
            y2.c("setProxyHost: try to set proxy host = " + str);
            int iIndexOf = str.indexOf("://");
            if (iIndexOf > 0) {
                y2.c("setProxyHost: detected custom schema, will be suppressed");
                strSubstring = str.substring(iIndexOf + 3);
            } else {
                strSubstring = str;
            }
            URI uri = new URI(a3.a(strSubstring, null));
            if (uri.getUserInfo() != null) {
                y2.c("setProxyHost: detected custom userinfo, will be suppressed");
            }
            if (!TextUtils.isEmpty(uri.getPath())) {
                y2.c("setProxyHost: detected custom path, will be suppressed");
            }
            int port = uri.getPort();
            if (port != -1) {
                host = uri.getHost() + StringUtils.PROCESS_POSTFIX_DELIMITER + port;
            } else {
                host = uri.getHost();
            }
            if (host.startsWith("www.")) {
                y2.c("setProxyHost: proxyHost starts from 'www.' which is not recommended (check docs), continue anyway");
            }
            d(host);
            y2.c("setProxyHost: proxy host = " + host + " successfully set");
        } catch (Throwable th) {
            StringBuilder sbQ = AbstractC8235ym.q("setProxyHost: unable to set proxy host = ", str, " (reason: invalid url), using default = tracker-api.vk-analytics.ru,\norig error = ");
            sbQ.append(th.getMessage());
            y2.c(sbQ.toString());
            y();
        }
    }

    public void d(boolean z) {
        this.h = z;
    }

    public void e(String str) {
        this.n = str;
    }

    private void d(String str) {
        this.q = a3.a(str, "v3/");
        y2.a("trackerUrl set = " + this.q);
        this.r = a3.a("ip4", str, null);
        y2.a("ipv4TrackerUrl set = " + this.r);
        this.u = a3.a("ts", str, "mobile/v1");
        y2.a("timeSpentUrl set = " + this.u);
        this.s = a3.a("mlapi", str, null);
        this.t = a3.a("beta-ml", str, null);
    }

    public void a(MyTracker.AttributionListener attributionListener, Handler handler) {
        this.v = attributionListener;
        this.w = handler;
    }

    public void b(boolean z) {
        this.f = z;
    }

    public void a(boolean z) {
        this.g = z;
    }

    public void a(int i) {
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
            this.l = i;
        }
        sb = new StringBuilder("Invalid bufferingPeriod value ");
        sb.append(i);
        str = ", bufferingPeriod set to max 86400";
        sb.append(str);
        y2.a(sb.toString());
        i = i2;
        this.l = i;
    }

    public void a(MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider) {
        this.o = installedPackagesProvider;
    }

    public void a(MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        this.p = okHttpClientProvider;
    }

    public void c(boolean z) {
        this.d = z;
    }
}
