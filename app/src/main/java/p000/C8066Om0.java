package p000;

/* renamed from: Om0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8066Om0 implements InterfaceC10701pr0 {

    /* renamed from: a */
    public InterfaceC10701pr0[] f8613a;

    @Override // p000.InterfaceC10701pr0
    /* renamed from: a */
    public final C9993kJ0 mo6137a(Class cls) {
        for (InterfaceC10701pr0 interfaceC10701pr0 : this.f8613a) {
            if (interfaceC10701pr0.mo6138b(cls)) {
                return interfaceC10701pr0.mo6137a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // p000.InterfaceC10701pr0
    /* renamed from: b */
    public final boolean mo6138b(Class cls) {
        for (InterfaceC10701pr0 interfaceC10701pr0 : this.f8613a) {
            if (interfaceC10701pr0.mo6138b(cls)) {
                return true;
            }
        }
        return false;
    }
}
