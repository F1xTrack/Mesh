package p000;

import android.app.PendingIntent;

/* renamed from: Mx1 */
/* loaded from: classes.dex */
public final class C7985Mx1 extends AbstractC9757iT0 {

    /* renamed from: a */
    public final PendingIntent f7415a;

    /* renamed from: b */
    public final boolean f7416b;

    public C7985Mx1(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.f7415a = pendingIntent;
        this.f7416b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC9757iT0) {
            AbstractC9757iT0 abstractC9757iT0 = (AbstractC9757iT0) obj;
            if (this.f7415a.equals(((C7985Mx1) abstractC9757iT0).f7415a) && this.f7416b == ((C7985Mx1) abstractC9757iT0).f7416b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f7415a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f7416b ? 1237 : 1231);
    }

    public final String toString() {
        return "ReviewInfo{pendingIntent=" + this.f7415a.toString() + ", isNoOp=" + this.f7416b + "}";
    }
}
