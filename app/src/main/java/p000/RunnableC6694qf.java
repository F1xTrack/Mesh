package p000;

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
import com.yandex.varioqub.config.impl.C3858B;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: qf */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6694qf implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f41090a;

    /* renamed from: b */
    public final /* synthetic */ int f41091b;

    /* renamed from: c */
    public final /* synthetic */ Object f41092c;

    /* renamed from: d */
    public final /* synthetic */ Object f41093d;

    public /* synthetic */ RunnableC6694qf(Object obj, int i, Object obj2, int i2) {
        this.f41090a = i2;
        this.f41092c = obj;
        this.f41091b = i;
        this.f41093d = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v15, types: [PL, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f41090a) {
            case 0:
                C3858B.m17384a((C3858B) this.f41092c, this.f41091b, (InterfaceC6434mZ) this.f41093d);
                break;
            case 1:
                ((AbstractC6511nn) this.f41092c).mo6423c(this.f41091b, (C6702qn) this.f41093d);
                break;
            case 2:
                ((AbstractC6511nn) this.f41092c).mo5817b(this.f41091b, (InterfaceC7034vn) this.f41093d);
                break;
            case 3:
                ((CameraCaptureSession.CaptureCallback) ((C6447mm) this.f41092c).f37864b).onCaptureSequenceAborted((CameraCaptureSession) this.f41093d, this.f41091b);
                break;
            case 4:
                ((CameraDevice.StateCallback) ((C7033vm) this.f41092c).f44519b).onError((CameraDevice) this.f41093d, this.f41091b);
                break;
            case 5:
                C0310Ev c0310Ev = (C0310Ev) this.f41092c;
                O90.m5968f(c0310Ev, "this$0");
                Object obj = ((C0633K2) this.f41093d).f5884a;
                String str = (String) c0310Ev.f14650a.get(Integer.valueOf(this.f41091b));
                if (str != null) {
                    C1324V2 c1324v2 = (C1324V2) c0310Ev.f14654e.get(str);
                    if ((c1324v2 != null ? c1324v2.f12311a : null) != null) {
                        InterfaceC0570J2 interfaceC0570J2 = c1324v2.f12311a;
                        O90.m5966d(interfaceC0570J2, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
                        if (c0310Ev.f14653d.remove(str)) {
                            interfaceC0570J2.onActivityResult(obj);
                            break;
                        }
                    } else {
                        c0310Ev.f14656g.remove(str);
                        c0310Ev.f14655f.put(str, obj);
                        break;
                    }
                }
                break;
            case 6:
                C0310Ev c0310Ev2 = (C0310Ev) this.f41092c;
                O90.m5968f(c0310Ev2, "this$0");
                IntentSender.SendIntentException sendIntentException = (IntentSender.SendIntentException) this.f41093d;
                O90.m5968f(sendIntentException, "$e");
                c0310Ev2.m9455a(this.f41091b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
                break;
            case 7:
                ((WD0) ((C1051Qh) this.f41092c).f9733d).mo6699i(this.f41091b, (Serializable) this.f41093d);
                break;
            case 8:
                C0903OL c0903ol = (C0903OL) this.f41092c;
                int i = c0903ol.f8364a;
                ?? r2 = this.f41093d;
                r2.getClass();
                r2.mo1086l(i, c0903ol.f8365b, this.f41091b);
                break;
            case 9:
                C1753aw c1753aw = (C1753aw) this.f41092c;
                boolean z = c1753aw.f16683c;
                final C0300El c0300El = (C0300El) this.f41093d;
                if (!z) {
                    ((C1356VY) c1753aw.f16684d).m8491c0(0);
                    c0300El.m2377d(new C1434Wn("Camera is not active."));
                    break;
                } else {
                    c1753aw.m10386d();
                    AbstractC9104dM1.m17550i(((C0300El) c1753aw.f16686f) == null, "mRunningCompleter should be null when starting set a new exposure compensation value");
                    AbstractC9104dM1.m17550i(((C6886tR) c1753aw.f16687g) == null, "mRunningCaptureResultListener should be null when starting set a new exposure compensation value");
                    final int i2 = this.f41091b;
                    InterfaceC6510nm interfaceC6510nm = new InterfaceC6510nm() { // from class: tR
                        @Override // p000.InterfaceC6510nm
                        /* renamed from: c */
                        public final boolean mo2326c(TotalCaptureResult totalCaptureResult) {
                            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
                            Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
                            int i3 = i2;
                            C0300El c0300El2 = c0300El;
                            if (num != null && num2 != null) {
                                int iIntValue = num.intValue();
                                if ((iIntValue == 2 || iIntValue == 3 || iIntValue == 4) && num2.intValue() == i3) {
                                    c0300El2.m2375b(Integer.valueOf(i3));
                                    return true;
                                }
                            } else if (num2 != null && num2.intValue() == i3) {
                                c0300El2.m2375b(Integer.valueOf(i3));
                                return true;
                            }
                            return false;
                        }
                    };
                    c1753aw.f16687g = interfaceC6510nm;
                    c1753aw.f16686f = c0300El;
                    C6573om c6573om = (C6573om) c1753aw.f16682b;
                    c6573om.m23543a(interfaceC6510nm);
                    c6573om.m23552m();
                    break;
                }
            case 10:
                Iterator it = ((CopyOnWriteArraySet) this.f41092c).iterator();
                while (it.hasNext()) {
                    C8320Tj0 c8320Tj0 = (C8320Tj0) it.next();
                    if (!c8320Tj0.f11485d) {
                        int i3 = this.f41091b;
                        if (i3 != -1) {
                            c8320Tj0.f11483b.m6120e(i3);
                        }
                        c8320Tj0.f11484c = true;
                        ((InterfaceC8216Rj0) this.f41093d).invoke(c8320Tj0.f11482a);
                    }
                }
                break;
            case 11:
                C7251zE c7251zE = (C7251zE) ((C8332Tp0) ((CC0) this.f41092c).f1251c).f11544i;
                Pair pair = (Pair) this.f41093d;
                c7251zE.mo1086l(((Integer) pair.first).intValue(), (C7604Fp0) pair.second, this.f41091b);
                break;
            case 12:
                ReactNativeMoneyInputModule.applyMask$lambda$0((ReactNativeMoneyInputModule) this.f41092c, this.f41091b, (ReadableMap) this.f41093d);
                break;
            case 13:
                ToastModule.show$lambda$0((ToastModule) this.f41092c, (String) this.f41093d, this.f41091b);
                break;
            case 14:
                VideoManagerModule.performOnPlayerView$lambda$0((VideoManagerModule) this.f41092c, this.f41091b, (InterfaceC6497nZ) this.f41093d);
                break;
            default:
                VisionCameraProxy visionCameraProxy = (VisionCameraProxy) this.f41092c;
                O90.m5968f(visionCameraProxy, "this$0");
                FrameProcessor frameProcessor = (FrameProcessor) this.f41093d;
                O90.m5968f(frameProcessor, "$frameProcessor");
                visionCameraProxy.m12744a(this.f41091b).setFrameProcessor$react_native_vision_camera_release(frameProcessor);
                break;
        }
    }

    public /* synthetic */ RunnableC6694qf(Object obj, Object obj2, int i, int i2) {
        this.f41090a = i2;
        this.f41092c = obj;
        this.f41093d = obj2;
        this.f41091b = i;
    }
}
