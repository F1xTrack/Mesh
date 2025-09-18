package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import com.yandex.metrica.C3802u;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.qg */
/* loaded from: classes2.dex */
public class C3548qg {

    /* renamed from: a */
    private final Map<String, C3522pg> f24546a = new HashMap();

    /* renamed from: b */
    private final C3626tg f24547b;

    /* renamed from: c */
    private final InterfaceExecutorC3607sn f24548c;

    /* renamed from: com.yandex.metrica.impl.ob.qg$a */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f24549a;

        public a(Context context) {
            this.f24549a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3626tg c3626tg = C3548qg.this.f24547b;
            Context context = this.f24549a;
            c3626tg.getClass();
            C3405l3.m16349a(context);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.qg$b */
    public static class b {

        /* renamed from: a */
        private static final C3548qg f24551a = new C3548qg(C3065Y.m15442g().m15445c(), new C3626tg());
    }

    public C3548qg(InterfaceExecutorC3607sn interfaceExecutorC3607sn, C3626tg c3626tg) {
        this.f24548c = interfaceExecutorC3607sn;
        this.f24547b = c3626tg;
    }

    /* renamed from: b */
    private C3522pg m16622b(Context context, String str) {
        this.f24547b.getClass();
        if (C3405l3.m16363k() == null) {
            ((C3581rn) this.f24548c).execute(new a(context));
        }
        C3522pg c3522pg = new C3522pg(this.f24548c, context, str);
        this.f24546a.put(str, c3522pg);
        return c3522pg;
    }

    /* renamed from: a */
    public static C3548qg m16620a() {
        return b.f24551a;
    }

    /* renamed from: a */
    public C3522pg m16624a(Context context, String str) {
        C3522pg c3522pg = this.f24546a.get(str);
        if (c3522pg == null) {
            synchronized (this.f24546a) {
                try {
                    c3522pg = this.f24546a.get(str);
                    if (c3522pg == null) {
                        C3522pg c3522pgM16622b = m16622b(context, str);
                        c3522pgM16622b.m16587d(str);
                        c3522pg = c3522pgM16622b;
                    }
                } finally {
                }
            }
        }
        return c3522pg;
    }

    /* renamed from: a */
    public C3522pg m16623a(Context context, C3802u c3802u) {
        C3522pg c3522pg = this.f24546a.get(c3802u.apiKey);
        if (c3522pg == null) {
            synchronized (this.f24546a) {
                try {
                    c3522pg = this.f24546a.get(c3802u.apiKey);
                    if (c3522pg == null) {
                        C3522pg c3522pgM16622b = m16622b(context, c3802u.apiKey);
                        c3522pgM16622b.m16586a(c3802u);
                        c3522pg = c3522pgM16622b;
                    }
                } finally {
                }
            }
        }
        return c3522pg;
    }
}
