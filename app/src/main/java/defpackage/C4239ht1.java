package defpackage;

import android.content.Context;
import java.util.Map;

/* renamed from: ht1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4239ht1 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ C5534kb1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4239ht1(C5534kb1 c5534kb1, int i) {
        super(0);
        this.e = i;
        this.f = c5534kb1;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        switch (this.e) {
            case 0:
                Context context = (Context) this.f.a;
                O90.f(context, "context");
                return C5958mp1.c.j(context).b;
            case 1:
                C5534kb1 c5534kb1 = this.f;
                return new C4242hu1((C0787Jv1) ((F71) c5534kb1.d).getValue(), (C1101Nw1) ((F71) c5534kb1.g).getValue());
            case 2:
                C5534kb1 c5534kb12 = this.f;
                return new C0787Jv1((C1017Mu1) ((F71) c5534kb12.e).getValue(), (C1397Rr0) ((F71) c5534kb12.f).getValue());
            default:
                return new C1101Nw1(new C5806m12(23), new C6446pN0(11, (Map) this.f.b), new C0240Cv0(24));
        }
    }
}
