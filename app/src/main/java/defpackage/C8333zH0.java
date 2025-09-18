package defpackage;

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
public final class C8333zH0 extends BaseActivityEventListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ReactContextBaseJavaModule b;

    public /* synthetic */ C8333zH0(ReactContextBaseJavaModule reactContextBaseJavaModule, int i) {
        this.a = i;
        this.b = reactContextBaseJavaModule;
    }

    @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        ReactContextBaseJavaModule reactContextBaseJavaModule = this.b;
        switch (this.a) {
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
        switch (this.a) {
            case 3:
                super.onNewIntent(intent);
                RustorePushModule rustorePushModule = (RustorePushModule) this.b;
                String messageIdFromIntent = rustorePushModule.getMessageIdFromIntent(intent);
                if (messageIdFromIntent != null && (nq0 = (NQ0) RustorePushService.l.get(messageIdFromIntent)) != null) {
                    rustorePushModule.sendEvent(rustorePushModule.reactContext, "ON_OPENED", AbstractC2350bZ1.a(nq0));
                    break;
                }
                break;
            default:
                super.onNewIntent(intent);
                break;
        }
    }
}
