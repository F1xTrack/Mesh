package p000;

import android.app.Notification;
import android.media.AudioAttributes;
import android.net.Uri;

/* renamed from: iw0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9815iw0 {
    /* renamed from: a */
    public static Notification.Builder m21940a(Notification.Builder builder, String str) {
        return builder.addPerson(str);
    }

    /* renamed from: b */
    public static Notification.Builder m21941b(Notification.Builder builder, String str) {
        return builder.setCategory(str);
    }

    /* renamed from: c */
    public static Notification.Builder m21942c(Notification.Builder builder, int i) {
        return builder.setColor(i);
    }

    /* renamed from: d */
    public static Notification.Builder m21943d(Notification.Builder builder, Notification notification) {
        return builder.setPublicVersion(notification);
    }

    /* renamed from: e */
    public static Notification.Builder m21944e(Notification.Builder builder, Uri uri, Object obj) {
        return builder.setSound(uri, (AudioAttributes) obj);
    }

    /* renamed from: f */
    public static Notification.Builder m21945f(Notification.Builder builder, int i) {
        return builder.setVisibility(i);
    }
}
