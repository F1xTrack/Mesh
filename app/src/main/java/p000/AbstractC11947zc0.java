package p000;

import java.io.Closeable;
import java.util.Arrays;

/* renamed from: zc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11947zc0 implements Closeable {

    /* renamed from: e */
    public static final String[] f46891e = new String[128];

    /* renamed from: a */
    public int f46892a;

    /* renamed from: b */
    public int[] f46893b;

    /* renamed from: c */
    public String[] f46894c;

    /* renamed from: d */
    public int[] f46895d;

    static {
        for (int i = 0; i <= 31; i++) {
            f46891e[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f46891e;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* renamed from: A */
    public abstract boolean mo3513A();

    /* renamed from: D */
    public abstract double mo3514D();

    /* renamed from: J */
    public abstract int mo3515J();

    /* renamed from: S */
    public abstract String mo3516S();

    /* renamed from: U */
    public abstract int mo3517U();

    /* renamed from: W */
    public final void m26479W(int i) {
        int i2 = this.f46892a;
        int[] iArr = this.f46893b;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new C6838sg("Nesting too deep at " + m26481w());
            }
            this.f46893b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f46894c;
            this.f46894c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f46895d;
            this.f46895d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f46893b;
        int i3 = this.f46892a;
        this.f46892a = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: X */
    public abstract int mo3518X(C1339VH c1339vh);

    /* renamed from: b0 */
    public abstract void mo3519b0();

    /* renamed from: d0 */
    public abstract void mo3520d0();

    /* renamed from: e0 */
    public final void m26480e0(String str) throws C6583ou {
        StringBuilder sbM5762k = AbstractC0852NX.m5762k(str, " at path ");
        sbM5762k.append(m26481w());
        throw new C6583ou(sbM5762k.toString());
    }

    /* renamed from: m */
    public abstract void mo3523m();

    /* renamed from: n */
    public abstract void mo3525n();

    /* renamed from: o */
    public abstract void mo3527o();

    /* renamed from: p */
    public abstract void mo3529p();

    /* renamed from: w */
    public final String m26481w() {
        int i = this.f46892a;
        int[] iArr = this.f46893b;
        String[] strArr = this.f46894c;
        int[] iArr2 = this.f46895d;
        StringBuilder sb = new StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: x */
    public abstract boolean mo3535x();
}
