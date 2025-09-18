package defpackage;

import java.util.Map;

/* renamed from: Rd1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1356Rd1 extends AbstractC1434Sd1 {
    public final /* synthetic */ Map c;
    public final /* synthetic */ boolean d;

    public C1356Rd1(Map map, boolean z) {
        this.c = map;
        this.d = z;
    }

    @Override // defpackage.AbstractC7452ue1
    public final boolean a() {
        return this.d;
    }

    @Override // defpackage.AbstractC7452ue1
    public final boolean e() {
        return this.c.isEmpty();
    }

    @Override // defpackage.AbstractC1434Sd1
    public final AbstractC6689qe1 g(InterfaceC1200Pd1 interfaceC1200Pd1) {
        O90.f(interfaceC1200Pd1, "key");
        return (AbstractC6689qe1) this.c.get(interfaceC1200Pd1);
    }
}
