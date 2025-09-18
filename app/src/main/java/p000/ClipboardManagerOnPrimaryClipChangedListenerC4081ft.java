package p000;

import android.content.ClipboardManager;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.reactnativecommunity.clipboard.ClipboardModule;

/* renamed from: ft */
/* loaded from: classes2.dex */
public final class ClipboardManagerOnPrimaryClipChangedListenerC4081ft implements ClipboardManager.OnPrimaryClipChangedListener {

    /* renamed from: a */
    public final /* synthetic */ ClipboardModule f27444a;

    public ClipboardManagerOnPrimaryClipChangedListenerC4081ft(ClipboardModule clipboardModule) {
        this.f27444a = clipboardModule;
    }

    @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
    public final void onPrimaryClipChanged() {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.f27444a.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(ClipboardModule.CLIPBOARD_TEXT_CHANGED, null);
    }
}
