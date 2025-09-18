package p000;

import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;

/* renamed from: Wv0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8500Wv0 {
    /* renamed from: a */
    public static boolean m8880a(NotificationChannel notificationChannel) {
        return notificationChannel.canBypassDnd();
    }

    /* renamed from: b */
    public static boolean m8881b(NotificationChannel notificationChannel) {
        return notificationChannel.canShowBadge();
    }

    /* renamed from: c */
    public static NotificationChannel m8882c(String str, CharSequence charSequence, int i) {
        return new NotificationChannel(str, charSequence, i);
    }

    /* renamed from: d */
    public static void m8883d(NotificationChannel notificationChannel, boolean z) {
        notificationChannel.enableLights(z);
    }

    /* renamed from: e */
    public static void m8884e(NotificationChannel notificationChannel, boolean z) {
        notificationChannel.enableVibration(z);
    }

    /* renamed from: f */
    public static AudioAttributes m8885f(NotificationChannel notificationChannel) {
        return notificationChannel.getAudioAttributes();
    }

    /* renamed from: g */
    public static String m8886g(NotificationChannel notificationChannel) {
        return notificationChannel.getDescription();
    }

    /* renamed from: h */
    public static String m8887h(NotificationChannel notificationChannel) {
        return notificationChannel.getGroup();
    }

    /* renamed from: i */
    public static String m8888i(NotificationChannel notificationChannel) {
        return notificationChannel.getId();
    }

    /* renamed from: j */
    public static int m8889j(NotificationChannel notificationChannel) {
        return notificationChannel.getImportance();
    }

    /* renamed from: k */
    public static int m8890k(NotificationChannel notificationChannel) {
        return notificationChannel.getLightColor();
    }

    /* renamed from: l */
    public static int m8891l(NotificationChannel notificationChannel) {
        return notificationChannel.getLockscreenVisibility();
    }

    /* renamed from: m */
    public static CharSequence m8892m(NotificationChannel notificationChannel) {
        return notificationChannel.getName();
    }

    /* renamed from: n */
    public static Uri m8893n(NotificationChannel notificationChannel) {
        return notificationChannel.getSound();
    }

    /* renamed from: o */
    public static long[] m8894o(NotificationChannel notificationChannel) {
        return notificationChannel.getVibrationPattern();
    }

    /* renamed from: p */
    public static void m8895p(NotificationChannel notificationChannel, String str) {
        notificationChannel.setDescription(str);
    }

    /* renamed from: q */
    public static void m8896q(NotificationChannel notificationChannel, String str) {
        notificationChannel.setGroup(str);
    }

    /* renamed from: r */
    public static void m8897r(NotificationChannel notificationChannel, int i) {
        notificationChannel.setLightColor(i);
    }

    /* renamed from: s */
    public static void m8898s(NotificationChannel notificationChannel, boolean z) {
        notificationChannel.setShowBadge(z);
    }

    /* renamed from: t */
    public static void m8899t(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
        notificationChannel.setSound(uri, audioAttributes);
    }

    /* renamed from: u */
    public static void m8900u(NotificationChannel notificationChannel, long[] jArr) {
        notificationChannel.setVibrationPattern(jArr);
    }

    /* renamed from: v */
    public static boolean m8901v(NotificationChannel notificationChannel) {
        return notificationChannel.shouldShowLights();
    }

    /* renamed from: w */
    public static boolean m8902w(NotificationChannel notificationChannel) {
        return notificationChannel.shouldVibrate();
    }
}
