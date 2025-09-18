package p000;

import java.util.Arrays;

/* renamed from: qa */
/* loaded from: classes.dex */
public final class C6689qa {

    /* renamed from: e */
    public static final C6689qa f41025e = new C6689qa(-1, -1, -1);

    /* renamed from: a */
    public final int f41026a;

    /* renamed from: b */
    public final int f41027b;

    /* renamed from: c */
    public final int f41028c;

    /* renamed from: d */
    public final int f41029d;

    public C6689qa(int i, int i2, int i3) {
        this.f41026a = i;
        this.f41027b = i2;
        this.f41028c = i3;
        this.f41029d = AbstractC7485Dh1.m1798M(i3) ? AbstractC7485Dh1.m1787B(i3, i2) : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6689qa)) {
            return false;
        }
        C6689qa c6689qa = (C6689qa) obj;
        return this.f41026a == c6689qa.f41026a && this.f41027b == c6689qa.f41027b && this.f41028c == c6689qa.f41028c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f41026a), Integer.valueOf(this.f41027b), Integer.valueOf(this.f41028c)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
        sb.append(this.f41026a);
        sb.append(", channelCount=");
        sb.append(this.f41027b);
        sb.append(", encoding=");
        return AbstractC7222ym.m26235l(sb, this.f41028c, ']');
    }
}
