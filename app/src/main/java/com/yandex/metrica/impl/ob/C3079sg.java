package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.impl.interact.CellularNetworkInfo;
import com.yandex.metrica.p;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.sg */
/* loaded from: classes2.dex */
public class C3079sg {
    private final C3104tg a;
    private final InterfaceExecutorC3086sn b;
    private final C2930mg c;
    private final uo<Context> d;
    private final uo<String> e;
    private final Pm f;

    /* renamed from: com.yandex.metrica.impl.ob.sg$a */
    public class a extends Km {
        final /* synthetic */ Context a;
        final /* synthetic */ IIdentifierCallback b;
        final /* synthetic */ List c;

        public a(Context context, IIdentifierCallback iIdentifierCallback, List list) {
            this.a = context;
            this.b = iIdentifierCallback;
            this.c = list;
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() throws Exception {
            C3104tg c3104tg = C3079sg.this.a;
            Context context = this.a;
            c3104tg.getClass();
            C2892l3.a(context).a(this.b, this.c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.sg$b */
    public class b extends Jm<String> {
        public b() {
        }

        @Override // com.yandex.metrica.impl.ob.Jm
        public String a() throws Exception {
            C3079sg.this.a.getClass();
            C2892l3 c2892l3K = C2892l3.k();
            if (c2892l3K == null) {
                return null;
            }
            return c2892l3K.e().a();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.sg$c */
    public class c extends Jm<Boolean> {
        public c() {
        }

        @Override // com.yandex.metrica.impl.ob.Jm
        public Boolean a() throws Exception {
            C3079sg.this.a.getClass();
            C2892l3 c2892l3K = C2892l3.k();
            if (c2892l3K == null) {
                return null;
            }
            return c2892l3K.e().b();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.sg$d */
    public class d extends Km {
        final /* synthetic */ int a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ Map d;

        public d(int i, String str, String str2, Map map) {
            this.a = i;
            this.b = str;
            this.c = str2;
            this.d = map;
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() throws Exception {
            C3079sg.b(C3079sg.this).a(this.a, this.b, this.c, this.d);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.sg$e */
    public class e extends Km {
        public e() {
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() throws Exception {
            C3079sg.b(C3079sg.this).sendEventsBuffer();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.sg$f */
    public class f extends Km {
        final /* synthetic */ boolean a;

        public f(boolean z) {
            this.a = z;
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() throws Exception {
            C3104tg c3104tg = C3079sg.this.a;
            boolean z = this.a;
            c3104tg.getClass();
            C2892l3.b(z);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.sg$g */
    public class g extends Km {
        final /* synthetic */ p.Ucc a;
        final /* synthetic */ boolean b;

        /* renamed from: com.yandex.metrica.impl.ob.sg$g$a */
        public class a implements Ol {
            public a() {
            }

            @Override // com.yandex.metrica.impl.ob.Ol
            public void onError(String str) {
                g.this.a.onError(str);
            }

            @Override // com.yandex.metrica.impl.ob.Ol
            public void onResult(JSONObject jSONObject) {
                g.this.a.onResult(jSONObject);
            }
        }

        public g(p.Ucc ucc, boolean z) {
            this.a = ucc;
            this.b = z;
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() throws Exception {
            C3079sg.b(C3079sg.this).a(new a(), this.b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.sg$h */
    public class h extends Km {
        final /* synthetic */ Context a;
        final /* synthetic */ Map b;

        public h(Context context, Map map) {
            this.a = context;
            this.b = map;
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() throws Exception {
            C3104tg c3104tg = C3079sg.this.a;
            Context context = this.a;
            c3104tg.getClass();
            C2892l3.a(context).a(this.b);
        }
    }

    public C3079sg(InterfaceExecutorC3086sn interfaceExecutorC3086sn, C3104tg c3104tg) {
        this(interfaceExecutorC3086sn, c3104tg, new C2930mg(c3104tg), new ro(new qo("Context")), new ro(new qo("Event name")), new Pm());
    }

    public Future<String> b() {
        return ((C3061rn) this.b).a(new b());
    }

    public Future<Boolean> c() {
        return ((C3061rn) this.b).a(new c());
    }

    public String d(Context context) {
        this.d.a(context);
        this.a.getClass();
        return C2892l3.a(context).a();
    }

    public C3079sg(InterfaceExecutorC3086sn interfaceExecutorC3086sn, C3104tg c3104tg, C2930mg c2930mg, uo<Context> uoVar, uo<String> uoVar2, Pm pm) {
        this.a = c3104tg;
        this.b = interfaceExecutorC3086sn;
        this.c = c2930mg;
        this.d = uoVar;
        this.e = uoVar2;
        this.f = pm;
    }

    public void a(Context context, IIdentifierCallback iIdentifierCallback, List<String> list) {
        this.d.a(context);
        ((C3061rn) this.b).execute(new a(context, iIdentifierCallback, list));
    }

    public String b(Context context) {
        this.d.a(context);
        this.a.getClass();
        return C2892l3.a(context).c();
    }

    public String c(Context context) {
        this.d.a(context);
        return context.getPackageName();
    }

    public boolean a() {
        this.a.getClass();
        return C2892l3.h();
    }

    public void d() {
        this.c.a(null);
        ((C3061rn) this.b).execute(new e());
    }

    public static U0 b(C3079sg c3079sg) {
        c3079sg.a.getClass();
        return C2892l3.k().d().b();
    }

    public String a(Context context) {
        this.d.a(context);
        return this.f.a(context) ? new CellularNetworkInfo(context).getCelluralInfo() : "";
    }

    public void a(int i, String str, String str2, Map<String, String> map) {
        this.c.a(null);
        this.e.a(str);
        ((C3061rn) this.b).execute(new d(i, str, str2, map));
    }

    public void a(Context context, boolean z) {
        this.d.a(context);
        ((C3061rn) this.b).execute(new f(z));
    }

    public void a(p.Ucc ucc, boolean z) {
        this.a.getClass();
        if (!C2892l3.i()) {
            ucc.onError("Main API key is not activated");
            return;
        }
        ((C3061rn) this.b).execute(new g(ucc, z));
    }

    public void a(Context context, Map<String, Object> map) {
        this.d.a(context);
        ((C3061rn) this.b).execute(new h(context, map));
    }
}
