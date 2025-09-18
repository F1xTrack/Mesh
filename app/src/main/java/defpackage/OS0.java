package defpackage;

import com.huawei.hms.rn.push.constants.Core;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class OS0 implements Serializable {
    public final Throwable a;

    public OS0(Throwable th) {
        O90.f(th, Core.Event.Result.EXCEPTION);
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof OS0) {
            if (O90.a(this.a, ((OS0) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.a + ')';
    }
}
