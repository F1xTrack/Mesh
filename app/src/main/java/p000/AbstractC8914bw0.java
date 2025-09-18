package p000;

import android.app.Notification;
import android.graphics.drawable.Icon;

/* renamed from: bw0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8914bw0 {
    /* renamed from: a */
    public static void m10543a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
        bigPictureStyle.bigPicture(icon);
    }

    /* renamed from: b */
    public static void m10544b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
        bigPictureStyle.setContentDescription(charSequence);
    }

    /* renamed from: c */
    public static void m10545c(Notification.BigPictureStyle bigPictureStyle, boolean z) {
        bigPictureStyle.showBigPictureWhenCollapsed(z);
    }
}
