package p000;

/* renamed from: Pm0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8118Pm0 implements InterfaceC10829qr0 {

    /* renamed from: a */
    public InterfaceC10829qr0[] f9277a;

    @Override // p000.InterfaceC10829qr0
    /* renamed from: a */
    public final C10121lJ0 mo6424a(Class cls) {
        for (InterfaceC10829qr0 interfaceC10829qr0 : this.f9277a) {
            if (interfaceC10829qr0.mo6425b(cls)) {
                return interfaceC10829qr0.mo6424a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // p000.InterfaceC10829qr0
    /* renamed from: b */
    public final boolean mo6425b(Class cls) {
        for (InterfaceC10829qr0 interfaceC10829qr0 : this.f9277a) {
            if (interfaceC10829qr0.mo6425b(cls)) {
                return true;
            }
        }
        return false;
    }
}
