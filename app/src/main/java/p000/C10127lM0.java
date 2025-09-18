package p000;

/* renamed from: lM0 */
/* loaded from: classes.dex */
public final class C10127lM0 extends EM0 {

    /* renamed from: y */
    public String f37026y;

    @InterfaceC9871jM0(name = "text")
    public void setText(String str) {
        this.f37026y = str;
        mo2191t();
    }

    @Override // p000.EM0
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f2650b;
        UN1.m7999c(str);
        sb.append(str);
        sb.append(" [text: ");
        return AbstractC1374Vq.m8593l(sb, this.f37026y, "]");
    }
}
