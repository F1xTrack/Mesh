package defpackage;

import cl.json.RNShare;
import com.ReactNativeBlobUtil.ReactNativeBlobUtil;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.leerman.rnsecuritypack.SecurityPackModule;
import com.mkuczera.RNReactNativeHapticFeedbackModule;
import com.oblador.storereview.StoreReviewModule;
import com.reactcommunity.rndatetimepicker.DatePickerModule;
import com.reactcommunity.rndatetimepicker.MaterialDatePickerModule;
import com.reactcommunity.rndatetimepicker.MaterialTimePickerModule;
import com.reactcommunity.rndatetimepicker.TimePickerModule;
import com.reactnativecommunity.webview.RNCWebViewManager;
import com.reactnativecommunity.webview.RNCWebViewModule;
import com.reactnativedocumentpicker.RNDocumentPickerModule;
import com.zoontek.rnpermissions.RNPermissionsModule;
import io.sentry.react.RNSentryModule;
import io.sentry.react.RNSentryOnDrawReporterManager;
import io.sentry.react.g;
import io.sentry.react.replay.RNSentryReplayMaskManager;
import io.sentry.react.replay.RNSentryReplayUnmaskManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: sH0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7000sH0 extends AbstractC6495pd1 {
    public final /* synthetic */ int a;

    public /* synthetic */ C7000sH0(int i) {
        this.a = i;
    }

    @Override // defpackage.AbstractC8407zg, defpackage.ZL0
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                arrayList.add(new RNCWebViewManager());
                return arrayList;
            case 9:
                Object[] objArr = {new RNSentryOnDrawReporterManager(reactApplicationContext), new RNSentryReplayMaskManager(), new RNSentryReplayUnmaskManager()};
                ArrayList arrayList2 = new ArrayList(3);
                for (int i = 0; i < 3; i++) {
                    Object obj = objArr[i];
                    Objects.requireNonNull(obj);
                    arrayList2.add(obj);
                }
                return Collections.unmodifiableList(arrayList2);
            default:
                return super.createViewManagers(reactApplicationContext);
        }
    }

    @Override // defpackage.AbstractC8407zg
    public final NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        switch (this.a) {
            case 0:
                if (str.equals("RNCWebViewModule")) {
                    return new RNCWebViewModule(reactApplicationContext);
                }
                return null;
            case 1:
                if (str.equals(DatePickerModule.NAME)) {
                    return new DatePickerModule(reactApplicationContext);
                }
                if (str.equals(TimePickerModule.NAME)) {
                    return new TimePickerModule(reactApplicationContext);
                }
                if (str.equals(MaterialDatePickerModule.NAME)) {
                    return new MaterialDatePickerModule(reactApplicationContext);
                }
                if (str.equals(MaterialTimePickerModule.NAME)) {
                    return new MaterialTimePickerModule(reactApplicationContext);
                }
                return null;
            case 2:
                if (str.equals(RNDocumentPickerModule.NAME)) {
                    return new RNDocumentPickerModule(reactApplicationContext);
                }
                return null;
            case 3:
                if (str.equals("RNPermissions")) {
                    return new RNPermissionsModule(reactApplicationContext);
                }
                return null;
            case 4:
                if (str.equals("RNHapticFeedback")) {
                    return new RNReactNativeHapticFeedbackModule(reactApplicationContext);
                }
                return null;
            case 5:
                if (str.equals("RNShare")) {
                    return new RNShare(reactApplicationContext);
                }
                return null;
            case 6:
                if (str.equals("ReactNativeBlobUtil")) {
                    return new ReactNativeBlobUtil(reactApplicationContext);
                }
                return null;
            case 7:
                O90.f(str, "name");
                O90.f(reactApplicationContext, "reactContext");
                if (str.equals(SecurityPackModule.NAME)) {
                    return new SecurityPackModule(reactApplicationContext);
                }
                return null;
            case 8:
                if (str.equals("RNStoreReview")) {
                    return new StoreReviewModule(reactApplicationContext);
                }
                return null;
            default:
                if ("RNSentry".equals(str)) {
                    return new RNSentryModule(reactApplicationContext);
                }
                return null;
        }
    }

    @Override // defpackage.AbstractC8407zg
    public final InterfaceC3563eL0 getReactModuleInfoProvider() {
        switch (this.a) {
            case 0:
                return new C2121aN(3);
            case 1:
                return new C2121aN(4);
            case 2:
                return new C2121aN(5);
            case 3:
                return new C2121aN(7);
            case 4:
                return new C2121aN(8);
            case 5:
                return new C2121aN(10);
            case 6:
                return new C2121aN(11);
            case 7:
                return new C2121aN(12);
            case 8:
                return new C2121aN(13);
            default:
                return new g();
        }
    }
}
