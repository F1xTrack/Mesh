package com.facebook.react.modules.toast;

import android.widget.Toast;
import com.facebook.fbreact.specs.NativeToastAndroidSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.toast.ToastModule;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import p000.AbstractC11077sn0;
import p000.C8511Xa1;
import p000.InterfaceC9101dL0;
import p000.O90;
import p000.RunnableC11365v20;
import p000.RunnableC6694qf;

@InterfaceC9101dL0(name = "ToastAndroid")
@Metadata(m22266d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0012\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J9\u0010\u0016\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m22267d2 = {"Lcom/facebook/react/modules/toast/ToastModule;", "Lcom/facebook/fbreact/specs/NativeToastAndroidSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "", "", "getTypedExportedConstants", "()Ljava/util/Map;", "message", "", "durationDouble", "LTf1;", "show", "(Ljava/lang/String;D)V", "gravityDouble", "showWithGravity", "(Ljava/lang/String;DD)V", "xOffsetDouble", "yOffsetDouble", "showWithGravityAndOffset", "(Ljava/lang/String;DDDD)V", "Companion", "Xa1", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class ToastModule extends NativeToastAndroidSpec {
    public static final C8511Xa1 Companion = new C8511Xa1();
    private static final String DURATION_LONG_KEY = "LONG";
    private static final String DURATION_SHORT_KEY = "SHORT";
    private static final String GRAVITY_BOTTOM_KEY = "BOTTOM";
    private static final String GRAVITY_CENTER = "CENTER";
    private static final String GRAVITY_TOP_KEY = "TOP";
    public static final String NAME = "ToastAndroid";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToastModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        O90.m5968f(reactApplicationContext, "reactContext");
    }

    public static final void show$lambda$0(ToastModule toastModule, String str, int i) {
        O90.m5968f(toastModule, "this$0");
        Toast.makeText(toastModule.getReactApplicationContext(), str, i).show();
    }

    public static final void showWithGravity$lambda$1(ToastModule toastModule, String str, int i, int i2) {
        O90.m5968f(toastModule, "this$0");
        Toast toastMakeText = Toast.makeText(toastModule.getReactApplicationContext(), str, i);
        toastMakeText.setGravity(i2, 0, 0);
        toastMakeText.show();
    }

    public static final void showWithGravityAndOffset$lambda$2(ToastModule toastModule, String str, int i, int i2, int i3, int i4) {
        O90.m5968f(toastModule, "this$0");
        Toast toastMakeText = Toast.makeText(toastModule.getReactApplicationContext(), str, i);
        toastMakeText.setGravity(i2, i3, i4);
        toastMakeText.show();
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public Map<String, Object> getTypedExportedConstants() {
        return AbstractC11077sn0.m24781i(new Pair(DURATION_SHORT_KEY, 0), new Pair(DURATION_LONG_KEY, 1), new Pair(GRAVITY_TOP_KEY, 49), new Pair(GRAVITY_BOTTOM_KEY, 81), new Pair(GRAVITY_CENTER, 17));
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public void show(String message, double durationDouble) {
        UiThreadUtil.runOnUiThread(new RunnableC6694qf(this, message, (int) durationDouble, 13));
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public void showWithGravity(String message, double durationDouble, double gravityDouble) {
        UiThreadUtil.runOnUiThread(new RunnableC11365v20(this, message, (int) durationDouble, (int) gravityDouble));
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public void showWithGravityAndOffset(final String message, double durationDouble, double gravityDouble, double xOffsetDouble, double yOffsetDouble) {
        final int i = (int) durationDouble;
        final int i2 = (int) gravityDouble;
        final int i3 = (int) xOffsetDouble;
        final int i4 = (int) yOffsetDouble;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: Wa1
            @Override // java.lang.Runnable
            public final void run() {
                ToastModule.showWithGravityAndOffset$lambda$2(this.f13267a, message, i, i2, i3, i4);
            }
        });
    }
}
