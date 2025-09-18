package p000;

import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.PromiseImpl;

/* renamed from: j9 */
/* loaded from: classes2.dex */
public final class C6219j9 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f34938e;

    /* renamed from: f */
    public final /* synthetic */ Object f34939f;

    /* renamed from: g */
    public final /* synthetic */ Object f34940g;

    /* renamed from: h */
    public final /* synthetic */ Object f34941h;

    /* renamed from: i */
    public final /* synthetic */ Object f34942i;

    /* renamed from: j */
    public final /* synthetic */ Object f34943j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6219j9(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        super(0);
        this.f34938e = i;
        this.f34939f = obj;
        this.f34940g = obj2;
        this.f34941h = obj3;
        this.f34942i = obj4;
        this.f34943j = obj5;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        CodedException codedException;
        switch (this.f34938e) {
            case 0:
                PromiseImpl promiseImpl = (PromiseImpl) this.f34939f;
                try {
                    C6599p9 c6599p9 = (C6599p9) this.f34940g;
                    String str = (String) this.f34941h;
                    try {
                        c6599p9.mo3551f((Object[]) this.f34942i, promiseImpl, (C0134C7) this.f34943j);
                    } catch (Throwable th) {
                        throw new C6281k8(c6599p9.f7489a, str, !(th instanceof CodedException) ? th instanceof AbstractC6266ju ? new CodedException(((AbstractC6266ju) th).mo2811a(), th.getMessage(), th.getCause()) : new UnexpectedException(th.toString(), th) : (CodedException) th);
                    }
                } catch (Throwable th2) {
                    if (promiseImpl.f26961a) {
                        throw th2;
                    }
                    if (th2 instanceof CodedException) {
                        codedException = (CodedException) th2;
                    } else {
                        codedException = th2 instanceof AbstractC6266ju ? new CodedException(((AbstractC6266ju) th2).mo2811a(), th2.getMessage(), th2.getCause()) : new UnexpectedException(th2.toString(), th2);
                    }
                    FM1.m2585l(promiseImpl, codedException);
                }
                return C8313Tf1.f11463a;
            default:
                ES1 es1 = (ES1) ((C8539Xo1) this.f34939f).f13983d;
                InterfaceC0873Ns interfaceC0873NsMo1962a = ((InterfaceC8101Pd1) this.f34942i).mo1962a();
                return es1.m2301w((InterfaceC10292me1) this.f34940g, C11818yb0.m26174a(C11818yb0.m26174a((C11818yb0) this.f34941h, null, false, null, interfaceC0873NsMo1962a != null ? interfaceC0873NsMo1962a.mo1492m() : null, 31), null, ((C9749iP0) this.f34943j).m19029d(), null, null, 59));
        }
    }
}
