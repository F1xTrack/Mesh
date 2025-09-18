package p000;

/* loaded from: classes2.dex */
public abstract class IE0 extends AbstractC7284zl implements InterfaceC10293mf0 {

    /* renamed from: a */
    public final boolean f4846a;

    public IE0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.f4846a = (i & 2) == 2;
    }

    @Override // p000.AbstractC7284zl
    public final InterfaceC8152Qd0 compute() {
        return this.f4846a ? this : super.compute();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IE0) {
            IE0 ie0 = (IE0) obj;
            return getOwner().equals(ie0.getOwner()) && getName().equals(ie0.getName()) && getSignature().equals(ie0.getSignature()) && O90.m5963a(getBoundReceiver(), ie0.getBoundReceiver());
        }
        if (obj instanceof InterfaceC10293mf0) {
            return obj.equals(compute());
        }
        return false;
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // p000.AbstractC7284zl
    /* renamed from: k */
    public final InterfaceC10293mf0 getReflected() {
        if (this.f4846a) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        InterfaceC8152Qd0 interfaceC8152Qd0Compute = compute();
        if (interfaceC8152Qd0Compute != this) {
            return (InterfaceC10293mf0) interfaceC8152Qd0Compute;
        }
        throw new C1131Rz();
    }

    public final String toString() {
        InterfaceC8152Qd0 interfaceC8152Qd0Compute = compute();
        if (interfaceC8152Qd0Compute != this) {
            return interfaceC8152Qd0Compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
