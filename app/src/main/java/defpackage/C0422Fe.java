package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: Fe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0422Fe {
    public static final C0422Fe d = new C0422Fe(0, 2, null);
    public static final Set e = Collections.unmodifiableSet(new HashSet(Arrays.asList(0, -1)));
    public static final C0245Cx f = new C0245Cx(new C0422Fe(0, 1, null));
    public final int a;
    public final int b;
    public final C1123Oe c;

    public C0422Fe(int i, int i2, C1123Oe c1123Oe) {
        this.a = i;
        if (i2 == 0) {
            throw new NullPointerException("Null streamState");
        }
        this.b = i2;
        this.c = c1123Oe;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0422Fe)) {
            return false;
        }
        C0422Fe c0422Fe = (C0422Fe) obj;
        if (this.a == c0422Fe.a && AbstractC8235ym.c(this.b, c0422Fe.b)) {
            C1123Oe c1123Oe = c0422Fe.c;
            C1123Oe c1123Oe2 = this.c;
            if (c1123Oe2 == null) {
                if (c1123Oe == null) {
                    return true;
                }
            } else if (c1123Oe2.equals(c1123Oe)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iX = (((this.a ^ 1000003) * 1000003) ^ AbstractC8235ym.x(this.b)) * 1000003;
        C1123Oe c1123Oe = this.c;
        return (c1123Oe == null ? 0 : c1123Oe.hashCode()) ^ iX;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamInfo{id=");
        sb.append(this.a);
        sb.append(", streamState=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? "null" : "INACTIVE" : "ACTIVE");
        sb.append(", inProgressTransformationInfo=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
