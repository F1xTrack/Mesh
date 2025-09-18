package com.huawei.hms.rn.push;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.huawei.hms.rn.push.local.HmsLocalNotification;
import com.huawei.hms.rn.push.opendevice.HmsPushOpenDevice;
import com.huawei.hms.rn.push.remote.HmsMessagePublisher;
import com.huawei.hms.rn.push.remote.HmsPushInstanceId;
import com.huawei.hms.rn.push.remote.HmsPushMessaging;
import com.huawei.hms.rn.push.remote.HmsPushProfile;
import defpackage.ZL0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class HmsPushPackage implements ZL0 {
    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    @Override // defpackage.ZL0
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

    @Override // defpackage.ZL0
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    public /* bridge */ /* synthetic */ NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        return null;
    }
}
