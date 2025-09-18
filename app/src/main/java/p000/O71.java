package p000;

import android.app.Notification;
import android.app.Service;

/* loaded from: classes.dex */
public abstract class O71 {
    /* renamed from: a */
    public static void m5955a(Service service, int i, Notification notification, int i2) {
        service.startForeground(i, notification, i2);
    }
}
