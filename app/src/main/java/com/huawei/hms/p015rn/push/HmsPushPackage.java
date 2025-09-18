package com.huawei.hms.p015rn.push;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.huawei.hms.p015rn.push.local.HmsLocalNotification;
import com.huawei.hms.p015rn.push.opendevice.HmsPushOpenDevice;
import com.huawei.hms.p015rn.push.remote.HmsMessagePublisher;
import com.huawei.hms.p015rn.push.remote.HmsPushInstanceId;
import com.huawei.hms.p015rn.push.remote.HmsPushMessaging;
import com.huawei.hms.p015rn.push.remote.HmsPushProfile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.ZL0;

/* loaded from: classes.dex */
public class HmsPushPackage implements ZL0 {
    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    @Override // p000.ZL0
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new HmsPushInstanceId(reactApplicationContext));
        arrayList.add(new HmsPushMessaging(reactApplicationContext));
        arrayList.add(new HmsMessagePublisher(reactApplicationContext));
        arrayList.add(new HmsLocalNotification(reactApplicationContext));
        arrayList.add(new HmsPushOpenDevice(reactApplicationContext));
        arrayList.add(new HmsPushProfile(reactApplicationContext));
        return arrayList;
    }

    @Override // p000.ZL0
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    public /* bridge */ /* synthetic */ NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        return null;
    }
}
