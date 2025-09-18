package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.yandex.metrica.impl.ob.Q1;

/* loaded from: classes2.dex */
public class X extends Q1 {
    private final F9 a;

    public class a extends SparseArray<Q1.a> {
        public a() {
            put(47, new c(X.this.a));
            put(66, new d(X.this, X.this.a));
            put(89, new b(X.this.a));
            put(99, new e(X.this.a));
            put(105, new f(X.this.a));
        }
    }

    public class d implements Q1.a {
        private final F9 a;

        public d(X x, F9 f9) {
            this.a = f9;
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            this.a.e(new C3232ye("COOKIE_BROWSERS", null).a());
            this.a.e(new C3232ye("BIND_ID_URL", null).a());
            V0.a(context, "b_meta.dat");
            V0.a(context, "browsers.dat");
        }
    }

    public static class e implements Q1.a {
        private final F9 a;

        public e(F9 f9) {
            this.a = f9;
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            this.a.e(new C3232ye("DEVICE_ID_POSSIBLE", null).a()).c();
        }
    }

    public static class f implements Q1.a {
        private final F9 a;

        public f(F9 f9) {
            this.a = f9;
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            this.a.e(new C3232ye("STARTUP_REQUEST_TIME", null).a()).c();
        }
    }

    public X(Context context) {
        this(new F9(Qa.a(context).d()));
    }

    @Override // com.yandex.metrica.impl.ob.Q1
    public SparseArray<Q1.a> a() {
        return new a();
    }

    @Override // com.yandex.metrica.impl.ob.Q1
    public int a(C3127ue c3127ue) {
        return (int) this.a.b(-1L);
    }

    public X(F9 f9) {
        this.a = f9;
    }

    @Override // com.yandex.metrica.impl.ob.Q1
    public void a(C3127ue c3127ue, int i) {
        this.a.e(i);
        c3127ue.g().b();
    }

    public static class b implements Q1.a {
        private final F9 a;

        public b(F9 f9) {
            this.a = f9;
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            String strK = this.a.k(null);
            String strM = this.a.m(null);
            String strL = this.a.l(null);
            String strF = this.a.f((String) null);
            String strG = this.a.g((String) null);
            String strI = this.a.i((String) null);
            this.a.e(a(strK));
            this.a.i(a(strM));
            this.a.d(a(strL));
            this.a.a(a(strF));
            this.a.b(a(strG));
            this.a.h(a(strI));
        }

        private C2766g1 a(String str) {
            boolean zIsEmpty = TextUtils.isEmpty(str);
            return new C2766g1(str, zIsEmpty ? EnumC2716e1.UNKNOWN : EnumC2716e1.OK, zIsEmpty ? "no identifier saved in previous version" : null);
        }
    }

    public static class c implements Q1.a {
        private F9 a;

        public c(F9 f9) {
            this.a = f9;
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            C3077se c3077se = new C3077se(context);
            if (U2.b(c3077se.g())) {
                return;
            }
            if (this.a.m(null) == null || this.a.k(null) == null) {
                String strE = c3077se.e(null);
                if (a(strE, this.a.k(null))) {
                    this.a.r(strE);
                }
                String strF = c3077se.f(null);
                if (a(strF, this.a.m(null))) {
                    this.a.s(strF);
                }
                String strB = c3077se.b(null);
                if (a(strB, this.a.f((String) null))) {
                    this.a.n(strB);
                }
                String strC = c3077se.c(null);
                if (a(strC, this.a.g((String) null))) {
                    this.a.o(strC);
                }
                String strD = c3077se.d(null);
                if (a(strD, this.a.i((String) null))) {
                    this.a.p(strD);
                }
                long jA = c3077se.a(-1L);
                long jD = this.a.d(-1L);
                if (jA != -1 && jD == -1) {
                    this.a.h(jA);
                }
                this.a.c();
                c3077se.f().b();
            }
        }

        private boolean a(String str, String str2) {
            return !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2);
        }
    }
}
