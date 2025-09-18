package p000;

import android.app.Notification;

/* renamed from: ow0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10583ow0 {
    /* renamed from: a */
    public static Notification.Action.Builder m23577a(Notification.Action.Builder builder, boolean z) {
        return builder.setAuthenticationRequired(z);
    }

    /* renamed from: b */
    public static Notification.Builder m23578b(Notification.Builder builder, int i) {
        return builder.setForegroundServiceBehavior(i);
    }
}
