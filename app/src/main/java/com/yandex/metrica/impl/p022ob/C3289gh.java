package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.yandex.metrica.impl.p022ob.C3211dh;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.gh */
/* loaded from: classes2.dex */
public class C3289gh extends C3211dh {

    /* renamed from: m */
    private String f23526m;

    /* renamed from: n */
    private String f23527n;

    /* renamed from: com.yandex.metrica.impl.ob.gh$a */
    public static abstract class a<T extends C3289gh, A extends C3211dh.a> extends C3211dh.b<T, A> {

        /* renamed from: c */
        private final C3039Wn f23528c;

        public a(Context context, String str) {
            this(context, str, new C3039Wn());
        }

        /* renamed from: a */
        public T m16004a(C3211dh.c<A> cVar) {
            T tMo15421a = mo15421a();
            tMo15421a.m15769a(C3168c0.m15699a());
            C3690w2 c3690w2M17210a = C2842P0.m14728i().m14745p().m17210a();
            tMo15421a.m15772a(c3690w2M17210a);
            tMo15421a.m15768a(cVar.f23275a);
            String str = cVar.f23276b.f23270a;
            if (str == null) {
                str = c3690w2M17210a.m17108a() != null ? c3690w2M17210a.m17108a().f25518a : null;
            }
            tMo15421a.m15777c(str);
            String str2 = this.f23274b;
            String strM15230a = cVar.f23276b.f23271b;
            Context context = this.f23273a;
            if (TextUtils.isEmpty(strM15230a)) {
                strM15230a = C2968U2.m15230a(context, str2);
            }
            tMo15421a.m15775b(strM15230a);
            String str3 = this.f23274b;
            String strValueOf = cVar.f23276b.f23272c;
            Context context2 = this.f23273a;
            if (TextUtils.isEmpty(strValueOf)) {
                strValueOf = String.valueOf(C2968U2.m15248b(context2, str3));
            }
            tMo15421a.m15773a(strValueOf);
            tMo15421a.m15781e(this.f23274b);
            tMo15421a.m15770a(C2842P0.m14728i().m14749t().m15837a(this.f23273a));
            tMo15421a.m15771a(C2842P0.m14728i().m14732b().m16087a());
            List<String> listM16550a = C3507p1.m16548a(this.f23273a).m16550a();
            tMo15421a.m15779d(listM16550a.isEmpty() ? null : listM16550a.get(0));
            T t = tMo15421a;
            String packageName = this.f23273a.getPackageName();
            ApplicationInfo applicationInfoM15403a = this.f23528c.m15403a(this.f23273a, this.f23274b, 0);
            if (applicationInfoM15403a != null) {
                t.m16002f((applicationInfoM15403a.flags & 2) != 0 ? "1" : "0");
                t.m16003g((applicationInfoM15403a.flags & 1) == 0 ? "0" : "1");
            } else if (TextUtils.equals(packageName, this.f23274b)) {
                t.m16002f((this.f23273a.getApplicationInfo().flags & 2) != 0 ? "1" : "0");
                t.m16003g((this.f23273a.getApplicationInfo().flags & 1) == 0 ? "0" : "1");
            } else {
                t.m16002f("0");
                t.m16003g("0");
            }
            return t;
        }

        public a(Context context, String str, C3039Wn c3039Wn) {
            super(context, str);
            this.f23528c = c3039Wn;
        }
    }

    /* renamed from: A */
    public String m16000A() {
        return this.f23526m;
    }

    /* renamed from: B */
    public String m16001B() {
        return this.f23527n;
    }

    /* renamed from: f */
    public void m16002f(String str) {
        this.f23526m = str;
    }

    /* renamed from: g */
    public void m16003g(String str) {
        this.f23527n = str;
    }

    public String toString() {
        return "CoreRequestConfig{mAppDebuggable='" + this.f23526m + "', mAppSystem='" + this.f23527n + "'} " + super.toString();
    }
}
