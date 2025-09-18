package p000;

import android.app.NotificationChannel;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import java.nio.file.Path;
import java.time.LocalDate;

/* loaded from: classes.dex */
public abstract /* synthetic */ class LR0 {
    /* renamed from: A */
    public static /* bridge */ /* synthetic */ Class m4971A() {
        return LocalDate.class;
    }

    /* renamed from: B */
    public static /* synthetic */ void m4972B() {
    }

    /* renamed from: d */
    public static /* synthetic */ NotificationChannel m4978d(String str) {
        return new NotificationChannel("ru.mail.vkpns.default_notification_channel", str, 3);
    }

    /* renamed from: g */
    public static /* synthetic */ Typeface.Builder m4981g(AssetManager assetManager, String str) {
        return new Typeface.Builder(assetManager, str);
    }

    /* renamed from: k */
    public static /* bridge */ /* synthetic */ Class m4985k() {
        return Path.class;
    }

    /* renamed from: o */
    public static /* synthetic */ void m4989o() {
    }

    /* renamed from: z */
    public static /* synthetic */ NotificationChannel m5000z(String str) {
        return new NotificationChannel("HwPushChannelID", str, 3);
    }
}
