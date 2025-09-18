package defpackage;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

/* renamed from: mn0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5951mn0 extends AbstractC6876rd1 {
    public final C7640vd1 a;
    public final C7640vd1 b;
    public final InterfaceC1490Sw0 c;
    public final /* synthetic */ C7689vu d;

    public C5951mn0(C7689vu c7689vu, C2226aw c2226aw, Type type, AbstractC6876rd1 abstractC6876rd1, Type type2, AbstractC6876rd1 abstractC6876rd12, InterfaceC1490Sw0 interfaceC1490Sw0) {
        this.d = c7689vu;
        this.a = new C7640vd1(c2226aw, abstractC6876rd1, type);
        this.b = new C7640vd1(c2226aw, abstractC6876rd12, type2);
        this.c = interfaceC1490Sw0;
    }

    @Override // defpackage.AbstractC6876rd1
    public final Object a(C8206yc0 c8206yc0) throws IOException {
        int iP0 = c8206yc0.p0();
        if (iP0 == 9) {
            c8206yc0.i0();
            return null;
        }
        Map map = (Map) this.c.c();
        C7640vd1 c7640vd1 = this.b;
        C7640vd1 c7640vd12 = this.a;
        AbstractC6876rd1 abstractC6876rd1 = (AbstractC6876rd1) c7640vd1.c;
        AbstractC6876rd1 abstractC6876rd12 = (AbstractC6876rd1) c7640vd12.c;
        if (iP0 == 1) {
            c8206yc0.m();
            while (c8206yc0.J()) {
                c8206yc0.m();
                Object objA = abstractC6876rd12.a(c8206yc0);
                if (map.put(objA, abstractC6876rd1.a(c8206yc0)) != null) {
                    throw new C6682qc0("duplicate key: " + objA);
                }
                c8206yc0.w();
            }
            c8206yc0.w();
        } else {
            c8206yc0.n();
            while (c8206yc0.J()) {
                C5396jt0.h.getClass();
                int iP = c8206yc0.h;
                if (iP == 0) {
                    iP = c8206yc0.p();
                }
                if (iP == 13) {
                    c8206yc0.h = 9;
                } else if (iP == 12) {
                    c8206yc0.h = 8;
                } else {
                    if (iP != 14) {
                        throw new IllegalStateException("Expected a name but was " + NX.t(c8206yc0.p0()) + c8206yc0.U());
                    }
                    c8206yc0.h = 10;
                }
                Object objA2 = abstractC6876rd12.a(c8206yc0);
                if (map.put(objA2, abstractC6876rd1.a(c8206yc0)) != null) {
                    throw new C6682qc0("duplicate key: " + objA2);
                }
            }
            c8206yc0.x();
        }
        return map;
    }

    @Override // defpackage.AbstractC6876rd1
    public final void b(C0807Kc0 c0807Kc0, Object obj) throws IOException {
        Map map = (Map) obj;
        if (map == null) {
            c0807Kc0.J();
            return;
        }
        this.d.getClass();
        C7640vd1 c7640vd1 = this.b;
        c0807Kc0.o();
        for (Map.Entry entry : map.entrySet()) {
            c0807Kc0.A(String.valueOf(entry.getKey()));
            c7640vd1.b(c0807Kc0, entry.getValue());
        }
        c0807Kc0.x();
    }
}
