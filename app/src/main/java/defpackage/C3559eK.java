package defpackage;

/* renamed from: eK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3559eK extends AbstractC3750fK {
    public final /* synthetic */ int d;

    @Override // defpackage.AbstractC3750fK
    public final boolean a() {
        switch (this.d) {
        }
        return true;
    }

    @Override // defpackage.AbstractC3750fK
    public final boolean b() {
        switch (this.d) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // defpackage.AbstractC3750fK
    public final boolean c(XC xc) {
        switch (this.d) {
            case 0:
                break;
            case 1:
                if (xc == XC.c || xc == XC.e) {
                }
                break;
            default:
                if (xc == XC.b) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.AbstractC3750fK
    public final boolean d(boolean z, XC xc, int i) {
        switch (this.d) {
            case 0:
                break;
            case 1:
                break;
            default:
                if (((!z || xc != XC.c) && xc != XC.a) || i != 2) {
                }
                break;
        }
        return false;
    }
}
