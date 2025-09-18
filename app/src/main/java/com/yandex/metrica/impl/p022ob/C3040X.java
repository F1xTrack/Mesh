package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.yandex.metrica.impl.p022ob.AbstractC2868Q1;

/* renamed from: com.yandex.metrica.impl.ob.X */
/* loaded from: classes2.dex */
public class C3040X extends AbstractC2868Q1 {

    /* renamed from: a */
    private final C2601F9 f22737a;

    /* renamed from: com.yandex.metrica.impl.ob.X$a */
    public class a extends SparseArray<AbstractC2868Q1.a> {
        public a() {
            put(47, new c(C3040X.this.f22737a));
            put(66, new d(C3040X.this, C3040X.this.f22737a));
            put(89, new b(C3040X.this.f22737a));
            put(99, new e(C3040X.this.f22737a));
            put(105, new f(C3040X.this.f22737a));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.X$d */
    public class d implements AbstractC2868Q1.a {

        /* renamed from: a */
        private final C2601F9 f22741a;

        public d(C3040X c3040x, C2601F9 c2601f9) {
            this.f22741a = c2601f9;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC2868Q1.a
        /* renamed from: a */
        public void mo14155a(Context context) {
            this.f22741a.m14261e(new C3754ye("COOKIE_BROWSERS", null).m17234a());
            this.f22741a.m14261e(new C3754ye("BIND_ID_URL", null).m17234a());
            C2991V0.m15294a(context, "b_meta.dat");
            C2991V0.m15294a(context, "browsers.dat");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.X$e */
    public static class e implements AbstractC2868Q1.a {

        /* renamed from: a */
        private final C2601F9 f22742a;

        public e(C2601F9 c2601f9) {
            this.f22742a = c2601f9;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC2868Q1.a
        /* renamed from: a */
        public void mo14155a(Context context) {
            this.f22742a.m14261e(new C3754ye("DEVICE_ID_POSSIBLE", null).m17234a()).m14258c();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.X$f */
    public static class f implements AbstractC2868Q1.a {

        /* renamed from: a */
        private final C2601F9 f22743a;

        public f(C2601F9 c2601f9) {
            this.f22743a = c2601f9;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC2868Q1.a
        /* renamed from: a */
        public void mo14155a(Context context) {
            this.f22743a.m14261e(new C3754ye("STARTUP_REQUEST_TIME", null).m17234a()).m14258c();
        }
    }

    public C3040X(Context context) {
        this(new C2601F9(C2877Qa.m14815a(context).m14828d()));
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2868Q1
    /* renamed from: a */
    public SparseArray<AbstractC2868Q1.a> mo14153a() {
        return new a();
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2868Q1
    /* renamed from: a */
    public int mo14152a(C3650ue c3650ue) {
        return (int) this.f22737a.m14076b(-1L);
    }

    public C3040X(C2601F9 c2601f9) {
        this.f22737a = c2601f9;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2868Q1
    /* renamed from: a */
    public void mo14154a(C3650ue c3650ue, int i) {
        this.f22737a.m14086e(i);
        c3650ue.m16919g().m16690b();
    }

    /* renamed from: com.yandex.metrica.impl.ob.X$b */
    public static class b implements AbstractC2868Q1.a {

        /* renamed from: a */
        private final C2601F9 f22739a;

        public b(C2601F9 c2601f9) {
            this.f22739a = c2601f9;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC2868Q1.a
        /* renamed from: a */
        public void mo14155a(Context context) {
            String strM14107k = this.f22739a.m14107k(null);
            String strM14111m = this.f22739a.m14111m(null);
            String strM14109l = this.f22739a.m14109l(null);
            String strM14092f = this.f22739a.m14092f((String) null);
            String strM14095g = this.f22739a.m14095g((String) null);
            String strM14102i = this.f22739a.m14102i((String) null);
            this.f22739a.m14087e(m15407a(strM14107k));
            this.f22739a.m14100i(m15407a(strM14111m));
            this.f22739a.m14084d(m15407a(strM14109l));
            this.f22739a.m14071a(m15407a(strM14092f));
            this.f22739a.m14077b(m15407a(strM14095g));
            this.f22739a.m14098h(m15407a(strM14102i));
        }

        /* renamed from: a */
        private C3273g1 m15407a(String str) {
            boolean zIsEmpty = TextUtils.isEmpty(str);
            return new C3273g1(str, zIsEmpty ? EnumC3221e1.UNKNOWN : EnumC3221e1.OK, zIsEmpty ? "no identifier saved in previous version" : null);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.X$c */
    public static class c implements AbstractC2868Q1.a {

        /* renamed from: a */
        private C2601F9 f22740a;

        public c(C2601F9 c2601f9) {
            this.f22740a = c2601f9;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC2868Q1.a
        /* renamed from: a */
        public void mo14155a(Context context) {
            C3598se c3598se = new C3598se(context);
            if (C2968U2.m15250b(c3598se.m16732g())) {
                return;
            }
            if (this.f22740a.m14111m(null) == null || this.f22740a.m14107k(null) == null) {
                String strM16729e = c3598se.m16729e(null);
                if (m15408a(strM16729e, this.f22740a.m14107k(null))) {
                    this.f22740a.m14120r(strM16729e);
                }
                String strM16731f = c3598se.m16731f(null);
                if (m15408a(strM16731f, this.f22740a.m14111m(null))) {
                    this.f22740a.m14122s(strM16731f);
                }
                String strM16726b = c3598se.m16726b(null);
                if (m15408a(strM16726b, this.f22740a.m14092f((String) null))) {
                    this.f22740a.m14112n(strM16726b);
                }
                String strM16727c = c3598se.m16727c(null);
                if (m15408a(strM16727c, this.f22740a.m14095g((String) null))) {
                    this.f22740a.m14114o(strM16727c);
                }
                String strM16728d = c3598se.m16728d(null);
                if (m15408a(strM16728d, this.f22740a.m14102i((String) null))) {
                    this.f22740a.m14117p(strM16728d);
                }
                long jM16725a = c3598se.m16725a(-1L);
                long jM14083d = this.f22740a.m14083d(-1L);
                if (jM16725a != -1 && jM14083d == -1) {
                    this.f22740a.m14097h(jM16725a);
                }
                this.f22740a.m14258c();
                c3598se.m16730f().m16690b();
            }
        }

        /* renamed from: a */
        private boolean m15408a(String str, String str2) {
            return !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2);
        }
    }
}
