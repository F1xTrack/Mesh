package p000;

import java.util.Map;

/* renamed from: Rd1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8205Rd1 extends AbstractC8257Sd1 {

    /* renamed from: c */
    public final /* synthetic */ Map f10345c;

    /* renamed from: d */
    public final /* synthetic */ boolean f10346d;

    public C8205Rd1(Map map, boolean z) {
        this.f10345c = map;
        this.f10346d = z;
    }

    @Override // p000.AbstractC11316ue1
    /* renamed from: a */
    public final boolean mo7049a() {
        return this.f10346d;
    }

    @Override // p000.AbstractC11316ue1
    /* renamed from: e */
    public final boolean mo7050e() {
        return this.f10345c.isEmpty();
    }

    @Override // p000.AbstractC8257Sd1
    /* renamed from: g */
    public final AbstractC10804qe1 mo7051g(InterfaceC8101Pd1 interfaceC8101Pd1) {
        O90.m5968f(interfaceC8101Pd1, "key");
        return (AbstractC10804qe1) this.f10345c.get(interfaceC8101Pd1);
    }
}
