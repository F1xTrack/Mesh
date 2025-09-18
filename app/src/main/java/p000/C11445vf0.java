package p000;

import java.lang.reflect.Type;

/* renamed from: vf0 */
/* loaded from: classes2.dex */
public final class C11445vf0 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f44463e;

    /* renamed from: f */
    public final /* synthetic */ C11572wf0 f44464f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11445vf0(C11572wf0 c11572wf0, int i) {
        super(0);
        this.f44463e = i;
        this.f44464f = c11572wf0;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        switch (this.f44463e) {
            case 0:
                AP0 ap0 = this.f44464f.f45017b;
                Type type = ap0 != null ? (Type) ap0.invoke() : null;
                O90.m5965c(type);
                return VO0.m8435c(type);
            default:
                C11572wf0 c11572wf0 = this.f44464f;
                return c11572wf0.m25670b(c11572wf0.f45016a);
        }
    }
}
