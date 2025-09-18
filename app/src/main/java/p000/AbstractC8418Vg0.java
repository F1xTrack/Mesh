package p000;

import java.io.Serializable;

/* renamed from: Vg0 */
/* loaded from: classes2.dex */
public abstract class AbstractC8418Vg0 implements InterfaceC6957uZ, Serializable {
    private final int arity;

    public AbstractC8418Vg0(int i) {
        this.arity = i;
    }

    @Override // p000.InterfaceC6957uZ
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String strMo3853i = BP0.f799a.mo3853i(this);
        O90.m5967e(strMo3853i, "renderLambdaToString(...)");
        return strMo3853i;
    }
}
