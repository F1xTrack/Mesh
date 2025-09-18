package p000;

import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;

/* renamed from: Kp1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7865Kp1 extends YogaNodeJNIBase {
    public final void finalize() throws Throwable {
        try {
            long j = this.f17997e;
            if (j != 0) {
                this.f17997e = 0L;
                YogaNative.jni_YGNodeFinalizeJNI(j);
            }
        } finally {
            super.finalize();
        }
    }
}
