package com.huawei.hms.rn.push.local;

import android.app.AlarmManager;
import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.huawei.hms.rn.push.config.NotificationAttributes;
import com.huawei.hms.rn.push.constants.Core;
import com.huawei.hms.rn.push.constants.NotificationConstants;
import com.huawei.hms.rn.push.constants.ResultCode;
import com.huawei.hms.rn.push.receiver.HmsLocalNotificationScheduledPublisher;
import com.huawei.hms.rn.push.utils.BundleUtils;
import com.huawei.hms.rn.push.utils.NotificationConfigUtils;
import com.huawei.hms.rn.push.utils.ResultUtils;
import com.yandex.varioqub.config.model.ConfigValue;
import defpackage.AbstractC2488cI0;
import defpackage.H30;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes.dex */
public class HmsLocalNotificationController {
    private final String TAG = "HmsLocalNotificationController";
    private Context context;
    private final SharedPreferences sharedPreferences;

    public HmsLocalNotificationController(Application application) {
        this.context = application;
        this.sharedPreferences = application.getSharedPreferences(Core.PREFERENCE_NAME, 0);
    }

    private PendingIntent buildScheduleNotificationIntent(Bundle bundle) throws NumberFormatException {
        try {
            int i = Integer.parseInt(BundleUtils.get(bundle, NotificationConstants.ID));
            Intent intent = new Intent(this.context, (Class<?>) HmsLocalNotificationScheduledPublisher.class);
            intent.putExtra(Core.ScheduledPublisher.NOTIFICATION_ID, i);
            intent.putExtras(bundle);
            return PendingIntent.getBroadcast(this.context, i, intent, 201326592);
        } catch (Exception unused) {
            return null;
        }
    }

    private void cancelScheduledNotification(String str) throws NumberFormatException {
        if (this.sharedPreferences.contains(str)) {
            SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
            editorEdit.remove(str);
            editorEdit.apply();
        }
        NotificationManager notificationManager = notificationManager();
        Bundle bundle = new Bundle();
        bundle.putString(NotificationConstants.ID, str);
        PendingIntent pendingIntentBuildScheduleNotificationIntent = buildScheduleNotificationIntent(bundle);
        if (pendingIntentBuildScheduleNotificationIntent != null) {
            getAlarmManager().cancel(pendingIntentBuildScheduleNotificationIntent);
        }
        try {
            notificationManager.cancel(Integer.parseInt(str));
        } catch (Exception e) {
            e.getLocalizedMessage();
        }
    }

    private void createChannel(NotificationManager notificationManager, String str, String str2, String str3, Uri uri, int i, long[] jArr) {
        if (Build.VERSION.SDK_INT >= 26 && notificationManager != null && notificationManager.getNotificationChannel(str) == null) {
            if (str2 == null) {
                str2 = Core.NOTIFICATION_CHANNEL_NAME;
            }
            if (str3 == null) {
                str3 = Core.NOTIFICATION_CHANNEL_DESC;
            }
            NotificationChannel notificationChannelD = AbstractC2488cI0.d(i, str, str2);
            notificationChannelD.setDescription(str3);
            notificationChannelD.enableLights(true);
            notificationChannelD.enableVibration(true);
            notificationChannelD.setVibrationPattern(jArr);
            if (uri != null) {
                notificationChannelD.setSound(uri, new AudioAttributes.Builder().setContentType(4).setUsage(5).build());
            } else {
                notificationChannelD.setSound(null, null);
            }
            notificationManager.createNotificationChannel(notificationChannelD);
        }
    }

    private AlarmManager getAlarmManager() {
        return (AlarmManager) this.context.getSystemService("alarm");
    }

    private void localNotificationRepeat(Bundle bundle) throws NumberFormatException {
        long jConfigNextFireDate = NotificationConfigUtils.configNextFireDate(bundle);
        if (jConfigNextFireDate == 0) {
            return;
        }
        bundle.putDouble(NotificationConstants.FIRE_DATE, jConfigNextFireDate);
        localNotificationSchedule(bundle, null);
    }

    private NotificationManager notificationManager() {
        return (NotificationManager) this.context.getSystemService("notification");
    }

