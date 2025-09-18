package defpackage;

import android.app.Notification;
import android.app.Service;

/* loaded from: classes.dex */
public abstract class O71 {
    public static void a(Service service, int i, Notification notification, int i2) {
        service.startForeground(i, notification, i2);
    }
}
