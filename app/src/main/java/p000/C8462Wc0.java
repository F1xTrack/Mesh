package p000;

import java.util.List;

/* renamed from: Wc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8462Wc0 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f13287e;

    /* renamed from: f */
    public final /* synthetic */ C8618Zc0 f13288f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8462Wc0(C8618Zc0 c8618Zc0, int i) {
        super(0);
        this.f13287e = i;
        this.f13288f = c8618Zc0;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        switch (this.f13287e) {
            case 0:
                return this.f13288f.f15020a.f1735e.m26498e();
            default:
                List listM26274e = AbstractC7230yu.m26274e(AbstractC0321F5.m2491a(this.f13288f.f15020a.f1735e, "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", "", "WARNING", true));
                return listM26274e.isEmpty() ? S20.f10539b : new C0636K5(listM26274e, 0);
        }
    }
}
