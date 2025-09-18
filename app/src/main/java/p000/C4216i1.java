package p000;

import java.util.List;

/* renamed from: i1 */
/* loaded from: classes2.dex */
public final class C4216i1 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f28750e;

    /* renamed from: f */
    public final /* synthetic */ Object f28751f;

    /* renamed from: g */
    public final /* synthetic */ Object f28752g;

    /* renamed from: h */
    public final /* synthetic */ Object f28753h;

    /* renamed from: i */
    public final /* synthetic */ Object f28754i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4216i1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(0);
        this.f28750e = i;
        this.f28751f = obj;
        this.f28752g = obj2;
        this.f28753h = obj3;
        this.f28754i = obj4;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        switch (this.f28750e) {
            case 0:
                return Boolean.valueOf(C6914tt.m25023r((C1622Zm) this.f28751f, ((InterfaceC0810Ms) this.f28752g).mo1077i((Z01) this.f28753h), (Z01) this.f28754i));
            default:
                List listM26274e = AbstractC7230yu.m26274e((NA0) this.f28751f);
                new RunnableC0780MO(new C11845yo1((C7863Ko1) this.f28752g, (String) this.f28753h, 2, listM26274e), (ES1) this.f28754i).run();
                return C8313Tf1.f11463a;
        }
    }
}
