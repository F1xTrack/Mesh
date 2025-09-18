package p000;

import android.app.Notification;
import android.widget.RemoteViews;

/* renamed from: kw0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10071kw0 {
    /* renamed from: a */
    public static Notification.Action.Builder m22313a(Notification.Action.Builder builder, boolean z) {
        return builder.setAllowGeneratedReplies(z);
    }

    /* renamed from: b */
    public static Notification.Builder m22314b(Notification.Builder builder, RemoteViews remoteViews) {
        return builder.setCustomBigContentView(remoteViews);
    }

    /* renamed from: c */
    public static Notification.Builder m22315c(Notification.Builder builder, RemoteViews remoteViews) {
        return builder.setCustomContentView(remoteViews);
    }

    /* renamed from: d */
    public static Notification.Builder m22316d(Notification.Builder builder, RemoteViews remoteViews) {
        return builder.setCustomHeadsUpContentView(remoteViews);
    }

    /* renamed from: e */
    public static Notification.Builder m22317e(Notification.Builder builder, CharSequence[] charSequenceArr) {
        return builder.setRemoteInputHistory(charSequenceArr);
    }
}
