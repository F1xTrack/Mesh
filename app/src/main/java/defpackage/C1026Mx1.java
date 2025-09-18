package defpackage;

import android.app.PendingIntent;

/* renamed from: Mx1 */
/* loaded from: classes.dex */
public final class C1026Mx1 extends AbstractC4351iT0 {
    public final PendingIntent a;
    public final boolean b;

    public C1026Mx1(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.a = pendingIntent;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4351iT0) {
            AbstractC4351iT0 abstractC4351iT0 = (AbstractC4351iT0) obj;
            if (this.a.equals(((C1026Mx1) abstractC4351iT0).a) && this.b == ((C1026Mx1) abstractC4351iT0).b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "ReviewInfo{pendingIntent=" + this.a.toString() + ", isNoOp=" + this.b + "}";
    }
}
