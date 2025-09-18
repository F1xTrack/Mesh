package com.huawei.hms.push;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.support.api.push.TransActivity;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.ResourceLoaderUtil;
import p000.LR0;

/* renamed from: com.huawei.hms.push.n */
/* loaded from: classes.dex */
public class C2228n {

    /* renamed from: a */
    private static int f19426a;

    /* renamed from: a */
    public static synchronized void m12462a(Context context, C2229o c2229o) {
        int iHashCode;
        int iHashCode2;
        int i;
        int iHashCode3;
        if (context != null) {
            try {
                if (!m12466a(c2229o)) {
                    HMSLog.m12617d("PushSelfShowLog", "showNotification, the msg id = " + c2229o.m12502o());
                    if (f19426a == 0) {
                        f19426a = (context.getPackageName() + System.currentTimeMillis()).hashCode();
                    }
                    if (TextUtils.isEmpty(c2229o.m12498k())) {
                        String strM12503p = c2229o.m12503p();
                        if (!TextUtils.isEmpty(strM12503p)) {
                            int iHashCode4 = strM12503p.hashCode();
                            c2229o.m12488a(iHashCode4);
                            HMSLog.m12617d("PushSelfShowLog", "notification msgTag = " + iHashCode4);
                        }
                        if (c2229o.m12504r() != -1) {
                            iHashCode = c2229o.m12504r();
                            iHashCode3 = (c2229o.m12497j() + System.currentTimeMillis()).hashCode();
                            i = iHashCode3 + 1;
                            iHashCode2 = (c2229o.m12504r() + c2229o.m12497j() + context.getPackageName()).hashCode();
                        } else {
                            int i2 = f19426a;
                            int i3 = i2 + 1;
                            int i4 = i2 + 2;
                            int i5 = i2 + 3;
                            int i6 = i2 + 4;
                            f19426a = i6;
                            iHashCode2 = i6;
                            iHashCode = i3;
                            iHashCode3 = i4;
                            i = i5;
                        }
                    } else {
                        iHashCode = (c2229o.m12498k() + c2229o.m12497j()).hashCode();
                        int i7 = f19426a;
                        int i8 = i7 + 1;
                        int i9 = i7 + 2;
                        f19426a = i9;
                        iHashCode2 = (c2229o.m12498k() + c2229o.m12497j() + context.getPackageName()).hashCode();
                        i = i9;
                        iHashCode3 = i8;
                    }
                    HMSLog.m12617d("PushSelfShowLog", "notifyId:" + iHashCode + ",openNotifyId:" + iHashCode3 + ",delNotifyId:" + i + ",alarmNotifyId:" + iHashCode2);
                    if (c2229o.m12492e() <= 0) {
                        iHashCode2 = 0;
                    }
                    Notification notificationM12458a = C2219e.m12445d() ? m12458a(context, c2229o, new int[]{iHashCode, iHashCode3, i, iHashCode2}) : null;
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                    if (notificationManager != null && notificationM12458a != null) {
                        if (Build.VERSION.SDK_INT >= 26) {
                            String string = context.getString(ResourceLoaderUtil.getStringId("hms_push_channel"));
                            LR0.m4972B();
                            notificationManager.createNotificationChannel(LR0.m5000z(string));
                        }
                        notificationManager.notify(iHashCode, notificationM12458a);
                        C2226l.m12457a(context, c2229o.m12502o(), c2229o.m12489b(), "100");
                    }
                }
            } finally {
            }
        }
    }

    /* renamed from: b */
    private static PendingIntent m12467b(Context context, C2229o c2229o, int[] iArr) {
        return PendingIntent.getBroadcast(context, iArr[2], m12459a(context, c2229o, iArr, "2", 268435456), C2219e.m12437a());
    }

    /* renamed from: c */
    private static PendingIntent m12470c(Context context, C2229o c2229o, int[] iArr) {
        Intent intentM12459a = m12459a(context, c2229o, iArr, "1", 268435456);
        if (!m12465a()) {
            return PendingIntent.getBroadcast(context, iArr[1], intentM12459a, C2219e.m12437a());
        }
        intentM12459a.setClass(context, TransActivity.class);
        intentM12459a.setFlags(268468224);
        return PendingIntent.getActivity(context, iArr[1], intentM12459a, C2219e.m12437a());
    }

