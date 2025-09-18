package p000;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class SF1 {

    /* renamed from: c */
    public static final SF1 f10657c = new SF1(0);

    /* renamed from: a */
    public final C10126lL1 f10658a = new C10126lL1();

    /* renamed from: b */
    public boolean f10659b;

    public SF1() {
    }

    /* renamed from: a */
    public static int m7198a(DG1 dg1, Object obj) {
        dg1.getClass();
        WE1.m8717b(0 << 3);
        if (EnumC10002kN1.f36470b == null) {
            Charset charset = AbstractC11398vH1.f44320a;
        }
        EnumC10514oN1 enumC10514oN1 = EnumC10514oN1.f38970a;
        throw null;
    }

    /* renamed from: h */
    public static boolean m7199h(Map.Entry entry) {
        ((DG1) entry.getKey()).getClass();
        throw null;
    }

    /* renamed from: i */
    public static final int m7200i(Map.Entry entry) {
        DG1 dg1 = (DG1) entry.getKey();
        entry.getValue();
        dg1.getClass();
        throw null;
    }

    /* renamed from: b */
    public final SF1 clone() {
        SF1 sf1 = new SF1();
        C10126lL1 c10126lL1 = this.f10658a;
        int i = c10126lL1.f37018b;
        for (int i2 = 0; i2 < i; i2++) {
            C10894rL1 c10894rL1M22409d = c10126lL1.m22409d(i2);
            sf1.m7204e((DG1) c10894rL1M22409d.f41606a, c10894rL1M22409d.f41607b);
        }
        for (Map.Entry entry : c10126lL1.m22407b()) {
            sf1.m7204e((DG1) entry.getKey(), entry.getValue());
        }
        return sf1;
    }

    /* renamed from: c */
    public final Iterator m7202c() {
        C10126lL1 c10126lL1 = this.f10658a;
        return c10126lL1.isEmpty() ? Collections.emptyIterator() : ((C6724r8) c10126lL1.entrySet()).iterator();
    }

    /* renamed from: d */
    public final void m7203d() {
        if (this.f10659b) {
            return;
        }
        C10126lL1 c10126lL1 = this.f10658a;
        int i = c10126lL1.f37018b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = c10126lL1.m22409d(i2).f41607b;
            if (obj instanceof QG1) {
                QG1 qg1 = (QG1) obj;
                qg1.getClass();
                C9482gJ1.f27672c.m18426a(qg1.getClass()).mo7661a(qg1);
                qg1.m6624g();
            }
        }
        if (!c10126lL1.f37020d) {
            for (int i3 = 0; i3 < c10126lL1.f37018b; i3++) {
                ((DG1) c10126lL1.m22409d(i3).f41606a).getClass();
            }
            Iterator it = c10126lL1.m22407b().iterator();
            while (it.hasNext()) {
                ((DG1) ((Map.Entry) it.next()).getKey()).getClass();
            }
        }
        if (!c10126lL1.f37020d) {
            c10126lL1.f37019c = c10126lL1.f37019c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(c10126lL1.f37019c);
            c10126lL1.f37022f = c10126lL1.f37022f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(c10126lL1.f37022f);
            c10126lL1.f37020d = true;
        }
        this.f10659b = true;
    }

    /* renamed from: e */
    public final void m7204e(DG1 dg1, Object obj) {
        dg1.getClass();
        Charset charset = AbstractC11398vH1.f44320a;
        obj.getClass();
        EnumC10002kN1 enumC10002kN1 = EnumC10002kN1.f36470b;
        EnumC10514oN1 enumC10514oN1 = EnumC10514oN1.f38970a;
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SF1) {
            return this.f10658a.equals(((SF1) obj).f10658a);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m7205f() {
        C10126lL1 c10126lL1 = this.f10658a;
        int i = c10126lL1.f37018b;
        for (int i2 = 0; i2 < i; i2++) {
            if (!m7199h(c10126lL1.m22409d(i2))) {
                return false;
            }
        }
        Iterator it = c10126lL1.m22407b().iterator();
        while (it.hasNext()) {
            if (!m7199h((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final void m7206g(Map.Entry entry) {
        DG1 dg1 = (DG1) entry.getKey();
        entry.getValue();
        dg1.getClass();
        throw null;
    }

    public final int hashCode() {
        return this.f10658a.hashCode();
    }

    public SF1(int i) {
        m7203d();
        m7203d();
    }
}
