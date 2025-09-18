package defpackage;

import java.util.List;

/* renamed from: Wc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1742Wc0 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ C1976Zc0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1742Wc0(C1976Zc0 c1976Zc0, int i) {
        super(0);
        this.e = i;
        this.f = c1976Zc0;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        switch (this.e) {
            case 0:
                return this.f.a.e.e();
            default:
                List listE = AbstractC8259yu.e(F5.a(this.f.a.e, "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", "", "WARNING", true));
                return listE.isEmpty() ? S20.b : new K5(listE, 0);
        }
    }
}
