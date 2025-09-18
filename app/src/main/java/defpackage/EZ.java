package defpackage;

/* loaded from: classes2.dex */
public abstract class EZ extends AbstractC8422zl implements InterfaceC7435uZ, InterfaceC6878re0 {
    private final int arity;
    private final int flags;

    public EZ(int i) {
        this(i, AbstractC8422zl.NO_RECEIVER, null, null, null, 0);
    }

    @Override // defpackage.AbstractC8422zl
    public InterfaceC1277Qd0 computeReflected() {
        return BP0.a.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EZ) {
            EZ ez = (EZ) obj;
            return getName().equals(ez.getName()) && getSignature().equals(ez.getSignature()) && this.flags == ez.flags && this.arity == ez.arity && O90.a(getBoundReceiver(), ez.getBoundReceiver()) && O90.a(getOwner(), ez.getOwner());
        }
        if (obj instanceof InterfaceC6878re0) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // defpackage.InterfaceC7435uZ
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // defpackage.InterfaceC6878re0
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // defpackage.InterfaceC6878re0
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // defpackage.InterfaceC6878re0
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // defpackage.InterfaceC6878re0
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // defpackage.InterfaceC1277Qd0, defpackage.InterfaceC6878re0
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC1277Qd0 interfaceC1277Qd0Compute = compute();
        if (interfaceC1277Qd0Compute != this) {
            return interfaceC1277Qd0Compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public EZ(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    @Override // defpackage.AbstractC8422zl
    public InterfaceC6878re0 getReflected() {
        InterfaceC1277Qd0 interfaceC1277Qd0Compute = compute();
        if (interfaceC1277Qd0Compute != this) {
            return (InterfaceC6878re0) interfaceC1277Qd0Compute;
        }
        throw new C1420Rz();
    }

    public EZ(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = 0;
    }
}
