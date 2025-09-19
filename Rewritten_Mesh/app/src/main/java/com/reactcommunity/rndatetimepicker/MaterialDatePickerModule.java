package com.reactcommunity.rndatetimepicker;

import androidx.fragment.app.AbstractActivityC1730l;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import kotlin.Metadata;
import p000.AbstractC9886jT1;
import p000.C10055ko0;
import p000.C6244jY;
import p000.O90;
import p000.RunnableC6757rf;

@Metadata(m22266d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m22267d2 = {"Lcom/reactcommunity/rndatetimepicker/MaterialDatePickerModule;", "Lcom/reactcommunity/rndatetimepicker/NativeModuleMaterialDatePickerSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "LTf1;", "dismiss", "(Lcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/ReadableMap;", "params", "open", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "Companion", "ko0", "react-native-community_datetimepicker_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class MaterialDatePickerModule extends NativeModuleMaterialDatePickerSpec {
    public static final C10055ko0 Companion = new C10055ko0();
    public static final String NAME = "RNCMaterialDatePicker";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialDatePickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        O90.m5968f(reactApplicationContext, "reactContext");
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void open$lambda$0(com.facebook.react.bridge.ReadableMap r7, com.facebook.react.bridge.Promise r8, androidx.fragment.app.AbstractC1733o r9, com.reactcommunity.rndatetimepicker.MaterialDatePickerModule r10) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactcommunity.rndatetimepicker.MaterialDatePickerModule.open$lambda$0(com.facebook.react.bridge.ReadableMap, com.facebook.react.bridge.Promise, androidx.fragment.app.o, com.reactcommunity.rndatetimepicker.MaterialDatePickerModule):void");
    }

    @Override // com.reactcommunity.rndatetimepicker.NativeModuleMaterialDatePickerSpec
    public void dismiss(Promise promise) {
        AbstractC9886jT1.m22038d((AbstractActivityC1730l) getCurrentActivity(), NAME, promise);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.reactcommunity.rndatetimepicker.NativeModuleMaterialDatePickerSpec
    public void open(ReadableMap params, Promise promise) {
        O90.m5968f(params, "params");
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        AbstractActivityC1730l abstractActivityC1730l = (AbstractActivityC1730l) getCurrentActivity();
        if (abstractActivityC1730l == null) {
            promise.reject("E_NO_ACTIVITY", "Tried to open a MaterialDatePicker dialog while not attached to an Activity");
            return;
        }
        C6244jY c6244jYM10034e = abstractActivityC1730l.m10034e();
        O90.m5967e(c6244jYM10034e, "getSupportFragmentManager(...)");
        UiThreadUtil.runOnUiThread(new RunnableC6757rf(params, promise, c6244jYM10034e, this, 10));
    }
}
