package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.C2707dh;
import com.yandex.metrica.impl.ob.C2782gh;
import com.yandex.metrica.impl.ob.X3;
import java.util.List;

/* loaded from: classes2.dex */
public class X4 extends C2782gh {
    private List<String> o;
    private String p;
    private Boolean q;

    public String C() {
        return this.p;
    }

    public List<String> D() {
        return this.o;
    }

    public Boolean E() {
        return this.q;
    }

    public void a(List<String> list) {
        this.o = list;
    }

    public void h(String str) {
        this.p = str;
    }

    @Override // com.yandex.metrica.impl.ob.C2782gh
    public String toString() {
        return "DiagnosticRequestConfig{mDiagnosticHosts=" + this.o + ", mApiKey='" + this.p + "', statisticsSending=" + this.q + '}';
    }

    public void a(Boolean bool) {
        this.q = bool;
    }

    public static final class a extends C2707dh.a<X3.a, a> {
        public final String d;
        public final boolean e;

        public a(String str, String str2, String str3, String str4, Boolean bool) {
            super(str, str2, str3);
            this.d = str4;
            this.e = ((Boolean) C3240ym.a(bool, Boolean.TRUE)).booleanValue();
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC2682ch
        public Object a(Object obj) {
            X3.a aVar = (X3.a) obj;
            String str = aVar.a;
            String str2 = this.a;
            if (str != null) {
                str2 = str;
            }
            String str3 = aVar.b;
            String str4 = this.b;
            if (str3 != null) {
                str4 = str3;
            }
            String str5 = aVar.c;
            String str6 = this.c;
            if (str5 != null) {
                str6 = str5;
            }
            String str7 = aVar.d;
            String str8 = this.d;
            if (str7 != null) {
                str8 = str7;
            }
            Boolean bool = aVar.l;
            return new a(str2, str4, str6, str8, bool == null ? Boolean.valueOf(this.e) : bool);
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC2682ch
        public boolean b(Object obj) {
            String str;
            String str2;
            String str3;
            X3.a aVar = (X3.a) obj;
            String str4 = aVar.a;
            return (str4 == null || str4.equals(this.a)) && ((str = aVar.b) == null || str.equals(this.b)) && (((str2 = aVar.c) == null || str2.equals(this.c)) && ((str3 = aVar.d) == null || str3.equals(this.d)));
        }

        public a(X3.a aVar) {
            this(aVar.a, aVar.b, aVar.c, aVar.d, aVar.l);
        }
    }

    public static class b extends C2782gh.a<X4, a> {
        public b(Context context, String str) {
            super(context, str);
        }

        @Override // com.yandex.metrica.impl.ob.C2707dh.d
        public C2707dh a(Object obj) {
            C2707dh.c cVar = (C2707dh.c) obj;
            X4 x4A = a(cVar);
            x4A.a(cVar.a.l());
            x4A.h(((a) cVar.b).d);
            x4A.a(Boolean.valueOf(((a) cVar.b).e));
            return x4A;
        }

        @Override // com.yandex.metrica.impl.ob.C2707dh.b
        public C2707dh a() {
            return new X4();
        }
    }
}
