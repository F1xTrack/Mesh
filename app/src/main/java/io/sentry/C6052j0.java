package io.sentry;

import io.sentry.vendor.gson.stream.C6184a;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC7222ym;
import p000.H30;

/* renamed from: io.sentry.j0 */
/* loaded from: classes2.dex */
public final class C6052j0 {

    /* renamed from: a */
    public final ArrayList f34215a;

    public C6052j0() {
        this.f34215a = new ArrayList();
    }

    /* renamed from: a */
    public InterfaceC6013e0 m21795a() {
        ArrayList arrayList = this.f34215a;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (InterfaceC6013e0) AbstractC7222ym.m26228e(1, arrayList);
    }

    /* renamed from: b */
    public boolean m21796b() {
        if (this.f34215a.size() == 1) {
            return true;
        }
        InterfaceC6013e0 interfaceC6013e0M21795a = m21795a();
        m21799e();
        if (!(m21795a() instanceof C6024h0)) {
            if (!(m21795a() instanceof C6018f0)) {
                return false;
            }
            C6018f0 c6018f0 = (C6018f0) m21795a();
            if (interfaceC6013e0M21795a == null || c6018f0 == null) {
                return false;
            }
            c6018f0.f34152a.add(interfaceC6013e0M21795a.getValue());
            return false;
        }
        C6024h0 c6024h0 = (C6024h0) m21795a();
        m21799e();
        C6021g0 c6021g0 = (C6021g0) m21795a();
        if (c6024h0 == null || interfaceC6013e0M21795a == null || c6021g0 == null) {
            return false;
        }
        c6021g0.f34162a.put(c6024h0.f34172a, interfaceC6013e0M21795a.getValue());
        return false;
    }

    /* renamed from: c */
    public boolean m21797c(InterfaceC6009d0 interfaceC6009d0) {
        Object objMo3252d = interfaceC6009d0.mo3252d();
        if (m21795a() == null && objMo3252d != null) {
            this.f34215a.add(new C6038i0(objMo3252d));
            return true;
        }
        if (m21795a() instanceof C6024h0) {
            C6024h0 c6024h0 = (C6024h0) m21795a();
            m21799e();
            ((C6021g0) m21795a()).f34162a.put(c6024h0.f34172a, objMo3252d);
            return false;
        }
        if (!(m21795a() instanceof C6018f0)) {
            return false;
        }
        ((C6018f0) m21795a()).f34152a.add(objMo3252d);
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: d */
    public void m21798d(final C6055k0 c6055k0) {
        boolean zM21796b;
        int i = AbstractC5986c0.f34089a[((C6184a) c6055k0.f34221b).m21910o0().ordinal()];
        ArrayList arrayList = this.f34215a;
        C6184a c6184a = (C6184a) c6055k0.f34221b;
        switch (i) {
            case 1:
                c6184a.m21905m();
                arrayList.add(new C6018f0());
                zM21796b = false;
                break;
            case 2:
                c6184a.m21917w();
                zM21796b = m21796b();
                break;
            case 3:
                c6055k0.m21817n();
                arrayList.add(new C6021g0());
                zM21796b = false;
                break;
            case 4:
                c6055k0.m21819o();
                zM21796b = m21796b();
                break;
            case 5:
                arrayList.add(new C6024h0(c6184a.m21901d0()));
                zM21796b = false;
                break;
            case 6:
                final int i2 = 0;
                zM21796b = m21797c(new InterfaceC6009d0() { // from class: io.sentry.b0
                    @Override // io.sentry.InterfaceC6009d0
                    /* renamed from: d */
                    public final Object mo3252d() {
                        switch (i2) {
                            case 0:
                                return ((C6184a) c6055k0.f34221b).m21906m0();
                            default:
                                return Boolean.valueOf(((C6184a) c6055k0.f34221b).m21897U());
                        }
                    }
                });
                break;
            case 7:
                zM21796b = m21797c(new H30(this, 22, c6055k0));
                break;
            case 8:
                final int i3 = 1;
                zM21796b = m21797c(new InterfaceC6009d0() { // from class: io.sentry.b0
                    @Override // io.sentry.InterfaceC6009d0
                    /* renamed from: d */
                    public final Object mo3252d() {
                        switch (i3) {
                            case 0:
                                return ((C6184a) c6055k0.f34221b).m21906m0();
                            default:
                                return Boolean.valueOf(((C6184a) c6055k0.f34221b).m21897U());
                        }
                    }
                });
                break;
            case 9:
                c6184a.m21903h0();
                zM21796b = m21797c(new C5754C(1));
                break;
            case 10:
                zM21796b = true;
                break;
            default:
                zM21796b = false;
                break;
        }
        if (zM21796b) {
            return;
        }
        m21798d(c6055k0);
    }

    /* renamed from: e */
    public void m21799e() {
        ArrayList arrayList = this.f34215a;
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
    }

    public C6052j0(List list) {
        this.f34215a = new ArrayList(list == null ? new ArrayList(0) : list);
    }
}
