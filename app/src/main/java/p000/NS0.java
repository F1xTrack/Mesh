package p000;

/* loaded from: classes2.dex */
public abstract class NS0 extends MS0 implements InterfaceC6957uZ {

    /* renamed from: a */
    public final int f7792a;

    public NS0(InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.f7792a = 2;
    }

    @Override // p000.InterfaceC6957uZ
    public final int getArity() {
        return this.f7792a;
    }

    @Override // p000.AbstractC1300Uf
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strMo3852h = BP0.f799a.mo3852h(this);
        O90.m5967e(strMo3852h, "renderLambdaToString(...)");
        return strMo3852h;
    }
}
