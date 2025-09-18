package defpackage;

import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: sc */
/* loaded from: classes.dex */
public final class C7062sc {
    public static final List e = Collections.unmodifiableList(Arrays.asList(48000, 44100, 22050, 11025, Integer.valueOf(JosStatusCodes.RTN_CODE_COMMON_ERROR), 4800));
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public C7062sc(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final int a() {
        int i = this.c;
        AbstractC3377dM1.d("Invalid channel count: " + i, i > 0);
        int i2 = this.d;
        if (i2 == 2) {
            return i * 2;
        }
        if (i2 == 3) {
            return i;
        }
        if (i2 != 4) {
            if (i2 == 21) {
                return i * 3;
            }
            if (i2 != 22) {
                throw new IllegalArgumentException(AbstractC7209tN0.u(i2, "Invalid audio encoding: "));
            }
        }
        return i * 4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7062sc)) {
            return false;
        }
        C7062sc c7062sc = (C7062sc) obj;
        return this.a == c7062sc.a && this.b == c7062sc.b && this.c == c7062sc.c && this.d == c7062sc.d;
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSettings{audioSource=");
        sb.append(this.a);
        sb.append(", sampleRate=");
        sb.append(this.b);
        sb.append(", channelCount=");
        sb.append(this.c);
        sb.append(", audioFormat=");
        return AbstractC1705Vq.j(sb, this.d, "}");
    }
}
