package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.yandex.metrica.impl.ob.C2707dh;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.gh */
/* loaded from: classes2.dex */
public class C2782gh extends C2707dh {
    private String m;
    private String n;

    /* renamed from: com.yandex.metrica.impl.ob.gh$a */
    public static abstract class a<T extends C2782gh, A extends C2707dh.a> extends C2707dh.b<T, A> {
        private final Wn c;

        public a(Context context, String str) {
            this(context, str, new Wn());
        }

        public T a(C2707dh.c<A> cVar) {
            T tA = a();
            tA.a(C2665c0.a());
            C3170w2 c3170w2A = P0.i().p().a();
            tA.a(c3170w2A);
            tA.a(cVar.a);
            String str = cVar.b.a;
            if (str == null) {
                str = c3170w2A.a() != null ? c3170w2A.a().a : null;
            }
            tA.c(str);
            String str2 = this.b;
            String strA = cVar.b.b;
            Context context = this.a;
            if (TextUtils.isEmpty(strA)) {
                strA = U2.a(context, str2);
            }
            tA.b(strA);
            String str3 = this.b;
            String strValueOf = cVar.b.c;
            Context context2 = this.a;
            if (TextUtils.isEmpty(strValueOf)) {
                strValueOf = String.valueOf(U2.b(context2, str3));
            }
            tA.a(strValueOf);
            tA.e(this.b);
            tA.a(P0.i().t().a(this.a));
            tA.a(P0.i().b().a());
            List<String> listA = C2990p1.a(this.a).a();
            tA.d(listA.isEmpty() ? null : listA.get(0));
            T t = tA;
            String packageName = this.a.getPackageName();
            ApplicationInfo applicationInfoA = this.c.a(this.a, this.b, 0);
            if (applicationInfoA != null) {
                t.f((applicationInfoA.flags & 2) != 0 ? "1" : "0");
                t.g((applicationInfoA.flags & 1) == 0 ? "0" : "1");
            } else if (TextUtils.equals(packageName, this.b)) {
                t.f((this.a.getApplicationInfo().flags & 2) != 0 ? "1" : "0");
                t.g((this.a.getApplicationInfo().flags & 1) == 0 ? "0" : "1");
            } else {
                t.f("0");
                t.g("0");
            }
            return t;
        }

        public a(Context context, String str, Wn wn) {
            super(context, str);
            this.c = wn;
        }
    }

    public String A() {
        return this.m;
    }

    public String B() {
        return this.n;
    }

    public void f(String str) {
        this.m = str;
    }

    public void g(String str) {
        this.n = str;
    }

    public String toString() {
        return "CoreRequestConfig{mAppDebuggable='" + this.m + "', mAppSystem='" + this.n + "'} " + super.toString();
    }
}
