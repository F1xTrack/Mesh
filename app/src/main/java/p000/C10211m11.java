package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: m11 */
/* loaded from: classes2.dex */
public final class C10211m11 implements InterfaceC10467o11, InterfaceC0651KK {

    /* renamed from: a */
    public final AtomicBoolean f37407a = new AtomicBoolean();

    /* renamed from: b */
    public final AtomicReference f37408b = new AtomicReference(null);

    /* renamed from: c */
    public final AtomicReference f37409c = new AtomicReference(null);

    /* renamed from: d */
    public final /* synthetic */ InterfaceC10467o11 f37410d;

    /* renamed from: e */
    public final /* synthetic */ C9699i11 f37411e;

    public C10211m11(InterfaceC10467o11 interfaceC10467o11, C9699i11 c9699i11) {
        this.f37410d = interfaceC10467o11;
        this.f37411e = c9699i11;
    }

    @Override // p000.InterfaceC0651KK
    /* renamed from: a */
    public final void mo4596a() {
        if (this.f37407a.compareAndSet(false, true)) {
            InterfaceC0651KK interfaceC0651KK = (InterfaceC0651KK) this.f37408b.getAndSet(null);
            if (interfaceC0651KK != null) {
                interfaceC0651KK.mo4596a();
            }
            InterfaceC0651KK interfaceC0651KK2 = (InterfaceC0651KK) this.f37409c.getAndSet(null);
            if (interfaceC0651KK2 != null) {
                interfaceC0651KK2.mo4596a();
            }
        }
    }

    @Override // p000.InterfaceC10467o11
    /* renamed from: e0 */
    public final void mo1066e0(InterfaceC0651KK interfaceC0651KK) {
        AtomicReference atomicReference = this.f37408b;
        while (!atomicReference.compareAndSet(null, interfaceC0651KK) && atomicReference.get() == null) {
        }
        if (this.f37407a.get()) {
            InterfaceC0651KK interfaceC0651KK2 = (InterfaceC0651KK) atomicReference.getAndSet(null);
            if (interfaceC0651KK2 != null) {
                interfaceC0651KK2.mo4596a();
            }
            InterfaceC0651KK interfaceC0651KK3 = (InterfaceC0651KK) this.f37409c.getAndSet(null);
            if (interfaceC0651KK3 != null) {
                interfaceC0651KK3.mo4596a();
            }
        }
        this.f37410d.mo1066e0(this);
    }

    @Override // p000.InterfaceC10467o11
    public final void onError(Throwable th) {
        O90.m5968f(th, "e");
        if (this.f37407a.compareAndSet(false, true)) {
            this.f37410d.onError(th);
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [Vg0, nZ] */
    @Override // p000.InterfaceC10467o11
    public final void onSuccess(Object obj) {
        Object objM7015b;
        if (this.f37407a.compareAndSet(false, true)) {
            C9699i11 c9699i11 = this.f37411e;
            C10083l11 c10083l11 = new C10083l11(c9699i11);
            this.f37409c.set(c10083l11);
            C4238iN c4238iN = new C4238iN(c10083l11, 26, this.f37410d);
            AtomicBoolean atomicBoolean = c10083l11.f36821a;
            if (atomicBoolean.get()) {
                return;
            }
            try {
                objM7015b = (AbstractC8926c11) c9699i11.f28761c.invoke(obj);
            } catch (Throwable th) {
                objM7015b = RQ1.m7015b(th);
            }
            if (!(objM7015b instanceof OS0)) {
                AbstractC8926c11 abstractC8926c11 = (AbstractC8926c11) objM7015b;
                if (!atomicBoolean.get()) {
                    abstractC8926c11.mo10562a(c4238iN);
                }
            }
            Throwable thM6365a = PS0.m6365a(objM7015b);
            if (thM6365a == null || atomicBoolean.get()) {
                return;
            }
            c4238iN.onError(thM6365a);
        }
    }
}
