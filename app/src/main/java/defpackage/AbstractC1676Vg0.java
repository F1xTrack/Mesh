package defpackage;

import java.io.Serializable;

/* renamed from: Vg0 */
/* loaded from: classes2.dex */
public abstract class AbstractC1676Vg0 implements InterfaceC7435uZ, Serializable {
    private final int arity;

    public AbstractC1676Vg0(int i) {
        this.arity = i;
    }

    @Override // defpackage.InterfaceC7435uZ
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String strI = BP0.a.i(this);
        O90.e(strI, "renderLambdaToString(...)");
        return strI;
    }
}
