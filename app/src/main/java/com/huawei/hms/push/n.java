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
import defpackage.LR0;

/* loaded from: classes.dex */
public class n {
    private static int a;

    public static synchronized void a(Context context, o oVar) {
        int iHashCode;
        int iHashCode2;
        int i;
        int iHashCode3;
        if (context != null) {
            try {
                if (!a(oVar)) {
                    HMSLog.d("PushSelfShowLog", "showNotification, the msg id = " + oVar.o());
                    if (a == 0) {
                        a = (context.getPackageName() + System.currentTimeMillis()).hashCode();
                    }
                    if (TextUtils.isEmpty(oVar.k())) {
                        String strP = oVar.p();
                        if (!TextUtils.isEmpty(strP)) {
                            int iHashCode4 = strP.hashCode();
                            oVar.a(iHashCode4);
                            HMSLog.d("PushSelfShowLog", "notification msgTag = " + iHashCode4);
                        }
                        if (oVar.r() != -1) {
                            iHashCode = oVar.r();
                            iHashCode3 = (oVar.j() + System.currentTimeMillis()).hashCode();
                            i = iHashCode3 + 1;
                            iHashCode2 = (oVar.r() + oVar.j() + context.getPackageName()).hashCode();
                        } else {
                            int i2 = a;
                            int i3 = i2 + 1;
                            int i4 = i2 + 2;
                            int i5 = i2 + 3;
                            int i6 = i2 + 4;
                            a = i6;
                            iHashCode2 = i6;
                            iHashCode = i3;
                            iHashCode3 = i4;
                            i = i5;
                        }
                    } else {
                        iHashCode = (oVar.k() + oVar.j()).hashCode();
                        int i7 = a;
                        int i8 = i7 + 1;
                        int i9 = i7 + 2;
                        a = i9;
                        iHashCode2 = (oVar.k() + oVar.j() + context.getPackageName()).hashCode();
                        i = i9;
                        iHashCode3 = i8;
                    }
                    HMSLog.d("PushSelfShowLog", "notifyId:" + iHashCode + ",openNotifyId:" + iHashCode3 + ",delNotifyId:" + i + ",alarmNotifyId:" + iHashCode2);
                    if (oVar.e() <= 0) {
                        iHashCode2 = 0;
                    }
                    Notification notificationA = e.d() ? a(context, oVar, new int[]{iHashCode, iHashCode3, i, iHashCode2}) : null;
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                    if (notificationManager != null && notificationA != null) {
                        if (Build.VERSION.SDK_INT >= 26) {
                            String string = context.getString(ResourceLoaderUtil.getStringId("hms_push_channel"));
                            LR0.B();
                            notificationManager.createNotificationChannel(LR0.z(string));
                        }
                        notificationManager.notify(iHashCode, notificationA);
                        l.a(context, oVar.o(), oVar.b(), "100");
                    }
                }
            } finally {
            }
        }
    }

    private static PendingIntent b(Context context, o oVar, int[] iArr) {
        return PendingIntent.getBroadcast(context, iArr[2], a(context, oVar, iArr, "2", 268435456), e.a());
    }

    private static PendingIntent c(Context context, o oVar, int[] iArr) {
        Intent intentA = a(context, oVar, iArr, "1", 268435456);
        if (!a()) {
            return PendingIntent.getBroadcast(context, iArr[1], intentA, e.a());
        }
        intentA.setClass(context, TransActivity.class);
        intentA.setFlags(268468224);
        return PendingIntent.getActivity(context, iArr[1], intentA, e.a());
    }

    private static void d(o oVar, Notification.Builder builder) {
        String strT = oVar.t();
        String strI = oVar.i();
        if (TextUtils.isEmpty(strI)) {
            builder.setContentText(strT);
            return;
        }
        builder.setContentText(strI);
        if (TextUtils.isEmpty(strT)) {
            return;
        }
        builder.setContentTitle(strT);
    }

    @SuppressLint({"NewApi"})
    private static void b(Context context, Notification.Builder builder, o oVar) {
        if ("com.huawei.android.pushagent".equals(context.getPackageName())) {
            Bundle bundle = new Bundle();
            String strJ = oVar.j();
            if (TextUtils.isEmpty(strJ)) {
                return;
            }
            bundle.putString("hw_origin_sender_package_name", strJ);
            builder.setExtras(bundle);
        }
    }

    private static void c(o oVar, Notification.Builder builder) {
        builder.setTicker(oVar.w());
    }

    private static void b(o oVar, Notification.Builder builder) {
        String strS = oVar.s();
        if (TextUtils.isEmpty(strS)) {
            return;
        }
        builder.setSubText(strS);
    }

    private static boolean a() {
        return Build.VERSION.SDK_INT >= 30;
    }

    private static Intent a(Context context, o oVar, int[] iArr, String str, int i) {
        Intent intent = new Intent("com.huawei.intent.action.PUSH_DELAY_NOTIFY");
        intent.putExtra("selfshow_info", oVar.n()).putExtra("selfshow_token", oVar.x()).putExtra("selfshow_event_id", str).putExtra("selfshow_notify_id", iArr[0]).putExtra("selfshow_auto_clear_id", iArr[3]).setPackage(context.getPackageName()).setFlags(i);
        return intent;
    }

    private static Notification a(Context context, o oVar, int[] iArr) {
        Notification.Builder builder = new Notification.Builder(context);
        if (j.a(oVar) == k.STYLE_BIGTEXT) {
            j.a(builder, oVar.f(), oVar);
        }
        h.a(context, builder, oVar);
        b(oVar, builder);
        d(oVar, builder);
        a(context, oVar, builder);
        a(builder);
        a(oVar, builder);
        c(oVar, builder);
        builder.setContentIntent(c(context, oVar, iArr));
        builder.setDeleteIntent(b(context, oVar, iArr));
        if (Build.VERSION.SDK_INT >= 26) {
            builder.setChannelId("HwPushChannelID");
        }
        b(context, builder, oVar);
        a(context, builder, oVar);
        return builder.build();
    }

    @SuppressLint({"NewApi"})
    private static void a(Context context, Notification.Builder builder, o oVar) {
        if (HwBuildEx.VERSION.EMUI_SDK_INT < 11 || !e.a(context)) {
            return;
        }
        Bundle bundle = new Bundle();
        String strJ = oVar.j();
        HMSLog.i("PushSelfShowLog", "the package name of notification is:" + strJ);
        if (!TextUtils.isEmpty(strJ)) {
            String strA = e.a(context, strJ);
            HMSLog.i("PushSelfShowLog", "the app name is:" + strA);
            if (strA != null) {
                bundle.putCharSequence("android.extraAppName", strA);
            }
        }
        builder.setExtras(bundle);
    }

    private static void a(Context context, o oVar, Notification.Builder builder) {
        Bitmap bitmapA = h.a(context, oVar);
        if (bitmapA != null) {
            builder.setLargeIcon(bitmapA);
        }
    }

    private static void a(Notification.Builder builder) {
        builder.setShowWhen(true);
        builder.setWhen(System.currentTimeMillis());
    }

    private static void a(o oVar, Notification.Builder builder) {
        builder.setAutoCancel(oVar.d() == 1);
        builder.setOngoing(false);
    }

    private static boolean a(o oVar) {
        return oVar == null || (TextUtils.isEmpty(oVar.t()) && TextUtils.isEmpty(oVar.i()));
    }
}
