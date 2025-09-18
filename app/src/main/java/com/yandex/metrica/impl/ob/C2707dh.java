package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.BuildConfig;

/* renamed from: com.yandex.metrica.impl.ob.dh */
/* loaded from: classes2.dex */
public class C2707dh {
    private String a;
    private C2665c0 b;
    private C3170w2 c;
    private final String d = z();
    private String e = B2.a();
    private String f;
    private String g;
    private C2802hc h;
    private C2777gc i;
    private String j;
    private String k;
    private Qi l;

    /* renamed from: com.yandex.metrica.impl.ob.dh$a */
    public static abstract class a<I, O> implements InterfaceC2682ch<I, O> {
        public final String a;
        public final String b;
        public final String c;

        public a(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.dh$b */
    public static abstract class b<T extends C2707dh, A extends a> implements d<T, c<A>> {
        final Context a;
        final String b;

        public b(Context context, String str) {
            this.a = context;
            this.b = str;
        }

        public abstract T a();
    }

    /* renamed from: com.yandex.metrica.impl.ob.dh$c */
    public static class c<A> {
        public final Qi a;
        public final A b;

        public c(Qi qi, A a) {
            this.a = qi;
            this.b = a;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.dh$d */
    public interface d<T extends C2707dh, D> {
        T a(D d);
    }

    private static String z() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty("public")) {
            sb.append("public");
        }
        if (!TextUtils.isEmpty(BuildConfig.SDK_DEPENDENCY)) {
            sb.append("_binary");
        }
        if (!TextUtils.isEmpty("")) {
            sb.append("_");
        }
        return sb.toString();
    }

    public void a(C2665c0 c2665c0) {
        this.b = c2665c0;
    }

    public String b() {
        String str = this.g;
        return str == null ? "" : str;
    }

    public String c() {
        return this.e;
    }

    public synchronized String d() {
        String strA;
        C2802hc c2802hc = this.h;
        strA = c2802hc == null ? null : c2802hc.a();
        if (strA == null) {
            strA = "";
        }
        return strA;
    }

    public void e(String str) {
        this.a = str;
    }

    public String f() {
        String str = this.f;
        return str == null ? "" : str;
    }

    public synchronized String g() {
        String strI;
        strI = this.l.i();
        if (strI == null) {
            strI = "";
        }
        return strI;
    }

    public synchronized String h() {
        String strJ;
        strJ = this.l.j();
        if (strJ == null) {
            strJ = "";
        }
        return strJ;
    }

    public String i() {
        return this.b.e;
    }

    public String j() {
        String str = this.j;
        return str == null ? "phone" : str;
    }

    public String k() {
        return this.d;
    }

    public String l() {
        String str = this.k;
        return str == null ? "" : str;
    }

    public String m() {
        String str = this.b.a;
        return str == null ? "" : str;
    }

    public String n() {
        return this.b.b;
    }

    public int o() {
        return this.b.d;
    }

    public String p() {
        return this.b.c;
    }

    public String q() {
        return this.a;
    }

    public Ci r() {
        return this.l.J();
    }

    public float s() {
        return this.c.d();
    }

    public int t() {
        return this.c.b();
    }

    public int u() {
        return this.c.c();
    }

    public int v() {
        return this.c.e();
    }

    public Qi w() {
        return this.l;
    }

    public synchronized String x() {
        String strV;
        strV = this.l.V();
        if (strV == null) {
            strV = "";
        }
        return strV;
    }

    public synchronized boolean y() {
        return Oi.a(this.l);
    }

    public void a(C3170w2 c3170w2) {
        this.c = c3170w2;
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f = str;
    }

    public void c(String str) {
        this.j = str;
    }

    public final void d(String str) {
        this.k = str;
    }

    public synchronized String e() {
        String str;
        C2802hc c2802hc = this.h;
        str = c2802hc == null ? null : c2802hc.b().a;
        if (str == null) {
            str = "";
        }
        return str;
    }

    public void a(Qi qi) {
        this.l = qi;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.g = str;
    }

    public synchronized void a(C2802hc c2802hc) {
        this.h = c2802hc;
    }

    public C2777gc a() {
        return this.i;
    }

    public void a(C2777gc c2777gc) {
        this.i = c2777gc;
    }
}
