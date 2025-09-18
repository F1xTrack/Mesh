package com.facebook.react.modules.i18nmanager;

import android.content.SharedPreferences;
import android.os.Build;
import com.facebook.fbreact.specs.NativeI18nManagerSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import p000.AbstractC11077sn0;
import p000.InterfaceC9101dL0;
import p000.O90;
import p000.Q12;

@InterfaceC9101dL0(name = NativeI18nManagerSpec.NAME)
@Metadata(m22266d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, m22267d2 = {"Lcom/facebook/react/modules/i18nmanager/I18nManagerModule;", "Lcom/facebook/fbreact/specs/NativeI18nManagerSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "context", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "", "", "getTypedExportedConstants", "()Ljava/util/Map;", "", "value", "LTf1;", "allowRTL", "(Z)V", "forceRTL", "swapLeftAndRightInRTL", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class I18nManagerModule extends NativeI18nManagerSpec {
    public I18nManagerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.fbreact.specs.NativeI18nManagerSpec
    public void allowRTL(boolean value) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        O90.m5967e(reactApplicationContext, "getReactApplicationContext(...)");
        SharedPreferences.Editor editorEdit = reactApplicationContext.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).edit();
        editorEdit.putBoolean("RCTI18nUtil_allowRTL", value);
        editorEdit.apply();
    }

    @Override // com.facebook.fbreact.specs.NativeI18nManagerSpec
    public void forceRTL(boolean value) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        O90.m5967e(reactApplicationContext, "getReactApplicationContext(...)");
        SharedPreferences.Editor editorEdit = reactApplicationContext.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).edit();
        editorEdit.putBoolean("RCTI18nUtil_forceRTL", value);
        editorEdit.apply();
    }

    @Override // com.facebook.fbreact.specs.NativeI18nManagerSpec
    public Map<String, Object> getTypedExportedConstants() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Locale locale = Build.VERSION.SDK_INT >= 24 ? reactApplicationContext.getResources().getConfiguration().getLocales().get(0) : reactApplicationContext.getResources().getConfiguration().locale;
        O90.m5965c(reactApplicationContext);
        return AbstractC11077sn0.m24780h(new Pair("isRTL", Boolean.valueOf(Q12.m6548b(reactApplicationContext))), new Pair("doLeftAndRightSwapInRTL", Boolean.valueOf(Q12.m6547a(reactApplicationContext))), new Pair("localeIdentifier", locale.toString()));
    }

    @Override // com.facebook.fbreact.specs.NativeI18nManagerSpec
    public void swapLeftAndRightInRTL(boolean value) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        O90.m5967e(reactApplicationContext, "getReactApplicationContext(...)");
        SharedPreferences.Editor editorEdit = reactApplicationContext.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).edit();
        editorEdit.putBoolean("RCTI18nUtil_makeRTLFlipLeftAndRightStyles", value);
        editorEdit.apply();
    }
}
