package com.facebook.react.modules.devtoolssettings;

import android.content.SharedPreferences;
import com.facebook.fbreact.specs.NativeDevToolsSettingsManagerSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import p000.C4045fJ;
import p000.InterfaceC9101dL0;
import p000.O90;

@InterfaceC9101dL0(name = NativeDevToolsSettingsManagerSpec.NAME)
@Metadata(m22266d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\r\u0010\bJ\u0019\u0010\u000e\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m22267d2 = {"Lcom/facebook/react/modules/devtoolssettings/DevToolsSettingsManagerModule;", "Lcom/facebook/fbreact/specs/NativeDevToolsSettingsManagerSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getConsolePatchSettings", "()Ljava/lang/String;", "newSettings", "LTf1;", "setConsolePatchSettings", "(Ljava/lang/String;)V", "getProfilingSettings", "setProfilingSettings", "Landroid/content/SharedPreferences;", "sharedPreferences", "Landroid/content/SharedPreferences;", "Companion", "fJ", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class DevToolsSettingsManagerModule extends NativeDevToolsSettingsManagerSpec {
    private static final C4045fJ Companion = new C4045fJ();
    private static final String KEY_CONSOLE_PATCH_SETTINGS = "ConsolePatchSettings";
    private static final String KEY_PROFILING_SETTINGS = "ProfilingSettings";
    private static final String SHARED_PREFERENCES_PREFIX = "ReactNative__DevToolsSettings";
    private final SharedPreferences sharedPreferences;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevToolsSettingsManagerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        O90.m5968f(reactApplicationContext, "reactContext");
        SharedPreferences sharedPreferences = reactApplicationContext.getSharedPreferences(SHARED_PREFERENCES_PREFIX, 0);
        O90.m5967e(sharedPreferences, "getSharedPreferences(...)");
        this.sharedPreferences = sharedPreferences;
    }

    @Override // com.facebook.fbreact.specs.NativeDevToolsSettingsManagerSpec
    public String getConsolePatchSettings() {
        return this.sharedPreferences.getString(KEY_CONSOLE_PATCH_SETTINGS, null);
    }

    @Override // com.facebook.fbreact.specs.NativeDevToolsSettingsManagerSpec
    public String getProfilingSettings() {
        return this.sharedPreferences.getString(KEY_PROFILING_SETTINGS, null);
    }

    @Override // com.facebook.fbreact.specs.NativeDevToolsSettingsManagerSpec
    public void setConsolePatchSettings(String newSettings) {
        this.sharedPreferences.edit().putString(KEY_CONSOLE_PATCH_SETTINGS, newSettings).apply();
    }

    @Override // com.facebook.fbreact.specs.NativeDevToolsSettingsManagerSpec
    public void setProfilingSettings(String newSettings) {
        this.sharedPreferences.edit().putString(KEY_PROFILING_SETTINGS, newSettings).apply();
    }
}
