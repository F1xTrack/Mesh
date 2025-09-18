package defpackage;

/* loaded from: classes2.dex */
public abstract class NS0 extends MS0 implements InterfaceC7435uZ {
    public final int a;

    public NS0(InterfaceC1729Vy interfaceC1729Vy) {
        super(interfaceC1729Vy);
        this.a = 2;
    }

    @Override // defpackage.InterfaceC7435uZ
    public final int getArity() {
        return this.a;
    }

    @Override // defpackage.AbstractC1594Uf
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strH = BP0.a.h(this);
        O90.e(strH, "renderLambdaToString(...)");
        return strH;
    }
}
