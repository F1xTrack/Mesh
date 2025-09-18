package com.huawei.hms.rn.push.remote;

import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.huawei.hms.push.RemoteMessage;
import com.huawei.hms.rn.push.constants.Core;
import com.huawei.hms.rn.push.utils.BundleUtils;
import com.huawei.hms.rn.push.utils.RemoteMessageUtils;

/* loaded from: classes.dex */
public class HmsMessagePublisher extends ReactContextBaseJavaModule {
    private static String TAG = "HmsMessagePublisher";
    private static String bundleString;
    private static volatile ReactApplicationContext context;
    private static String multiSenderToken;
    private static String token;

    public HmsMessagePublisher(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        setContext(reactApplicationContext);
    }

    public static String getBundleString() {
        return bundleString;
    }

    public static ReactApplicationContext getContext() {
        return context;
    }

    public static String getMultiSenderToken() {
        return multiSenderToken;
    }

    public static String getToken() {
        return token;
    }

    public static void sendMessageReceivedEvent(RemoteMessage remoteMessage) {
        try {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putMap("msg", RemoteMessageUtils.toWritableMap(remoteMessage));
            ReactApplicationContext context2 = getContext();
            if (context2 != null) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) context2.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(Core.Event.REMOTE_DATA_MESSAGE_RECEIVED, writableMapCreateMap);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void sendMultiSenderTokenErrorEvent(Exception exc, Bundle bundle) {
        try {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString(Core.Event.Result.EXCEPTION, exc.getLocalizedMessage());
            writableMapCreateMap.putString(Core.Event.Result.DATA_JSON, BundleUtils.convertJSON(bundle));
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) getContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(Core.Event.ON_MULTI_SENDER_TOKEN_ERROR_EVENT, writableMapCreateMap);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void sendOnMessageDeliveredEvent(String str, int i, String str2) {
        try {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("result", i + "");
            writableMapCreateMap.putString("msgId", str);
            writableMapCreateMap.putString(Core.Event.Result.RESULT_INFO, str2);
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) getContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(Core.Event.ON_PUSH_MESSAGE_SENT_DELIVERED, writableMapCreateMap);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void sendOnMessageSentErrorEvent(String str, int i, String str2) {
        try {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("result", i + "");
            writableMapCreateMap.putString("msgId", str);
            writableMapCreateMap.putString(Core.Event.Result.RESULT_INFO, str2);
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) getContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(Core.Event.ON_PUSH_MESSAGE_SENT_ERROR, writableMapCreateMap);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void sendOnMessageSentEvent(String str) {
        try {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("msgId", str);
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) getContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(Core.Event.ON_PUSH_MESSAGE_SENT, writableMapCreateMap);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void sendOnNewMultiSenderTokenEvent(String str, Bundle bundle) {
        try {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("token", str);
            writableMapCreateMap.putString(Core.Event.Result.DATA_JSON, BundleUtils.convertJSON(bundle));
            if (getContext() != null) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) getContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(Core.Event.ON_MULTI_SENDER_TOKEN_RECEIVED_EVENT, writableMapCreateMap);
            } else {
                setBundleString(BundleUtils.convertJSON(bundle));
                setMultiSenderToken(str);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void sendOnNewTokenEvent(String str) {
        try {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("token", str);
            if (getContext() == null) {
                setToken(str);
            } else {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) getContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(Core.Event.ON_TOKEN_RECEIVED_EVENT, writableMapCreateMap);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void sendTokenErrorEvent(Exception exc) {
        try {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString(Core.Event.Result.EXCEPTION, exc.getMessage());
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) getContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(Core.Event.ON_TOKEN_ERROR_EVENT, writableMapCreateMap);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void setBundleString(String str) {
        bundleString = str;
    }

    public static void setContext(ReactApplicationContext reactApplicationContext) {
        context = reactApplicationContext;
    }

    public static void setMultiSenderToken(String str) {
        multiSenderToken = str;
    }

    public static void setToken(String str) {
        token = str;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        try {
            if (getToken() != null) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("token", getToken());
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) getContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(Core.Event.ON_TOKEN_RECEIVED_EVENT, writableMapCreateMap);
            }
            if (getBundleString() == null || getMultiSenderToken() == null) {
                return;
            }
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putString("token", getMultiSenderToken());
            writableMapCreateMap2.putString(Core.Event.Result.DATA_JSON, getBundleString());
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) getContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(Core.Event.ON_MULTI_SENDER_TOKEN_RECEIVED_EVENT, writableMapCreateMap2);
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
