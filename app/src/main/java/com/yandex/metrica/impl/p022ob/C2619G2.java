package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.SparseArray;
import com.p019vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import com.p019vk.push.core.base.AidlException;
import com.yandex.metrica.impl.p022ob.AbstractC2868Q1;
import com.yandex.metrica.impl.p022ob.C2466A;
import com.yandex.metrica.impl.p022ob.C2506Be;
import com.yandex.metrica.impl.p022ob.C2845P3;
import com.yandex.metrica.impl.p022ob.C2885Qi;
import com.yandex.metrica.impl.p022ob.C2909Ri;
import com.yandex.metrica.impl.p022ob.InterfaceC2777Ma;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.G2 */
/* loaded from: classes2.dex */
public class C2619G2 extends AbstractC2868Q1 {

    /* renamed from: a */
    private final C2676I9 f21241a;

    /* renamed from: b */
    private final Context f21242b;

    /* renamed from: c */
    private final C2650H8 f21243c;

    /* renamed from: com.yandex.metrica.impl.ob.G2$a */
    public class a extends SparseArray<AbstractC2868Q1.a> {
        public a() {
            put(29, new j(C2619G2.this.f21242b));
            put(39, new k());
            put(47, new l(C2619G2.this.f21241a));
            put(60, new m(C2619G2.this.f21241a));
            put(62, new n());
            put(66, new o());
            put(67, new g(InterfaceC2777Ma.b.m14608a(C2909Ri.class).mo14607b(C2619G2.this.f21242b), new C2701J9(C2877Qa.m14815a(C2619G2.this.f21242b).m14838q(), C2619G2.this.f21242b.getPackageName())));
            put(68, new u());
            put(72, new f(InterfaceC2777Ma.b.m14609b(C3338ie.class).mo14607b(C2619G2.this.f21242b), InterfaceC2777Ma.b.m14608a(C2909Ri.class).mo14607b(C2619G2.this.f21242b)));
            put(82, new h(InterfaceC2777Ma.b.m14609b(C3338ie.class).mo14607b(C2619G2.this.f21242b), InterfaceC2777Ma.b.m14608a(C3130ae.class).mo14607b(C2619G2.this.f21242b)));
            put(87, new i(InterfaceC2777Ma.b.m14608a(C2909Ri.class).mo14607b(C2619G2.this.f21242b)));
            put(92, new c(InterfaceC2777Ma.b.m14608a(C2909Ri.class).mo14607b(C2619G2.this.f21242b)));
            put(93, new e(C2619G2.this.f21242b, InterfaceC2777Ma.b.m14608a(C2756Le.class).mo14607b(C2619G2.this.f21242b), InterfaceC2777Ma.b.m14608a(C2506Be.class).mo14607b(C2619G2.this.f21242b)));
            put(94, new p(C2619G2.this.f21242b, InterfaceC2777Ma.b.m14608a(C2909Ri.class).mo14607b(C2619G2.this.f21242b)));
            put(98, new t(C2619G2.this.f21241a));
            put(100, new b(new C2701J9(C2877Qa.m14815a(C2619G2.this.f21242b).m14838q(), C2619G2.this.f21242b.getPackageName())));
            put(AidlException.ILLEGAL_ARGUMENT_EXCEPTION, new q(C2619G2.this.f21241a, InterfaceC2777Ma.b.m14608a(C2909Ri.class).mo14607b(C2619G2.this.f21242b)));
            put(102, new r(InterfaceC2777Ma.b.m14608a(C2506Be.class).mo14607b(C2619G2.this.f21242b)));
            put(AidlException.HOST_IS_NOT_MASTER, new d(InterfaceC2777Ma.b.m14608a(C3612t2.class).mo14607b(C2619G2.this.f21242b), InterfaceC2777Ma.b.m14608a(C2845P3.class).mo14607b(C2619G2.this.f21242b), C2619G2.this.f21241a));
            put(104, new s(C2877Qa.m14815a(C2619G2.this.f21242b).m14836o()));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$b */
    public static class b implements AbstractC2868Q1.a {

        /* renamed from: a */
        private final C2701J9 f21245a;

        public b(C2701J9 c2701j9) {
            this.f21245a = c2701j9;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC2868Q1.a
        /* renamed from: a */
        public void mo14155a(Context context) {
            this.f21245a.m14427e();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$c */
    public static class c implements AbstractC2868Q1.a {

        /* renamed from: a */
        private final C2876Q9 f21246a;

        public c(C2876Q9 c2876q9) {
            this.f21246a = c2876q9;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC2868Q1.a
        /* renamed from: a */
        public void mo14155a(Context context) {
            C2909Ri c2909Ri = (C2909Ri) this.f21246a.m14814b();
            this.f21246a.m14813a(c2909Ri.m15023a(c2909Ri.f22225s).m15073h(c2909Ri.f22223q).m15054a());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$d */
    public static class d implements AbstractC2868Q1.a {

        /* renamed from: a */
        private final C2876Q9 f21247a;

        /* renamed from: b */
        private final C2876Q9 f21248b;

        /* renamed from: c */
        private final C2676I9 f21249c;

        public d(C2876Q9 c2876q9, C2876Q9 c2876q92, C2676I9 c2676i9) {
            this.f21247a = c2876q9;
            this.f21248b = c2876q92;
            this.f21249c = c2676i9;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC2868Q1.a
        /* renamed from: a */
        public void mo14155a(Context context) {
            C3612t2 c3612t2 = (C3612t2) this.f21247a.m14814b();
            this.f21247a.m14812a();
            if (c3612t2.f24793b) {
                if (!C2968U2.m15250b(c3612t2.f24792a)) {
                    C2845P3.a aVar = new C2845P3.a(c3612t2.f24792a, EnumC2567E0.SATELLITE);
                    this.f21248b.m14813a(new C2845P3(aVar, Collections.singletonList(aVar)));
                }
                this.f21249c.m14327g();
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$e */
    public static class e implements AbstractC2868Q1.a {

        /* renamed from: a */
        private final C2656He f21250a;

        /* renamed from: b */
        private final C2876Q9 f21251b;

        /* renamed from: c */
        private final C2876Q9 f21252c;

        public e(Context context, C2876Q9 c2876q9, C2876Q9 c2876q92) {
            this(c2876q9, c2876q92, new C2656He(context));
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC2868Q1.a
        /* renamed from: a */
        public void mo14155a(Context context) {
            C2756Le c2756LeInvoke;
            C2756Le c2756Le = (C2756Le) this.f21251b.m14814b();
            ArrayList arrayList = new ArrayList();
            EnumC2567E0 enumC2567E0 = c2756Le.f21642e;
            if (enumC2567E0 != EnumC2567E0.UNDEFINED) {
                arrayList.add(new C2506Be.a(c2756Le.f21638a, c2756Le.f21639b, enumC2567E0));
            }
            if (c2756Le.f21642e == EnumC2567E0.RETAIL && (c2756LeInvoke = this.f21250a.invoke()) != null) {
                arrayList.add(new C2506Be.a(c2756LeInvoke.f21638a, c2756LeInvoke.f21639b, c2756LeInvoke.f21642e));
            }
            this.f21252c.m14813a(new C2506Be(c2756Le, arrayList));
            this.f21251b.m14812a();
        }

        public e(C2876Q9 c2876q9, C2876Q9 c2876q92, C2656He c2656He) {
            this.f21251b = c2876q9;
            this.f21252c = c2876q92;
            this.f21250a = c2656He;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$f */
    public static class f implements AbstractC2868Q1.a {

        /* renamed from: a */
        private final C2876Q9 f21253a;

        /* renamed from: b */
        private final C2876Q9 f21254b;

        /* renamed from: c */
        private final C2742L0 f21255c;

        public f(C2876Q9 c2876q9, C2876Q9 c2876q92) {
            this(c2876q9, c2876q92, new C2742L0());
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC2868Q1.a
        /* renamed from: a */
        public void mo14155a(Context context) {
            JSONObject jSONObject;
            String strOptString;
            C2525C8 c2525c8M14832h = C2877Qa.m14815a(context).m14832h();
            List<C3338ie> listM13958b = c2525c8M14832h.m13958b();
            if (listM13958b != null) {
                this.f21253a.m14813a(listM13958b);
                c2525c8M14832h.m13957a();
            }
            C2909Ri c2909Ri = (C2909Ri) this.f21254b.m14814b();
            C2909Ri.b bVarM15023a = c2909Ri.m15023a(c2909Ri.f22225s);
            String strOptString2 = null;
            try {
                jSONObject = new JSONObject(C2991V0.m15292a(this.f21255c.m14503b(context.getFilesDir(), "credentials.dat")));
            } catch (Throwable unused) {
                jSONObject = null;
            }
            if (jSONObject == null && C2968U2.m15243a(21)) {
                try {
                    jSONObject = new JSONObject(C2991V0.m15292a(this.f21255c.m14503b(context.getNoBackupFilesDir(), "credentials.dat")));
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
                bVarM15023a.m15062c(strOptString2);
            }
            if (!TextUtils.isEmpty(strOptString)) {
                bVarM15023a.m15067e(strOptString);
            }
            bVarM15023a.m15059b(true);
            this.f21254b.m14813a(bVarM15023a.m15054a());
            context.getSharedPreferences("com.yandex.metrica.configuration", 0).edit().clear().apply();
        }

        public f(C2876Q9 c2876q9, C2876Q9 c2876q92, C2742L0 c2742l0) {
            this.f21253a = c2876q9;
            this.f21254b = c2876q92;
            this.f21255c = c2742l0;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$g */
    public static class g implements AbstractC2868Q1.a {

        /* renamed from: a */
        private C2876Q9 f21256a;

        /* renamed from: b */
        private C2701J9 f21257b;

        public g(C2876Q9 c2876q9, C2701J9 c2701j9) {
            this.f21256a = c2876q9;
            this.f21257b = c2701j9;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC2868Q1.a
        /* renamed from: a */
        public void mo14155a(Context context) {
            this.f21256a.m14813a(this.f21257b.m14428f());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$h */
    public static class h implements AbstractC2868Q1.a {

        /* renamed from: a */
        private final C2876Q9 f21258a;

        /* renamed from: b */
        private final C2876Q9 f21259b;

        public h(C2876Q9 c2876q9, C2876Q9 c2876q92) {
            this.f21258a = c2876q9;
            this.f21259b = c2876q92;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC2868Q1.a
        /* renamed from: a */
        public void mo14155a(Context context) {
            this.f21259b.m14813a(new C3130ae(new ArrayList((Collection) this.f21258a.m14814b()), null, new ArrayList()));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$i */
    public static class i implements AbstractC2868Q1.a {

        /* renamed from: a */
        private final C2876Q9 f21260a;

        public i(C2876Q9 c2876q9) {
            this.f21260a = c2876q9;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC2868Q1.a
        /* renamed from: a */
        public void mo14155a(Context context) {
            C2876Q9 c2876q9 = this.f21260a;
            C2909Ri c2909Ri = (C2909Ri) c2876q9.m14814b();
            c2876q9.m14813a(c2909Ri.m15023a(c2909Ri.f22225s).m15059b(true).m15054a());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$j */
    public static class j implements AbstractC2868Q1.a {

        /* renamed from: a */
        private C3702we f21261a;

        /* renamed from: b */
        private C2701J9 f21262b;

        public j(Context context) {
            this.f21261a = new C3702we(context);
            this.f21262b = new C2701J9(C2877Qa.m14815a(context).m14837p(), context.getPackageName());
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC2868Q1.a
        /* renamed from: a */
        public void mo14155a(Context context) {
            String strM17133b = this.f21261a.m17133b((String) null);
            if (TextUtils.isEmpty(strM17133b)) {
                return;
            }
            this.f21262b.m14431h(strM17133b).m14258c();
            C3702we.m17131b(context);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$k */
    public static class k implements AbstractC2868Q1.a {
        @Override // com.yandex.metrica.impl.p022ob.AbstractC2868Q1.a
        /* renamed from: a */
        public void mo14155a(Context context) {
            C3624te c3624te = new C3624te(context, context.getPackageName());
            SharedPreferences sharedPreferencesM16061a = C3323i.m16061a(context, "_boundentrypreferences");
            C3754ye c3754ye = C3624te.f24829H;
            String string = sharedPreferencesM16061a.getString(c3754ye.m17236b(), null);
            C3754ye c3754ye2 = C3624te.f24830I;
            long j = sharedPreferencesM16061a.getLong(c3754ye2.m17236b(), -1L);
            if (string == null || j == -1) {
                return;
            }
            c3624te.m16851a(new C2466A.a(string, j)).m16690b();
            sharedPreferencesM16061a.edit().remove(c3754ye.m17236b()).remove(c3754ye2.m17236b()).apply();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$l */
    public static class l implements AbstractC2868Q1.a {

        /* renamed from: a */
        private final C2676I9 f21263a;

        public l(C2676I9 c2676i9) {
            this.f21263a = c2676i9;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC2868Q1.a
        /* renamed from: a */
        public void mo14155a(Context context) {
            C2676I9 c2676i9 = this.f21263a;
            C3728xe c3728xe = new C3728xe(context, null);
            if (c3728xe.m17180f()) {
                c2676i9.m14322d(true);
                c3728xe.m17181g();
            }
            C2676I9 c2676i92 = this.f21263a;
            C3676ve c3676ve = new C3676ve(context, context.getPackageName());
            long jM16973a = c3676ve.m16973a(0);
            if (jM16973a != 0) {
                c2676i92.m14337l(jM16973a);
            }
            c3676ve.m16974f();
            new C3624te(context, new C3536q4(context.getPackageName(), null).m15701b()).m16865i().m16690b();
            this.f21263a.m14258c();
            C3494oe c3494oe = new C3494oe(context);
            c3494oe.m16541a();
            c3494oe.m16542b();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$m */
    public static class m implements AbstractC2868Q1.a {

        /* renamed from: a */
        private final C2676I9 f21264a;

        public m(C2676I9 c2676i9) {
            this.f21264a = c2676i9;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC2868Q1.a
        /* renamed from: a */
        public void mo14155a(Context context) {
            boolean z = new C2701J9(C2877Qa.m14815a(context).m14838q(), context.getPackageName()).m14428f().f22229w > 0;
            boolean z2 = this.f21264a.m14313b(-1) > 0;
            if (z || z2) {
                this.f21264a.m14320c(false).m14258c();
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$n */
    public static class n implements AbstractC2868Q1.a {
        @Override // com.yandex.metrica.impl.p022ob.AbstractC2868Q1.a
        /* renamed from: a */
        public void mo14155a(Context context) {
            C2701J9 c2701j9 = new C2701J9(C2877Qa.m14815a(context).m14838q(), context.getPackageName());
            String strM14430g = c2701j9.m14430g(null);
            if (strM14430g != null) {
                c2701j9.m14426b(Collections.singletonList(strM14430g));
            }
            String strM14429f = c2701j9.m14429f(null);
            if (strM14429f != null) {
                c2701j9.m14423a(Collections.singletonList(strM14429f));
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$o */
    public static class o implements AbstractC2868Q1.a {

        /* renamed from: a */
        private final C2742L0 f21265a;

        /* renamed from: com.yandex.metrica.impl.ob.G2$o$a */
        public static class a implements FilenameFilter {

            /* renamed from: a */
            final Iterable<FilenameFilter> f21266a;

            public a(Iterable<FilenameFilter> iterable) {
                this.f21266a = iterable;
            }

            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                Iterator<FilenameFilter> it = this.f21266a.iterator();
                while (it.hasNext()) {
                    if (it.next().accept(file, str)) {
                        return true;
                    }
                }
                return false;
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.G2$o$b */
        public static class b implements FilenameFilter {

            /* renamed from: a */
            private final FilenameFilter f21267a;

            public b(FilenameFilter filenameFilter) {
                this.f21267a = filenameFilter;
            }

            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                if (!str.startsWith("db_metrica_")) {
                    return false;
                }
                try {
                    FilenameFilter filenameFilter = this.f21267a;
                    if (str.endsWith("-journal")) {
                        str = str.replace("-journal", "");
                    }
                    return filenameFilter.accept(file, str);
                } catch (Throwable unused) {
                    return false;
                }
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.G2$o$c */
        public static class c implements FilenameFilter {
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.endsWith("null");
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.G2$o$d */
        public static class d implements FilenameFilter {

            /* renamed from: a */
            private final String f21268a;

            public d(String str) {
                this.f21268a = str;
            }

            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return !str.contains(this.f21268a);
            }
        }

        public o() {
            this(new C2742L0());
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC2868Q1.a
        /* renamed from: a */
        public void mo14155a(Context context) {
            for (File file : m14156b(context) == null ? new File[0] : m14156b(context).listFiles(new a(Arrays.asList(new b(new d(context.getPackageName())), new b(new c()))))) {
                try {
                    if (!file.delete()) {
                        ((C2809Nh) C2834Oh.m14711a()).reportEvent("Can not delete file", new JSONObject().put("fileName", file.getName()).toString());
                    }
                } catch (Throwable th) {
                    ((C2809Nh) C2834Oh.m14711a()).reportError("Can not delete file", th);
                }
            }
            new C2701J9(C2877Qa.m14815a(context).m14838q(), context.getPackageName()).m14261e(new C3754ye("LAST_STARTUP_CLIDS_SAVE_TIME", null).m17234a()).m14258c();
        }

        /* renamed from: b */
        public File m14156b(Context context) {
            if (C2968U2.m15243a(21)) {
                return context.getNoBackupFilesDir();
            }
            File filesDir = context.getFilesDir();
            if (filesDir != null) {
                return this.f21265a.m14503b(filesDir.getParentFile(), "databases");
            }
            return null;
        }

        public o(C2742L0 c2742l0) {
            this.f21265a = c2742l0;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$r */
    public static class r implements AbstractC2868Q1.a {

        /* renamed from: a */
        private final C2876Q9 f21279a;

        public r(C2876Q9 c2876q9) {
            this.f21279a = c2876q9;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC2868Q1.a
        /* renamed from: a */
        public void mo14155a(Context context) {
            C2506Be c2506Be = (C2506Be) this.f21279a.m14814b();
            ArrayList arrayList = new ArrayList();
            C2506Be.a aVar = null;
            for (C2506Be.a aVar2 : c2506Be.f20931b) {
                if (aVar2.f20934c != EnumC2567E0.APP) {
                    arrayList.add(aVar2);
                } else if (aVar == null) {
                    arrayList.add(aVar2);
                    aVar = aVar2;
                }
            }
            this.f21279a.m14813a(new C2506Be(c2506Be.f20930a, arrayList));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$s */
    public static class s implements AbstractC2868Q1.a {

        /* renamed from: a */
        private final InterfaceC3748y8 f21280a;

        public s(InterfaceC3748y8 interfaceC3748y8) {
            this.f21280a = interfaceC3748y8;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC2868Q1.a
        /* renamed from: a */
        public void mo14155a(Context context) {
            this.f21280a.mo14698b("notification_cache_state");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$t */
    public static class t implements AbstractC2868Q1.a {

        /* renamed from: a */
        private final C2676I9 f21281a;

        public t(C2676I9 c2676i9) {
            this.f21281a = c2676i9;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC2868Q1.a
        /* renamed from: a */
        public void mo14155a(Context context) {
            this.f21281a.m14261e(new C3754ye("REFERRER", null).m17234a()).m14261e(new C3754ye("REFERRER_HOLDER_STATE", null).m17234a()).m14258c();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$u */
    public static class u implements AbstractC2868Q1.a {
        @Override // com.yandex.metrica.impl.p022ob.AbstractC2868Q1.a
        /* renamed from: a */
        public void mo14155a(Context context) {
            C2876Q9 c2876q9Mo14607b = InterfaceC2777Ma.b.m14608a(C2909Ri.class).mo14607b(context);
            C2909Ri c2909Ri = (C2909Ri) c2876q9Mo14607b.m14814b();
            c2876q9Mo14607b.m14813a(c2909Ri.m15023a(c2909Ri.f22225s).m15053a(c2909Ri.f22229w > 0).m15059b(true).m15054a());
        }
    }

    public C2619G2(Context context, C2676I9 c2676i9, C2650H8 c2650h8) {
        this.f21242b = context;
        this.f21241a = c2676i9;
        this.f21243c = c2650h8;
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$q */
    public static class q implements AbstractC2868Q1.a {

        /* renamed from: a */
        private final C2676I9 f21271a;

        /* renamed from: b */
        private final C2876Q9 f21272b;

        /* renamed from: c */
        private final C2650H8 f21273c;

        /* renamed from: d */
        private final String f21274d;

        /* renamed from: e */
        private final String f21275e;

        /* renamed from: f */
        private final String f21276f;

        /* renamed from: g */
        private final String f21277g;

        /* renamed from: h */
        private final String f21278h;

        public q(C2676I9 c2676i9, C2876Q9 c2876q9) {
            this(c2676i9, c2876q9, C2842P0.m14728i().m14754y().m14471a());
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC2868Q1.a
        /* renamed from: a */
        public void mo14155a(Context context) {
            C2909Ri c2909Ri = (C2909Ri) this.f21272b.m14814b();
            C3650ue c3650ue = new C3650ue(context);
            int iM16918f = c3650ue.m16918f();
            if (iM16918f == -1) {
                iM16918f = this.f21271a.m14305a(-1);
            }
            this.f21273c.m14237a(c2909Ri.f22208b, c2909Ri.f22210d, this.f21271a.m14248a(this.f21274d, (String) null), this.f21271a.m14256b(this.f21275e) ? Boolean.valueOf(this.f21271a.m14250a(this.f21275e, false)) : null, this.f21271a.m14256b(this.f21276f) ? Long.valueOf(this.f21271a.m14247a(this.f21276f, -1L)) : null, this.f21271a.m14256b(this.f21277g) ? Long.valueOf(this.f21271a.m14247a(this.f21277g, -1L)) : null, this.f21271a.m14256b(this.f21278h) ? Long.valueOf(this.f21271a.m14247a(this.f21278h, -1L)) : null, iM16918f == -1 ? null : Integer.valueOf(iM16918f));
            this.f21271a.m14331i().m14261e(this.f21274d).m14261e(this.f21275e).m14261e(this.f21276f).m14261e(this.f21277g).m14261e(this.f21278h).m14258c();
            c3650ue.m16920h().m16690b();
        }

        public q(C2676I9 c2676i9, C2876Q9 c2876q9, C2650H8 c2650h8) {
            this.f21274d = new C3754ye("REFERRER_FROM_PLAY_SERVICES").m17234a();
            this.f21275e = new C3754ye("REFERRER_CHECKED").m17234a();
            this.f21276f = new C3754ye("L_ID").m17234a();
            this.f21277g = new C3754ye("LBS_ID").m17234a();
            this.f21278h = new C3754ye("L_REQ_NUM").m17234a();
            this.f21271a = c2676i9;
            this.f21272b = c2876q9;
            this.f21273c = c2650h8;
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2868Q1
    /* renamed from: a */
    public SparseArray<AbstractC2868Q1.a> mo14153a() {
        return new a();
    }

    /* renamed from: com.yandex.metrica.impl.ob.G2$p */
    public static class p implements AbstractC2868Q1.a {

        /* renamed from: a */
        private final C2876Q9 f21269a;

        /* renamed from: b */
        private final C2586Ej f21270b;

        public p(Context context, C2876Q9 c2876q9) {
            this(c2876q9, C2611Fj.m14141a(context).m14143b(context, new C2711Jj(new C2885Qi.b(context))));
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC2868Q1.a
        /* renamed from: a */
        public void mo14155a(Context context) {
            String str = this.f21270b.m14045a().f23462a;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            C2909Ri c2909Ri = (C2909Ri) this.f21269a.m14814b();
            if (str.equals(c2909Ri.f22207a)) {
                return;
            }
            this.f21269a.m14813a(c2909Ri.m15023a(c2909Ri.f22225s).m15080l(str).m15054a());
        }

        public p(C2876Q9 c2876q9, C2586Ej c2586Ej) {
            this.f21269a = c2876q9;
            this.f21270b = c2586Ej;
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2868Q1
    /* renamed from: a */
    public int mo14152a(C3650ue c3650ue) {
        int iM16918f = c3650ue.m16918f();
        if (iM16918f == -1) {
            iM16918f = this.f21241a.m14305a(-1);
        }
        return iM16918f == -1 ? this.f21243c.m14242e() : iM16918f;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2868Q1
    /* renamed from: a */
    public void mo14154a(C3650ue c3650ue, int i2) {
        this.f21243c.m14233a(i2);
    }
}
