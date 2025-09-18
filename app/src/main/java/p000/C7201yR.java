package p000;

/* renamed from: yR */
/* loaded from: classes2.dex */
public final class C7201yR extends AbstractC1259U0 {

    /* renamed from: c */
    public final AbstractC0329FD f46256c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C7201yR(InterfaceC7032vl interfaceC7032vl, AbstractC7742Ig0 abstractC7742Ig0) {
        super(abstractC7742Ig0);
        if (abstractC7742Ig0 == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "receiverType", "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver", "<init>"));
        }
        this.f46256c = (AbstractC0329FD) interfaceC7032vl;
    }

    @Override // p000.AbstractC1259U0
    public final String toString() {
        return getType() + ": Ext {" + this.f46256c + "}";
    }
}
