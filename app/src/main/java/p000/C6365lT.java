package p000;

import java.io.File;

/* renamed from: lT */
/* loaded from: classes.dex */
public final class C6365lT {

    /* renamed from: a */
    public final File f37075a;

    public C6365lT(File file) {
        this.f37075a = file;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C6365lT)) {
            return false;
        }
        return O90.m5963a(this.f37075a, ((C6365lT) obj).f37075a);
    }

    public final int hashCode() {
        return this.f37075a.hashCode();
    }
}