    public void cancelNotification(int i) {
        notificationManager().cancel(i);
    }

    public void cancelNotifications() {
        notificationManager().cancelAll();
    }

    public void cancelNotificationsWithId(ReadableArray readableArray) {
        for (int i = 0; i < readableArray.size(); i++) {
            String string = readableArray.getString(i);
            if (string != null) {
                cancelNotification(Integer.parseInt(string));
            }
        }
    }

    public void cancelNotificationsWithIdTag(ReadableArray readableArray) {
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableMap map = readableArray.getMap(i);
            String string = map.getString(NotificationConstants.ID);
            String string2 = map.getString("tag");
            if (string != null) {
                cancelNotification(string2, Integer.parseInt(string));
            }
        }
    }

    public void cancelNotificationsWithTag(String str) {
        for (StatusBarNotification statusBarNotification : notificationManager().getActiveNotifications()) {
            if (str.equals(statusBarNotification.getTag())) {
                cancelNotification(str, statusBarNotification.getId());
            }
        }
    }

    public void cancelScheduledNotifications() throws NumberFormatException {
        Iterator<String> it = this.sharedPreferences.getAll().keySet().iterator();
        while (it.hasNext()) {
            cancelScheduledNotification(it.next());
        }
    }

    public void channelExists(String str, Promise promise) {
        if (Build.VERSION.SDK_INT < 26) {
            ResultUtils.handleResult(false, "requires API level 26", promise, ResultCode.ERROR);
        } else if (notificationManager().getNotificationChannel(str) == null) {
            ResultUtils.handleResult(false, "Channel not found", promise, ResultCode.ERROR);
        } else {
            ResultUtils.handleResult(true, true, promise);
        }
    }

    public void checkRequiredParams(Bundle bundle, Promise promise, String str) {
        if (getMainActivityClass() == null) {
            if (promise != null) {
                ResultUtils.handleResult(false, "No activity class", promise, ResultCode.ERROR);
                return;
            }
            return;
        }
        if (BundleUtils.get(bundle, "message") == null) {
            if (promise != null) {
                ResultUtils.handleResult(false, "Notification Message is required", promise, ResultCode.ERROR);
            }
        } else if (BundleUtils.get(bundle, NotificationConstants.ID) == null) {
            if (promise != null) {
                ResultUtils.handleResult(false, "Notification ID is null", promise, ResultCode.ERROR);
            }
        } else if (str.equals(Core.NotificationType.SCHEDULED) && BundleUtils.getD(bundle, NotificationConstants.FIRE_DATE) == ConfigValue.DOUBLE_DEFAULT_VALUE && promise != null) {
            ResultUtils.handleResult(false, "FireDate is null", promise, ResultCode.ERROR);
        }
    }

    public void createDefaultChannel() {
        createChannel(notificationManager(), "huawei-hms-rn-push-channel-id-4", Core.NOTIFICATION_CHANNEL_NAME, Core.NOTIFICATION_CHANNEL_DESC, RingtoneManager.getDefaultUri(2), 4, new long[]{0, 250});
    }

    public void deleteChannel(String str, Promise promise) {
        if (Build.VERSION.SDK_INT < 26) {
            if (promise != null) {
                ResultUtils.handleResult(false, "requires API level 26", promise, ResultCode.ERROR);
            }
        } else {
            notificationManager().deleteNotificationChannel(str);
            if (promise != null) {
                ResultUtils.handleResult(true, Boolean.TRUE, promise);
            }
        }
    }

    public Class getMainActivityClass() {
        try {
            return Class.forName(this.context.getPackageManager().getLaunchIntentForPackage(this.context.getPackageName()).getComponent().getClassName());
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public WritableArray getNotifications() {
        StatusBarNotification[] activeNotifications = notificationManager().getActiveNotifications();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (StatusBarNotification statusBarNotification : activeNotifications) {
            Notification notification = statusBarNotification.getNotification();
            Bundle bundle = notification.extras;
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString(NotificationConstants.IDENTIFIER, "" + statusBarNotification.getId());
            writableMapCreateMap.putString("title", bundle.getString("android.title"));
            writableMapCreateMap.putString("body", bundle.getString("android.text"));
            writableMapCreateMap.putString("tag", statusBarNotification.getTag());
            writableMapCreateMap.putString(NotificationConstants.GROUP, notification.getGroup());
            writableArrayCreateArray.pushMap(writableMapCreateMap);
        }
        return writableArrayCreateArray;
    }

    public WritableArray getScheduledNotifications() {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Iterator<Map.Entry<String, ?>> it = this.sharedPreferences.getAll().entrySet().iterator();
        while (it.hasNext()) {
            try {
                NotificationAttributes notificationAttributesFromJson = NotificationAttributes.fromJson(it.next().getValue().toString());
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString(NotificationConstants.ID, notificationAttributesFromJson.getId());
                writableMapCreateMap.putString("title", notificationAttributesFromJson.getTitle());
                writableMapCreateMap.putString("message", notificationAttributesFromJson.getMessage());
                writableMapCreateMap.putString("ticker", notificationAttributesFromJson.getTicker());
                writableMapCreateMap.putString(NotificationConstants.NUMBER, notificationAttributesFromJson.getNumber());
                writableMapCreateMap.putDouble(NotificationConstants.DATE, notificationAttributesFromJson.getFireDate());
                writableMapCreateMap.putString("channelId", notificationAttributesFromJson.getChannelId());
                writableMapCreateMap.putString(NotificationConstants.CHANNEL_NAME, notificationAttributesFromJson.getChannelName());
                writableMapCreateMap.putString("tag", notificationAttributesFromJson.getTag());
                writableMapCreateMap.putString(NotificationConstants.REPEAT_INTERVAL, notificationAttributesFromJson.getRepeatType());
                writableMapCreateMap.putString(NotificationConstants.SOUND_NAME, notificationAttributesFromJson.getSound());
                writableArrayCreateArray.pushMap(writableMapCreateMap);
            } catch (JSONException e) {
                e.getLocalizedMessage();
            }
        }
        return writableArrayCreateArray;
    }

    public void invokeApp(Bundle bundle) throws ClassNotFoundException {
        Intent launchIntentForPackage = this.context.getPackageManager().getLaunchIntentForPackage(this.context.getPackageName());
        if (launchIntentForPackage == null) {
            return;
        }
        try {
            Intent intent = new Intent(this.context, Class.forName(launchIntentForPackage.getComponent().getClassName()));
            if (bundle != null) {
                intent.putExtra("notification", bundle);
            }
            intent.addFlags(268435456);
            this.context.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public void isChannelBlocked(String str, Promise promise) {
        if (Build.VERSION.SDK_INT < 26) {
            ResultUtils.handleResult(false, "requires API level 24", promise, ResultCode.ERROR);
            return;
        }
        if (str == null) {
            ResultUtils.handleResult(false, "invalid channelId", promise, ResultCode.ERROR);
            return;
        }
        NotificationChannel notificationChannel = notificationManager().getNotificationChannel(str);
        if (notificationChannel == null) {
            ResultUtils.handleResult(false, "Channel not found", promise, ResultCode.ERROR);
        } else {
            ResultUtils.handleResult(true, Boolean.valueOf(notificationChannel.getImportance() == 0), promise);
        }
    }

    public List<String> listChannels() {
        if (Build.VERSION.SDK_INT < 26) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = notificationManager().getNotificationChannels().iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC2488cI0.e(it.next()).getId());
        }
        return arrayList;
    }

    public void localNotificationNow(Bundle bundle, Promise promise) {
        HmsLocalNotificationPicturesLoader hmsLocalNotificationPicturesLoader = new HmsLocalNotificationPicturesLoader(new H30(this, 0, bundle));
        hmsLocalNotificationPicturesLoader.setReactPromise(promise);
        hmsLocalNotificationPicturesLoader.setLargeIconUrl(this.context, BundleUtils.get(bundle, NotificationConstants.LARGE_ICON_URL));
        hmsLocalNotificationPicturesLoader.setBigPictureUrl(this.context, BundleUtils.get(bundle, NotificationConstants.BIG_PICTURE_URL));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:294:0x00b2 A[Catch: IllegalStateException -> 0x00a1, IllegalArgumentException -> 0x00a9, NullPointerException -> 0x00ab, TRY_LEAVE, TryCatch #18 {IllegalArgumentException -> 0x00a9, IllegalStateException -> 0x00a1, NullPointerException -> 0x00ab, blocks: (B:284:0x0096, B:294:0x00b2, B:297:0x00bd, B:300:0x00c6, B:322:0x010e, B:325:0x0128, B:327:0x012d, B:329:0x013c, B:349:0x017c, B:375:0x0216, B:380:0x022e, B:388:0x025b, B:409:0x02a5, B:411:0x02ad, B:428:0x0300, B:431:0x030a, B:443:0x0376, B:445:0x0385, B:446:0x0395, B:448:0x039d, B:452:0x03a9, B:454:0x03bb, B:456:0x03c7, B:396:0x0270, B:356:0x0195, B:358:0x019b, B:360:0x01ad, B:361:0x01b8, B:365:0x01ed), top: B:523:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x00bd A[Catch: IllegalStateException -> 0x00a1, IllegalArgumentException -> 0x00a9, NullPointerException -> 0x00ab, TRY_ENTER, TRY_LEAVE, TryCatch #18 {IllegalArgumentException -> 0x00a9, IllegalStateException -> 0x00a1, NullPointerException -> 0x00ab, blocks: (B:284:0x0096, B:294:0x00b2, B:297:0x00bd, B:300:0x00c6, B:322:0x010e, B:325:0x0128, B:327:0x012d, B:329:0x013c, B:349:0x017c, B:375:0x0216, B:380:0x022e, B:388:0x025b, B:409:0x02a5, B:411:0x02ad, B:428:0x0300, B:431:0x030a, B:443:0x0376, B:445:0x0385, B:446:0x0395, B:448:0x039d, B:452:0x03a9, B:454:0x03bb, B:456:0x03c7, B:396:0x0270, B:356:0x0195, B:358:0x019b, B:360:0x01ad, B:361:0x01b8, B:365:0x01ed), top: B:523:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x00cc A[Catch: IllegalStateException -> 0x0402, IllegalArgumentException | IllegalStateException | NullPointerException -> 0x0406, NullPointerException -> 0x0408, TRY_ENTER, TryCatch #15 {IllegalArgumentException | IllegalStateException | NullPointerException -> 0x0406, blocks: (B:272:0x0033, B:274:0x0060, B:276:0x0066, B:278:0x0074, B:281:0x0086, B:295:0x00b5, B:298:0x00c0, B:303:0x00d3, B:305:0x00df, B:317:0x00fd, B:320:0x0106, B:323:0x0115, B:346:0x015d, B:373:0x0210, B:378:0x0223, B:382:0x0237, B:386:0x0255, B:412:0x02b0, B:416:0x02bb, B:418:0x02e3, B:393:0x0268, B:403:0x0280, B:406:0x029f, B:377:0x021c, B:372:0x020c, B:353:0x0187, B:366:0x01ff, B:344:0x0155, B:302:0x00cc), top: B:528:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x00fd A[Catch: IllegalStateException -> 0x0402, IllegalArgumentException | IllegalStateException | NullPointerException -> 0x0406, NullPointerException -> 0x0408, TRY_ENTER, TryCatch #15 {IllegalArgumentException | IllegalStateException | NullPointerException -> 0x0406, blocks: (B:272:0x0033, B:274:0x0060, B:276:0x0066, B:278:0x0074, B:281:0x0086, B:295:0x00b5, B:298:0x00c0, B:303:0x00d3, B:305:0x00df, B:317:0x00fd, B:320:0x0106, B:323:0x0115, B:346:0x015d, B:373:0x0210, B:378:0x0223, B:382:0x0237, B:386:0x0255, B:412:0x02b0, B:416:0x02bb, B:418:0x02e3, B:393:0x0268, B:403:0x0280, B:406:0x029f, B:377:0x021c, B:372:0x020c, B:353:0x0187, B:366:0x01ff, B:344:0x0155, B:302:0x00cc), top: B:528:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x010e A[Catch: IllegalStateException -> 0x00a1, IllegalArgumentException -> 0x00a9, NullPointerException -> 0x00ab, TRY_ENTER, TRY_LEAVE, TryCatch #18 {IllegalArgumentException -> 0x00a9, IllegalStateException -> 0x00a1, NullPointerException -> 0x00ab, blocks: (B:284:0x0096, B:294:0x00b2, B:297:0x00bd, B:300:0x00c6, B:322:0x010e, B:325:0x0128, B:327:0x012d, B:329:0x013c, B:349:0x017c, B:375:0x0216, B:380:0x022e, B:388:0x025b, B:409:0x02a5, B:411:0x02ad, B:428:0x0300, B:431:0x030a, B:443:0x0376, B:445:0x0385, B:446:0x0395, B:448:0x039d, B:452:0x03a9, B:454:0x03bb, B:456:0x03c7, B:396:0x0270, B:356:0x0195, B:358:0x019b, B:360:0x01ad, B:361:0x01b8, B:365:0x01ed), top: B:523:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0128 A[Catch: IllegalStateException -> 0x00a1, IllegalArgumentException -> 0x00a9, NullPointerException -> 0x00ab, TRY_ENTER, TryCatch #18 {IllegalArgumentException -> 0x00a9, IllegalStateException -> 0x00a1, NullPointerException -> 0x00ab, blocks: (B:284:0x0096, B:294:0x00b2, B:297:0x00bd, B:300:0x00c6, B:322:0x010e, B:325:0x0128, B:327:0x012d, B:329:0x013c, B:349:0x017c, B:375:0x0216, B:380:0x022e, B:388:0x025b, B:409:0x02a5, B:411:0x02ad, B:428:0x0300, B:431:0x030a, B:443:0x0376, B:445:0x0385, B:446:0x0395, B:448:0x039d, B:452:0x03a9, B:454:0x03bb, B:456:0x03c7, B:396:0x0270, B:356:0x0195, B:358:0x019b, B:360:0x01ad, B:361:0x01b8, B:365:0x01ed), top: B:523:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x012d A[Catch: IllegalStateException -> 0x00a1, IllegalArgumentException -> 0x00a9, NullPointerException -> 0x00ab, TRY_LEAVE, TryCatch #18 {IllegalArgumentException -> 0x00a9, IllegalStateException -> 0x00a1, NullPointerException -> 0x00ab, blocks: (B:284:0x0096, B:294:0x00b2, B:297:0x00bd, B:300:0x00c6, B:322:0x010e, B:325:0x0128, B:327:0x012d, B:329:0x013c, B:349:0x017c, B:375:0x0216, B:380:0x022e, B:388:0x025b, B:409:0x02a5, B:411:0x02ad, B:428:0x0300, B:431:0x030a, B:443:0x0376, B:445:0x0385, B:446:0x0395, B:448:0x039d, B:452:0x03a9, B:454:0x03bb, B:456:0x03c7, B:396:0x0270, B:356:0x0195, B:358:0x019b, B:360:0x01ad, B:361:0x01b8, B:365:0x01ed), top: B:523:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0155 A[Catch: IllegalStateException -> 0x0402, IllegalArgumentException | IllegalStateException | NullPointerException -> 0x0406, NullPointerException -> 0x0408, TRY_ENTER, TRY_LEAVE, TryCatch #15 {IllegalArgumentException | IllegalStateException | NullPointerException -> 0x0406, blocks: (B:272:0x0033, B:274:0x0060, B:276:0x0066, B:278:0x0074, B:281:0x0086, B:295:0x00b5, B:298:0x00c0, B:303:0x00d3, B:305:0x00df, B:317:0x00fd, B:320:0x0106, B:323:0x0115, B:346:0x015d, B:373:0x0210, B:378:0x0223, B:382:0x0237, B:386:0x0255, B:412:0x02b0, B:416:0x02bb, B:418:0x02e3, B:393:0x0268, B:403:0x0280, B:406:0x029f, B:377:0x021c, B:372:0x020c, B:353:0x0187, B:366:0x01ff, B:344:0x0155, B:302:0x00cc), top: B:528:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0195 A[Catch: IllegalStateException -> 0x00a1, IllegalArgumentException -> 0x00a9, NullPointerException -> 0x00ab, TRY_ENTER, TryCatch #18 {IllegalArgumentException -> 0x00a9, IllegalStateException -> 0x00a1, NullPointerException -> 0x00ab, blocks: (B:284:0x0096, B:294:0x00b2, B:297:0x00bd, B:300:0x00c6, B:322:0x010e, B:325:0x0128, B:327:0x012d, B:329:0x013c, B:349:0x017c, B:375:0x0216, B:380:0x022e, B:388:0x025b, B:409:0x02a5, B:411:0x02ad, B:428:0x0300, B:431:0x030a, B:443:0x0376, B:445:0x0385, B:446:0x0395, B:448:0x039d, B:452:0x03a9, B:454:0x03bb, B:456:0x03c7, B:396:0x0270, B:356:0x0195, B:358:0x019b, B:360:0x01ad, B:361:0x01b8, B:365:0x01ed), top: B:523:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x01ed A[Catch: IllegalStateException -> 0x00a1, IllegalArgumentException -> 0x00a9, NullPointerException -> 0x00ab, TRY_LEAVE, TryCatch #18 {IllegalArgumentException -> 0x00a9, IllegalStateException -> 0x00a1, NullPointerException -> 0x00ab, blocks: (B:284:0x0096, B:294:0x00b2, B:297:0x00bd, B:300:0x00c6, B:322:0x010e, B:325:0x0128, B:327:0x012d, B:329:0x013c, B:349:0x017c, B:375:0x0216, B:380:0x022e, B:388:0x025b, B:409:0x02a5, B:411:0x02ad, B:428:0x0300, B:431:0x030a, B:443:0x0376, B:445:0x0385, B:446:0x0395, B:448:0x039d, B:452:0x03a9, B:454:0x03bb, B:456:0x03c7, B:396:0x0270, B:356:0x0195, B:358:0x019b, B:360:0x01ad, B:361:0x01b8, B:365:0x01ed), top: B:523:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x020c A[Catch: IllegalStateException -> 0x0402, IllegalArgumentException | IllegalStateException | NullPointerException -> 0x0406, NullPointerException -> 0x0408, TryCatch #15 {IllegalArgumentException | IllegalStateException | NullPointerException -> 0x0406, blocks: (B:272:0x0033, B:274:0x0060, B:276:0x0066, B:278:0x0074, B:281:0x0086, B:295:0x00b5, B:298:0x00c0, B:303:0x00d3, B:305:0x00df, B:317:0x00fd, B:320:0x0106, B:323:0x0115, B:346:0x015d, B:373:0x0210, B:378:0x0223, B:382:0x0237, B:386:0x0255, B:412:0x02b0, B:416:0x02bb, B:418:0x02e3, B:393:0x0268, B:403:0x0280, B:406:0x029f, B:377:0x021c, B:372:0x020c, B:353:0x0187, B:366:0x01ff, B:344:0x0155, B:302:0x00cc), top: B:528:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x021c A[Catch: IllegalStateException -> 0x0402, IllegalArgumentException | IllegalStateException | NullPointerException -> 0x0406, NullPointerException -> 0x0408, TRY_ENTER, TryCatch #15 {IllegalArgumentException | IllegalStateException | NullPointerException -> 0x0406, blocks: (B:272:0x0033, B:274:0x0060, B:276:0x0066, B:278:0x0074, B:281:0x0086, B:295:0x00b5, B:298:0x00c0, B:303:0x00d3, B:305:0x00df, B:317:0x00fd, B:320:0x0106, B:323:0x0115, B:346:0x015d, B:373:0x0210, B:378:0x0223, B:382:0x0237, B:386:0x0255, B:412:0x02b0, B:416:0x02bb, B:418:0x02e3, B:393:0x0268, B:403:0x0280, B:406:0x029f, B:377:0x021c, B:372:0x020c, B:353:0x0187, B:366:0x01ff, B:344:0x0155, B:302:0x00cc), top: B:528:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:380:0x022e A[Catch: IllegalStateException -> 0x00a1, IllegalArgumentException -> 0x00a9, NullPointerException -> 0x00ab, TRY_ENTER, TRY_LEAVE, TryCatch #18 {IllegalArgumentException -> 0x00a9, IllegalStateException -> 0x00a1, NullPointerException -> 0x00ab, blocks: (B:284:0x0096, B:294:0x00b2, B:297:0x00bd, B:300:0x00c6, B:322:0x010e, B:325:0x0128, B:327:0x012d, B:329:0x013c, B:349:0x017c, B:375:0x0216, B:380:0x022e, B:388:0x025b, B:409:0x02a5, B:411:0x02ad, B:428:0x0300, B:431:0x030a, B:443:0x0376, B:445:0x0385, B:446:0x0395, B:448:0x039d, B:452:0x03a9, B:454:0x03bb, B:456:0x03c7, B:396:0x0270, B:356:0x0195, B:358:0x019b, B:360:0x01ad, B:361:0x01b8, B:365:0x01ed), top: B:523:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0270 A[Catch: IllegalStateException -> 0x00a1, IllegalArgumentException -> 0x00a9, NullPointerException -> 0x00ab, TRY_ENTER, TRY_LEAVE, TryCatch #18 {IllegalArgumentException -> 0x00a9, IllegalStateException -> 0x00a1, NullPointerException -> 0x00ab, blocks: (B:284:0x0096, B:294:0x00b2, B:297:0x00bd, B:300:0x00c6, B:322:0x010e, B:325:0x0128, B:327:0x012d, B:329:0x013c, B:349:0x017c, B:375:0x0216, B:380:0x022e, B:388:0x025b, B:409:0x02a5, B:411:0x02ad, B:428:0x0300, B:431:0x030a, B:443:0x0376, B:445:0x0385, B:446:0x0395, B:448:0x039d, B:452:0x03a9, B:454:0x03bb, B:456:0x03c7, B:396:0x0270, B:356:0x0195, B:358:0x019b, B:360:0x01ad, B:361:0x01b8, B:365:0x01ed), top: B:523:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x02ec A[Catch: Exception -> 0x02f6, TRY_LEAVE, TryCatch #9 {Exception -> 0x02f6, blocks: (B:419:0x02e6, B:421:0x02ec), top: B:509:0x02e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:425:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0385 A[Catch: IllegalStateException -> 0x00a1, IllegalArgumentException -> 0x00a9, NullPointerException -> 0x00ab, TryCatch #18 {IllegalArgumentException -> 0x00a9, IllegalStateException -> 0x00a1, NullPointerException -> 0x00ab, blocks: (B:284:0x0096, B:294:0x00b2, B:297:0x00bd, B:300:0x00c6, B:322:0x010e, B:325:0x0128, B:327:0x012d, B:329:0x013c, B:349:0x017c, B:375:0x0216, B:380:0x022e, B:388:0x025b, B:409:0x02a5, B:411:0x02ad, B:428:0x0300, B:431:0x030a, B:443:0x0376, B:445:0x0385, B:446:0x0395, B:448:0x039d, B:452:0x03a9, B:454:0x03bb, B:456:0x03c7, B:396:0x0270, B:356:0x0195, B:358:0x019b, B:360:0x01ad, B:361:0x01b8, B:365:0x01ed), top: B:523:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:452:0x03a9 A[Catch: IllegalStateException -> 0x00a1, IllegalArgumentException -> 0x00a9, NullPointerException -> 0x00ab, TryCatch #18 {IllegalArgumentException -> 0x00a9, IllegalStateException -> 0x00a1, NullPointerException -> 0x00ab, blocks: (B:284:0x0096, B:294:0x00b2, B:297:0x00bd, B:300:0x00c6, B:322:0x010e, B:325:0x0128, B:327:0x012d, B:329:0x013c, B:349:0x017c, B:375:0x0216, B:380:0x022e, B:388:0x025b, B:409:0x02a5, B:411:0x02ad, B:428:0x0300, B:431:0x030a, B:443:0x0376, B:445:0x0385, B:446:0x0395, B:448:0x039d, B:452:0x03a9, B:454:0x03bb, B:456:0x03c7, B:396:0x0270, B:356:0x0195, B:358:0x019b, B:360:0x01ad, B:361:0x01b8, B:365:0x01ed), top: B:523:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:454:0x03bb A[Catch: IllegalStateException -> 0x00a1, IllegalArgumentException -> 0x00a9, NullPointerException -> 0x00ab, TryCatch #18 {IllegalArgumentException -> 0x00a9, IllegalStateException -> 0x00a1, NullPointerException -> 0x00ab, blocks: (B:284:0x0096, B:294:0x00b2, B:297:0x00bd, B:300:0x00c6, B:322:0x010e, B:325:0x0128, B:327:0x012d, B:329:0x013c, B:349:0x017c, B:375:0x0216, B:380:0x022e, B:388:0x025b, B:409:0x02a5, B:411:0x02ad, B:428:0x0300, B:431:0x030a, B:443:0x0376, B:445:0x0385, B:446:0x0395, B:448:0x039d, B:452:0x03a9, B:454:0x03bb, B:456:0x03c7, B:396:0x0270, B:356:0x0195, B:358:0x019b, B:360:0x01ad, B:361:0x01b8, B:365:0x01ed), top: B:523:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:456:0x03c7 A[Catch: IllegalStateException -> 0x00a1, IllegalArgumentException -> 0x00a9, NullPointerException -> 0x00ab, TRY_LEAVE, TryCatch #18 {IllegalArgumentException -> 0x00a9, IllegalStateException -> 0x00a1, NullPointerException -> 0x00ab, blocks: (B:284:0x0096, B:294:0x00b2, B:297:0x00bd, B:300:0x00c6, B:322:0x010e, B:325:0x0128, B:327:0x012d, B:329:0x013c, B:349:0x017c, B:375:0x0216, B:380:0x022e, B:388:0x025b, B:409:0x02a5, B:411:0x02ad, B:428:0x0300, B:431:0x030a, B:443:0x0376, B:445:0x0385, B:446:0x0395, B:448:0x039d, B:452:0x03a9, B:454:0x03bb, B:456:0x03c7, B:396:0x0270, B:356:0x0195, B:358:0x019b, B:360:0x01ad, B:361:0x01b8, B:365:0x01ed), top: B:523:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:505:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x03cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:521:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:534:? A[RETURN, SYNTHETIC] */
    /* renamed from: localNotificationNowPicture */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void lambda$localNotificationNow$0(android.os.Bundle r33, android.graphics.Bitmap r34, android.graphics.Bitmap r35, com.facebook.react.bridge.Promise r36) throws org.json.JSONException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1060
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.rn.push.local.HmsLocalNotificationController.lambda$localNotificationNow$0(android.os.Bundle, android.graphics.Bitmap, android.graphics.Bitmap, com.facebook.react.bridge.Promise):void");
    }

    public void localNotificationSchedule(Bundle bundle, Promise promise) throws NumberFormatException {
        checkRequiredParams(bundle, promise, Core.NotificationType.SCHEDULED);
        NotificationAttributes notificationAttributes = new NotificationAttributes(bundle);
        String id = notificationAttributes.getId();
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putString(id, notificationAttributes.toJson().toString());
        editorEdit.apply();
        localNotificationScheduleSetAlarm(bundle);
        if (promise != null) {
            ResultUtils.handleResult(true, Arguments.fromBundle(bundle), promise);
        }
    }

    public void localNotificationScheduleSetAlarm(Bundle bundle) throws NumberFormatException {
        long l = BundleUtils.getL(bundle, NotificationConstants.FIRE_DATE);
        boolean b = BundleUtils.getB(bundle, NotificationConstants.ALLOW_WHILE_IDLE);
        new Date().getTime();
        PendingIntent pendingIntentBuildScheduleNotificationIntent = buildScheduleNotificationIntent(bundle);
        if (pendingIntentBuildScheduleNotificationIntent == null) {
            return;
        }
        if (b) {
            getAlarmManager().setExactAndAllowWhileIdle(0, l, pendingIntentBuildScheduleNotificationIntent);
        } else {
            getAlarmManager().setExact(0, l, pendingIntentBuildScheduleNotificationIntent);
        }
    }

    public void cancelNotification(String str, int i) {
        notificationManager().cancel(str, i);
    }
}
