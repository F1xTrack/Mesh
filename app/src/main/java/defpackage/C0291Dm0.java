package defpackage;

/* renamed from: Dm0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0291Dm0 extends C8425zm {
    public EO d;

    @Override // defpackage.C8425zm
    public final int d(Object obj) {
        InterfaceC5506kS0 interfaceC5506kS0 = (InterfaceC5506kS0) obj;
        if (interfaceC5506kS0 == null) {
            return 1;
        }
        return interfaceC5506kS0.getSize();
    }

    @Override // defpackage.C8425zm
    public final void e(Object obj, Object obj2) {
        InterfaceC5506kS0 interfaceC5506kS0 = (InterfaceC5506kS0) obj2;
        EO eo = this.d;
        if (eo == null || interfaceC5506kS0 == null) {
            return;
        }
        eo.e.l(interfaceC5506kS0, true);
    }

    public final void h(int i) {
        long j;
        if (i >= 40) {
            g(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (this) {
                j = this.a;
            }
            g(j / 2);
        }
    }
}
