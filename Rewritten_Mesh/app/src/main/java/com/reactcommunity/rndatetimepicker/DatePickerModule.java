package com.reactcommunity.rndatetimepicker;

import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC1730l;
import androidx.fragment.app.AbstractC1733o;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.Calendar;
import p000.AbstractC9886jT1;
import p000.C11397vH0;
import p000.DialogInterfaceOnDismissListenerC6412mD;
import p000.InterfaceC9101dL0;
import p000.RunnableC6757rf;

@InterfaceC9101dL0(name = DatePickerModule.NAME)
/* loaded from: classes2.dex */
public class DatePickerModule extends NativeModuleDatePickerSpec {
    public static final String NAME = "RNCDatePicker";

    public DatePickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public void lambda$open$0(AbstractC1733o abstractC1733o, ReadableMap readableMap, Promise promise) {
        C11397vH0 c11397vH0 = (C11397vH0) abstractC1733o.m10039B(NAME);
        Bundle bundleM22035a = AbstractC9886jT1.m22035a(readableMap);
        if (c11397vH0 != null) {
            Calendar calendar = Calendar.getInstance();
            if (bundleM22035a.containsKey("value")) {
                calendar.setTimeInMillis(bundleM22035a.getLong("value"));
            }
            calendar.setTimeZone(AbstractC9886jT1.m22039e(bundleM22035a));
            c11397vH0.f44316a.updateDate(calendar.get(1), calendar.get(2), calendar.get(5));
            return;
        }
        C11397vH0 c11397vH02 = new C11397vH0();
        c11397vH02.setArguments(bundleM22035a);
        DialogInterfaceOnDismissListenerC6412mD dialogInterfaceOnDismissListenerC6412mD = new DialogInterfaceOnDismissListenerC6412mD(this, promise, bundleM22035a);
        c11397vH02.f44318c = dialogInterfaceOnDismissListenerC6412mD;
        c11397vH02.f44317b = dialogInterfaceOnDismissListenerC6412mD;
        c11397vH02.f44319d = dialogInterfaceOnDismissListenerC6412mD;
        c11397vH02.show(abstractC1733o, NAME);
    }

    @Override // com.reactcommunity.rndatetimepicker.NativeModuleDatePickerSpec
    @ReactMethod
    public void dismiss(Promise promise) {
        AbstractC9886jT1.m22038d((AbstractActivityC1730l) getCurrentActivity(), NAME, promise);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.reactcommunity.rndatetimepicker.NativeModuleDatePickerSpec
    @ReactMethod
    public void open(ReadableMap readableMap, Promise promise) {
        AbstractActivityC1730l abstractActivityC1730l = (AbstractActivityC1730l) getCurrentActivity();
        if (abstractActivityC1730l == null) {
            promise.reject("E_NO_ACTIVITY", "Tried to open a DatePicker dialog while not attached to an Activity");
        } else {
            UiThreadUtil.runOnUiThread(new RunnableC6757rf(this, abstractActivityC1730l.m10034e(), readableMap, promise, 4));
        }
    }
}
