package defpackage;

import android.content.ClipboardManager;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.reactnativecommunity.clipboard.ClipboardModule;

/* renamed from: ft, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ClipboardManagerOnPrimaryClipChangedListenerC3855ft implements ClipboardManager.OnPrimaryClipChangedListener {
    public final /* synthetic */ ClipboardModule a;

    public ClipboardManagerOnPrimaryClipChangedListenerC3855ft(ClipboardModule clipboardModule) {
        this.a = clipboardModule;
    }

    @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
    public final void onPrimaryClipChanged() {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.a.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(ClipboardModule.CLIPBOARD_TEXT_CHANGED, null);
    }
}
