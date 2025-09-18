package defpackage;

/* renamed from: Pb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1192Pb {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    public final boolean a(InterfaceC1315Qq interfaceC1315Qq) {
        int i = this.b - this.c;
        if (this.a) {
            if ((interfaceC1315Qq.getLeft() >= i - this.e || interfaceC1315Qq.getRight() >= i - this.e) && (interfaceC1315Qq.getLeft() <= this.d + i || interfaceC1315Qq.getRight() <= i + this.d)) {
                return true;
            }
        } else if ((interfaceC1315Qq.getTop() >= i - this.e || interfaceC1315Qq.getBottom() >= i - this.e) && (interfaceC1315Qq.getTop() <= this.d + i || interfaceC1315Qq.getBottom() <= i + this.d)) {
            return true;
        }
        return false;
    }
}
