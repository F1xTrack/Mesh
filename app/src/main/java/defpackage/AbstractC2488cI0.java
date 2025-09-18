package defpackage;

import android.app.NotificationChannel;
import android.app.PictureInPictureParams;

/* renamed from: cI0 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2488cI0 {
    public static /* synthetic */ NotificationChannel d(int i, String str, String str2) {
        return new NotificationChannel(str, str2, i);
    }

    public static /* bridge */ /* synthetic */ NotificationChannel e(Object obj) {
        return (NotificationChannel) obj;
    }

    public static /* synthetic */ PictureInPictureParams.Builder f() {
        return new PictureInPictureParams.Builder();
    }
}
