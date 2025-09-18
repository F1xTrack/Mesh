package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import com.yandex.metrica.impl.p022ob.C3044X3;
import com.yandex.metrica.impl.p022ob.C3211dh;
import com.yandex.metrica.impl.p022ob.C3289gh;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.X4 */
/* loaded from: classes2.dex */
public class C3045X4 extends C3289gh {

    /* renamed from: o */
    private List<String> f22768o;

    /* renamed from: p */
    private String f22769p;

    /* renamed from: q */
    private Boolean f22770q;

    /* renamed from: C */
    public String m15415C() {
        return this.f22769p;
    }

    /* renamed from: D */
    public List<String> m15416D() {
        return this.f22768o;
    }

    /* renamed from: E */
    public Boolean m15417E() {
        return this.f22770q;
    }

    /* renamed from: a */
    public void m15419a(List<String> list) {
        this.f22768o = list;
    }

    /* renamed from: h */
    public void m15420h(String str) {
        this.f22769p = str;
    }

    @Override // com.yandex.metrica.impl.p022ob.C3289gh
    public String toString() {
        return "DiagnosticRequestConfig{mDiagnosticHosts=" + this.f22768o + ", mApiKey='" + this.f22769p + "', statisticsSending=" + this.f22770q + '}';
    }

    /* renamed from: a */
    public void m15418a(Boolean bool) {
        this.f22770q = bool;
    }

    /* renamed from: com.yandex.metrica.impl.ob.X4$a */
    public static final class a extends C3211dh.a<C3044X3.a, a> {

        /* renamed from: d */
        public final String f22771d;

        /* renamed from: e */
        public final boolean f22772e;

        public a(String str, String str2, String str3, String str4, Boolean bool) {
            super(str, str2, str3);
            this.f22771d = str4;
            this.f22772e = ((Boolean) C3762ym.m17269a(bool, Boolean.TRUE)).booleanValue();
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3185ch
        /* renamed from: a */
        public Object mo15413a(Object obj) {
            C3044X3.a aVar = (C3044X3.a) obj;
            String str = aVar.f22751a;
            String str2 = this.f23270a;
            if (str != null) {
                str2 = str;
            }
            String str3 = aVar.f22752b;
            String str4 = this.f23271b;
            if (str3 != null) {
                str4 = str3;
            }
            String str5 = aVar.f22753c;
            String str6 = this.f23272c;
            if (str5 != null) {
                str6 = str5;
            }
            String str7 = aVar.f22754d;
            String str8 = this.f22771d;
            if (str7 != null) {
                str8 = str7;
            }
            Boolean bool = aVar.f22762l;
            return new a(str2, str4, str6, str8, bool == null ? Boolean.valueOf(this.f22772e) : bool);
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3185ch
        /* renamed from: b */
        public boolean mo15414b(Object obj) {
            String str;
            String str2;
            String str3;
            C3044X3.a aVar = (C3044X3.a) obj;
            String str4 = aVar.f22751a;
            return (str4 == null || str4.equals(this.f23270a)) && ((str = aVar.f22752b) == null || str.equals(this.f23271b)) && (((str2 = aVar.f22753c) == null || str2.equals(this.f23272c)) && ((str3 = aVar.f22754d) == null || str3.equals(this.f22771d)));
        }

        public a(C3044X3.a aVar) {
            this(aVar.f22751a, aVar.f22752b, aVar.f22753c, aVar.f22754d, aVar.f22762l);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.X4$b */
    public static class b extends C3289gh.a<C3045X4, a> {
        public b(Context context, String str) {
            super(context, str);
        }

        @Override // com.yandex.metrica.impl.p022ob.C3211dh.d
        /* renamed from: a */
        public C3211dh mo14785a(Object obj) {
            C3211dh.c cVar = (C3211dh.c) obj;
            C3045X4 c3045x4M16004a = m16004a(cVar);
            c3045x4M16004a.m15419a(cVar.f23275a.m14886l());
            c3045x4M16004a.m15420h(((a) cVar.f23276b).f22771d);
            c3045x4M16004a.m15418a(Boolean.valueOf(((a) cVar.f23276b).f22772e));
            return c3045x4M16004a;
        }

        @Override // com.yandex.metrica.impl.p022ob.C3211dh.b
        /* renamed from: a */
        public C3211dh mo15421a() {
            return new C3045X4();
        }
    }
}
