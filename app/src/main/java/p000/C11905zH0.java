package p000;

import android.app.Activity;
import android.content.Intent;
import com.burnweb.rnsendintent.RNSendIntentModule;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.reactnativedocumentpicker.RNDocumentPickerModule;
import com.rustorepush.RustorePushModule;
import com.rustorepush.RustorePushService;
import com.vinzscam.reactnativefileviewer.RNFileViewerModule;

/* renamed from: zH0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11905zH0 extends BaseActivityEventListener {

    /* renamed from: a */
    public final /* synthetic */ int f46774a;

    /* renamed from: b */
    public final /* synthetic */ ReactContextBaseJavaModule f46775b;

    public /* synthetic */ C11905zH0(ReactContextBaseJavaModule reactContextBaseJavaModule, int i) {
        this.f46774a = i;
        this.f46775b = reactContextBaseJavaModule;
    }

    @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        ReactContextBaseJavaModule reactContextBaseJavaModule = this.f46775b;
        switch (this.f46774a) {
            case 0:
                if (i == 41 || i == 42) {
                    RNDocumentPickerModule rNDocumentPickerModule = (RNDocumentPickerModule) reactContextBaseJavaModule;
                    Promise promise = rNDocumentPickerModule.promise;
                    if (promise != null) {
                        if (i2 != 0) {
                            if (i != 41) {
                                rNDocumentPickerModule.onPickDirectoryResult(i2, intent);
                                break;
                            } else {
                                rNDocumentPickerModule.onShowActivityResult(i2, intent, promise);
                                break;
                            }
                        } else {
                            rNDocumentPickerModule.sendError(RNDocumentPickerModule.E_DOCUMENT_PICKER_CANCELED, "User canceled directory picker");
                            break;
                        }
                    }
                }
                break;
            case 1:
                ((RNFileViewerModule) reactContextBaseJavaModule).sendEvent(RNFileViewerModule.DISMISS_EVENT, Integer.valueOf(i - RNFileViewerModule.RN_FILE_VIEWER_REQUEST.intValue()), null);
                break;
            case 2:
                if (i == 20190903 && intent != null) {
                    ((RNSendIntentModule) reactContextBaseJavaModule).mCallback.invoke(intent.getData().getPath());
                    break;
                }
                break;
            default:
                super.onActivityResult(activity, i, i2, intent);
                break;
        }
    }

    @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
        NQ0 nq0;
        switch (this.f46774a) {
            case 3:
                super.onNewIntent(intent);
                RustorePushModule rustorePushModule = (RustorePushModule) this.f46775b;
                String messageIdFromIntent = rustorePushModule.getMessageIdFromIntent(intent);
                if (messageIdFromIntent != null && (nq0 = (NQ0) RustorePushService.f20245l.get(messageIdFromIntent)) != null) {
                    rustorePushModule.sendEvent(rustorePushModule.reactContext, "ON_OPENED", AbstractC8869bZ1.m10459a(nq0));
                    break;
                }
                break;
            default:
                super.onNewIntent(intent);
                break;
        }
    }
}
