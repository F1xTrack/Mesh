package defpackage;

/* renamed from: uj0 */
/* loaded from: classes.dex */
public final class C7466uj0 extends AbstractC7847wj0 {
    @Override // defpackage.AbstractC7847wj0
    public final void a(long j, Object obj) {
        S0 s0 = (S0) ((InterfaceC7549v90) AbstractC1053Ng1.c.i(j, obj));
        if (s0.a) {
            s0.a = false;
        }
    }

    @Override // defpackage.AbstractC7847wj0
    public final void b(long j, Object obj, Object obj2) {
        AbstractC0898Lg1 abstractC0898Lg1 = AbstractC1053Ng1.c;
        InterfaceC7549v90 interfaceC7549v90E = (InterfaceC7549v90) abstractC0898Lg1.i(j, obj);
        InterfaceC7549v90 interfaceC7549v90 = (InterfaceC7549v90) abstractC0898Lg1.i(j, obj2);
        int size = interfaceC7549v90E.size();
        int size2 = interfaceC7549v90.size();
        if (size > 0 && size2 > 0) {
            if (!((S0) interfaceC7549v90E).a) {
                interfaceC7549v90E = interfaceC7549v90E.e(size2 + size);
            }
            interfaceC7549v90E.addAll(interfaceC7549v90);
        }
        if (size > 0) {
            interfaceC7549v90 = interfaceC7549v90E;
        }
        AbstractC1053Ng1.o(j, obj, interfaceC7549v90);
    }
}
