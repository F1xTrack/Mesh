package p000;

import android.app.Notification;
import android.content.LocusId;

/* renamed from: nw0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10455nw0 {
    /* renamed from: a */
    public static Notification.Builder m23281a(Notification.Builder builder, boolean z) {
        return builder.setAllowSystemGeneratedContextualActions(z);
    }

    /* renamed from: b */
    public static Notification.Builder m23282b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
        return builder.setBubbleMetadata(bubbleMetadata);
    }

    /* renamed from: c */
    public static Notification.Action.Builder m23283c(Notification.Action.Builder builder, boolean z) {
        return builder.setContextual(z);
    }

    /* renamed from: d */
    public static Notification.Builder m23284d(Notification.Builder builder, Object obj) {
        return builder.setLocusId((LocusId) obj);
    }
}
