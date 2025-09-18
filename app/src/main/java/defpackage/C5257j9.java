package defpackage;

import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.PromiseImpl;

/* renamed from: j9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5257j9 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5257j9(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        super(0);
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
        this.j = obj5;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        CodedException codedException;
        switch (this.e) {
            case 0:
                PromiseImpl promiseImpl = (PromiseImpl) this.f;
                try {
                    C6403p9 c6403p9 = (C6403p9) this.g;
                    String str = (String) this.h;
                    try {
                        c6403p9.f((Object[]) this.i, promiseImpl, (C7) this.j);
                    } catch (Throwable th) {
                        throw new C5445k8(c6403p9.a, str, !(th instanceof CodedException) ? th instanceof AbstractC5398ju ? new CodedException(((AbstractC5398ju) th).a(), th.getMessage(), th.getCause()) : new UnexpectedException(th.toString(), th) : (CodedException) th);
                    }
                } catch (Throwable th2) {
                    if (promiseImpl.a) {
                        throw th2;
                    }
                    if (th2 instanceof CodedException) {
                        codedException = (CodedException) th2;
                    } else {
                        codedException = th2 instanceof AbstractC5398ju ? new CodedException(((AbstractC5398ju) th2).a(), th2.getMessage(), th2.getCause()) : new UnexpectedException(th2.toString(), th2);
                    }
                    FM1.l(promiseImpl, codedException);
                }
                return C1518Tf1.a;
            default:
                ES1 es1 = (ES1) ((C1857Xo1) this.f).d;
                InterfaceC1087Ns interfaceC1087NsA = ((InterfaceC1200Pd1) this.i).a();
                return es1.w((InterfaceC5925me1) this.g, C8203yb0.a(C8203yb0.a((C8203yb0) this.h, null, false, null, interfaceC1087NsA != null ? interfaceC1087NsA.m() : null, 31), null, ((C4339iP0) this.j).d(), null, null, 59));
        }
    }
}
