package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.SparseArray;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import com.vk.push.core.base.AidlException;
import com.yandex.metrica.impl.ob.A;
import com.yandex.metrica.impl.ob.Be;
import com.yandex.metrica.impl.ob.Ma;
import com.yandex.metrica.impl.ob.P3;
import com.yandex.metrica.impl.ob.Q1;
import com.yandex.metrica.impl.ob.Qi;
import com.yandex.metrica.impl.ob.Ri;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class G2 extends Q1 {
    private final I9 a;
    private final Context b;
    private final H8 c;

    public class a extends SparseArray<Q1.a> {
        public a() {
            put(29, new j(G2.this.b));
            put(39, new k());
            put(47, new l(G2.this.a));
            put(60, new m(G2.this.a));
            put(62, new n());
            put(66, new o());
            put(67, new g(Ma.b.a(Ri.class).b(G2.this.b), new J9(Qa.a(G2.this.b).q(), G2.this.b.getPackageName())));
            put(68, new u());
            put(72, new f(Ma.b.b(C2829ie.class).b(G2.this.b), Ma.b.a(Ri.class).b(G2.this.b)));
            put(82, new h(Ma.b.b(C2829ie.class).b(G2.this.b), Ma.b.a(C2629ae.class).b(G2.this.b)));
            put(87, new i(Ma.b.a(Ri.class).b(G2.this.b)));
            put(92, new c(Ma.b.a(Ri.class).b(G2.this.b)));
            put(93, new e(G2.this.b, Ma.b.a(Le.class).b(G2.this.b), Ma.b.a(Be.class).b(G2.this.b)));
            put(94, new p(G2.this.b, Ma.b.a(Ri.class).b(G2.this.b)));
            put(98, new t(G2.this.a));
            put(100, new b(new J9(Qa.a(G2.this.b).q(), G2.this.b.getPackageName())));
            put(AidlException.ILLEGAL_ARGUMENT_EXCEPTION, new q(G2.this.a, Ma.b.a(Ri.class).b(G2.this.b)));
            put(102, new r(Ma.b.a(Be.class).b(G2.this.b)));
            put(AidlException.HOST_IS_NOT_MASTER, new d(Ma.b.a(C3090t2.class).b(G2.this.b), Ma.b.a(P3.class).b(G2.this.b), G2.this.a));
            put(104, new s(Qa.a(G2.this.b).o()));
        }
    }

    public static class b implements Q1.a {
        private final J9 a;

        public b(J9 j9) {
            this.a = j9;
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            this.a.e();
        }
    }

    public static class c implements Q1.a {
        private final Q9 a;

        public c(Q9 q9) {
            this.a = q9;
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            Ri ri = (Ri) this.a.b();
            this.a.a(ri.a(ri.s).h(ri.q).a());
        }
    }

    public static class d implements Q1.a {
        private final Q9 a;
        private final Q9 b;
        private final I9 c;

        public d(Q9 q9, Q9 q92, I9 i9) {
            this.a = q9;
            this.b = q92;
            this.c = i9;
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            C3090t2 c3090t2 = (C3090t2) this.a.b();
            this.a.a();
            if (c3090t2.b) {
                if (!U2.b(c3090t2.a)) {
                    P3.a aVar = new P3.a(c3090t2.a, E0.SATELLITE);
                    this.b.a(new P3(aVar, Collections.singletonList(aVar)));
                }
                this.c.g();
            }
        }
    }

    public static class e implements Q1.a {
        private final He a;
        private final Q9 b;
        private final Q9 c;

        public e(Context context, Q9 q9, Q9 q92) {
            this(q9, q92, new He(context));
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            Le leInvoke;
            Le le = (Le) this.b.b();
            ArrayList arrayList = new ArrayList();
            E0 e0 = le.e;
            if (e0 != E0.UNDEFINED) {
                arrayList.add(new Be.a(le.a, le.b, e0));
            }
            if (le.e == E0.RETAIL && (leInvoke = this.a.invoke()) != null) {
                arrayList.add(new Be.a(leInvoke.a, leInvoke.b, leInvoke.e));
            }
            this.c.a(new Be(le, arrayList));
            this.b.a();
        }

        public e(Q9 q9, Q9 q92, He he) {
            this.b = q9;
            this.c = q92;
            this.a = he;
        }
    }

    public static class f implements Q1.a {
        private final Q9 a;
        private final Q9 b;
        private final L0 c;

        public f(Q9 q9, Q9 q92) {
            this(q9, q92, new L0());
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            JSONObject jSONObject;
            String strOptString;
            C8 c8H = Qa.a(context).h();
            List<C2829ie> listB = c8H.b();
            if (listB != null) {
                this.a.a(listB);
                c8H.a();
            }
            Ri ri = (Ri) this.b.b();
            Ri.b bVarA = ri.a(ri.s);
            String strOptString2 = null;
            try {
                jSONObject = new JSONObject(V0.a(this.c.b(context.getFilesDir(), "credentials.dat")));
            } catch (Throwable unused) {
                jSONObject = null;
            }
            if (jSONObject == null && U2.a(21)) {
                try {
                    jSONObject = new JSONObject(V0.a(this.c.b(context.getNoBackupFilesDir(), "credentials.dat")));
                } catch (Throwable unused2) {
                }
            }
            if (jSONObject != null) {
                strOptString2 = jSONObject.optString(AnalyticsBaseParamsConstantsKt.DEVICE_ID, null);
                strOptString = jSONObject.optString("device_id_hash", null);
            } else {
                strOptString = null;
            }
            if (!TextUtils.isEmpty(strOptString2)) {
                bVarA.c(strOptString2);
            }
            if (!TextUtils.isEmpty(strOptString)) {
                bVarA.e(strOptString);
            }
            bVarA.b(true);
            this.b.a(bVarA.a());
            context.getSharedPreferences("com.yandex.metrica.configuration", 0).edit().clear().apply();
        }

        public f(Q9 q9, Q9 q92, L0 l0) {
            this.a = q9;
            this.b = q92;
            this.c = l0;
        }
    }

    public static class g implements Q1.a {
        private Q9 a;
        private J9 b;

        public g(Q9 q9, J9 j9) {
            this.a = q9;
            this.b = j9;
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            this.a.a(this.b.f());
        }
    }

    public static class h implements Q1.a {
        private final Q9 a;
        private final Q9 b;

        public h(Q9 q9, Q9 q92) {
            this.a = q9;
            this.b = q92;
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            this.b.a(new C2629ae(new ArrayList((Collection) this.a.b()), null, new ArrayList()));
        }
    }

    public static class i implements Q1.a {
        private final Q9 a;

        public i(Q9 q9) {
            this.a = q9;
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            Q9 q9 = this.a;
            Ri ri = (Ri) q9.b();
            q9.a(ri.a(ri.s).b(true).a());
        }
    }

    public static class j implements Q1.a {
        private C3182we a;
        private J9 b;

        public j(Context context) {
            this.a = new C3182we(context);
            this.b = new J9(Qa.a(context).p(), context.getPackageName());
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            String strB = this.a.b((String) null);
            if (TextUtils.isEmpty(strB)) {
                return;
            }
            this.b.h(strB).c();
            C3182we.b(context);
        }
    }

    public static class k implements Q1.a {
        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            C3102te c3102te = new C3102te(context, context.getPackageName());
            SharedPreferences sharedPreferencesA = C2814i.a(context, "_boundentrypreferences");
            C3232ye c3232ye = C3102te.H;
            String string = sharedPreferencesA.getString(c3232ye.b(), null);
            C3232ye c3232ye2 = C3102te.I;
            long j = sharedPreferencesA.getLong(c3232ye2.b(), -1L);
            if (string == null || j == -1) {
                return;
            }
            c3102te.a(new A.a(string, j)).b();
            sharedPreferencesA.edit().remove(c3232ye.b()).remove(c3232ye2.b()).apply();
        }
    }

    public static class l implements Q1.a {
        private final I9 a;

        public l(I9 i9) {
            this.a = i9;
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            I9 i9 = this.a;
            C3207xe c3207xe = new C3207xe(context, null);
            if (c3207xe.f()) {
                i9.d(true);
                c3207xe.g();
            }
            I9 i92 = this.a;
            C3152ve c3152ve = new C3152ve(context, context.getPackageName());
            long jA = c3152ve.a(0);
            if (jA != 0) {
                i92.l(jA);
            }
            c3152ve.f();
            new C3102te(context, new C3018q4(context.getPackageName(), null).b()).i().b();
            this.a.c();
            C2978oe c2978oe = new C2978oe(context);
            c2978oe.a();
            c2978oe.b();
        }
    }

    public static class m implements Q1.a {
        private final I9 a;

        public m(I9 i9) {
            this.a = i9;
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            boolean z = new J9(Qa.a(context).q(), context.getPackageName()).f().w > 0;
            boolean z2 = this.a.b(-1) > 0;
            if (z || z2) {
                this.a.c(false).c();
            }
        }
    }

    public static class n implements Q1.a {
        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            J9 j9 = new J9(Qa.a(context).q(), context.getPackageName());
            String strG = j9.g(null);
            if (strG != null) {
                j9.b(Collections.singletonList(strG));
            }
            String strF = j9.f(null);
            if (strF != null) {
                j9.a(Collections.singletonList(strF));
            }
        }
    }

    public static class o implements Q1.a {
        private final L0 a;

        public static class a implements FilenameFilter {
            final Iterable<FilenameFilter> a;

            public a(Iterable<FilenameFilter> iterable) {
                this.a = iterable;
            }

            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                Iterator<FilenameFilter> it = this.a.iterator();
                while (it.hasNext()) {
                    if (it.next().accept(file, str)) {
                        return true;
                    }
                }
                return false;
            }
        }

        public static class b implements FilenameFilter {
            private final FilenameFilter a;

            public b(FilenameFilter filenameFilter) {
                this.a = filenameFilter;
            }

            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                if (!str.startsWith("db_metrica_")) {
                    return false;
                }
                try {
                    FilenameFilter filenameFilter = this.a;
                    if (str.endsWith("-journal")) {
                        str = str.replace("-journal", "");
                    }
                    return filenameFilter.accept(file, str);
                } catch (Throwable unused) {
                    return false;
                }
            }
        }

        public static class c implements FilenameFilter {
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.endsWith("null");
            }
        }

        public static class d implements FilenameFilter {
            private final String a;

            public d(String str) {
                this.a = str;
            }

            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return !str.contains(this.a);
            }
        }

        public o() {
            this(new L0());
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            for (File file : b(context) == null ? new File[0] : b(context).listFiles(new a(Arrays.asList(new b(new d(context.getPackageName())), new b(new c()))))) {
                try {
                    if (!file.delete()) {
                        ((Nh) Oh.a()).reportEvent("Can not delete file", new JSONObject().put("fileName", file.getName()).toString());
                    }
                } catch (Throwable th) {
                    ((Nh) Oh.a()).reportError("Can not delete file", th);
                }
            }
            new J9(Qa.a(context).q(), context.getPackageName()).e(new C3232ye("LAST_STARTUP_CLIDS_SAVE_TIME", null).a()).c();
        }

        public File b(Context context) {
            if (U2.a(21)) {
                return context.getNoBackupFilesDir();
            }
            File filesDir = context.getFilesDir();
            if (filesDir != null) {
                return this.a.b(filesDir.getParentFile(), "databases");
            }
            return null;
        }

        public o(L0 l0) {
            this.a = l0;
        }
    }

    public static class r implements Q1.a {
        private final Q9 a;

        public r(Q9 q9) {
            this.a = q9;
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            Be be = (Be) this.a.b();
            ArrayList arrayList = new ArrayList();
            Be.a aVar = null;
            for (Be.a aVar2 : be.b) {
                if (aVar2.c != E0.APP) {
                    arrayList.add(aVar2);
                } else if (aVar == null) {
                    arrayList.add(aVar2);
                    aVar = aVar2;
                }
            }
            this.a.a(new Be(be.a, arrayList));
        }
    }

    public static class s implements Q1.a {
        private final InterfaceC3226y8 a;

        public s(InterfaceC3226y8 interfaceC3226y8) {
            this.a = interfaceC3226y8;
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            this.a.b("notification_cache_state");
        }
    }

    public static class t implements Q1.a {
        private final I9 a;

        public t(I9 i9) {
            this.a = i9;
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            this.a.e(new C3232ye("REFERRER", null).a()).e(new C3232ye("REFERRER_HOLDER_STATE", null).a()).c();
        }
    }

    public static class u implements Q1.a {
        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            Q9 q9B = Ma.b.a(Ri.class).b(context);
            Ri ri = (Ri) q9B.b();
            q9B.a(ri.a(ri.s).a(ri.w > 0).b(true).a());
        }
    }

    public G2(Context context, I9 i9, H8 h8) {
        this.b = context;
        this.a = i9;
        this.c = h8;
    }

    public static class q implements Q1.a {
        private final I9 a;
        private final Q9 b;
        private final H8 c;
        private final String d;
        private final String e;
        private final String f;
        private final String g;
        private final String h;

        public q(I9 i9, Q9 q9) {
            this(i9, q9, P0.i().y().a());
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            Ri ri = (Ri) this.b.b();
            C3127ue c3127ue = new C3127ue(context);
            int iF = c3127ue.f();
            if (iF == -1) {
                iF = this.a.a(-1);
            }
            this.c.a(ri.b, ri.d, this.a.a(this.d, (String) null), this.a.b(this.e) ? Boolean.valueOf(this.a.a(this.e, false)) : null, this.a.b(this.f) ? Long.valueOf(this.a.a(this.f, -1L)) : null, this.a.b(this.g) ? Long.valueOf(this.a.a(this.g, -1L)) : null, this.a.b(this.h) ? Long.valueOf(this.a.a(this.h, -1L)) : null, iF == -1 ? null : Integer.valueOf(iF));
            this.a.i().e(this.d).e(this.e).e(this.f).e(this.g).e(this.h).c();
            c3127ue.h().b();
        }

        public q(I9 i9, Q9 q9, H8 h8) {
            this.d = new C3232ye("REFERRER_FROM_PLAY_SERVICES").a();
            this.e = new C3232ye("REFERRER_CHECKED").a();
            this.f = new C3232ye("L_ID").a();
            this.g = new C3232ye("LBS_ID").a();
            this.h = new C3232ye("L_REQ_NUM").a();
            this.a = i9;
            this.b = q9;
            this.c = h8;
        }
    }

    @Override // com.yandex.metrica.impl.ob.Q1
    public SparseArray<Q1.a> a() {
        return new a();
    }

    public static class p implements Q1.a {
        private final Q9 a;
        private final Ej b;

        public p(Context context, Q9 q9) {
            this(q9, Fj.a(context).b(context, new Jj(new Qi.b(context))));
        }

        @Override // com.yandex.metrica.impl.ob.Q1.a
        public void a(Context context) {
            String str = this.b.a().a;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Ri ri = (Ri) this.a.b();
            if (str.equals(ri.a)) {
                return;
            }
            this.a.a(ri.a(ri.s).l(str).a());
        }

        public p(Q9 q9, Ej ej) {
            this.a = q9;
            this.b = ej;
        }
    }

    @Override // com.yandex.metrica.impl.ob.Q1
    public int a(C3127ue c3127ue) {
        int iF = c3127ue.f();
        if (iF == -1) {
            iF = this.a.a(-1);
        }
        return iF == -1 ? this.c.e() : iF;
    }

    @Override // com.yandex.metrica.impl.ob.Q1
    public void a(C3127ue c3127ue, int i2) {
        this.c.a(i2);
    }
}
