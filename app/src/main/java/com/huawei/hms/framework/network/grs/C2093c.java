package com.huawei.hms.framework.network.grs;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.framework.network.grs.p006e.C2095a;
import com.huawei.hms.framework.network.grs.p006e.C2097c;
import com.huawei.hms.framework.network.grs.p007f.C2099b;
import com.huawei.hms.framework.network.grs.p008g.C2109g;
import com.huawei.hms.framework.network.grs.p008g.C2110h;
import com.huawei.hms.framework.network.grs.p008g.p010j.C2114c;
import com.huawei.hms.framework.network.grs.p011h.C2116a;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p000.AbstractC7222ym;

/* renamed from: com.huawei.hms.framework.network.grs.c */
/* loaded from: classes.dex */
public class C2093c {

    /* renamed from: i */
    private static final String f19009i = "c";

    /* renamed from: j */
    private static final ExecutorService f19010j = ExecutorsUtils.newSingleThreadExecutor("GRS_GrsClient-Init");

    /* renamed from: k */
    private static long f19011k = 0;

    /* renamed from: a */
    private GrsBaseInfo f19012a;

    /* renamed from: b */
    private Context f19013b;

    /* renamed from: c */
    private C2109g f19014c;

    /* renamed from: d */
    private C2095a f19015d;

    /* renamed from: e */
    private C2097c f19016e;

    /* renamed from: f */
    private C2097c f19017f;

    /* renamed from: g */
    private C2091a f19018g;

    /* renamed from: h */
    private FutureTask<Boolean> f19019h;

    /* renamed from: com.huawei.hms.framework.network.grs.c$a */
    public class a implements Callable<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Context f19020a;

        /* renamed from: b */
        final /* synthetic */ GrsBaseInfo f19021b;

