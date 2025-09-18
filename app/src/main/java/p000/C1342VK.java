package p000;

/* renamed from: VK */
/* loaded from: classes.dex */
public final class C1342VK {

    /* renamed from: a */
    public final /* synthetic */ int f12521a;

    /* renamed from: b */
    public final String f12522b;

    public /* synthetic */ C1342VK(String str, int i) {
        this.f12521a = i;
        this.f12522b = str;
    }

    /* renamed from: a */
    public static C1342VK m8397a(C9591hA0 c9591hA0) {
        String str;
        c9591hA0.m18742H(2);
        int iM18763u = c9591hA0.m18763u();
        int i = iM18763u >> 1;
        int iM18763u2 = ((c9591hA0.m18763u() >> 3) & 31) | ((iM18763u & 1) << 5);
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
        sb.append(iM18763u2 >= 10 ? "." : ".0");
        sb.append(iM18763u2);
        return new C1342VK(sb.toString(), 0);
    }

    public String toString() {
        switch (this.f12521a) {
            case 1:
                return this.f12522b;
            default:
                return super.toString();
        }
    }
}
