package p000;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;

/* renamed from: jw0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9943jw0 {
    /* renamed from: a */
    public static Notification.Action.Builder m22125a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(icon, charSequence, pendingIntent);
    }

    /* renamed from: b */
    public static Notification.Builder m22126b(Notification.Builder builder, Icon icon) {
        return builder.setLargeIcon(icon);
    }

    /* renamed from: c */
    public static Notification.Builder m22127c(Notification.Builder builder, Object obj) {
        return builder.setSmallIcon((Icon) obj);
    }
}
