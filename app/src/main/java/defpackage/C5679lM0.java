package defpackage;

/* renamed from: lM0 */
/* loaded from: classes.dex */
public final class C5679lM0 extends EM0 {
    public String y;

    @InterfaceC5297jM0(name = "text")
    public void setText(String str) {
        this.y = str;
        t();
    }

    @Override // defpackage.EM0
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.b;
        UN1.c(str);
        sb.append(str);
        sb.append(" [text: ");
        return AbstractC1705Vq.l(sb, this.y, "]");
    }
}
