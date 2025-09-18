package defpackage;

/* loaded from: classes.dex */
public final class VK {
    public final /* synthetic */ int a;
    public final String b;

    public /* synthetic */ VK(String str, int i) {
        this.a = i;
        this.b = str;
    }

    public static VK a(C4103hA0 c4103hA0) {
        String str;
        c4103hA0.H(2);
        int iU = c4103hA0.u();
        int i = iU >> 1;
        int iU2 = ((c4103hA0.u() >> 3) & 31) | ((iU & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(iU2 >= 10 ? "." : ".0");
        sb.append(iU2);
        return new VK(sb.toString(), 0);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return this.b;
            default:
                return super.toString();
        }
    }
}
