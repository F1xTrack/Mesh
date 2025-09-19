package com.alexzunik.reactnativemoneyinput;

import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.HashMap;
import kotlin.Metadata;
import p000.AbstractC11556wX0;
import p000.AbstractC11842yn0;
import p000.C11588wn0;
import p000.C7444Cn0;
import p000.O90;
import p000.OZ1;
import p000.R02;
import p000.RunnableC6694qf;
import p000.TL0;

@Metadata(m22266d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 32\u00020\u0001:\u00014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0015J!\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0018J!\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001cJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b%\u0010&J'\u0010*\u001a\u00020\"2\u0006\u0010'\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(H\u0007¢\u0006\u0004\b*\u0010+J'\u0010,\u001a\u00020\"2\u0006\u0010'\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(H\u0007¢\u0006\u0004\b,\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R4\u00101\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010/0.j\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010/`08\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00065"}, m22267d2 = {"Lcom/alexzunik/reactnativemoneyinput/ReactNativeMoneyInputModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "reactNode", "", "getKey", "(I)Ljava/lang/String;", "Lcom/facebook/react/bridge/ReadableMap;", "options", "Lwn0;", "getMaskOptions", "(Lcom/facebook/react/bridge/ReadableMap;)Lwn0;", "map", "key", "safeResolveString", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Ljava/lang/String;", "defaultValue", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "safeResolveInt", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Ljava/lang/Integer;", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;I)I", "", "safeResolveDouble", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Ljava/lang/Double;", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;D)D", "Landroid/widget/EditText;", "getComponent", "(I)Landroid/widget/EditText;", "getName", "()Ljava/lang/String;", "LTf1;", "applyMask", "(ILcom/facebook/react/bridge/ReadableMap;)V", "unmount", "(I)V", "value", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "mask", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "unmask", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Ljava/util/HashMap;", "Landroid/text/TextWatcher;", "Lkotlin/collections/HashMap;", "listeners", "Ljava/util/HashMap;", "Companion", "TL0", "alexzunik_react-native-money-input_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class ReactNativeMoneyInputModule extends ReactContextBaseJavaModule {
    public static final TL0 Companion = new TL0();
    public static final String NAME = "ReactNativeMoneyInput";
    private final HashMap<String, TextWatcher> listeners;
    private final ReactApplicationContext reactContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactNativeMoneyInputModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        O90.m5968f(reactApplicationContext, "reactContext");
        this.reactContext = reactApplicationContext;
        this.listeners = new HashMap<>();
    }

    public static final void applyMask$lambda$0(ReactNativeMoneyInputModule reactNativeMoneyInputModule, int i, ReadableMap readableMap) {
        O90.m5968f(reactNativeMoneyInputModule, "this$0");
        O90.m5968f(readableMap, "$options");
        OZ1.m6095f(reactNativeMoneyInputModule.reactContext, R02.m6874b(i), true);
        EditText component = reactNativeMoneyInputModule.getComponent(i);
        if (component == null) {
            return;
        }
        component.removeTextChangedListener(reactNativeMoneyInputModule.listeners.get(reactNativeMoneyInputModule.getKey(i)));
        C7444Cn0 c7444Cn0 = new C7444Cn0(component, reactNativeMoneyInputModule.getMaskOptions(readableMap));
        reactNativeMoneyInputModule.listeners.put(reactNativeMoneyInputModule.getKey(i), c7444Cn0);
        component.addTextChangedListener(c7444Cn0);
        component.setSelection(component.getText().toString().length());
    }

    private final EditText getComponent(int reactNode) {
        View viewResolveView;
        UIManager uIManagerM6095f = OZ1.m6095f(this.reactContext, R02.m6874b(reactNode), true);
        if (uIManagerM6095f != null) {
            try {
                viewResolveView = uIManagerM6095f.resolveView(reactNode);
            } catch (Throwable unused) {
                return null;
            }
        } else {
            viewResolveView = null;
        }
        EditText editText = viewResolveView instanceof EditText ? (EditText) viewResolveView : null;
        if (editText == null) {
            return null;
        }
        return editText;
    }

    private final String getKey(int reactNode) {
        return String.valueOf(reactNode);
    }

    private final C11588wn0 getMaskOptions(ReadableMap options) {
        String strSafeResolveString = safeResolveString(options, "groupingSeparator", " ");
        String str = AbstractC11842yn0.f46457a;
        return new C11588wn0(strSafeResolveString, safeResolveString(options, "fractionSeparator", AbstractC11842yn0.f46457a), safeResolveString(options, "prefix", ""), safeResolveString(options, "suffix", ""), safeResolveInt(options, "maximumIntegerDigits"), safeResolveInt(options, "maximumFractionalDigits", 2), safeResolveDouble(options, "minValue"), safeResolveDouble(options, "maxValue"));
    }

    private final Double safeResolveDouble(ReadableMap map, String key) {
        try {
            return Double.valueOf(map.getDouble(key));
        } catch (Exception unused) {
            return null;
        }
    }

    private final Integer safeResolveInt(ReadableMap map, String key) {
        try {
            return Integer.valueOf(map.getInt(key));
        } catch (Exception unused) {
            return null;
        }
    }

    private final String safeResolveString(ReadableMap map, String key) {
        try {
            return map.getString(key);
        } catch (Exception unused) {
            return null;
        }
    }

    @ReactMethod
    public final void applyMask(int reactNode, ReadableMap options) {
        O90.m5968f(options, "options");
        UiThreadUtil.runOnUiThread(new RunnableC6694qf(this, reactNode, options, 12));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public final void mask(String value, ReadableMap options, Promise promise) {
        O90.m5968f(value, "value");
        O90.m5968f(options, "options");
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        String str = AbstractC11842yn0.f46457a;
        promise.resolve(AbstractC11556wX0.m25644a(value, getMaskOptions(options)));
    }

    @ReactMethod
    public final void unmask(String value, ReadableMap options, Promise promise) {
        O90.m5968f(value, "value");
        O90.m5968f(options, "options");
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        String str = AbstractC11842yn0.f46457a;
        promise.resolve(AbstractC11556wX0.m25647d(value, getMaskOptions(options)));
    }

    @ReactMethod
    public final void unmount(int reactNode) {
        TextWatcher textWatcher;
        EditText component = getComponent(reactNode);
        if (component == null || (textWatcher = this.listeners.get(getKey(reactNode))) == null) {
            return;
        }
        component.removeTextChangedListener(textWatcher);
        this.listeners.remove(getKey(reactNode));
    }

    private final double safeResolveDouble(ReadableMap map, String key, double defaultValue) {
        Double dSafeResolveDouble = safeResolveDouble(map, key);
        return dSafeResolveDouble != null ? dSafeResolveDouble.doubleValue() : defaultValue;
    }

    private final int safeResolveInt(ReadableMap map, String key, int defaultValue) {
        Integer numSafeResolveInt = safeResolveInt(map, key);
        return numSafeResolveInt != null ? numSafeResolveInt.intValue() : defaultValue;
    }

    private final String safeResolveString(ReadableMap map, String key, String defaultValue) {
        String strSafeResolveString = safeResolveString(map, key);
        return strSafeResolveString == null ? defaultValue : strSafeResolveString;
    }
}
