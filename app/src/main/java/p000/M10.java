package p000;

import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.graphics.drawable.Icon;

/* loaded from: classes.dex */
public abstract /* synthetic */ class M10 {
    /* renamed from: c */
    public static /* synthetic */ NotificationChannel m5188c(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    /* renamed from: e */
    public static /* synthetic */ RemoteAction m5190e(Icon icon, String str, String str2, PendingIntent pendingIntent) {
        return new RemoteAction(icon, str, str2, pendingIntent);
    }

    /* renamed from: p */
    public static /* synthetic */ void m5201p() {
    }
}
