package p000;

import android.app.Notification;

/* renamed from: nX */
/* loaded from: classes.dex */
public final class C6495nX {

    /* renamed from: a */
    public final int f38357a;

    /* renamed from: b */
    public final int f38358b;

    /* renamed from: c */
    public final Notification f38359c;

    public C6495nX(int i, Notification notification, int i2) {
        this.f38357a = i;
        this.f38359c = notification;
        this.f38358b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6495nX.class != obj.getClass()) {
            return false;
        }
        C6495nX c6495nX = (C6495nX) obj;
        if (this.f38357a == c6495nX.f38357a && this.f38358b == c6495nX.f38358b) {
            return this.f38359c.equals(c6495nX.f38359c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f38359c.hashCode() + (((this.f38357a * 31) + this.f38358b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f38357a + ", mForegroundServiceType=" + this.f38358b + ", mNotification=" + this.f38359c + '}';
    }
}
