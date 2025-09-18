package defpackage;

import android.app.Notification;

/* renamed from: ow0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6360ow0 {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
        return builder.setAuthenticationRequired(z);
    }

    public static Notification.Builder b(Notification.Builder builder, int i) {
        return builder.setForegroundServiceBehavior(i);
    }
}
