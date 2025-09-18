package defpackage;

import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.graphics.drawable.Icon;

/* loaded from: classes.dex */
public abstract /* synthetic */ class M10 {
    public static /* synthetic */ NotificationChannel c(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static /* synthetic */ RemoteAction e(Icon icon, String str, String str2, PendingIntent pendingIntent) {
        return new RemoteAction(icon, str, str2, pendingIntent);
    }

    public static /* synthetic */ void p() {
    }
}
