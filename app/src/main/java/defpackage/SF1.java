package defpackage;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class SF1 {
    public static final SF1 c = new SF1(0);
    public final C5677lL1 a = new C5677lL1();
    public boolean b;

    public SF1() {
    }

    public static int a(DG1 dg1, Object obj) {
        dg1.getClass();
        WE1.b(0 << 3);
        if (EnumC5492kN1.b == null) {
            Charset charset = AbstractC7574vH1.a;
        }
        EnumC6256oN1 enumC6256oN1 = EnumC6256oN1.a;
        throw null;
    }

    public static boolean h(Map.Entry entry) {
        ((DG1) entry.getKey()).getClass();
        throw null;
    }

    public static final int i(Map.Entry entry) {
        DG1 dg1 = (DG1) entry.getKey();
        entry.getValue();
        dg1.getClass();
        throw null;
    }

    /* renamed from: b */
    public final SF1 clone() {
        SF1 sf1 = new SF1();
        C5677lL1 c5677lL1 = this.a;
        int i = c5677lL1.b;
        for (int i2 = 0; i2 < i; i2++) {
            C6822rL1 c6822rL1D = c5677lL1.d(i2);
            sf1.e((DG1) c6822rL1D.a, c6822rL1D.b);
        }
        for (Map.Entry entry : c5677lL1.b()) {
            sf1.e((DG1) entry.getKey(), entry.getValue());
        }
        return sf1;
    }

    public final Iterator c() {
        C5677lL1 c5677lL1 = this.a;
        return c5677lL1.isEmpty() ? Collections.emptyIterator() : ((C6781r8) c5677lL1.entrySet()).iterator();
    }

    public final void d() {
        if (this.b) {
            return;
        }
        C5677lL1 c5677lL1 = this.a;
        int i = c5677lL1.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = c5677lL1.d(i2).b;
            if (obj instanceof QG1) {
                QG1 qg1 = (QG1) obj;
                qg1.getClass();
                C3940gJ1.c.a(qg1.getClass()).a(qg1);
                qg1.g();
            }
        }
        if (!c5677lL1.d) {
            for (int i3 = 0; i3 < c5677lL1.b; i3++) {
                ((DG1) c5677lL1.d(i3).a).getClass();
            }
            Iterator it = c5677lL1.b().iterator();
            while (it.hasNext()) {
                ((DG1) ((Map.Entry) it.next()).getKey()).getClass();
            }
        }
        if (!c5677lL1.d) {
            c5677lL1.c = c5677lL1.c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(c5677lL1.c);
            c5677lL1.f = c5677lL1.f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(c5677lL1.f);
            c5677lL1.d = true;
        }
        this.b = true;
    }

    public final void e(DG1 dg1, Object obj) {
        dg1.getClass();
        Charset charset = AbstractC7574vH1.a;
        obj.getClass();
        EnumC5492kN1 enumC5492kN1 = EnumC5492kN1.b;
        EnumC6256oN1 enumC6256oN1 = EnumC6256oN1.a;
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SF1) {
            return this.a.equals(((SF1) obj).a);
        }
        return false;
    }

    public final boolean f() {
        C5677lL1 c5677lL1 = this.a;
        int i = c5677lL1.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (!h(c5677lL1.d(i2))) {
                return false;
            }
        }
        Iterator it = c5677lL1.b().iterator();
        while (it.hasNext()) {
            if (!h((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void g(Map.Entry entry) {
        DG1 dg1 = (DG1) entry.getKey();
        entry.getValue();
        dg1.getClass();
        throw null;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public SF1(int i) {
        d();
        d();
    }
}
