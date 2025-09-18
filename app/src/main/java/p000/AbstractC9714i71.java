package p000;

/* renamed from: i71, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9714i71 extends AbstractC1571Yy implements InterfaceC6957uZ {
    private final int arity;

    public AbstractC9714i71(int i, InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.arity = i;
    }

    @Override // p000.InterfaceC6957uZ
    public int getArity() {
        return this.arity;
    }

    @Override // p000.AbstractC1300Uf
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strMo3852h = BP0.f799a.mo3852h(this);
        O90.m5967e(strMo3852h, "renderLambdaToString(...)");
        return strMo3852h;
    }
}
