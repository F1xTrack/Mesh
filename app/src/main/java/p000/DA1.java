package p000;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class DA1 extends AbstractC0638K7 {

    /* renamed from: a */
    public final C9110dP1 f1878a;

    /* renamed from: b */
    public final FR1 f1879b;

    public DA1(C9110dP1 c9110dP1) {
        Preconditions.checkNotNull(c9110dP1);
        this.f1878a = c9110dP1;
        FR1 fr1 = c9110dP1.f26046p;
        C9110dP1.m17590c(fr1);
        this.f1879b = fr1;
    }

    @Override // p000.InterfaceC8859bU1
    /* renamed from: b */
    public final int mo1571b(String str) {
        Preconditions.checkNotEmpty(str);
        return 25;
    }

    @Override // p000.InterfaceC8859bU1
    /* renamed from: c */
    public final void mo1572c(String str, String str2, Bundle bundle) {
        FR1 fr1 = this.f1878a.f26046p;
        C9110dP1.m17590c(fr1);
        fr1.m2639I1(str, str2, bundle);
    }

    @Override // p000.InterfaceC8859bU1
    /* renamed from: d */
    public final void mo1573d(String str) {
        C9110dP1 c9110dP1 = this.f1878a;
        C7933Lx1 c7933Lx1 = c9110dP1.f26047q;
        C9110dP1.m17591d(c7933Lx1);
        c7933Lx1.m5165E1(c9110dP1.f26044n.elapsedRealtime(), str);
    }

    @Override // p000.InterfaceC8859bU1
    /* renamed from: e */
    public final void mo1574e(String str) {
        C9110dP1 c9110dP1 = this.f1878a;
        C7933Lx1 c7933Lx1 = c9110dP1.f26047q;
        C9110dP1.m17591d(c7933Lx1);
        c7933Lx1.m5161A1(c9110dP1.f26044n.elapsedRealtime(), str);
    }

    @Override // p000.InterfaceC8859bU1
    /* renamed from: f */
    public final Map mo1575f(String str, String str2, boolean z) {
        FR1 fr1 = this.f1879b;
        if (fr1.mo6071p0().m25414G1()) {
            fr1.mo6070n().f8378g.m24555d("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        if (C4049fN.m18225p()) {
            fr1.mo6070n().f8378g.m24555d("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        C11412vO1 c11412vO1 = ((C9110dP1) fr1.f11615b).f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.m25416z1(atomicReference, 5000L, "get user properties", new QM1(fr1, atomicReference, str, str2, z, 2));
        List<C9898jZ1> list = (List) atomicReference.get();
        if (list == null) {
            OL1 ol1Mo6070n = fr1.mo6070n();
            ol1Mo6070n.f8378g.m24554c(Boolean.valueOf(z), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.emptyMap();
        }
        C7119x8 c7119x8 = new C7119x8(list.size());
        for (C9898jZ1 c9898jZ1 : list) {
            Object objZza = c9898jZ1.zza();
            if (objZza != null) {
                c7119x8.put(c9898jZ1.f35239b, objZza);
            }
        }
        return c7119x8;
    }

    @Override // p000.InterfaceC8859bU1
    /* renamed from: g */
    public final void mo1576g(String str, String str2, Bundle bundle) {
        FR1 fr1 = this.f1879b;
        fr1.m2640J1(str, str2, bundle, true, true, ((C9110dP1) fr1.f11615b).f26044n.currentTimeMillis());
    }

    @Override // p000.InterfaceC8859bU1
    /* renamed from: h */
    public final List mo1577h(String str, String str2) {
        FR1 fr1 = this.f1879b;
        if (fr1.mo6071p0().m25414G1()) {
            fr1.mo6070n().f8378g.m24555d("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (C4049fN.m18225p()) {
            fr1.mo6070n().f8378g.m24555d("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        C11412vO1 c11412vO1 = ((C9110dP1) fr1.f11615b).f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.m25416z1(atomicReference, 5000L, "get conditional user properties", new RunnableC6704qp(fr1, atomicReference, str, str2, 8, false));
        List list = (List) atomicReference.get();
        if (list != null) {
            return C10282mZ1.m22855q2(list);
        }
        fr1.mo6070n().f8378g.m24554c(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // p000.InterfaceC8859bU1
    /* renamed from: m */
    public final String mo1578m() {
        JU1 ju1 = ((C9110dP1) this.f1879b.f11615b).f26045o;
        C9110dP1.m17590c(ju1);
        CU1 cu1 = ju1.f5547d;
        if (cu1 != null) {
            return cu1.f1400b;
        }
        return null;
    }

    @Override // p000.InterfaceC8859bU1
    /* renamed from: n */
    public final String mo1579n() {
        return (String) this.f1879b.f3209h.get();
    }

    @Override // p000.InterfaceC8859bU1
    public final void zza(Bundle bundle) {
        FR1 fr1 = this.f1879b;
        fr1.m2636F1(bundle, ((C9110dP1) fr1.f11615b).f26044n.currentTimeMillis());
    }

    @Override // p000.InterfaceC8859bU1
    public final long zzf() {
        C10282mZ1 c10282mZ1 = this.f1878a.f26042l;
        C9110dP1.m17589b(c10282mZ1);
        return c10282mZ1.m22865F2();
    }

    @Override // p000.InterfaceC8859bU1
    public final String zzg() {
        return (String) this.f1879b.f3209h.get();
    }

    @Override // p000.InterfaceC8859bU1
    public final String zzi() {
        JU1 ju1 = ((C9110dP1) this.f1879b.f11615b).f26045o;
        C9110dP1.m17590c(ju1);
        CU1 cu1 = ju1.f5547d;
        if (cu1 != null) {
            return cu1.f1399a;
        }
        return null;
    }
}
