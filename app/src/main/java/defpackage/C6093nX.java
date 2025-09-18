package defpackage;

import android.app.Notification;

/* renamed from: nX, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6093nX {
    public final int a;
    public final int b;
    public final Notification c;

    public C6093nX(int i, Notification notification, int i2) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6093nX.class != obj.getClass()) {
            return false;
        }
        C6093nX c6093nX = (C6093nX) obj;
        if (this.a == c6093nX.a && this.b == c6093nX.b) {
            return this.c.equals(c6093nX.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}
