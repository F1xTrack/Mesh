package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.qg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3030qg {
    private final Map<String, C3005pg> a = new HashMap();
    private final C3104tg b;
    private final InterfaceExecutorC3086sn c;

    /* renamed from: com.yandex.metrica.impl.ob.qg$a */
    public class a implements Runnable {
        final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3104tg c3104tg = C3030qg.this.b;
            Context context = this.a;
            c3104tg.getClass();
            C2892l3.a(context);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.qg$b */
    public static class b {
        private static final C3030qg a = new C3030qg(Y.g().c(), new C3104tg());
    }

    public C3030qg(InterfaceExecutorC3086sn interfaceExecutorC3086sn, C3104tg c3104tg) {
        this.c = interfaceExecutorC3086sn;
        this.b = c3104tg;
    }

    private C3005pg b(Context context, String str) {
        this.b.getClass();
        if (C2892l3.k() == null) {
            ((C3061rn) this.c).execute(new a(context));
        }
        C3005pg c3005pg = new C3005pg(this.c, context, str);
        this.a.put(str, c3005pg);
        return c3005pg;
    }

    public static C3030qg a() {
        return b.a;
    }

    public C3005pg a(Context context, String str) {
        C3005pg c3005pg = this.a.get(str);
        if (c3005pg == null) {
            synchronized (this.a) {
                try {
                    c3005pg = this.a.get(str);
                    if (c3005pg == null) {
                        C3005pg c3005pgB = b(context, str);
                        c3005pgB.d(str);
                        c3005pg = c3005pgB;
                    }
                } finally {
                }
            }
        }
        return c3005pg;
    }

    public C3005pg a(Context context, com.yandex.metrica.u uVar) {
        C3005pg c3005pg = this.a.get(uVar.apiKey);
        if (c3005pg == null) {
            synchronized (this.a) {
                try {
                    c3005pg = this.a.get(uVar.apiKey);
                    if (c3005pg == null) {
                        C3005pg c3005pgB = b(context, uVar.apiKey);
                        c3005pgB.a(uVar);
                        c3005pg = c3005pgB;
                    }
                } finally {
                }
            }
        }
        return c3005pg;
    }
}
