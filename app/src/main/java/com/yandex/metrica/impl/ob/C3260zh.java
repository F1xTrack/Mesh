package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.Ma;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.zh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3260zh {
    private InterfaceExecutorC3086sn a;
    private final Q9 b;
    private b c;
    private C2650ba d;
    private final Qd e;
    private final Nm f;
    private final Rd g;
    private String h;

    /* renamed from: com.yandex.metrica.impl.ob.zh$a */
    public class a implements Runnable {
        final /* synthetic */ C3235yh a;

        public a(C3235yh c3235yh) {
            this.a = c3235yh;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3260zh c3260zh = C3260zh.this;
            C3260zh.a(c3260zh, this.a, c3260zh.h);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.zh$b */
    public static class b {
        private final Ih a;

        public b() {
            this(new Ih());
        }

        public List<Hh> a(byte[] bArr) {
            ArrayList arrayList = new ArrayList();
            if (U2.a(bArr)) {
                return arrayList;
            }
            try {
                return this.a.a(new String(bArr, "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
                return arrayList;
            }
        }

        public b(Ih ih) {
            this.a = ih;
        }
    }

    public C3260zh(Context context, String str, InterfaceExecutorC3086sn interfaceExecutorC3086sn) {
        this(null, Ma.b.a(Eh.class).a(context), new b(), new Qd(), interfaceExecutorC3086sn, new C2650ba(), new Nm(), new Rd(context));
    }

    public void a(C3235yh c3235yh) {
        ((C3061rn) this.a).execute(new a(c3235yh));
    }

    public boolean b(Qi qi) {
        return this.h == null ? qi.L() != null : !r0.equals(qi.L());
    }

    public C3260zh(String str, Q9 q9, b bVar, Qd qd, InterfaceExecutorC3086sn interfaceExecutorC3086sn, C2650ba c2650ba, Nm nm, Rd rd) {
        this.h = str;
        this.b = q9;
        this.c = bVar;
        this.e = qd;
        this.a = interfaceExecutorC3086sn;
        this.d = c2650ba;
        this.f = nm;
        this.g = rd;
    }

    public static void a(C3260zh c3260zh, C3235yh c3235yh, String str) {
        if (!c3260zh.g.a() || str == null) {
            return;
        }
        c3260zh.e.a(str, new Ah(c3260zh, (Eh) c3260zh.b.b(), c3235yh));
    }

    public void a(Qi qi) {
        if (qi != null) {
            this.h = qi.L();
        }
    }
}
