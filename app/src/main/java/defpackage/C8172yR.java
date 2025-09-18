package defpackage;

/* renamed from: yR, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8172yR extends U0 {
    public final FD c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8172yR(InterfaceC7662vl interfaceC7662vl, AbstractC0663Ig0 abstractC0663Ig0) {
        super(abstractC0663Ig0);
        if (abstractC0663Ig0 == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "receiverType", "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver", "<init>"));
        }
        this.c = (FD) interfaceC7662vl;
    }

    @Override // defpackage.U0
    public final String toString() {
        return getType() + ": Ext {" + this.c + "}";
    }
}