        public a(Context context, GrsBaseInfo grsBaseInfo) {
            this.f19020a = context;
            this.f19021b = grsBaseInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Boolean call() throws NumberFormatException {
            C2093c.this.f19014c = new C2109g();
            C2093c.this.f19016e = new C2097c(this.f19020a, GrsApp.getInstance().getBrand("_") + "share_pre_grs_conf_");
            C2093c.this.f19017f = new C2097c(this.f19020a, GrsApp.getInstance().getBrand("_") + "share_pre_grs_services_");
            C2093c c2093c = C2093c.this;
            c2093c.f19015d = new C2095a(c2093c.f19016e, C2093c.this.f19017f, C2093c.this.f19014c);
            C2093c c2093c2 = C2093c.this;
            c2093c2.f19018g = new C2091a(c2093c2.f19012a, C2093c.this.f19015d, C2093c.this.f19014c, C2093c.this.f19017f);
            if (C2099b.m11767a(this.f19020a.getPackageName()) == null) {
                new C2099b(this.f19020a, true);
            }
            String strM11850c = new C2114c(this.f19021b, this.f19020a).m11850c();
            Logger.m11687v(C2093c.f19009i, "scan serviceSet is: " + strM11850c);
            String strM11743a = C2093c.this.f19017f.m11743a("services", "");
            String strM11840a = C2110h.m11840a(strM11743a, strM11850c);
            if (!TextUtils.isEmpty(strM11840a)) {
                C2093c.this.f19017f.m11747b("services", strM11840a);
                Logger.m11685i(C2093c.f19009i, "postList is:" + StringUtils.anonymizeMessage(strM11840a));
                Logger.m11685i(C2093c.f19009i, "currentServices:" + StringUtils.anonymizeMessage(strM11743a));
                if (!strM11840a.equals(strM11743a)) {
                    C2093c.this.f19014c.m11839a(C2093c.this.f19012a.getGrsParasKey(true, true, this.f19020a));
                    C2093c.this.f19014c.m11838a(new C2114c(this.f19021b, this.f19020a), null, null, C2093c.this.f19017f, C2093c.this.f19012a.getQueryTimeout());
                }
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - C2093c.f19011k;
            if (C2093c.f19011k == 0 || TimeUnit.MILLISECONDS.toHours(jElapsedRealtime) > 24) {
                Logger.m11685i(C2093c.f19009i, "Try to clear unUsed sp data.");
                long unused = C2093c.f19011k = SystemClock.elapsedRealtime();
                C2093c c2093c3 = C2093c.this;
                c2093c3.m11713a(c2093c3.f19016e.m11744a());
            }
            C2093c.this.f19015d.m11738b(this.f19021b, this.f19020a);
            return Boolean.TRUE;
        }
    }

    public C2093c(Context context, GrsBaseInfo grsBaseInfo) {
        this.f19019h = null;
        this.f19013b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        m11711a(grsBaseInfo);
        GrsBaseInfo grsBaseInfo2 = this.f19012a;
        FutureTask<Boolean> futureTask = new FutureTask<>(new a(this.f19013b, grsBaseInfo2));
        this.f19019h = futureTask;
        f19010j.execute(futureTask);
        Logger.m11686i(f19009i, "GrsClient Instance is init, GRS SDK version: %s, GrsBaseInfoParam: app_name=%s, reg_country=%s, ser_country=%s, issue_country=%s ,queryTimeout=%d", C2116a.m11858a(), grsBaseInfo2.getAppName(), grsBaseInfo.getRegCountry(), grsBaseInfo.getSerCountry(), grsBaseInfo.getIssueCountry(), Integer.valueOf(grsBaseInfo.getQueryTimeout()));
    }

    public C2093c(GrsBaseInfo grsBaseInfo) {
        this.f19019h = null;
        m11711a(grsBaseInfo);
    }

    /* renamed from: e */
    private boolean m11722e() {
        String str;
        String str2;
        FutureTask<Boolean> futureTask = this.f19019h;
        if (futureTask == null) {
            return false;
        }
        try {
            return futureTask.get(8L, TimeUnit.SECONDS).booleanValue();
        } catch (InterruptedException e) {
            e = e;
            str = f19009i;
            str2 = "init compute task interrupted.";
            Logger.m11690w(str, str2, e);
            return false;
        } catch (CancellationException unused) {
            Logger.m11685i(f19009i, "init compute task canceled.");
            return false;
        } catch (ExecutionException e2) {
            e = e2;
            str = f19009i;
            str2 = "init compute task failed.";
            Logger.m11690w(str, str2, e);
            return false;
        } catch (TimeoutException unused2) {
            Logger.m11689w(f19009i, "init compute task timed out");
            return false;
        } catch (Exception e3) {
            e = e3;
            str = f19009i;
            str2 = "init compute task occur unknown Exception";
            Logger.m11690w(str, str2, e);
            return false;
        }
    }

    /* renamed from: b */
    public boolean m11729b() {
        GrsBaseInfo grsBaseInfo;
        Context context;
        if (!m11722e() || (grsBaseInfo = this.f19012a) == null || (context = this.f19013b) == null) {
            return false;
        }
        this.f19015d.m11735a(grsBaseInfo, context);
        return true;
    }

    /* renamed from: b */
    private boolean m11716b(long j) {
        return System.currentTimeMillis() - j <= 604800000;
    }

    /* renamed from: a */
    public String m11723a(String str, String str2, int i) {
        if (this.f19012a == null || str == null || str2 == null) {
            Logger.m11689w(f19009i, "invalid para!");
            return null;
        }
        if (m11722e()) {
            return this.f19018g.m11699a(str, str2, this.f19013b, i);
        }
        return null;
    }

    /* renamed from: a */
    public Map<String, String> m11724a(String str, int i) {
        if (this.f19012a != null && str != null) {
            return m11722e() ? this.f19018g.m11700a(str, this.f19013b, i) : new HashMap();
        }
        Logger.m11689w(f19009i, "invalid para!");
        return new HashMap();
    }

    /* renamed from: a */
    public void m11725a() {
        if (m11722e()) {
            String grsParasKey = this.f19012a.getGrsParasKey(true, true, this.f19013b);
            this.f19016e.m11745a(grsParasKey);
            this.f19016e.m11745a(grsParasKey + CrashHianalyticsData.TIME);
            this.f19016e.m11745a(grsParasKey + "ETag");
            this.f19014c.m11839a(grsParasKey);
        }
    }

    /* renamed from: a */
    private void m11711a(GrsBaseInfo grsBaseInfo) {
        try {
            this.f19012a = grsBaseInfo.m26665clone();
        } catch (CloneNotSupportedException e) {
            Logger.m11690w(f19009i, "GrsClient catch CloneNotSupportedException", e);
            this.f19012a = grsBaseInfo.copy();
        }
    }

    /* renamed from: a */
    public void m11726a(String str, IQueryUrlsCallBack iQueryUrlsCallBack, int i) {
        if (iQueryUrlsCallBack == null) {
            Logger.m11689w(f19009i, "IQueryUrlsCallBack is must not null for process continue.");
            return;
        }
        if (this.f19012a == null || str == null) {
            iQueryUrlsCallBack.onCallBackFail(-6);
        } else if (m11722e()) {
            this.f19018g.m11701a(str, iQueryUrlsCallBack, this.f19013b, i);
        } else {
            Logger.m11685i(f19009i, "grs init task has not completed.");
            iQueryUrlsCallBack.onCallBackFail(-7);
        }
    }

    /* renamed from: a */
    public void m11727a(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, int i) {
        if (iQueryUrlCallBack == null) {
            Logger.m11689w(f19009i, "IQueryUrlCallBack is must not null for process continue.");
            return;
        }
        if (this.f19012a == null || str == null || str2 == null) {
            iQueryUrlCallBack.onCallBackFail(-6);
        } else if (m11722e()) {
            this.f19018g.m11702a(str, str2, iQueryUrlCallBack, this.f19013b, i);
        } else {
            Logger.m11685i(f19009i, "grs init task has not completed.");
            iQueryUrlCallBack.onCallBackFail(-7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m11713a(Map<String, ?> map) throws NumberFormatException {
        if (map == null || map.isEmpty()) {
            Logger.m11687v(f19009i, "sp's content is empty.");
            return;
        }
        Set<String> setKeySet = map.keySet();
        for (String str : setKeySet) {
            if (str.endsWith(this.f19013b.getPackageName() + CrashHianalyticsData.TIME)) {
                String strM11743a = this.f19016e.m11743a(str, "");
                long j = 0;
                if (!TextUtils.isEmpty(strM11743a) && strM11743a.matches("\\d+")) {
                    try {
                        j = Long.parseLong(strM11743a);
                    } catch (NumberFormatException e) {
                        Logger.m11690w(f19009i, "convert expire time from String to Long catch NumberFormatException.", e);
                    }
                }
                String strSubstring = str.substring(0, str.length() - 4);
                String strM26232i = AbstractC7222ym.m26232i(strSubstring, "ETag");
                if (!m11716b(j) || !setKeySet.contains(strSubstring) || !setKeySet.contains(strM26232i)) {
                    Logger.m11685i(f19009i, "init interface auto clear some invalid sp's data: ".concat(str));
                    this.f19016e.m11745a(strSubstring);
                    this.f19016e.m11745a(str);
                    this.f19016e.m11745a(strM26232i);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m11728a(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2093c.class == obj.getClass() && (obj instanceof C2093c)) {
            return this.f19012a.compare(((C2093c) obj).f19012a);
        }
        return false;
    }
}
