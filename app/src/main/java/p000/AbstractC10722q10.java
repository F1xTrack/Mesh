package p000;

import java.util.Collection;
import java.util.List;

/* renamed from: q10, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10722q10 extends AbstractC10187lq0 {

    /* renamed from: d */
    public static final /* synthetic */ InterfaceC10293mf0[] f40497d;

    /* renamed from: b */
    public final AbstractC0189D f40498b;

    /* renamed from: c */
    public final C8426Vk0 f40499c;

    static {
        IP0 ip0 = BP0.f799a;
        f40497d = new InterfaceC10293mf0[]{ip0.mo3850f(new GE0(ip0.mo3846b(AbstractC10722q10.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};
    }

    public AbstractC10722q10(Z41 z41, AbstractC0189D abstractC0189D) {
        O90.m5968f(z41, "storageManager");
        this.f40498b = abstractC0189D;
        this.f40499c = new C8426Vk0((C8582Yk0) z41, new C4090g1(23, this));
    }

    @Override // p000.AbstractC10187lq0, p000.InterfaceC10059kq0
    /* renamed from: a */
    public final Collection mo1769a(C8340Tt0 c8340Tt0, InterfaceC7700Hl0 interfaceC7700Hl0) {
        Collection collection;
        O90.m5968f(c8340Tt0, "name");
        List list = (List) WS1.m8763b(this.f40499c, f40497d[0]);
        if (list.isEmpty()) {
            collection = C0779MN.f7117a;
        } else {
            C11494w21 c11494w21 = new C11494w21();
            for (Object obj : list) {
                if ((obj instanceof U01) && O90.m5963a(((U01) obj).getName(), c8340Tt0)) {
                    c11494w21.add(obj);
                }
            }
            collection = c11494w21;
        }
        return collection;
    }

    @Override // p000.AbstractC10187lq0, p000.InterfaceC10059kq0
    /* renamed from: e */
    public final Collection mo1771e(C8340Tt0 c8340Tt0, EnumC11985zv0 enumC11985zv0) {
        Collection collection;
        O90.m5968f(c8340Tt0, "name");
        List list = (List) WS1.m8763b(this.f40499c, f40497d[0]);
        if (list.isEmpty()) {
            collection = C0779MN.f7117a;
        } else {
            C11494w21 c11494w21 = new C11494w21();
            for (Object obj : list) {
                if ((obj instanceof CE0) && O90.m5963a(((CE0) obj).getName(), c8340Tt0)) {
                    c11494w21.add(obj);
                }
            }
            collection = c11494w21;
        }
        return collection;
    }

    @Override // p000.AbstractC10187lq0, p000.InterfaceC9243eS0
    /* renamed from: g */
    public final Collection mo2108g(C4233iI c4233iI, InterfaceC6497nZ interfaceC6497nZ) {
        O90.m5968f(c4233iI, "kindFilter");
        O90.m5968f(interfaceC6497nZ, "nameFilter");
        return !c4233iI.m18998a(C4233iI.f29059n.f29066b) ? C0779MN.f7117a : (List) WS1.m8763b(this.f40499c, f40497d[0]);
    }

    /* renamed from: h */
    public abstract List mo10478h();
}
