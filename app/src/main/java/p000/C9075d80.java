package p000;

/* renamed from: d80 */
/* loaded from: classes.dex */
public final class C9075d80 implements InterfaceC4228iD {

    /* renamed from: a */
    public final int f25839a;

    /* renamed from: b */
    public final /* synthetic */ C9203e80 f25840b;

    public C9075d80(C9203e80 c9203e80, int i) {
        this.f25840b = c9203e80;
        this.f25839a = i;
    }

    @Override // p000.InterfaceC4228iD
    public final void onFailure(InterfaceC1523YC interfaceC1523YC) {
        C9203e80.m17866n(this.f25840b, this.f25839a, interfaceC1523YC);
    }

    @Override // p000.InterfaceC4228iD
    public final void onNewResult(InterfaceC1523YC interfaceC1523YC) {
        Throwable th;
        int i;
        if (!interfaceC1523YC.mo3662a()) {
            if (((AbstractC0504I) interfaceC1523YC).m3668g()) {
                C9203e80.m17866n(this.f25840b, this.f25839a, interfaceC1523YC);
                return;
            }
            return;
        }
        C9203e80 c9203e80 = this.f25840b;
        int i2 = this.f25839a;
        c9203e80.getClass();
        AbstractC0504I abstractC0504I = (AbstractC0504I) interfaceC1523YC;
        boolean zM3668g = abstractC0504I.m3668g();
        synchronized (c9203e80) {
            try {
                int i3 = c9203e80.f26558i;
                if (abstractC0504I == c9203e80.m17868p(i2) && i2 != c9203e80.f26558i) {
                    if (c9203e80.m17869q() == null || (zM3668g && i2 < c9203e80.f26558i)) {
                        c9203e80.f26558i = i2;
                        i = i2;
                    } else {
                        i = i3;
                    }
                    while (i3 > i) {
                        InterfaceC1523YC interfaceC1523YCM17867o = c9203e80.m17867o(i3);
                        if (interfaceC1523YCM17867o != null) {
                            interfaceC1523YCM17867o.close();
                        }
                        i3--;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (abstractC0504I == c9203e80.m17869q()) {
            c9203e80.m3672k(null, i2 == 0 && abstractC0504I.m3668g(), abstractC0504I.f4626a);
        }
        if (c9203e80.f26560k.incrementAndGet() != c9203e80.f26559j || (th = c9203e80.f26561l) == null) {
            return;
        }
        c9203e80.m3670i(th, c9203e80.f26562m);
    }

    @Override // p000.InterfaceC4228iD
    public final void onProgressUpdate(InterfaceC1523YC interfaceC1523YC) {
        if (this.f25839a == 0) {
            this.f25840b.m3671j(((AbstractC0504I) interfaceC1523YC).m3665d());
        }
    }

    @Override // p000.InterfaceC4228iD
    public final void onCancellation(InterfaceC1523YC interfaceC1523YC) {
    }
}
