package com.reactcommunity.rndatetimepicker;

import android.os.Bundle;
import android.text.format.DateFormat;
import androidx.fragment.app.AbstractActivityC1730l;
import androidx.fragment.app.AbstractC1733o;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.google.android.material.timepicker.C1949e;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import p000.AbstractC0852NX;
import p000.AbstractC9886jT1;
import p000.C10156la1;
import p000.C10951ro0;
import p000.C1753aw;
import p000.C6244jY;
import p000.C6937uF;
import p000.O90;
import p000.RunnableC6757rf;
import p000.YH0;

@Metadata(m22266d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m22267d2 = {"Lcom/reactcommunity/rndatetimepicker/MaterialTimePickerModule;", "Lcom/reactcommunity/rndatetimepicker/NativeModuleMaterialTimePickerSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "LTf1;", "dismiss", "(Lcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/ReadableMap;", "params", "open", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "Companion", "ro0", "react-native-community_datetimepicker_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class MaterialTimePickerModule extends NativeModuleMaterialTimePickerSpec {
    public static final C10951ro0 Companion = new C10951ro0();
    public static final String NAME = "RNCMaterialTimePicker";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialTimePickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        O90.m5968f(reactApplicationContext, "reactContext");
    }

    public static final void open$lambda$0(ReadableMap readableMap, Promise promise, AbstractC1733o abstractC1733o, MaterialTimePickerModule materialTimePickerModule) {
        O90.m5968f(readableMap, "$params");
        O90.m5968f(promise, "$promise");
        O90.m5968f(abstractC1733o, "$fragmentManager");
        O90.m5968f(materialTimePickerModule, "this$0");
        Bundle bundleM22037c = AbstractC9886jT1.m22037c(readableMap);
        ReactApplicationContext reactApplicationContext = materialTimePickerModule.getReactApplicationContext();
        O90.m5967e(reactApplicationContext, "getReactApplicationContext(...)");
        C1753aw c1753aw = new C1753aw(bundleM22037c, promise, abstractC1733o, reactApplicationContext, 7);
        Calendar calendar = Calendar.getInstance();
        if (bundleM22037c.containsKey("value")) {
            calendar.setTimeInMillis(bundleM22037c.getLong("value"));
        }
        calendar.setTimeZone(AbstractC9886jT1.m22039e(bundleM22037c));
        int i = calendar.get(11);
        C6937uF c6937uF = (C6937uF) c1753aw.f16687g;
        C10156la1 c10156la1 = (C10156la1) c6937uF.f43616a;
        c10156la1.getClass();
        c10156la1.f37174g = i >= 12 ? 1 : 0;
        c10156la1.f37171d = i;
        ((C10156la1) c6937uF.f43616a).m22513d(calendar.get(12));
        String string = bundleM22037c.getString("title");
        if (string != null && string.length() != 0) {
            c6937uF.f43618c = bundleM22037c.getString("title");
        }
        String string2 = bundleM22037c.getString("initialInputMode");
        if (string2 == null || string2.length() == 0) {
            c6937uF.f43617b = 0;
        } else {
            String string3 = bundleM22037c.getString("initialInputMode");
            O90.m5965c(string3);
            String upperCase = string3.toUpperCase(Locale.ROOT);
            O90.m5967e(upperCase, "toUpperCase(...)");
            if (AbstractC0852NX.m5773v(upperCase) == 2) {
                c6937uF.f43617b = 1;
            } else {
                c6937uF.f43617b = 0;
            }
        }
        Bundle bundle = bundleM22037c.getBundle("dialogButtons");
        if (bundle != null) {
            Bundle bundle2 = bundle.getBundle("negative");
            Bundle bundle3 = bundle.getBundle("positive");
            if (bundle2 != null) {
                c6937uF.f43620e = bundle2.getString("label");
            }
            if (bundle3 != null) {
                c6937uF.f43619d = bundle3.getString("label");
            }
        }
        if (bundleM22037c.getBoolean("is24Hour") || DateFormat.is24HourFormat(reactApplicationContext)) {
            c6937uF.m25134E(1);
        } else {
            c6937uF.m25134E(0);
        }
        C1949e c1949e = new C1949e();
        Bundle bundle4 = new Bundle();
        bundle4.putParcelable("TIME_PICKER_TIME_MODEL", (C10156la1) c6937uF.f43616a);
        Integer num = (Integer) c6937uF.f43617b;
        if (num != null) {
            bundle4.putInt("TIME_PICKER_INPUT_MODE", num.intValue());
        }
        bundle4.putInt("TIME_PICKER_TITLE_RES", 0);
        String str = (String) c6937uF.f43618c;
        if (str != null) {
            bundle4.putCharSequence("TIME_PICKER_TITLE_TEXT", str);
        }
        bundle4.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", 0);
        String str2 = (String) c6937uF.f43619d;
        if (str2 != null) {
            bundle4.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", str2);
        }
        bundle4.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", 0);
        String str3 = (String) c6937uF.f43620e;
        if (str3 != null) {
            bundle4.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", str3);
        }
        bundle4.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", 0);
        c1949e.setArguments(bundle4);
        c1753aw.f16686f = c1949e;
        YH0 yh0 = new YH0(c1753aw);
        c1949e.f18395a.add(yh0);
        C1949e c1949e2 = (C1949e) c1753aw.f16686f;
        O90.m5965c(c1949e2);
        c1949e2.f18398d.add(yh0);
        C1949e c1949e3 = (C1949e) c1753aw.f16686f;
        O90.m5965c(c1949e3);
        c1949e3.show(abstractC1733o, NAME);
    }

    @Override // com.reactcommunity.rndatetimepicker.NativeModuleMaterialTimePickerSpec
    public void dismiss(Promise promise) {
        AbstractC9886jT1.m22038d((AbstractActivityC1730l) getCurrentActivity(), NAME, promise);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.reactcommunity.rndatetimepicker.NativeModuleMaterialTimePickerSpec
    public void open(ReadableMap params, Promise promise) {
        O90.m5968f(params, "params");
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        AbstractActivityC1730l abstractActivityC1730l = (AbstractActivityC1730l) getCurrentActivity();
        if (abstractActivityC1730l == null) {
            promise.reject("E_NO_ACTIVITY", "Tried to open a MaterialTimePicker dialog while not attached to an Activity");
        }
        O90.m5965c(abstractActivityC1730l);
        C6244jY c6244jYM10034e = abstractActivityC1730l.m10034e();
        O90.m5967e(c6244jYM10034e, "getSupportFragmentManager(...)");
        UiThreadUtil.runOnUiThread(new RunnableC6757rf(params, promise, c6244jYM10034e, this, 11));
    }
}
