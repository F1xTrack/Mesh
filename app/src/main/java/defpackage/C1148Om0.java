package defpackage;

/* renamed from: Om0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1148Om0 implements InterfaceC6536pr0 {
    public InterfaceC6536pr0[] a;

    @Override // defpackage.InterfaceC6536pr0
    public final C5479kJ0 a(Class cls) {
        for (InterfaceC6536pr0 interfaceC6536pr0 : this.a) {
            if (interfaceC6536pr0.b(cls)) {
                return interfaceC6536pr0.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // defpackage.InterfaceC6536pr0
    public final boolean b(Class cls) {
        for (InterfaceC6536pr0 interfaceC6536pr0 : this.a) {
            if (interfaceC6536pr0.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
