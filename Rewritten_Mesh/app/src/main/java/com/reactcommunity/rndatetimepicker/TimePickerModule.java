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
import p000.DialogInterfaceOnDismissListenerC10668pa1;
import p000.InterfaceC9101dL0;
import p000.RunnableC6757rf;
import p000.UI0;

@InterfaceC9101dL0(name = TimePickerModule.NAME)
/* loaded from: classes2.dex */
public class TimePickerModule extends NativeModuleTimePickerSpec {
    public static final String NAME = "RNCTimePicker";

    public TimePickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public void lambda$open$0(AbstractC1733o abstractC1733o, ReadableMap readableMap, Promise promise) {
        UI0 ui0 = (UI0) abstractC1733o.m10039B(NAME);
        Bundle bundleM22037c = AbstractC9886jT1.m22037c(readableMap);
        if (ui0 != null) {
            Calendar calendar = Calendar.getInstance();
            if (bundleM22037c.containsKey("value")) {
                calendar.setTimeInMillis(bundleM22037c.getLong("value"));
            }
            calendar.setTimeZone(AbstractC9886jT1.m22039e(bundleM22037c));
            ui0.f11724a.updateTime(calendar.get(11), calendar.get(12));
            return;
        }
        UI0 ui02 = new UI0();
        ui02.setArguments(bundleM22037c);
        DialogInterfaceOnDismissListenerC10668pa1 dialogInterfaceOnDismissListenerC10668pa1 = new DialogInterfaceOnDismissListenerC10668pa1(this, promise, bundleM22037c);
        ui02.f11726c = dialogInterfaceOnDismissListenerC10668pa1;
        ui02.f11725b = dialogInterfaceOnDismissListenerC10668pa1;
        ui02.f11727d = dialogInterfaceOnDismissListenerC10668pa1;
        ui02.show(abstractC1733o, NAME);
    }

    @Override // com.reactcommunity.rndatetimepicker.NativeModuleTimePickerSpec
    @ReactMethod
    public void dismiss(Promise promise) {
        AbstractC9886jT1.m22038d((AbstractActivityC1730l) getCurrentActivity(), NAME, promise);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.reactcommunity.rndatetimepicker.NativeModuleTimePickerSpec
    @ReactMethod
    public void open(ReadableMap readableMap, Promise promise) {
        AbstractActivityC1730l abstractActivityC1730l = (AbstractActivityC1730l) getCurrentActivity();
        if (abstractActivityC1730l == null) {
            promise.reject("E_NO_ACTIVITY", "Tried to open a TimePicker dialog while not attached to an Activity");
        } else {
            UiThreadUtil.runOnUiThread(new RunnableC6757rf(this, abstractActivityC1730l.m10034e(), readableMap, promise, 17));
        }
    }
}
