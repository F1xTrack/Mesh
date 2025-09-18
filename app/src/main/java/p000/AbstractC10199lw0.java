package p000;

import android.app.Notification;
import android.content.Context;

/* renamed from: lw0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10199lw0 {
    /* renamed from: a */
    public static Notification.Builder m22599a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    /* renamed from: b */
    public static Notification.Builder m22600b(Notification.Builder builder, int i) {
        return builder.setBadgeIconType(i);
    }

    /* renamed from: c */
    public static Notification.Builder m22601c(Notification.Builder builder, boolean z) {
        return builder.setColorized(z);
    }

    /* renamed from: d */
    public static Notification.Builder m22602d(Notification.Builder builder, int i) {
        return builder.setGroupAlertBehavior(i);
    }

    /* renamed from: e */
    public static Notification.Builder m22603e(Notification.Builder builder, CharSequence charSequence) {
        return builder.setSettingsText(charSequence);
    }

    /* renamed from: f */
    public static Notification.Builder m22604f(Notification.Builder builder, String str) {
        return builder.setShortcutId(str);
    }

    /* renamed from: g */
    public static Notification.Builder m22605g(Notification.Builder builder, long j) {
        return builder.setTimeoutAfter(j);
    }
}