    /* renamed from: d */
    private static void m12472d(C2229o c2229o, Notification.Builder builder) {
        String strM12506t = c2229o.m12506t();
        String strM12496i = c2229o.m12496i();
        if (TextUtils.isEmpty(strM12496i)) {
            builder.setContentText(strM12506t);
            return;
        }
        builder.setContentText(strM12496i);
        if (TextUtils.isEmpty(strM12506t)) {
            return;
        }
        builder.setContentTitle(strM12506t);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    private static void m12468b(Context context, Notification.Builder builder, C2229o c2229o) {
        if ("com.huawei.android.pushagent".equals(context.getPackageName())) {
            Bundle bundle = new Bundle();
            String strM12497j = c2229o.m12497j();
            if (TextUtils.isEmpty(strM12497j)) {
                return;
            }
            bundle.putString("hw_origin_sender_package_name", strM12497j);
            builder.setExtras(bundle);
        }
    }

    /* renamed from: c */
    private static void m12471c(C2229o c2229o, Notification.Builder builder) {
        builder.setTicker(c2229o.m12508w());
    }

    /* renamed from: b */
    private static void m12469b(C2229o c2229o, Notification.Builder builder) {
        String strM12505s = c2229o.m12505s();
        if (TextUtils.isEmpty(strM12505s)) {
            return;
        }
        builder.setSubText(strM12505s);
    }

    /* renamed from: a */
    private static boolean m12465a() {
        return Build.VERSION.SDK_INT >= 30;
    }

    /* renamed from: a */
    private static Intent m12459a(Context context, C2229o c2229o, int[] iArr, String str, int i) {
        Intent intent = new Intent("com.huawei.intent.action.PUSH_DELAY_NOTIFY");
        intent.putExtra("selfshow_info", c2229o.m12501n()).putExtra("selfshow_token", c2229o.m12509x()).putExtra("selfshow_event_id", str).putExtra("selfshow_notify_id", iArr[0]).putExtra("selfshow_auto_clear_id", iArr[3]).setPackage(context.getPackageName()).setFlags(i);
        return intent;
    }

    /* renamed from: a */
    private static Notification m12458a(Context context, C2229o c2229o, int[] iArr) {
        Notification.Builder builder = new Notification.Builder(context);
        if (C2224j.m12453a(c2229o) == EnumC2225k.STYLE_BIGTEXT) {
            C2224j.m12454a(builder, c2229o.m12493f(), c2229o);
        }
        C2222h.m12449a(context, builder, c2229o);
        m12469b(c2229o, builder);
        m12472d(c2229o, builder);
        m12463a(context, c2229o, builder);
        m12460a(builder);
        m12464a(c2229o, builder);
        m12471c(c2229o, builder);
        builder.setContentIntent(m12470c(context, c2229o, iArr));
        builder.setDeleteIntent(m12467b(context, c2229o, iArr));
        if (Build.VERSION.SDK_INT >= 26) {
            builder.setChannelId("HwPushChannelID");
        }
        m12468b(context, builder, c2229o);
        m12461a(context, builder, c2229o);
        return builder.build();
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    private static void m12461a(Context context, Notification.Builder builder, C2229o c2229o) {
        if (HwBuildEx.VERSION.EMUI_SDK_INT < 11 || !C2219e.m12440a(context)) {
            return;
        }
        Bundle bundle = new Bundle();
        String strM12497j = c2229o.m12497j();
        HMSLog.m12622i("PushSelfShowLog", "the package name of notification is:" + strM12497j);
        if (!TextUtils.isEmpty(strM12497j)) {
            String strM12439a = C2219e.m12439a(context, strM12497j);
            HMSLog.m12622i("PushSelfShowLog", "the app name is:" + strM12439a);
            if (strM12439a != null) {
                bundle.putCharSequence("android.extraAppName", strM12439a);
            }
        }
        builder.setExtras(bundle);
    }

    /* renamed from: a */
    private static void m12463a(Context context, C2229o c2229o, Notification.Builder builder) {
        Bitmap bitmapM12448a = C2222h.m12448a(context, c2229o);
        if (bitmapM12448a != null) {
            builder.setLargeIcon(bitmapM12448a);
        }
    }

    /* renamed from: a */
    private static void m12460a(Notification.Builder builder) {
        builder.setShowWhen(true);
        builder.setWhen(System.currentTimeMillis());
    }

    /* renamed from: a */
    private static void m12464a(C2229o c2229o, Notification.Builder builder) {
        builder.setAutoCancel(c2229o.m12491d() == 1);
        builder.setOngoing(false);
    }

    /* renamed from: a */
    private static boolean m12466a(C2229o c2229o) {
        return c2229o == null || (TextUtils.isEmpty(c2229o.m12506t()) && TextUtils.isEmpty(c2229o.m12496i()));
    }
}
