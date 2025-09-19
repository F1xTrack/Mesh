package com.RNTextInputMask;

import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.RNTextInputMask.RNTextInputMaskModule;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import p000.C0779MN;
import p000.C11856yu0;
import p000.C11969zn0;
import p000.C6848sq;
import p000.C6911tq;
import p000.C6936uE;
import p000.C7173y;
import p000.EnumC7240z3;
import p000.O90;
import p000.ViewOnFocusChangeListenerC10331my0;
import p000.YN1;

@Metadata(m22266d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ9\u0010\u0012\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J9\u0010\u0014\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0013J'\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001a¨\u0006\u001b"}, m22267d2 = {"Lcom/RNTextInputMask/RNTextInputMaskModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "context", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "maskString", "inputValue", "", "autocomplete", "Lcom/facebook/react/bridge/ReadableMap;", "options", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "LTf1;", "mask", "(Ljava/lang/String;Ljava/lang/String;ZLcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "unmask", "", "tag", "primaryFormat", "setMask", "(ILjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "react-native-text-input-mask_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class RNTextInputMaskModule extends ReactContextBaseJavaModule {
    private final ReactApplicationContext context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNTextInputMaskModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        O90.m5968f(reactApplicationContext, "context");
        this.context = reactApplicationContext;
    }

    public static final void setMask$lambda$4(int i, ReadableMap readableMap, RNTextInputMaskModule rNTextInputMaskModule, final String str, C11856yu0 c11856yu0) {
        O90.m5968f(readableMap, "$options");
        O90.m5968f(rNTextInputMaskModule, "this$0");
        O90.m5968f(str, "$primaryFormat");
        View viewResolveView = c11856yu0.resolveView(i);
        O90.m5966d(viewResolveView, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText = (EditText) viewResolveView;
        final ArrayList arrayListM9285j = YN1.m9285j(readableMap, "affineFormats", C7173y.f45988r);
        final ArrayList arrayListM9285j2 = YN1.m9285j(readableMap, "customNotations", C7173y.f45986p);
        String string = readableMap.getString("affinityCalculationStrategy");
        final EnumC7240z3 enumC7240z3ValueOf = string != null ? EnumC7240z3.valueOf(string) : null;
        final Boolean boolM9276a = YN1.m9276a(readableMap, "autocomplete");
        final Boolean boolM9276a2 = YN1.m9276a(readableMap, "autoskip");
        final Boolean boolM9276a3 = YN1.m9276a(readableMap, "rightToLeft");
        rNTextInputMaskModule.context.runOnUiQueueThread(new Runnable() { // from class: TI0
            @Override // java.lang.Runnable
            public final void run() {
                EditText editText2 = editText;
                RNTextInputMaskModule.setMask$lambda$4$lambda$3(str, arrayListM9285j, arrayListM9285j2, enumC7240z3ValueOf, boolM9276a, boolM9276a2, editText2, boolM9276a3);
            }
        });
    }

    public static final void setMask$lambda$4$lambda$3(String str, List list, List list2, EnumC7240z3 enumC7240z3, Boolean bool, Boolean bool2, EditText editText, Boolean bool3) {
        O90.m5968f(str, "$primaryFormat");
        O90.m5968f(editText, "$editText");
        C0779MN c0779mn = C0779MN.f7117a;
        List list3 = list == null ? c0779mn : list;
        List list4 = list2 == null ? c0779mn : list2;
        EnumC7240z3 enumC7240z32 = enumC7240z3 == null ? EnumC7240z3.f46604a : enumC7240z3;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
        if (editText.getTag(123456789) != null) {
            Object tag = editText.getTag(123456789);
            O90.m5966d(tag, "null cannot be cast to non-null type android.text.TextWatcher");
            editText.removeTextChangedListener((TextWatcher) tag);
        }
        View.OnFocusChangeListener onFocusChangeListener = editText.getOnFocusChangeListener();
        O90.m5967e(onFocusChangeListener, "getOnFocusChangeListener(...)");
        ViewOnFocusChangeListenerC10331my0 viewOnFocusChangeListenerC10331my0 = new ViewOnFocusChangeListenerC10331my0(str, list3, list4, enumC7240z32, zBooleanValue, zBooleanValue2, editText, zBooleanValue3, onFocusChangeListener);
        editText.addTextChangedListener(viewOnFocusChangeListenerC10331my0);
        editText.setOnFocusChangeListener(viewOnFocusChangeListenerC10331my0);
        editText.setTag(123456789, viewOnFocusChangeListenerC10331my0);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNTextInputMask";
    }

    @ReactMethod
    public final void mask(String maskString, String inputValue, boolean autocomplete, ReadableMap options, Promise promise) {
        O90.m5968f(inputValue, "inputValue");
        O90.m5968f(options, "options");
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        List listM9285j = YN1.m9285j(options, "customNotations", C7173y.f45985o);
        if (maskString != null) {
            if (listM9285j == null) {
                listM9285j = C0779MN.f7117a;
            }
            promise.resolve(new C11969zn0(maskString, listM9285j).mo10446a(new C6911tq(inputValue, inputValue.length(), new C6848sq(autocomplete))).f45787a.f43353a);
        }
    }

    @ReactMethod
    public final void setMask(int tag, String primaryFormat, ReadableMap options) {
        O90.m5968f(primaryFormat, "primaryFormat");
        O90.m5968f(options, "options");
        NativeModule nativeModule = this.context.getNativeModule((Class<NativeModule>) UIManagerModule.class);
        O90.m5965c(nativeModule);
        ((UIManagerModule) nativeModule).prependUIBlock(new C6936uE(tag, options, this, primaryFormat));
    }

    @ReactMethod
    public final void unmask(String maskString, String inputValue, boolean autocomplete, ReadableMap options, Promise promise) {
        O90.m5968f(inputValue, "inputValue");
        O90.m5968f(options, "options");
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        List listM9285j = YN1.m9285j(options, "customNotations", C7173y.f45987q);
        if (maskString != null) {
            if (listM9285j == null) {
                listM9285j = C0779MN.f7117a;
            }
            promise.resolve(new C11969zn0(maskString, listM9285j).mo10446a(new C6911tq(inputValue, inputValue.length(), new C6848sq(autocomplete))).f45788b);
        }
    }
}
