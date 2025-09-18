package com.reactnative.ivpusic.imagepicker;

import com.facebook.react.bridge.ReactApplicationContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.ZL0;

/* renamed from: com.reactnative.ivpusic.imagepicker.e */
/* loaded from: classes2.dex */
public final class C2404e implements ZL0 {
    @Override // p000.ZL0
    public final List createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new PickerModule(reactApplicationContext));
        return arrayList;
    }

    @Override // p000.ZL0
    public final List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
