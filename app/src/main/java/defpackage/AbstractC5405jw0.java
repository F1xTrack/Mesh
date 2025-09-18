package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;

/* renamed from: jw0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5405jw0 {
    public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(icon, charSequence, pendingIntent);
    }

    public static Notification.Builder b(Notification.Builder builder, Icon icon) {
        return builder.setLargeIcon(icon);
    }

    public static Notification.Builder c(Notification.Builder builder, Object obj) {
        return builder.setSmallIcon((Icon) obj);
    }
}
