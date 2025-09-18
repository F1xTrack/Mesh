package p000;

import com.facebook.yoga.YogaNative;

/* renamed from: Hp1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7709Hp1 {

    /* renamed from: a */
    public long f4521a;

    public final void finalize() throws Throwable {
        try {
            long j = this.f4521a;
            if (j != 0) {
                this.f4521a = 0L;
                YogaNative.jni_YGConfigFreeJNI(j);
            }
        } finally {
            super.finalize();
        }
    }
}
