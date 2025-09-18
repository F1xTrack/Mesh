package defpackage;

/* loaded from: classes2.dex */
public abstract class MS0 extends AbstractC1594Uf {
    public MS0(InterfaceC1729Vy interfaceC1729Vy) {
        super(interfaceC1729Vy);
        if (interfaceC1729Vy != null && interfaceC1729Vy.getContext() != JN.a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // defpackage.InterfaceC1729Vy
    public final InterfaceC0173Bz getContext() {
        return JN.a;
    }
}
