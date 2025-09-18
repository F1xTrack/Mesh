package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: m11 */
/* loaded from: classes2.dex */
public final class C5805m11 implements InterfaceC6187o11, KK {
    public final AtomicBoolean a = new AtomicBoolean();
    public final AtomicReference b = new AtomicReference(null);
    public final AtomicReference c = new AtomicReference(null);
    public final /* synthetic */ InterfaceC6187o11 d;
    public final /* synthetic */ C4265i11 e;

    public C5805m11(InterfaceC6187o11 interfaceC6187o11, C4265i11 c4265i11) {
        this.d = interfaceC6187o11;
        this.e = c4265i11;
    }

    @Override // defpackage.KK
    public final void a() {
        if (this.a.compareAndSet(false, true)) {
            KK kk = (KK) this.b.getAndSet(null);
            if (kk != null) {
                kk.a();
            }
            KK kk2 = (KK) this.c.getAndSet(null);
            if (kk2 != null) {
                kk2.a();
            }
        }
    }

    @Override // defpackage.InterfaceC6187o11
    public final void e0(KK kk) {
        AtomicReference atomicReference = this.b;
        while (!atomicReference.compareAndSet(null, kk) && atomicReference.get() == null) {
        }
        if (this.a.get()) {
            KK kk2 = (KK) atomicReference.getAndSet(null);
            if (kk2 != null) {
                kk2.a();
            }
            KK kk3 = (KK) this.c.getAndSet(null);
            if (kk3 != null) {
                kk3.a();
            }
        }
        this.d.e0(this);
    }

    @Override // defpackage.InterfaceC6187o11
    public final void onError(Throwable th) {
        O90.f(th, "e");
        if (this.a.compareAndSet(false, true)) {
            this.d.onError(th);
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [Vg0, nZ] */
    @Override // defpackage.InterfaceC6187o11
    public final void onSuccess(Object obj) {
        Object objB;
        if (this.a.compareAndSet(false, true)) {
            C4265i11 c4265i11 = this.e;
            C5614l11 c5614l11 = new C5614l11(c4265i11);
            this.c.set(c5614l11);
            C4332iN c4332iN = new C4332iN(c5614l11, 26, this.d);
            AtomicBoolean atomicBoolean = c5614l11.a;
            if (atomicBoolean.get()) {
                return;
            }
            try {
                objB = (AbstractC2435c11) c4265i11.c.invoke(obj);
            } catch (Throwable th) {
                objB = RQ1.b(th);
            }
            if (!(objB instanceof OS0)) {
                AbstractC2435c11 abstractC2435c11 = (AbstractC2435c11) objB;
                if (!atomicBoolean.get()) {
                    abstractC2435c11.a(c4332iN);
                }
            }
            Throwable thA = PS0.a(objB);
            if (thA == null || atomicBoolean.get()) {
                return;
            }
            c4332iN.onError(thA);
        }
    }
}
