package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Yy */
/* loaded from: classes2.dex */
public abstract class AbstractC1963Yy extends AbstractC1594Uf {
    private final InterfaceC0173Bz _context;
    private transient InterfaceC1729Vy intercepted;

    public AbstractC1963Yy(InterfaceC1729Vy interfaceC1729Vy, InterfaceC0173Bz interfaceC0173Bz) {
        super(interfaceC1729Vy);
        this._context = interfaceC0173Bz;
    }

    @Override // defpackage.InterfaceC1729Vy
    public InterfaceC0173Bz getContext() {
        InterfaceC0173Bz interfaceC0173Bz = this._context;
        O90.c(interfaceC0173Bz);
        return interfaceC0173Bz;
    }

    public final InterfaceC1729Vy intercepted() {
        InterfaceC1729Vy c7961xK = this.intercepted;
        if (c7961xK == null) {
            InterfaceC2041Zy interfaceC2041Zy = (InterfaceC2041Zy) getContext().g(C0240Cv0.c);
            c7961xK = interfaceC2041Zy != null ? new C7961xK((AbstractC0485Fz) interfaceC2041Zy, this) : this;
            this.intercepted = c7961xK;
        }
        return c7961xK;
    }

    @Override // defpackage.AbstractC1594Uf
    public void releaseIntercepted() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC1729Vy interfaceC1729Vy = this.intercepted;
        if (interfaceC1729Vy != null && interfaceC1729Vy != this) {
            InterfaceC8464zz interfaceC8464zzG = getContext().g(C0240Cv0.c);
            O90.c(interfaceC8464zzG);
            C7961xK c7961xK = (C7961xK) interfaceC1729Vy;
            do {
                atomicReferenceFieldUpdater = C7961xK.h;
            } while (atomicReferenceFieldUpdater.get(c7961xK) == EU0.b);
            Object obj = atomicReferenceFieldUpdater.get(c7961xK);
            C0767Jp c0767Jp = obj instanceof C0767Jp ? (C0767Jp) obj : null;
            if (c0767Jp != null) {
                c0767Jp.o();
            }
        }
        this.intercepted = C5974mv.b;
    }

    public AbstractC1963Yy(InterfaceC1729Vy interfaceC1729Vy) {
        this(interfaceC1729Vy, interfaceC1729Vy != null ? interfaceC1729Vy.getContext() : null);
    }
}
