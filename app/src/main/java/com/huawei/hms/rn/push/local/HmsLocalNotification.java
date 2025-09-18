package com.huawei.hms.rn.push.local;

import android.app.Application;
import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.huawei.hms.rn.push.constants.ResultCode;
import com.huawei.hms.rn.push.utils.NotificationConfigUtils;
import com.huawei.hms.rn.push.utils.ResultUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class HmsLocalNotification extends ReactContextBaseJavaModule {
    private final String TAG;
    private HmsLocalNotificationController hmsLocalNotificationController;

    public HmsLocalNotification(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.TAG = "HmsLocalNotification";
        HmsLocalNotificationController hmsLocalNotificationController = new HmsLocalNotificationController((Application) reactApplicationContext.getApplicationContext());
        this.hmsLocalNotificationController = hmsLocalNotificationController;
        hmsLocalNotificationController.createDefaultChannel();
    }

    @ReactMethod
    public void cancelAllNotifications(Promise promise) throws NumberFormatException {
        this.hmsLocalNotificationController.cancelScheduledNotifications();
        this.hmsLocalNotificationController.cancelNotifications();
        if (promise != null) {
            ResultUtils.handleResult(true, Boolean.TRUE, promise);
        }
    }

    @ReactMethod
    public void cancelNotifications(Promise promise) {
        this.hmsLocalNotificationController.cancelNotifications();
        if (promise != null) {
            ResultUtils.handleResult(true, Boolean.TRUE, promise);
        }
    }

    @ReactMethod
    public void cancelNotificationsWithId(ReadableArray readableArray, Promise promise) {
        this.hmsLocalNotificationController.cancelNotificationsWithId(readableArray);
        if (promise != null) {
            ResultUtils.handleResult(true, Boolean.TRUE, promise);
        }
    }

    @ReactMethod
    public void cancelNotificationsWithIdTag(ReadableArray readableArray, Promise promise) {
        this.hmsLocalNotificationController.cancelNotificationsWithIdTag(readableArray);
        if (promise != null) {
            ResultUtils.handleResult(true, Boolean.TRUE, promise);
        }
    }

    @ReactMethod
    public void cancelNotificationsWithTag(String str, Promise promise) {
        this.hmsLocalNotificationController.cancelNotificationsWithTag(str);
        if (promise != null) {
            ResultUtils.handleResult(true, Boolean.TRUE, promise);
        }
    }

    @ReactMethod
    public void cancelScheduledNotifications(Promise promise) throws NumberFormatException {
        this.hmsLocalNotificationController.cancelScheduledNotifications();
        if (promise != null) {
            ResultUtils.handleResult(true, Boolean.TRUE, promise);
        }
    }

    @ReactMethod
    public void channelBlocked(String str, Promise promise) {
        this.hmsLocalNotificationController.isChannelBlocked(str, promise);
    }

    @ReactMethod
    public void channelExists(String str, Promise promise) {
        this.hmsLocalNotificationController.channelExists(str, promise);
    }

    @ReactMethod
    public void deleteChannel(String str, Promise promise) {
        this.hmsLocalNotificationController.deleteChannel(str, promise);
    }

    @ReactMethod
    public void getChannels(Promise promise) {
        WritableArray writableArrayFromList = Arguments.fromList(this.hmsLocalNotificationController.listChannels());
        if (promise != null) {
            ResultUtils.handleResult(true, writableArrayFromList, promise);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return new HashMap();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return this.TAG;
    }

    @ReactMethod
    public void getNotifications(Promise promise) {
        WritableArray notifications = this.hmsLocalNotificationController.getNotifications();
        if (promise != null) {
            ResultUtils.handleResult(true, notifications, promise);
        }
    }

    @ReactMethod
    public void getScheduledNotifications(Promise promise) {
        WritableArray scheduledNotifications = this.hmsLocalNotificationController.getScheduledNotifications();
        if (promise != null) {
            ResultUtils.handleResult(true, scheduledNotifications, promise);
        }
    }

    @ReactMethod
    public void localNotification(ReadableMap readableMap, Promise promise) {
        Bundle bundle = Arguments.toBundle(readableMap);
        if (bundle == null) {
            ResultUtils.handleResult(false, Boolean.FALSE, promise, ResultCode.NULL_BUNDLE);
        } else {
            NotificationConfigUtils.configId(bundle);
            this.hmsLocalNotificationController.localNotificationNow(bundle, promise);
        }
    }

    @ReactMethod
    public void localNotificationSchedule(ReadableMap readableMap, Promise promise) throws NumberFormatException {
        Bundle bundle = Arguments.toBundle(readableMap);
        if (bundle == null) {
            ResultUtils.handleResult(false, Boolean.FALSE, promise, ResultCode.NULL_BUNDLE);
        } else {
            NotificationConfigUtils.configId(bundle);
            this.hmsLocalNotificationController.localNotificationSchedule(bundle, promise);
        }
    }
}
