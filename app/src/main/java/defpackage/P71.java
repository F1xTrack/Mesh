package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import androidx.work.impl.foreground.SystemForegroundService;

/* loaded from: classes.dex */
public abstract class P71 {
    public static void a(Service service, int i, Notification notification, int i2) {
        try {
            service.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException unused) {
            TE teG = TE.G();
            int i3 = SystemForegroundService.f;
            teG.getClass();
        }
    }
}
