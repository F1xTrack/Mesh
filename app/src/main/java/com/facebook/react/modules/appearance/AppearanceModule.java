package com.facebook.react.modules.appearance;

import android.content.Context;
import com.facebook.fbreact.specs.NativeAppearanceSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.huawei.hms.p015rn.push.constants.LocalNotification;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.AbstractC6928u6;
import p000.C1455X7;
import p000.InterfaceC1518Y7;
import p000.InterfaceC9101dL0;
import p000.O90;

@InterfaceC9101dL0(name = "Appearance")
@Metadata(m22266d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\r\b\u0007\u0018\u0000  2\u00020\u0001:\u0002!\u0004B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u0012R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0016\u0010\u001c\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001f¨\u0006\""}, m22267d2 = {"Lcom/facebook/react/modules/appearance/AppearanceModule;", "Lcom/facebook/fbreact/specs/NativeAppearanceSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "LY7;", "overrideColorScheme", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;LY7;)V", "Landroid/content/Context;", "context", "", "colorSchemeForCurrentConfiguration", "(Landroid/content/Context;)Ljava/lang/String;", "getColorScheme", "()Ljava/lang/String;", "style", "LTf1;", "setColorScheme", "(Ljava/lang/String;)V", "eventName", "addListener", "", "count", "removeListeners", "(D)V", "currentContext", "onConfigurationChanged", "(Landroid/content/Context;)V", "colorScheme", "emitAppearanceChanged", "LY7;", "Ljava/lang/String;", "Companion", "X7", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class AppearanceModule extends NativeAppearanceSpec {
    private static final String APPEARANCE_CHANGED_EVENT_NAME = "appearanceChanged";
    public static final C1455X7 Companion = new C1455X7();
    public static final String NAME = "Appearance";
    private String colorScheme;
    private final InterfaceC1518Y7 overrideColorScheme;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppearanceModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, null, 2, null);
        O90.m5968f(reactApplicationContext, "reactContext");
    }

    private final String colorSchemeForCurrentConfiguration(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) != 32 ? "light" : "dark";
    }

    @Override // com.facebook.fbreact.specs.NativeAppearanceSpec
    public void addListener(String eventName) {
        O90.m5968f(eventName, "eventName");
    }

    public final void emitAppearanceChanged(String colorScheme) {
        O90.m5968f(colorScheme, "colorScheme");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("colorScheme", colorScheme);
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent(APPEARANCE_CHANGED_EVENT_NAME, writableMapCreateMap);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAppearanceSpec
    public String getColorScheme() {
        Context currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            currentActivity = getReactApplicationContext();
        }
        O90.m5965c(currentActivity);
        String strColorSchemeForCurrentConfiguration = colorSchemeForCurrentConfiguration(currentActivity);
        this.colorScheme = strColorSchemeForCurrentConfiguration;
        return strColorSchemeForCurrentConfiguration;
    }

    public final void onConfigurationChanged(Context currentContext) {
        O90.m5968f(currentContext, "currentContext");
        String strColorSchemeForCurrentConfiguration = colorSchemeForCurrentConfiguration(currentContext);
        if (O90.m5963a(this.colorScheme, strColorSchemeForCurrentConfiguration)) {
            return;
        }
        this.colorScheme = strColorSchemeForCurrentConfiguration;
        emitAppearanceChanged(strColorSchemeForCurrentConfiguration);
    }

    @Override // com.facebook.fbreact.specs.NativeAppearanceSpec
    public void removeListeners(double count) {
    }

    @Override // com.facebook.fbreact.specs.NativeAppearanceSpec
    public void setColorScheme(String style) {
        O90.m5968f(style, "style");
        int iHashCode = style.hashCode();
        if (iHashCode == -1626174665) {
            if (style.equals(LocalNotification.Importance.UNSPECIFIED)) {
                AbstractC6928u6.m25108l(-1);
            }
        } else if (iHashCode == 3075958) {
            if (style.equals("dark")) {
                AbstractC6928u6.m25108l(2);
            }
        } else if (iHashCode == 102970646 && style.equals("light")) {
            AbstractC6928u6.m25108l(1);
        }
    }

    public /* synthetic */ AppearanceModule(ReactApplicationContext reactApplicationContext, InterfaceC1518Y7 interfaceC1518Y7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactApplicationContext, (i & 2) != 0 ? null : interfaceC1518Y7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppearanceModule(ReactApplicationContext reactApplicationContext, InterfaceC1518Y7 interfaceC1518Y7) {
        super(reactApplicationContext);
        O90.m5968f(reactApplicationContext, "reactContext");
        this.colorScheme = colorSchemeForCurrentConfiguration(reactApplicationContext);
    }
}
