package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: p60 */
/* loaded from: classes.dex */
public final class C6395p60 extends AbstractC8190yX {
    public final /* synthetic */ int d = 1;
    public final Object e;

    public C6395p60(InterfaceC3903g70 interfaceC3903g70) {
        super(interfaceC3903g70);
        this.e = new AtomicBoolean(false);
    }

    @Override // defpackage.AbstractC8190yX, java.lang.AutoCloseable
    public void close() {
        switch (this.d) {
            case 1:
                if (!((AtomicBoolean) this.e).getAndSet(true)) {
                    super.close();
                    break;
                }
                break;
            default:
                super.close();
                break;
        }
    }

    public C6395p60(InterfaceC3903g70 interfaceC3903g70, C6586q60 c6586q60) {
        super(interfaceC3903g70);
        this.e = new WeakReference(c6586q60);
        a(new C6204o60(0, this));
    }
}
