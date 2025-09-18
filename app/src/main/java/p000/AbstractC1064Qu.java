package p000;

import android.app.NotificationChannel;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: Qu */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1064Qu {
    /* renamed from: b */
    public static /* synthetic */ NotificationChannel m6805b(String str) {
        return new NotificationChannel("fcm_fallback_notification_channel", str, 3);
    }

    /* renamed from: y */
    public static /* bridge */ /* synthetic */ boolean m6828y(Drawable drawable) {
        return drawable instanceof AdaptiveIconDrawable;
    }
}
