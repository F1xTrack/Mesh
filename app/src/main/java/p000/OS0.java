package p000;

import com.huawei.hms.p015rn.push.constants.Core;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class OS0 implements Serializable {

    /* renamed from: a */
    public final Throwable f8450a;

    public OS0(Throwable th) {
        O90.m5968f(th, Core.Event.Result.EXCEPTION);
        this.f8450a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof OS0) {
            if (O90.m5963a(this.f8450a, ((OS0) obj).f8450a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8450a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f8450a + ')';
    }
}
