package defpackage;

import com.facebook.yoga.YogaNative;

/* renamed from: Hp1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0613Hp1 {
    public long a;

    public final void finalize() throws Throwable {
        try {
            long j = this.a;
            if (j != 0) {
                this.a = 0L;
                YogaNative.jni_YGConfigFreeJNI(j);
            }
        } finally {
            super.finalize();
        }
    }
}
