package p000;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.os.Bundle;

/* renamed from: hw0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9687hw0 {
    /* renamed from: a */
    public static Notification.Builder m18919a(Notification.Builder builder, Notification.Action action) {
        return builder.addAction(action);
    }

    /* renamed from: b */
    public static Notification.Action.Builder m18920b(Notification.Action.Builder builder, Bundle bundle) {
        return builder.addExtras(bundle);
    }

    /* renamed from: c */
    public static Notification.Action.Builder m18921c(Notification.Action.Builder builder, RemoteInput remoteInput) {
        return builder.addRemoteInput(remoteInput);
    }

    /* renamed from: d */
    public static Notification.Action m18922d(Notification.Action.Builder builder) {
        return builder.build();
    }

    /* renamed from: e */
    public static Notification.Action.Builder m18923e(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(i, charSequence, pendingIntent);
    }

    /* renamed from: f */
    public static String m18924f(Notification notification) {
        return notification.getGroup();
    }

    /* renamed from: g */
    public static Notification.Builder m18925g(Notification.Builder builder, String str) {
        return builder.setGroup(str);
    }

    /* renamed from: h */
    public static Notification.Builder m18926h(Notification.Builder builder, boolean z) {
        return builder.setGroupSummary(z);
    }

    /* renamed from: i */
    public static Notification.Builder m18927i(Notification.Builder builder, boolean z) {
        return builder.setLocalOnly(z);
    }

    /* renamed from: j */
    public static Notification.Builder m18928j(Notification.Builder builder, String str) {
        return builder.setSortKey(str);
    }
}
