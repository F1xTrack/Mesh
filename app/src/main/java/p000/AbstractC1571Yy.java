package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Yy */
/* loaded from: classes2.dex */
public abstract class AbstractC1571Yy extends AbstractC1300Uf {
    private final InterfaceC0125Bz _context;
    private transient InterfaceC1382Vy intercepted;

    public AbstractC1571Yy(InterfaceC1382Vy interfaceC1382Vy, InterfaceC0125Bz interfaceC0125Bz) {
        super(interfaceC1382Vy);
        this._context = interfaceC0125Bz;
    }

    @Override // p000.InterfaceC1382Vy
    public InterfaceC0125Bz getContext() {
        InterfaceC0125Bz interfaceC0125Bz = this._context;
        O90.m5965c(interfaceC0125Bz);
        return interfaceC0125Bz;
    }

    public final InterfaceC1382Vy intercepted() {
        InterfaceC1382Vy c7131xK = this.intercepted;
        if (c7131xK == null) {
            InterfaceC1634Zy interfaceC1634Zy = (InterfaceC1634Zy) getContext().mo937g(C7460Cv0.f1753c);
            c7131xK = interfaceC1634Zy != null ? new C7131xK((AbstractC0377Fz) interfaceC1634Zy, this) : this;
            this.intercepted = c7131xK;
        }
        return c7131xK;
    }

    @Override // p000.AbstractC1300Uf
    public void releaseIntercepted() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC1382Vy interfaceC1382Vy = this.intercepted;
        if (interfaceC1382Vy != null && interfaceC1382Vy != this) {
            InterfaceC7298zz interfaceC7298zzMo937g = getContext().mo937g(C7460Cv0.f1753c);
            O90.m5965c(interfaceC7298zzMo937g);
            C7131xK c7131xK = (C7131xK) interfaceC1382Vy;
            do {
                atomicReferenceFieldUpdater = C7131xK.f45546h;
            } while (atomicReferenceFieldUpdater.get(c7131xK) == EU0.f2720b);
            Object obj = atomicReferenceFieldUpdater.get(c7131xK);
            C0619Jp c0619Jp = obj instanceof C0619Jp ? (C0619Jp) obj : null;
            if (c0619Jp != null) {
                c0619Jp.m4435o();
            }
        }
        this.intercepted = C6456mv.f37990b;
    }

    public AbstractC1571Yy(InterfaceC1382Vy interfaceC1382Vy) {
        this(interfaceC1382Vy, interfaceC1382Vy != null ? interfaceC1382Vy.getContext() : null);
    }
}
