package defpackage;

import java.io.File;

/* renamed from: lT, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5699lT {
    public final File a;

    public C5699lT(File file) {
        this.a = file;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C5699lT)) {
            return false;
        }
        return O90.a(this.a, ((C5699lT) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
