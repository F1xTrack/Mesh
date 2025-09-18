package p000;

/* loaded from: classes2.dex */
public abstract class MS0 extends AbstractC1300Uf {
    public MS0(InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        if (interfaceC1382Vy != null && interfaceC1382Vy.getContext() != C0591JN.f5499a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // p000.InterfaceC1382Vy
    public final InterfaceC0125Bz getContext() {
        return C0591JN.f5499a;
    }
}
