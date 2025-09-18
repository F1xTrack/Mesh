package p000;

import java.util.Arrays;

/* renamed from: vk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11455vk0 {

    /* renamed from: a */
    public final long f44511a;

    /* renamed from: b */
    public final float f44512b;

    /* renamed from: c */
    public final long f44513c;

    public C11455vk0(C11327uk0 c11327uk0) {
        this.f44511a = c11327uk0.f43840a;
        this.f44512b = c11327uk0.f43841b;
        this.f44513c = c11327uk0.f43842c;
    }

    /* renamed from: a */
    public final boolean m25482a(long j) {
        long j2 = this.f44513c;
        return (j2 == -9223372036854775807L || j == -9223372036854775807L || j2 < j) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11455vk0)) {
            return false;
        }
        C11455vk0 c11455vk0 = (C11455vk0) obj;
        return this.f44511a == c11455vk0.f44511a && this.f44512b == c11455vk0.f44512b && this.f44513c == c11455vk0.f44513c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f44511a), Float.valueOf(this.f44512b), Long.valueOf(this.f44513c)});
    }
}
