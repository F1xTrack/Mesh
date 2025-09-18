package defpackage;

/* renamed from: i71, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4286i71 extends AbstractC1963Yy implements InterfaceC7435uZ {
    private final int arity;

    public AbstractC4286i71(int i, InterfaceC1729Vy interfaceC1729Vy) {
        super(interfaceC1729Vy);
        this.arity = i;
    }

    @Override // defpackage.InterfaceC7435uZ
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.AbstractC1594Uf
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strH = BP0.a.h(this);
        O90.e(strH, "renderLambdaToString(...)");
        return strH;
    }
}
