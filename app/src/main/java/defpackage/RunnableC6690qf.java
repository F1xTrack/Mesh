package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Pair;
import com.alexzunik.reactnativemoneyinput.ReactNativeMoneyInputModule;
import com.brentvatne.react.VideoManagerModule;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.toast.ToastModule;
import com.mrousavy.camera.frameprocessors.FrameProcessor;
import com.mrousavy.camera.frameprocessors.VisionCameraProxy;
import com.yandex.varioqub.config.impl.B;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: qf */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6690qf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ RunnableC6690qf(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v15, types: [PL, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                B.a((B) this.c, this.b, (InterfaceC5908mZ) this.d);
                break;
            case 1:
                ((AbstractC6141nn) this.c).c(this.b, (C6714qn) this.d);
                break;
            case 2:
                ((AbstractC6141nn) this.c).b(this.b, (InterfaceC7668vn) this.d);
                break;
            case 3:
                ((CameraCaptureSession.CaptureCallback) ((C5947mm) this.c).b).onCaptureSequenceAborted((CameraCaptureSession) this.d, this.b);
                break;
            case 4:
                ((CameraDevice.StateCallback) ((C7665vm) this.c).b).onError((CameraDevice) this.d, this.b);
                break;
            case 5:
                C0395Ev c0395Ev = (C0395Ev) this.c;
                O90.f(c0395Ev, "this$0");
                Object obj = ((K2) this.d).a;
                String str = (String) c0395Ev.a.get(Integer.valueOf(this.b));
                if (str != null) {
                    V2 v2 = (V2) c0395Ev.e.get(str);
                    if ((v2 != null ? v2.a : null) != null) {
                        J2 j2 = v2.a;
                        O90.d(j2, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
                        if (c0395Ev.d.remove(str)) {
                            j2.onActivityResult(obj);
                            break;
                        }
                    } else {
                        c0395Ev.g.remove(str);
                        c0395Ev.f.put(str, obj);
                        break;
                    }
                }
                break;
            case 6:
                C0395Ev c0395Ev2 = (C0395Ev) this.c;
                O90.f(c0395Ev2, "this$0");
                IntentSender.SendIntentException sendIntentException = (IntentSender.SendIntentException) this.d;
                O90.f(sendIntentException, "$e");
                c0395Ev2.a(this.b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
                break;
            case 7:
                ((WD0) ((C1288Qh) this.c).d).i(this.b, (Serializable) this.d);
                break;
            case 8:
                OL ol = (OL) this.c;
                int i = ol.a;
                ?? r2 = this.d;
                r2.getClass();
                r2.l(i, ol.b, this.b);
                break;
            case 9:
                C2226aw c2226aw = (C2226aw) this.c;
                boolean z = c2226aw.c;
                final C0365El c0365El = (C0365El) this.d;
                if (!z) {
                    ((VY) c2226aw.d).c0(0);
                    c0365El.d(new C1774Wn("Camera is not active."));
                    break;
                } else {
                    c2226aw.d();
                    AbstractC3377dM1.i(((C0365El) c2226aw.f) == null, "mRunningCompleter should be null when starting set a new exposure compensation value");
                    AbstractC3377dM1.i(((C7220tR) c2226aw.g) == null, "mRunningCaptureResultListener should be null when starting set a new exposure compensation value");
                    final int i2 = this.b;
                    InterfaceC6138nm interfaceC6138nm = new InterfaceC6138nm() { // from class: tR
                        @Override // defpackage.InterfaceC6138nm
                        public final boolean c(TotalCaptureResult totalCaptureResult) {
                            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
                            Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
                            int i3 = i2;
                            C0365El c0365El2 = c0365El;
                            if (num != null && num2 != null) {
                                int iIntValue = num.intValue();
                                if ((iIntValue == 2 || iIntValue == 3 || iIntValue == 4) && num2.intValue() == i3) {
                                    c0365El2.b(Integer.valueOf(i3));
                                    return true;
                                }
                            } else if (num2 != null && num2.intValue() == i3) {
                                c0365El2.b(Integer.valueOf(i3));
                                return true;
                            }
                            return false;
                        }
                    };
                    c2226aw.g = interfaceC6138nm;
                    c2226aw.f = c0365El;
                    C6329om c6329om = (C6329om) c2226aw.b;
                    c6329om.a(interfaceC6138nm);
                    c6329om.m();
                    break;
                }
            case 10:
                Iterator it = ((CopyOnWriteArraySet) this.c).iterator();
                while (it.hasNext()) {
                    C1529Tj0 c1529Tj0 = (C1529Tj0) it.next();
                    if (!c1529Tj0.d) {
                        int i3 = this.b;
                        if (i3 != -1) {
                            c1529Tj0.b.e(i3);
                        }
                        c1529Tj0.c = true;
                        ((InterfaceC1373Rj0) this.d).invoke(c1529Tj0.a);
                    }
                }
                break;
            case 11:
                C8323zE c8323zE = (C8323zE) ((C1547Tp0) ((CC0) this.c).c).i;
                Pair pair = (Pair) this.d;
                c8323zE.l(((Integer) pair.first).intValue(), (C0456Fp0) pair.second, this.b);
                break;
            case 12:
                ReactNativeMoneyInputModule.applyMask$lambda$0((ReactNativeMoneyInputModule) this.c, this.b, (ReadableMap) this.d);
                break;
            case 13:
                ToastModule.show$lambda$0((ToastModule) this.c, (String) this.d, this.b);
                break;
            case 14:
                VideoManagerModule.performOnPlayerView$lambda$0((VideoManagerModule) this.c, this.b, (InterfaceC6099nZ) this.d);
                break;
            default:
                VisionCameraProxy visionCameraProxy = (VisionCameraProxy) this.c;
                O90.f(visionCameraProxy, "this$0");
                FrameProcessor frameProcessor = (FrameProcessor) this.d;
                O90.f(frameProcessor, "$frameProcessor");
                visionCameraProxy.a(this.b).setFrameProcessor$react_native_vision_camera_release(frameProcessor);
                break;
        }
    }

    public /* synthetic */ RunnableC6690qf(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
