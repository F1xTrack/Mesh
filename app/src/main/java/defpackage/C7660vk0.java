package defpackage;

import java.util.Arrays;

/* renamed from: vk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7660vk0 {
    public final long a;
    public final float b;
    public final long c;

    public C7660vk0(C7469uk0 c7469uk0) {
        this.a = c7469uk0.a;
        this.b = c7469uk0.b;
        this.c = c7469uk0.c;
    }

    public final boolean a(long j) {
        long j2 = this.c;
        return (j2 == -9223372036854775807L || j == -9223372036854775807L || j2 < j) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7660vk0)) {
            return false;
        }
        C7660vk0 c7660vk0 = (C7660vk0) obj;
        return this.a == c7660vk0.a && this.b == c7660vk0.b && this.c == c7660vk0.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c)});
    }
}
