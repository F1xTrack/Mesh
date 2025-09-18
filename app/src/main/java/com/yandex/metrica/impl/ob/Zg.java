package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.yandex.metrica.impl.ob.Fg;
import defpackage.AbstractC8449zu;
import defpackage.GT1;
import defpackage.O90;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Zg {
    private final Fm<Fg.a, Integer> a;
    private final long b;
    private final String c;
    private final String d;
    private final Context e;
    private final Wn f;
    private final W0 g;

    public static final class a<T> implements Comparator<T> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return GT1.b((Comparable) ((Pair) t).b, (Comparable) ((Pair) t2).b);
        }
    }

    public static final class b<T> implements Comparator<Fg> {
        public b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public final int compare(Fg fg, Fg fg2) {
            int iSignum = Long.signum(fg.c - fg2.c);
            if (iSignum != 0) {
                return iSignum;
            }
            int iIntValue = ((Number) Zg.this.a.a(fg.d)).intValue();
            Object objA = Zg.this.a.a(fg2.d);
            O90.e(objA, "sourcePriorities[second.source]");
            return iIntValue - ((Number) objA).intValue();
        }
    }

    public Zg(Context context, Wn wn, W0 w0) {
        this.e = context;
        this.f = wn;
        this.g = w0;
        Fm<Fg.a, Integer> fm = new Fm<>(0);
        fm.a(Fg.a.HMS, 1);
        fm.a(Fg.a.GP, 2);
        this.a = fm;
        this.b = TimeUnit.DAYS.toSeconds(1L);
        this.c = "com.android.vending";
        this.d = "com.huawei.appmarket";
    }

    private final JSONObject c(Fg fg) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("referrer", fg.a).put("install_timestamp_seconds", fg.c).put("click_timestamp_seconds", fg.b).put("source", fg.d.a);
        O90.e(jSONObjectPut, "JSONObject()\n           …eferrerInfo.source.value)");
        return jSONObjectPut;
    }

    public final boolean b(Fg fg) {
        String str = fg != null ? fg.a : null;
        return !(str == null || str.length() == 0);
    }

    public final boolean a(Fg fg) {
        String strA;
        if (fg == null) {
            return false;
        }
        Wn wn = this.f;
        Context context = this.e;
        String packageName = context.getPackageName();
        wn.getClass();
        try {
            PackageManager packageManager = context.getPackageManager();
            strA = U2.a(30) ? Xn.a(packageManager, packageName) : packageManager.getInstallerPackageName(packageName);
        } catch (Throwable unused) {
            strA = null;
        }
        int iOrdinal = fg.d.ordinal();
        if (iOrdinal == 1) {
            return O90.a(this.c, strA);
        }
        if (iOrdinal != 2) {
            return false;
        }
        return O90.a(this.d, strA);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Zg(Context context, Wn wn, W0 w0, int i) {
        W0 w0A = null;
        Wn wn2 = (i & 2) != 0 ? new Wn() : null;
        if ((i & 4) != 0) {
            w0A = Oh.a();
            O90.e(w0A, "YandexMetricaSelfReportFacade.getReporter()");
        }
        this(context, wn2, w0A);
    }

    public final Fg a(List<Fg> list) {
        Fg fg = null;
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        Wn wn = this.f;
        Context context = this.e;
        PackageInfo packageInfoB = wn.b(context, context.getPackageName(), 0);
        if (packageInfoB != null) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(packageInfoB.firstInstallTime);
            a aVar = new a();
            Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                Fg fg2 = (Fg) it.next();
                Pair pair = new Pair(fg2, Long.valueOf(Math.abs(fg2.c - seconds)));
                while (it.hasNext()) {
                    Fg fg3 = (Fg) it.next();
                    Pair pair2 = new Pair(fg3, Long.valueOf(Math.abs(fg3.c - seconds)));
                    if (aVar.compare(pair, pair2) > 0) {
                        pair = pair2;
                    }
                }
                Fg fg4 = (Fg) pair.a;
                if (((Number) pair.b).longValue() < this.b) {
                    fg = fg4;
                }
            } else {
                throw new NoSuchElementException();
            }
        }
        if (fg == null) {
            b bVar = new b();
            Iterator<T> it2 = list.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            Fg fg5 = (Fg) it2.next();
            while (it2.hasNext()) {
                Fg fg6 = (Fg) it2.next();
                if (bVar.compare(fg5, fg6) < 0) {
                    fg5 = fg6;
                }
            }
            fg = fg5;
        }
        this.g.reportEvent("several_filled_referrers", a(list, fg, packageInfoB).toString());
        return fg;
    }

    private final JSONObject a(List<Fg> list, Fg fg, PackageInfo packageInfo) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(list));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(c((Fg) it.next()));
        }
        JSONObject jSONObjectPutOpt = jSONObject.put("candidates", C3240ym.b((List<?>) arrayList)).put("chosen", c(fg)).putOpt("install_time", packageInfo != null ? Long.valueOf(packageInfo.firstInstallTime) : null);
        O90.e(jSONObjectPutOpt, "JSONObject()\n           …geInfo?.firstInstallTime)");
        return jSONObjectPutOpt;
    }
}
