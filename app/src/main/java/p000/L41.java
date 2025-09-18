package p000;

import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public final class L41 extends AbstractC10187lq0 {

    /* renamed from: f */
    public static final /* synthetic */ InterfaceC10293mf0[] f6478f;

    /* renamed from: b */
    public final C0460HI f6479b;

    /* renamed from: c */
    public final boolean f6480c;

    /* renamed from: d */
    public final C8426Vk0 f6481d;

    /* renamed from: e */
    public final C8426Vk0 f6482e;

    static {
        IP0 ip0 = BP0.f799a;
        f6478f = new InterfaceC10293mf0[]{ip0.mo3850f(new GE0(ip0.mo3846b(L41.class), "functions", "getFunctions()Ljava/util/List;")), ip0.mo3850f(new GE0(ip0.mo3846b(L41.class), "properties", "getProperties()Ljava/util/List;"))};
    }

    public L41(Z41 z41, C0460HI c0460hi, boolean z) {
        O90.m5968f(z41, "storageManager");
        this.f6479b = c0460hi;
        this.f6480c = z;
        EnumC0118Bs enumC0118Bs = EnumC0118Bs.f1060a;
        C8582Yk0 c8582Yk0 = (C8582Yk0) z41;
        this.f6481d = new C8426Vk0(c8582Yk0, new K41(this, 0));
        this.f6482e = new C8426Vk0(c8582Yk0, new K41(this, 1));
    }

    @Override // p000.AbstractC10187lq0, p000.InterfaceC10059kq0
    /* renamed from: a */
    public final Collection mo1769a(C8340Tt0 c8340Tt0, InterfaceC7700Hl0 interfaceC7700Hl0) {
        O90.m5968f(c8340Tt0, "name");
        List list = (List) WS1.m8763b(this.f6481d, f6478f[0]);
        C11494w21 c11494w21 = new C11494w21();
        for (Object obj : list) {
            if (O90.m5963a(((U01) obj).getName(), c8340Tt0)) {
                c11494w21.add(obj);
            }
        }
        return c11494w21;
    }

    @Override // p000.AbstractC10187lq0, p000.InterfaceC9243eS0
    /* renamed from: c */
    public final InterfaceC0873Ns mo1770c(C8340Tt0 c8340Tt0, InterfaceC7700Hl0 interfaceC7700Hl0) {
        O90.m5968f(c8340Tt0, "name");
        O90.m5968f(interfaceC7700Hl0, "location");
        return null;
    }

    @Override // p000.AbstractC10187lq0, p000.InterfaceC10059kq0
    /* renamed from: e */
    public final Collection mo1771e(C8340Tt0 c8340Tt0, EnumC11985zv0 enumC11985zv0) {
        O90.m5968f(c8340Tt0, "name");
        List list = (List) WS1.m8763b(this.f6482e, f6478f[1]);
        C11494w21 c11494w21 = new C11494w21();
        for (Object obj : list) {
            if (O90.m5963a(((CE0) obj).getName(), c8340Tt0)) {
                c11494w21.add(obj);
            }
        }
        return c11494w21;
    }

    @Override // p000.AbstractC10187lq0, p000.InterfaceC9243eS0
    /* renamed from: g */
    public final Collection mo2108g(C4233iI c4233iI, InterfaceC6497nZ interfaceC6497nZ) {
        O90.m5968f(c4233iI, "kindFilter");
        O90.m5968f(interfaceC6497nZ, "nameFilter");
        C8426Vk0 c8426Vk0 = this.f6481d;
        InterfaceC10293mf0[] interfaceC10293mf0Arr = f6478f;
        return AbstractC7167xu.m25968N((List) WS1.m8763b(c8426Vk0, interfaceC10293mf0Arr[0]), (List) WS1.m8763b(this.f6482e, interfaceC10293mf0Arr[1]));
    }
}
