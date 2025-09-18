package p000;

import android.content.Context;
import java.util.Map;

/* renamed from: ht1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9682ht1 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f28650e;

    /* renamed from: f */
    public final /* synthetic */ C10030kb1 f28651f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9682ht1(C10030kb1 c10030kb1, int i) {
        super(0);
        this.f28650e = i;
        this.f28651f = c10030kb1;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        switch (this.f28650e) {
            case 0:
                Context context = (Context) this.f28651f.f36561a;
                O90.m5968f(context, "context");
                return C10314mp1.f37956c.m1942j(context).f37959b;
            case 1:
                C10030kb1 c10030kb1 = this.f28651f;
                return new C9684hu1((C7825Jv1) ((F71) c10030kb1.f36564d).getValue(), (C8035Nw1) ((F71) c10030kb1.f36567g).getValue());
            case 2:
                C10030kb1 c10030kb12 = this.f28651f;
                return new C7825Jv1((C7979Mu1) ((F71) c10030kb12.f36565e).getValue(), (C8232Rr0) ((F71) c10030kb12.f36566f).getValue());
            default:
                return new C8035Nw1(new C10212m12(23), new C10641pN0(11, (Map) this.f28651f.f36562b), new C7460Cv0(24));
        }
    }
}
