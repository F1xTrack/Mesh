package p000;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import androidx.work.impl.foreground.SystemForegroundService;

/* loaded from: classes.dex */
public abstract class P71 {
    /* renamed from: a */
    public static void m6238a(Service service, int i, Notification notification, int i2) {
        try {
            service.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException unused) {
            C1210TE c1210teM7634G = C1210TE.m7634G();
            int i3 = SystemForegroundService.f16590f;
            c1210teM7634G.getClass();
        }
    }
}
