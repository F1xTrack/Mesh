package defpackage;

import java.lang.reflect.Type;

/* renamed from: vf0 */
/* loaded from: classes2.dex */
public final class C7645vf0 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ C7835wf0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7645vf0(C7835wf0 c7835wf0, int i) {
        super(0);
        this.e = i;
        this.f = c7835wf0;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        switch (this.e) {
            case 0:
                AP0 ap0 = this.f.b;
                Type type = ap0 != null ? (Type) ap0.invoke() : null;
                O90.c(type);
                return VO0.c(type);
            default:
                C7835wf0 c7835wf0 = this.f;
                return c7835wf0.b(c7835wf0.a);
        }
    }
}
