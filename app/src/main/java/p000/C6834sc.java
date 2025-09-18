package p000;

import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: sc */
/* loaded from: classes.dex */
public final class C6834sc {

    /* renamed from: e */
    public static final List f42495e = Collections.unmodifiableList(Arrays.asList(48000, 44100, 22050, 11025, Integer.valueOf(JosStatusCodes.RTN_CODE_COMMON_ERROR), 4800));

    /* renamed from: a */
    public final int f42496a;

    /* renamed from: b */
    public final int f42497b;

    /* renamed from: c */
    public final int f42498c;

    /* renamed from: d */
    public final int f42499d;

    public C6834sc(int i, int i2, int i3, int i4) {
        this.f42496a = i;
        this.f42497b = i2;
        this.f42498c = i3;
        this.f42499d = i4;
    }

    /* renamed from: a */
    public final int m24749a() {
        int i = this.f42498c;
        AbstractC9104dM1.m17545d("Invalid channel count: " + i, i > 0);
        int i2 = this.f42499d;
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
                throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i2, "Invalid audio encoding: "));
            }
        }
        return i * 4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6834sc)) {
            return false;
        }
        C6834sc c6834sc = (C6834sc) obj;
        return this.f42496a == c6834sc.f42496a && this.f42497b == c6834sc.f42497b && this.f42498c == c6834sc.f42498c && this.f42499d == c6834sc.f42499d;
    }

    public final int hashCode() {
        return ((((((this.f42496a ^ 1000003) * 1000003) ^ this.f42497b) * 1000003) ^ this.f42498c) * 1000003) ^ this.f42499d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSettings{audioSource=");
        sb.append(this.f42496a);
        sb.append(", sampleRate=");
        sb.append(this.f42497b);
        sb.append(", channelCount=");
        sb.append(this.f42498c);
        sb.append(", audioFormat=");
        return AbstractC1374Vq.m8591j(sb, this.f42499d, "}");
    }
}
