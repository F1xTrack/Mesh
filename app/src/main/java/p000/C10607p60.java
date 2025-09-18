package p000;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: p60 */
/* loaded from: classes.dex */
public final class C10607p60 extends AbstractC7207yX {

    /* renamed from: d */
    public final /* synthetic */ int f39839d = 1;

    /* renamed from: e */
    public final Object f39840e;

    public C10607p60(InterfaceC9457g70 interfaceC9457g70) {
        super(interfaceC9457g70);
        this.f39840e = new AtomicBoolean(false);
    }

    @Override // p000.AbstractC7207yX, java.lang.AutoCloseable
    public void close() {
        switch (this.f39839d) {
            case 1:
                if (!((AtomicBoolean) this.f39840e).getAndSet(true)) {
                    super.close();
                    break;
                }
                break;
            default:
                super.close();
                break;
        }
    }

    public C10607p60(InterfaceC9457g70 interfaceC9457g70, C10735q60 c10735q60) {
        super(interfaceC9457g70);
        this.f39840e = new WeakReference(c10735q60);
        m26161a(new C10479o60(0, this));
    }
}
