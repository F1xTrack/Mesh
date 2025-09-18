package p000;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

/* renamed from: mn0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10309mn0 extends AbstractC10930rd1 {

    /* renamed from: a */
    public final C11442vd1 f37916a;

    /* renamed from: b */
    public final C11442vd1 f37917b;

    /* renamed from: c */
    public final InterfaceC8294Sw0 f37918c;

    /* renamed from: d */
    public final /* synthetic */ C7041vu f37919d;

    public C10309mn0(C7041vu c7041vu, C1753aw c1753aw, Type type, AbstractC10930rd1 abstractC10930rd1, Type type2, AbstractC10930rd1 abstractC10930rd12, InterfaceC8294Sw0 interfaceC8294Sw0) {
        this.f37919d = c7041vu;
        this.f37916a = new C11442vd1(c1753aw, abstractC10930rd1, type);
        this.f37917b = new C11442vd1(c1753aw, abstractC10930rd12, type2);
        this.f37918c = interfaceC8294Sw0;
    }

    @Override // p000.AbstractC10930rd1
    /* renamed from: a */
    public final Object mo480a(C11820yc0 c11820yc0) throws IOException {
        int iM26194p0 = c11820yc0.m26194p0();
        if (iM26194p0 == 9) {
            c11820yc0.m26186i0();
            return null;
        }
        Map map = (Map) this.f37918c.mo386c();
        C11442vd1 c11442vd1 = this.f37917b;
        C11442vd1 c11442vd12 = this.f37916a;
        AbstractC10930rd1 abstractC10930rd1 = (AbstractC10930rd1) c11442vd1.f44459c;
        AbstractC10930rd1 abstractC10930rd12 = (AbstractC10930rd1) c11442vd12.f44459c;
        if (iM26194p0 == 1) {
            c11820yc0.m26187m();
            while (c11820yc0.m26177J()) {
                c11820yc0.m26187m();
                Object objMo480a = abstractC10930rd12.mo480a(c11820yc0);
                if (map.put(objMo480a, abstractC10930rd1.mo480a(c11820yc0)) != null) {
                    throw new C10799qc0("duplicate key: " + objMo480a);
                }
                c11820yc0.m26201w();
            }
            c11820yc0.m26201w();
        } else {
            c11820yc0.m26189n();
            while (c11820yc0.m26177J()) {
                C9937jt0.f35443h.getClass();
                int iM26193p = c11820yc0.f46348h;
                if (iM26193p == 0) {
                    iM26193p = c11820yc0.m26193p();
                }
                if (iM26193p == 13) {
                    c11820yc0.f46348h = 9;
                } else if (iM26193p == 12) {
                    c11820yc0.f46348h = 8;
                } else {
                    if (iM26193p != 14) {
                        throw new IllegalStateException("Expected a name but was " + AbstractC0852NX.m5771t(c11820yc0.m26194p0()) + c11820yc0.m26179U());
                    }
                    c11820yc0.f46348h = 10;
                }
                Object objMo480a2 = abstractC10930rd12.mo480a(c11820yc0);
                if (map.put(objMo480a2, abstractC10930rd1.mo480a(c11820yc0)) != null) {
                    throw new C10799qc0("duplicate key: " + objMo480a2);
                }
            }
            c11820yc0.m26203x();
        }
        return map;
    }

    @Override // p000.AbstractC10930rd1
    /* renamed from: b */
    public final void mo481b(C7838Kc0 c7838Kc0, Object obj) throws IOException {
        Map map = (Map) obj;
        if (map == null) {
            c7838Kc0.m4680J();
            return;
        }
        this.f37919d.getClass();
        C11442vd1 c11442vd1 = this.f37917b;
        c7838Kc0.m4691o();
        for (Map.Entry entry : map.entrySet()) {
            c7838Kc0.m4678A(String.valueOf(entry.getKey()));
            c11442vd1.mo481b(c7838Kc0, entry.getValue());
        }
        c7838Kc0.m4694x();
    }
}
