package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class DA1 extends K7 {
    public final C3386dP1 a;
    public final FR1 b;

    public DA1(C3386dP1 c3386dP1) {
        Preconditions.checkNotNull(c3386dP1);
        this.a = c3386dP1;
        FR1 fr1 = c3386dP1.p;
        C3386dP1.c(fr1);
        this.b = fr1;
    }

    @Override // defpackage.InterfaceC2335bU1
    public final int b(String str) {
        Preconditions.checkNotEmpty(str);
        return 25;
    }

    @Override // defpackage.InterfaceC2335bU1
    public final void c(String str, String str2, Bundle bundle) {
        FR1 fr1 = this.a.p;
        C3386dP1.c(fr1);
        fr1.I1(str, str2, bundle);
    }

    @Override // defpackage.InterfaceC2335bU1
    public final void d(String str) {
        C3386dP1 c3386dP1 = this.a;
        C0948Lx1 c0948Lx1 = c3386dP1.q;
        C3386dP1.d(c0948Lx1);
        c0948Lx1.E1(c3386dP1.n.elapsedRealtime(), str);
    }

    @Override // defpackage.InterfaceC2335bU1
    public final void e(String str) {
        C3386dP1 c3386dP1 = this.a;
        C0948Lx1 c0948Lx1 = c3386dP1.q;
        C3386dP1.d(c0948Lx1);
        c0948Lx1.A1(c3386dP1.n.elapsedRealtime(), str);
    }

    @Override // defpackage.InterfaceC2335bU1
    public final Map f(String str, String str2, boolean z) {
        FR1 fr1 = this.b;
        if (fr1.p0().G1()) {
            fr1.n().g.d("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        if (C3759fN.p()) {
            fr1.n().g.d("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        C7595vO1 c7595vO1 = ((C3386dP1) fr1.b).j;
        C3386dP1.e(c7595vO1);
        c7595vO1.z1(atomicReference, 5000L, "get user properties", new QM1(fr1, atomicReference, str, str2, z, 2));
        List<C5337jZ1> list = (List) atomicReference.get();
        if (list == null) {
            OL1 ol1N = fr1.n();
            ol1N.g.c(Boolean.valueOf(z), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.emptyMap();
        }
        C7925x8 c7925x8 = new C7925x8(list.size());
        for (C5337jZ1 c5337jZ1 : list) {
            Object objZza = c5337jZ1.zza();
            if (objZza != null) {
                c7925x8.put(c5337jZ1.b, objZza);
            }
        }
        return c7925x8;
    }

    @Override // defpackage.InterfaceC2335bU1
    public final void g(String str, String str2, Bundle bundle) {
        FR1 fr1 = this.b;
        fr1.J1(str, str2, bundle, true, true, ((C3386dP1) fr1.b).n.currentTimeMillis());
    }

    @Override // defpackage.InterfaceC2335bU1
    public final List h(String str, String str2) {
        FR1 fr1 = this.b;
        if (fr1.p0().G1()) {
            fr1.n().g.d("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (C3759fN.p()) {
            fr1.n().g.d("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        C7595vO1 c7595vO1 = ((C3386dP1) fr1.b).j;
        C3386dP1.e(c7595vO1);
        c7595vO1.z1(atomicReference, 5000L, "get conditional user properties", new RunnableC6720qp(fr1, atomicReference, str, str2, 8, false));
        List list = (List) atomicReference.get();
        if (list != null) {
            return C5910mZ1.q2(list);
        }
        fr1.n().g.c(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // defpackage.InterfaceC2335bU1
    public final String m() {
        JU1 ju1 = ((C3386dP1) this.b.b).o;
        C3386dP1.c(ju1);
        CU1 cu1 = ju1.d;
        if (cu1 != null) {
            return cu1.b;
        }
        return null;
    }

    @Override // defpackage.InterfaceC2335bU1
    public final String n() {
        return (String) this.b.h.get();
    }

    @Override // defpackage.InterfaceC2335bU1
    public final void zza(Bundle bundle) {
        FR1 fr1 = this.b;
        fr1.F1(bundle, ((C3386dP1) fr1.b).n.currentTimeMillis());
    }

    @Override // defpackage.InterfaceC2335bU1
    public final long zzf() {
        C5910mZ1 c5910mZ1 = this.a.l;
        C3386dP1.b(c5910mZ1);
        return c5910mZ1.F2();
    }

    @Override // defpackage.InterfaceC2335bU1
    public final String zzg() {
        return (String) this.b.h.get();
    }

    @Override // defpackage.InterfaceC2335bU1
    public final String zzi() {
        JU1 ju1 = ((C3386dP1) this.b.b).o;
        C3386dP1.c(ju1);
        CU1 cu1 = ju1.d;
        if (cu1 != null) {
            return cu1.a;
        }
        return null;
    }
}
