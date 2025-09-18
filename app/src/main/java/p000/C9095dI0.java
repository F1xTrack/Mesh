package p000;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.Application;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import com.dieam.reactnativepushnotification.modules.RNPushNotificationPublisher;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dI0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9095dI0 {

    /* renamed from: a */
    public final Application f25932a;

    /* renamed from: b */
    public final C7621Fx1 f25933b;

    /* renamed from: c */
    public final SharedPreferences f25934c;

    public C9095dI0(Application application) {
        this.f25932a = application;
        this.f25933b = new C7621Fx1(application);
        this.f25934c = application.getSharedPreferences("rn_push_notification", 0);
    }

    /* renamed from: a */
    public final void m17520a(String str) throws NumberFormatException {
        Bundle bundle = new Bundle();
        bundle.putString(NotificationConstants.f19487ID, str);
        PendingIntent pendingIntentM17528i = m17528i(bundle);
        if (pendingIntentM17528i != null) {
            ((AlarmManager) this.f25932a.getSystemService("alarm")).cancel(pendingIntentM17528i);
        }
        SharedPreferences sharedPreferences = this.f25934c;
        if (sharedPreferences.contains(str)) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.remove(str);
            editorEdit.apply();
        }
        try {
            m17523d().cancel(Integer.parseInt(str));
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public final Uri m17521b(String str) {
        int identifier;
        if (str == null || "default".equalsIgnoreCase(str)) {
            return RingtoneManager.getDefaultUri(2);
        }
        Application application = this.f25932a;
        if (application.getResources().getIdentifier(str, Core.RAW, application.getPackageName()) != 0) {
            identifier = application.getResources().getIdentifier(str, Core.RAW, application.getPackageName());
        } else {
            identifier = application.getResources().getIdentifier(str.substring(0, str.lastIndexOf(46)), Core.RAW, application.getPackageName());
        }
        return Uri.parse("android.resource://" + application.getPackageName() + "/" + identifier);
    }

    /* renamed from: c */
    public final boolean m17522c() {
        Application application = this.f25932a;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) application.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.processName.equals(application.getPackageName()) && runningAppProcessInfo.importance == 100 && runningAppProcessInfo.pkgList.length > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final NotificationManager m17523d() {
        return (NotificationManager) this.f25932a.getSystemService("notification");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m17524e(android.os.Bundle r13) throws org.json.JSONException, java.lang.ClassNotFoundException, java.lang.NumberFormatException {
        /*
            r12 = this;
            java.lang.String r0 = "repeatType"
            java.lang.String r0 = r13.getString(r0)
            java.lang.String r1 = "repeatTime"
            double r1 = r13.getDouble(r1)
            long r1 = (long) r1
            if (r0 == 0) goto Lc3
            java.lang.String r3 = "fireDate"
            double r4 = r13.getDouble(r3)
            long r4 = (long) r4
            java.lang.String r8 = "week"
            java.lang.String r9 = "day"
            java.lang.String r6 = "time"
            java.lang.String r7 = "month"
            java.lang.String r10 = "hour"
            java.lang.String r11 = "minute"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7, r8, r9, r10, r11}
            java.util.List r6 = java.util.Arrays.asList(r6)
            boolean r6 = r6.contains(r0)
            if (r6 != 0) goto L36
            java.lang.String r13 = "Invalid repeatType specified as "
            r13.concat(r0)
            return
        L36:
            java.lang.String r6 = "time"
            boolean r7 = r6.equals(r0)
            r8 = 0
            if (r7 == 0) goto L45
            int r7 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r7 > 0) goto L45
            return
        L45:
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L4e
            long r4 = r4 + r1
            goto Lb0
        L4e:
            int r6 = r0.hashCode()
            r7 = 1
            r10 = 3
            r11 = 2
            switch(r6) {
                case -1074026988: goto L81;
                case 99228: goto L77;
                case 3208676: goto L6d;
                case 3645428: goto L63;
                case 104080000: goto L59;
                default: goto L58;
            }
        L58:
            goto L8b
        L59:
            java.lang.String r6 = "month"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L8b
            r0 = 0
            goto L8c
        L63:
            java.lang.String r6 = "week"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L8b
            r0 = r7
            goto L8c
        L6d:
            java.lang.String r6 = "hour"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L8b
            r0 = r11
            goto L8c
        L77:
            java.lang.String r6 = "day"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L8b
            r0 = 4
            goto L8c
        L81:
            java.lang.String r6 = "minute"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L8b
            r0 = r10
            goto L8c
        L8b:
            r0 = -1
        L8c:
            if (r0 == 0) goto L9c
            if (r0 == r7) goto L9d
            if (r0 == r11) goto L99
            if (r0 == r10) goto L96
            r10 = 5
            goto L9d
        L96:
            r10 = 12
            goto L9d
        L99:
            r10 = 10
            goto L9d
        L9c:
            r10 = r11
        L9d:
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r0.setTimeInMillis(r4)
            int r4 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r4 <= 0) goto La9
            int r7 = (int) r1
        La9:
            r0.add(r10, r7)
            long r4 = r0.getTimeInMillis()
        Lb0:
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 == 0) goto Lc3
            java.lang.String r0 = "id"
            r13.getString(r0)
            java.lang.Long.toString(r4)
            double r0 = (double) r4
            r13.putDouble(r3, r0)
            r12.m17525f(r13)
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9095dI0.m17524e(android.os.Bundle):void");
    }

    /* renamed from: f */
    public final void m17525f(Bundle bundle) throws JSONException, ClassNotFoundException, NumberFormatException {
        Class<?> cls;
        Application application = this.f25932a;
        try {
            cls = Class.forName(application.getPackageManager().getLaunchIntentForPackage(application.getPackageName()).getComponent().getClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            cls = null;
        }
        if (cls == null || bundle.getString("message") == null || bundle.getString(NotificationConstants.f19487ID) == null || bundle.getDouble(NotificationConstants.FIRE_DATE) == ConfigValue.DOUBLE_DEFAULT_VALUE) {
            return;
        }
        String string = bundle.getString(NotificationConstants.f19487ID);
        String string2 = bundle.getString("message");
        double d = bundle.getDouble(NotificationConstants.FIRE_DATE);
        String string3 = bundle.getString("title");
        String string4 = bundle.getString("ticker");
        boolean z = bundle.getBoolean(NotificationConstants.SHOW_WHEN);
        boolean z2 = bundle.getBoolean("autoCancel");
        String string5 = bundle.getString(NotificationConstants.LARGE_ICON);
        String string6 = bundle.getString(NotificationConstants.LARGE_ICON_URL);
        String string7 = bundle.getString(NotificationConstants.SMALL_ICON);
        String string8 = bundle.getString(NotificationConstants.BIG_TEXT);
        String string9 = bundle.getString(NotificationConstants.SUB_TEXT);
        String string10 = bundle.getString(NotificationConstants.BIG_PICTURE_URL);
        String string11 = bundle.getString(NotificationConstants.SHORTCUT_ID);
        String string12 = bundle.getString(NotificationConstants.NUMBER);
        String string13 = bundle.getString("channelId");
        String string14 = bundle.getString("sound");
        String string15 = bundle.getString("color");
        String string16 = bundle.getString(NotificationConstants.GROUP);
        boolean z3 = bundle.getBoolean(NotificationConstants.GROUP_SUMMARY);
        String string17 = bundle.getString(RemoteMessageAttributes.MESSAGE_ID);
        boolean z4 = bundle.getBoolean(NotificationConstants.PLAY_SOUND);
        boolean z5 = bundle.getBoolean(NotificationConstants.VIBRATE);
        double d2 = bundle.getDouble("vibration");
        String string18 = bundle.getString(NotificationConstants.ACTIONS);
        boolean z6 = bundle.getBoolean(NotificationConstants.INVOKE_APP);
        String string19 = bundle.getString("tag");
        String string20 = bundle.getString(NotificationConstants.REPEAT_TYPE);
        double d3 = bundle.getDouble(NotificationConstants.REPEAT_TIME);
        double d4 = bundle.getDouble(RemoteMessageConst.Notification.WHEN);
        boolean z7 = bundle.getBoolean("usesChronometer");
        double d5 = bundle.getDouble("timeoutAfter");
        boolean z8 = bundle.getBoolean(NotificationConstants.ONLY_ALERT_ONCE);
        boolean z9 = bundle.getBoolean(NotificationConstants.ONGOING);
        String string21 = bundle.getString("reply_button_text");
        String string22 = bundle.getString("reply_placeholder_text");
        boolean z10 = bundle.getBoolean(NotificationConstants.ALLOW_WHILE_IDLE);
        boolean z11 = bundle.getBoolean("ignoreInForeground");
        String string23 = bundle.getString("userInfo");
        SharedPreferences sharedPreferences = this.f25934c;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(NotificationConstants.f19487ID, string);
            jSONObject.put("message", string2);
            jSONObject.put(NotificationConstants.FIRE_DATE, d);
            jSONObject.put("title", string3);
            jSONObject.put("ticker", string4);
            jSONObject.put(NotificationConstants.SHOW_WHEN, z);
            jSONObject.put("autoCancel", z2);
            jSONObject.put(NotificationConstants.LARGE_ICON, string5);
            jSONObject.put(NotificationConstants.LARGE_ICON_URL, string6);
            jSONObject.put(NotificationConstants.SMALL_ICON, string7);
            jSONObject.put(NotificationConstants.BIG_TEXT, string8);
            jSONObject.put(NotificationConstants.BIG_PICTURE_URL, string10);
            jSONObject.put(NotificationConstants.SUB_TEXT, string9);
            jSONObject.put(NotificationConstants.SHORTCUT_ID, string11);
            jSONObject.put(NotificationConstants.NUMBER, string12);
            jSONObject.put("channelId", string13);
            jSONObject.put("sound", string14);
            jSONObject.put("color", string15);
            jSONObject.put(NotificationConstants.GROUP, string16);
            jSONObject.put(NotificationConstants.GROUP_SUMMARY, z3);
            jSONObject.put(RemoteMessageAttributes.MESSAGE_ID, string17);
            jSONObject.put(NotificationConstants.PLAY_SOUND, z4);
            jSONObject.put(NotificationConstants.VIBRATE, z5);
            jSONObject.put("vibration", d2);
            jSONObject.put(NotificationConstants.ACTIONS, string18);
            jSONObject.put(NotificationConstants.INVOKE_APP, z6);
            jSONObject.put("tag", string19);
            jSONObject.put(NotificationConstants.REPEAT_TYPE, string20);
            jSONObject.put(NotificationConstants.REPEAT_TIME, d3);
            jSONObject.put(RemoteMessageConst.Notification.WHEN, d4);
            jSONObject.put("usesChronometer", z7);
            jSONObject.put("timeoutAfter", d5);
            jSONObject.put(NotificationConstants.ONLY_ALERT_ONCE, z8);
            jSONObject.put(NotificationConstants.ONGOING, z9);
            jSONObject.put("reply_button_text", string21);
            jSONObject.put("reply_placeholder_text", string22);
            jSONObject.put(NotificationConstants.ALLOW_WHILE_IDLE, z10);
            jSONObject.put("ignoreInForeground", z11);
            jSONObject.put("userInfo", string23);
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        editorEdit.putString(string, jSONObject.toString());
        editorEdit.apply();
        sharedPreferences.contains(string);
        m17526g(bundle);
    }

    /* renamed from: g */
    public final void m17526g(Bundle bundle) throws NumberFormatException {
        long j = (long) bundle.getDouble(NotificationConstants.FIRE_DATE);
        boolean z = bundle.getBoolean(NotificationConstants.ALLOW_WHILE_IDLE);
        PendingIntent pendingIntentM17528i = m17528i(bundle);
        if (pendingIntentM17528i == null) {
            return;
        }
        bundle.getString(NotificationConstants.f19487ID);
        Long.toString(j);
        if (z) {
            ((AlarmManager) this.f25932a.getSystemService("alarm")).setExactAndAllowWhileIdle(0, j, pendingIntentM17528i);
        } else {
            ((AlarmManager) this.f25932a.getSystemService("alarm")).setExact(0, j, pendingIntentM17528i);
        }
    }

    /* renamed from: h */
    public final void m17527h(Bundle bundle) {
        C4238iN c4238iN = new C4238iN(this, bundle, false, 23);
        C6479nH c6479nH = new C6479nH();
        c6479nH.f38227a = new AtomicInteger(0);
        c6479nH.f38231e = c4238iN;
        Application application = this.f25932a;
        String string = bundle.getString(NotificationConstants.LARGE_ICON_URL);
        if (string == null) {
            c6479nH.f38228b = null;
            c6479nH.m23118e();
        } else {
            try {
                C6479nH.m23114d(application, Uri.parse(string), new C9351fI0(c6479nH, 1));
            } catch (Exception unused) {
                c6479nH.f38228b = null;
                c6479nH.m23118e();
            }
        }
        String string2 = bundle.getString("bigLargeIconUrl");
        if (string2 == null) {
            c6479nH.f38230d = null;
            c6479nH.m23118e();
        } else {
            try {
                C6479nH.m23114d(application, Uri.parse(string2), new C9351fI0(c6479nH, 2));
            } catch (Exception unused2) {
                c6479nH.f38230d = null;
                c6479nH.m23118e();
            }
        }
        String string3 = bundle.getString(NotificationConstants.BIG_PICTURE_URL);
        if (string3 == null) {
            c6479nH.f38229c = null;
            c6479nH.m23118e();
            return;
        }
        try {
            C6479nH.m23114d(application, Uri.parse(string3), new C9351fI0(c6479nH, 0));
        } catch (Exception unused3) {
            c6479nH.f38229c = null;
            c6479nH.m23118e();
        }
    }

    /* renamed from: i */
    public final PendingIntent m17528i(Bundle bundle) throws NumberFormatException {
        try {
            int i = Integer.parseInt(bundle.getString(NotificationConstants.f19487ID));
            Application application = this.f25932a;
            Intent intent = new Intent(application, (Class<?>) RNPushNotificationPublisher.class);
            intent.putExtra(Core.ScheduledPublisher.NOTIFICATION_ID, i);
            intent.putExtras(bundle);
            return PendingIntent.getBroadcast(application, i, intent, 201326592);
        } catch (Exception unused) {
            return null;
        }
    }
}
