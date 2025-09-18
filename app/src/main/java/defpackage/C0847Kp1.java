package defpackage;

import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;

/* renamed from: Kp1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0847Kp1 extends YogaNodeJNIBase {
    public final void finalize() throws Throwable {
        try {
            long j = this.e;
            if (j != 0) {
                this.e = 0L;
                YogaNative.jni_YGNodeFinalizeJNI(j);
            }
        } finally {
            super.finalize();
        }
    }
}
