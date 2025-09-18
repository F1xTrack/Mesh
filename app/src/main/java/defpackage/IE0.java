package defpackage;

/* loaded from: classes2.dex */
public abstract class IE0 extends AbstractC8422zl implements InterfaceC5927mf0 {
    public final boolean a;

    public IE0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.a = (i & 2) == 2;
    }

    @Override // defpackage.AbstractC8422zl
    public final InterfaceC1277Qd0 compute() {
        return this.a ? this : super.compute();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IE0) {
            IE0 ie0 = (IE0) obj;
            return getOwner().equals(ie0.getOwner()) && getName().equals(ie0.getName()) && getSignature().equals(ie0.getSignature()) && O90.a(getBoundReceiver(), ie0.getBoundReceiver());
        }
        if (obj instanceof InterfaceC5927mf0) {
            return obj.equals(compute());
        }
        return false;
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // defpackage.AbstractC8422zl
    /* renamed from: k */
    public final InterfaceC5927mf0 getReflected() {
        if (this.a) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        InterfaceC1277Qd0 interfaceC1277Qd0Compute = compute();
        if (interfaceC1277Qd0Compute != this) {
            return (InterfaceC5927mf0) interfaceC1277Qd0Compute;
        }
        throw new C1420Rz();
    }

    public final String toString() {
        InterfaceC1277Qd0 interfaceC1277Qd0Compute = compute();
        if (interfaceC1277Qd0Compute != this) {
            return interfaceC1277Qd0Compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
