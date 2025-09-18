package p000;

/* renamed from: EZ */
/* loaded from: classes2.dex */
public abstract class AbstractC0288EZ extends AbstractC7284zl implements InterfaceC6957uZ, InterfaceC10931re0 {
    private final int arity;
    private final int flags;

    public AbstractC0288EZ(int i) {
        this(i, AbstractC7284zl.NO_RECEIVER, null, null, null, 0);
    }

    @Override // p000.AbstractC7284zl
    public InterfaceC8152Qd0 computeReflected() {
        return BP0.f799a.mo3845a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0288EZ) {
            AbstractC0288EZ abstractC0288EZ = (AbstractC0288EZ) obj;
            return getName().equals(abstractC0288EZ.getName()) && getSignature().equals(abstractC0288EZ.getSignature()) && this.flags == abstractC0288EZ.flags && this.arity == abstractC0288EZ.arity && O90.m5963a(getBoundReceiver(), abstractC0288EZ.getBoundReceiver()) && O90.m5963a(getOwner(), abstractC0288EZ.getOwner());
        }
        if (obj instanceof InterfaceC10931re0) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // p000.InterfaceC6957uZ
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // p000.InterfaceC10931re0
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // p000.InterfaceC10931re0
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // p000.InterfaceC10931re0
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // p000.InterfaceC10931re0
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // p000.InterfaceC8152Qd0, p000.InterfaceC10931re0
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC8152Qd0 interfaceC8152Qd0Compute = compute();
        if (interfaceC8152Qd0Compute != this) {
            return interfaceC8152Qd0Compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public AbstractC0288EZ(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    @Override // p000.AbstractC7284zl
    public InterfaceC10931re0 getReflected() {
        InterfaceC8152Qd0 interfaceC8152Qd0Compute = compute();
        if (interfaceC8152Qd0Compute != this) {
            return (InterfaceC10931re0) interfaceC8152Qd0Compute;
        }
        throw new C1131Rz();
    }

    public AbstractC0288EZ(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = 0;
    }
}
