package defpackage;

/* renamed from: Pm0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1226Pm0 implements InterfaceC6727qr0 {
    public InterfaceC6727qr0[] a;

    @Override // defpackage.InterfaceC6727qr0
    public final C5670lJ0 a(Class cls) {
        for (InterfaceC6727qr0 interfaceC6727qr0 : this.a) {
            if (interfaceC6727qr0.b(cls)) {
                return interfaceC6727qr0.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // defpackage.InterfaceC6727qr0
    public final boolean b(Class cls) {
        for (InterfaceC6727qr0 interfaceC6727qr0 : this.a) {
            if (interfaceC6727qr0.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
