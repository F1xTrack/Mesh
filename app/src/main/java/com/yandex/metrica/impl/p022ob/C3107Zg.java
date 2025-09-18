package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.yandex.metrica.impl.p022ob.C2608Fg;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC7293zu;
import p000.GT1;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.Zg */
/* loaded from: classes2.dex */
public final class C3107Zg {

    /* renamed from: a */
    private final C2614Fm<C2608Fg.a, Integer> f22985a;

    /* renamed from: b */
    private final long f22986b;

    /* renamed from: c */
    private final String f22987c;

    /* renamed from: d */
    private final String f22988d;

    /* renamed from: e */
    private final Context f22989e;

    /* renamed from: f */
    private final C3039Wn f22990f;

    /* renamed from: g */
    private final InterfaceC3016W0 f22991g;

    /* renamed from: com.yandex.metrica.impl.ob.Zg$a */
    public static final class a<T> implements Comparator<T> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return GT1.m3070b((Comparable) ((Pair) t).f36703b, (Comparable) ((Pair) t2).f36703b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Zg$b */
    public static final class b<T> implements Comparator<C2608Fg> {
        public b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public final int compare(C2608Fg c2608Fg, C2608Fg c2608Fg2) {
            int iSignum = Long.signum(c2608Fg.f21218c - c2608Fg2.f21218c);
            if (iSignum != 0) {
                return iSignum;
            }
            int iIntValue = ((Number) C3107Zg.this.f22985a.m14144a(c2608Fg.f21219d)).intValue();
            Object objM14144a = C3107Zg.this.f22985a.m14144a(c2608Fg2.f21219d);
            O90.m5967e(objM14144a, "sourcePriorities[second.source]");
            return iIntValue - ((Number) objM14144a).intValue();
        }
    }

    public C3107Zg(Context context, C3039Wn c3039Wn, InterfaceC3016W0 interfaceC3016W0) {
        this.f22989e = context;
        this.f22990f = c3039Wn;
        this.f22991g = interfaceC3016W0;
        C2614Fm<C2608Fg.a, Integer> c2614Fm = new C2614Fm<>(0);
        c2614Fm.m14146a(C2608Fg.a.HMS, 1);
        c2614Fm.m14146a(C2608Fg.a.GP, 2);
        this.f22985a = c2614Fm;
        this.f22986b = TimeUnit.DAYS.toSeconds(1L);
        this.f22987c = "com.android.vending";
        this.f22988d = "com.huawei.appmarket";
    }

    /* renamed from: c */
    private final JSONObject m15551c(C2608Fg c2608Fg) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("referrer", c2608Fg.f21216a).put("install_timestamp_seconds", c2608Fg.f21218c).put("click_timestamp_seconds", c2608Fg.f21217b).put("source", c2608Fg.f21219d.f21224a);
        O90.m5967e(jSONObjectPut, "JSONObject()\n           …eferrerInfo.source.value)");
        return jSONObjectPut;
    }

    /* renamed from: b */
    public final boolean m15554b(C2608Fg c2608Fg) {
        String str = c2608Fg != null ? c2608Fg.f21216a : null;
        return !(str == null || str.length() == 0);
    }

    /* renamed from: a */
    public final boolean m15553a(C2608Fg c2608Fg) {
        String strM15441a;
        if (c2608Fg == null) {
            return false;
        }
        C3039Wn c3039Wn = this.f22990f;
        Context context = this.f22989e;
        String packageName = context.getPackageName();
        c3039Wn.getClass();
        try {
            PackageManager packageManager = context.getPackageManager();
            strM15441a = C2968U2.m15243a(30) ? C3064Xn.m15441a(packageManager, packageName) : packageManager.getInstallerPackageName(packageName);
        } catch (Throwable unused) {
            strM15441a = null;
        }
        int iOrdinal = c2608Fg.f21219d.ordinal();
        if (iOrdinal == 1) {
            return O90.m5963a(this.f22987c, strM15441a);
        }
        if (iOrdinal != 2) {
            return false;
        }
        return O90.m5963a(this.f22988d, strM15441a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C3107Zg(Context context, C3039Wn c3039Wn, InterfaceC3016W0 interfaceC3016W0, int i) {
        InterfaceC3016W0 interfaceC3016W0M14711a = null;
        C3039Wn c3039Wn2 = (i & 2) != 0 ? new C3039Wn() : null;
        if ((i & 4) != 0) {
            interfaceC3016W0M14711a = C2834Oh.m14711a();
            O90.m5967e(interfaceC3016W0M14711a, "YandexMetricaSelfReportFacade.getReporter()");
        }
        this(context, c3039Wn2, interfaceC3016W0M14711a);
    }

    /* renamed from: a */
    public final C2608Fg m15552a(List<C2608Fg> list) {
        C2608Fg c2608Fg = null;
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        C3039Wn c3039Wn = this.f22990f;
        Context context = this.f22989e;
        PackageInfo packageInfoM15405b = c3039Wn.m15405b(context, context.getPackageName(), 0);
        if (packageInfoM15405b != null) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(packageInfoM15405b.firstInstallTime);
            a aVar = new a();
            Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                C2608Fg c2608Fg2 = (C2608Fg) it.next();
                Pair pair = new Pair(c2608Fg2, Long.valueOf(Math.abs(c2608Fg2.f21218c - seconds)));
                while (it.hasNext()) {
                    C2608Fg c2608Fg3 = (C2608Fg) it.next();
                    Pair pair2 = new Pair(c2608Fg3, Long.valueOf(Math.abs(c2608Fg3.f21218c - seconds)));
                    if (aVar.compare(pair, pair2) > 0) {
                        pair = pair2;
                    }
                }
                C2608Fg c2608Fg4 = (C2608Fg) pair.f36702a;
                if (((Number) pair.f36703b).longValue() < this.f22986b) {
                    c2608Fg = c2608Fg4;
                }
            } else {
                throw new NoSuchElementException();
            }
        }
        if (c2608Fg == null) {
            b bVar = new b();
            Iterator<T> it2 = list.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            C2608Fg c2608Fg5 = (C2608Fg) it2.next();
            while (it2.hasNext()) {
                C2608Fg c2608Fg6 = (C2608Fg) it2.next();
                if (bVar.compare(c2608Fg5, c2608Fg6) < 0) {
                    c2608Fg5 = c2608Fg6;
                }
            }
            c2608Fg = c2608Fg5;
        }
        this.f22991g.reportEvent("several_filled_referrers", m15550a(list, c2608Fg, packageInfoM15405b).toString());
        return c2608Fg;
    }

    /* renamed from: a */
    private final JSONObject m15550a(List<C2608Fg> list, C2608Fg c2608Fg, PackageInfo packageInfo) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(list));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m15551c((C2608Fg) it.next()));
        }
        JSONObject jSONObjectPutOpt = jSONObject.put("candidates", C3762ym.m17290b((List<?>) arrayList)).put("chosen", m15551c(c2608Fg)).putOpt("install_time", packageInfo != null ? Long.valueOf(packageInfo.firstInstallTime) : null);
        O90.m5967e(jSONObjectPutOpt, "JSONObject()\n           …geInfo?.firstInstallTime)");
        return jSONObjectPutOpt;
    }
}
