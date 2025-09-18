package com.reactnative.ivpusic.imagepicker;

import com.facebook.react.bridge.ReactApplicationContext;
import defpackage.ZL0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class e implements ZL0 {
    @Override // defpackage.ZL0
    public final List createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new PickerModule(reactApplicationContext));
        return arrayList;
    }

    @Override // defpackage.ZL0
    public final List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
