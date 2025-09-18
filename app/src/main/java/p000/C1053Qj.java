package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: Qj */
/* loaded from: classes2.dex */
public final class C1053Qj implements InterfaceC7102ws {

    /* renamed from: a */
    public final C8582Yk0 f9753a;

    /* renamed from: b */
    public final C7454Cs0 f9754b;

    public C1053Qj(C8582Yk0 c8582Yk0, C7454Cs0 c7454Cs0) {
        O90.m5968f(c7454Cs0, "module");
        this.f9753a = c8582Yk0;
        this.f9754b = c7454Cs0;
    }

    @Override // p000.InterfaceC7102ws
    /* renamed from: a */
    public final InterfaceC6976us mo6737a(C0055As c0055As) {
        O90.m5968f(c0055As, "classId");
        if (c0055As.f453c || !c0055As.f452b.m4657e().m4656d()) {
            return null;
        }
        String strM4654b = c0055As.m364h().m4654b();
        if (!AbstractC11374v51.m25351p(strM4654b, "Function", false)) {
            return null;
        }
        C0664KX c0664kxM363g = c0055As.m363g();
        O90.m5967e(c0664kxM363g, "getPackageFqName(...)");
        C0728LZ c0728lzM5399a = C0791MZ.f7224c.m5399a(c0664kxM363g, strM4654b);
        if (c0728lzM5399a == null) {
            return null;
        }
        List list = (List) WS1.m8763b(((C8524Xh0) this.f9754b.mo895C0(c0664kxM363g)).f13924f, C8524Xh0.f13921i[0]);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C1493Xj) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (AbstractC7167xu.m25957C(arrayList2) != null) {
            throw new ClassCastException();
        }
        return new C7083wZ(this.f9753a, (C1493Xj) AbstractC7167xu.m25955A(arrayList), c0728lzM5399a.f6712a, c0728lzM5399a.f6713b);
    }

    @Override // p000.InterfaceC7102ws
    /* renamed from: b */
    public final Collection mo6738b(C0664KX c0664kx) {
        O90.m5968f(c0664kx, "packageFqName");
        return C1156SN.f10705a;
    }

    @Override // p000.InterfaceC7102ws
    /* renamed from: c */
    public final boolean mo6739c(C0664KX c0664kx, C8340Tt0 c8340Tt0) {
        O90.m5968f(c0664kx, "packageFqName");
        O90.m5968f(c8340Tt0, "name");
        String strM7801b = c8340Tt0.m7801b();
        O90.m5967e(strM7801b, "asString(...)");
        return (D51.m1556o(strM7801b, "Function", false) || D51.m1556o(strM7801b, "KFunction", false) || D51.m1556o(strM7801b, "SuspendFunction", false) || D51.m1556o(strM7801b, "KSuspendFunction", false)) && C0791MZ.f7224c.m5399a(c0664kx, strM7801b) != null;
    }
}
