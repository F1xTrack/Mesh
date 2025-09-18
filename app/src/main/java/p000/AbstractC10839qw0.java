package p000;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import java.util.List;

/* renamed from: qw0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10839qw0 {
    /* renamed from: a */
    public static void m24128a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
        notificationManager.createNotificationChannel(notificationChannel);
    }

    /* renamed from: b */
    public static void m24129b(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
        notificationManager.createNotificationChannelGroup(notificationChannelGroup);
    }

    /* renamed from: c */
    public static void m24130c(NotificationManager notificationManager, List<NotificationChannelGroup> list) {
        notificationManager.createNotificationChannelGroups(list);
    }

    /* renamed from: d */
    public static void m24131d(NotificationManager notificationManager, List<NotificationChannel> list) {
        notificationManager.createNotificationChannels(list);
    }

    /* renamed from: e */
    public static void m24132e(NotificationManager notificationManager, String str) {
        notificationManager.deleteNotificationChannel(str);
    }

    /* renamed from: f */
    public static void m24133f(NotificationManager notificationManager, String str) {
        notificationManager.deleteNotificationChannelGroup(str);
    }

    /* renamed from: g */
    public static String m24134g(NotificationChannel notificationChannel) {
        return notificationChannel.getId();
    }

    /* renamed from: h */
    public static String m24135h(NotificationChannelGroup notificationChannelGroup) {
        return notificationChannelGroup.getId();
    }

    /* renamed from: i */
    public static NotificationChannel m24136i(NotificationManager notificationManager, String str) {
        return notificationManager.getNotificationChannel(str);
    }

    /* renamed from: j */
    public static List<NotificationChannelGroup> m24137j(NotificationManager notificationManager) {
        return notificationManager.getNotificationChannelGroups();
    }

    /* renamed from: k */
    public static List<NotificationChannel> m24138k(NotificationManager notificationManager) {
        return notificationManager.getNotificationChannels();
    }
}
