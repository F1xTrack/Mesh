package defpackage;

import android.app.NotificationChannel;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import java.nio.file.Path;
import java.time.LocalDate;

/* loaded from: classes.dex */
public abstract /* synthetic */ class LR0 {
    public static /* bridge */ /* synthetic */ Class A() {
        return LocalDate.class;
    }

    public static /* synthetic */ void B() {
    }

    public static /* synthetic */ NotificationChannel d(String str) {
        return new NotificationChannel("ru.mail.vkpns.default_notification_channel", str, 3);
    }

    public static /* synthetic */ Typeface.Builder g(AssetManager assetManager, String str) {
        return new Typeface.Builder(assetManager, str);
    }

    public static /* bridge */ /* synthetic */ Class k() {
        return Path.class;
    }

    public static /* synthetic */ void o() {
    }

    public static /* synthetic */ NotificationChannel z(String str) {
        return new NotificationChannel("HwPushChannelID", str, 3);
    }
}
