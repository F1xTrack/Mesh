package defpackage;

import java.util.Arrays;

/* renamed from: qa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6675qa {
    public static final C6675qa e = new C6675qa(-1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public C6675qa(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = AbstractC0277Dh1.M(i3) ? AbstractC0277Dh1.B(i3, i2) : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6675qa)) {
            return false;
        }
        C6675qa c6675qa = (C6675qa) obj;
        return this.a == c6675qa.a && this.b == c6675qa.b && this.c == c6675qa.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
        sb.append(this.a);
        sb.append(", channelCount=");
        sb.append(this.b);
        sb.append(", encoding=");
        return AbstractC8235ym.l(sb, this.c, ']');
    }
}
