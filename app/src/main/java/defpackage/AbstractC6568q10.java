package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: q10, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6568q10 extends AbstractC5769lq0 {
    public static final /* synthetic */ InterfaceC5927mf0[] d;
    public final D b;
    public final C1688Vk0 c;

    static {
        IP0 ip0 = BP0.a;
        d = new InterfaceC5927mf0[]{ip0.f(new GE0(ip0.b(AbstractC6568q10.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};
    }

    public AbstractC6568q10(Z41 z41, D d2) {
        O90.f(z41, "storageManager");
        this.b = d2;
        this.c = new C1688Vk0((C1922Yk0) z41, new C3881g1(23, this));
    }

    @Override // defpackage.AbstractC5769lq0, defpackage.InterfaceC5578kq0
    public final Collection a(C1559Tt0 c1559Tt0, InterfaceC0600Hl0 interfaceC0600Hl0) {
        Collection collection;
        O90.f(c1559Tt0, "name");
        List list = (List) WS1.b(this.c, d[0]);
        if (list.isEmpty()) {
            collection = MN.a;
        } else {
            C7718w21 c7718w21 = new C7718w21();
            for (Object obj : list) {
                if ((obj instanceof U01) && O90.a(((U01) obj).getName(), c1559Tt0)) {
                    c7718w21.add(obj);
                }
            }
            collection = c7718w21;
        }
        return collection;
    }

    @Override // defpackage.AbstractC5769lq0, defpackage.InterfaceC5578kq0
    public final Collection e(C1559Tt0 c1559Tt0, EnumC8453zv0 enumC8453zv0) {
        Collection collection;
        O90.f(c1559Tt0, "name");
        List list = (List) WS1.b(this.c, d[0]);
        if (list.isEmpty()) {
            collection = MN.a;
        } else {
            C7718w21 c7718w21 = new C7718w21();
            for (Object obj : list) {
                if ((obj instanceof CE0) && O90.a(((CE0) obj).getName(), c1559Tt0)) {
                    c7718w21.add(obj);
                }
            }
            collection = c7718w21;
        }
        return collection;
    }

    @Override // defpackage.AbstractC5769lq0, defpackage.InterfaceC3584eS0
    public final Collection g(C4317iI c4317iI, InterfaceC6099nZ interfaceC6099nZ) {
        O90.f(c4317iI, "kindFilter");
        O90.f(interfaceC6099nZ, "nameFilter");
        return !c4317iI.a(C4317iI.n.b) ? MN.a : (List) WS1.b(this.c, d[0]);
    }

    public abstract List h();
}
