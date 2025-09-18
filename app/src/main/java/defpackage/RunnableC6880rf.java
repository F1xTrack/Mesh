package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.camera.ImageStoreManager;
import com.facebook.react.uimanager.ViewGroupManager;
import com.my.tracker.obfuscated.f0;
import com.my.tracker.obfuscated.n0;
import com.my.tracker.obfuscated.x0;
import com.my.tracker.obfuscated.x1;
import com.my.tracker.obfuscated.z2;
import com.my.tracker.personalize.PersonalizeApiClient;
import com.my.tracker.personalize.PersonalizeRequest;
import com.my.tracker.personalize.PersonalizeResponse;
import com.reactcommunity.rndatetimepicker.DatePickerModule;
import com.reactcommunity.rndatetimepicker.MaterialDatePickerModule;
import com.reactcommunity.rndatetimepicker.MaterialTimePickerModule;
import com.reactcommunity.rndatetimepicker.TimePickerModule;
import com.swmansion.reanimated.layoutReanimation.ReanimatedNativeHierarchyManager;
import io.appmetrica.analytics.impl.B0;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.sentry.ILogger;
import io.sentry.android.core.D;
import io.sentry.android.core.internal.util.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.logging.Logger;

/* renamed from: rf */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6880rf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC6880rf(PersonalizeApiClient personalizeApiClient, PersonalizeApiClient.OnCompleteListener onCompleteListener, PersonalizeRequest personalizeRequest, String str) {
        this.a = 13;
        this.b = personalizeApiClient;
        this.d = onCompleteListener;
        this.e = personalizeRequest;
        this.c = str;
    }

    /* JADX WARN: Type inference failed for: r1v24, types: [Kp0, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                B0.a((B0) this.b, (String) this.c, (String) this.d, (PluginErrorDetails) this.e);
                return;
            case 1:
                ((CameraCaptureSession.CaptureCallback) ((C5947mm) this.b).b).onCaptureCompleted((CameraCaptureSession) this.c, (CaptureRequest) this.d, (TotalCaptureResult) this.e);
                return;
            case 2:
                ((CameraCaptureSession.CaptureCallback) ((C5947mm) this.b).b).onCaptureProgressed((CameraCaptureSession) this.c, (CaptureRequest) this.d, (CaptureResult) this.e);
                return;
            case 3:
                ((CameraCaptureSession.CaptureCallback) ((C5947mm) this.b).b).onCaptureFailed((CameraCaptureSession) this.c, (CaptureRequest) this.d, (CaptureFailure) this.e);
                return;
            case 4:
                ((DatePickerModule) this.b).lambda$open$0((C5332jY) this.c, (ReadableMap) this.d, (Promise) this.e);
                return;
            case 5:
                C1513Te c1513Te = (C1513Te) this.c;
                InterfaceC2552cd1 interfaceC2552cd1 = (InterfaceC2552cd1) this.d;
                C0185Cd c0185Cd = (C0185Cd) this.e;
                C7949xG c7949xG = (C7949xG) this.b;
                c7949xG.getClass();
                Logger logger = C7949xG.f;
                try {
                    InterfaceC1431Sc1 interfaceC1431Sc1A = c7949xG.c.a(c1513Te.a);
                    if (interfaceC1431Sc1A == null) {
                        String str = "Transport backend '" + c1513Te.a + "' is not registered";
                        logger.warning(str);
                        interfaceC2552cd1.d(new IllegalArgumentException(str));
                    } else {
                        ((C7992xU0) c7949xG.e).x(new C4290i9(c7949xG, c1513Te, ((C0380Eq) interfaceC1431Sc1A).a(c0185Cd), 5));
                        interfaceC2552cd1.d(null);
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    interfaceC2552cd1.d(e);
                    return;
                }
            case 6:
                CM cm = (CM) this.c;
                Map map = (Map) this.d;
                C0365El c0365El = (C0365El) this.e;
                JG jg = (JG) this.b;
                jg.getClass();
                try {
                    jg.a.f(cm, map);
                    c0365El.b(null);
                    return;
                } catch (RuntimeException e2) {
                    c0365El.d(e2);
                    return;
                }
            case 7:
                CM cm2 = (CM) this.c;
                Map map2 = (Map) this.d;
                C0365El c0365El2 = (C0365El) this.e;
                C5869mM c5869mM = (C5869mM) this.b;
                c5869mM.getClass();
                try {
                    c5869mM.a.f(cm2, map2);
                    c0365El2.b(null);
                    return;
                } catch (RuntimeException e3) {
                    c0365El2.d(e3);
                    return;
                }
            case 8:
                ((C7349u60) this.b).J((VH) this.c, (ExecutorService) this.d, (C2226aw) this.e);
                return;
            case 9:
                ImageStoreManager.getBase64ForTag$lambda$0((ImageStoreManager) this.b, (String) this.c, (Callback) this.d, (Callback) this.e);
                return;
            case 10:
                MaterialDatePickerModule.open$lambda$0((ReadableMap) this.b, (Promise) this.c, (C5332jY) this.d, (MaterialDatePickerModule) this.e);
                return;
            case 11:
                MaterialTimePickerModule.open$lambda$0((ReadableMap) this.b, (Promise) this.c, (C5332jY) this.d, (MaterialTimePickerModule) this.e);
                return;
            case 12:
                this.c.f(((VY) this.b).b, (C0456Fp0) this.d, (C7102sp0) this.e);
                return;
            case 13:
                ((PersonalizeApiClient) this.b).a((PersonalizeApiClient.OnCompleteListener) this.d, (PersonalizeRequest) this.e, (String) this.c);
                return;
            case 14:
                ((PersonalizeApiClient) this.b).a((PersonalizeApiClient.OnCompleteListener) this.c, (PersonalizeRequest) this.d, (PersonalizeResponse) this.e);
                return;
            case 15:
                ReanimatedNativeHierarchyManager.lambda$manageChildren$0((ArrayList) this.b, (View) this.c, (ViewGroupManager) this.d, (ViewGroup) this.e);
                return;
            case 16:
                Q91 q91 = (Q91) this.b;
                q91.getClass();
                AbstractC0759Jm0.f("TextureViewImpl");
                C4290i9 c4290i9 = q91.l;
                if (c4290i9 != null) {
                    c4290i9.c();
                    q91.l = null;
                }
                ((Surface) this.c).release();
                if (q91.g == ((C0599Hl) this.d)) {
                    q91.g = null;
                }
                if (q91.h == ((Z61) this.e)) {
                    q91.h = null;
                    return;
                }
                return;
            case 17:
                ((TimePickerModule) this.b).lambda$open$0((C5332jY) this.c, (ReadableMap) this.d, (Promise) this.e);
                return;
            case 18:
                C5534kb1 c5534kb1 = (C5534kb1) this.b;
                String str2 = (String) ((AtomicMarkableReference) c5534kb1.g).getReference();
                String str3 = (String) this.c;
                C0306Dr0 c0306Dr0 = (C0306Dr0) c5534kb1.a;
                if (str2 != null) {
                    c0306Dr0.j(str3, (String) ((AtomicMarkableReference) c5534kb1.g).getReference());
                }
                Map map3 = (Map) this.d;
                if (!map3.isEmpty()) {
                    c0306Dr0.h(map3, str3, false);
                }
                List list = (List) this.e;
                if (list.isEmpty()) {
                    return;
                }
                c0306Dr0.i(str3, list);
                return;
            case 19:
                Window window = (Window) this.b;
                View viewPeekDecorView = window.peekDecorView();
                if (viewPeekDecorView != null) {
                    window.setCallback((Window.Callback) this.c);
                    f.b(viewPeekDecorView, (Runnable) this.d, (D) this.e);
                    return;
                }
                return;
            case 20:
                View view = (View) this.b;
                Canvas canvas = (Canvas) this.c;
                ILogger iLogger = (ILogger) this.d;
                CountDownLatch countDownLatch = (CountDownLatch) this.e;
                try {
                    view.draw(canvas);
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            case 21:
                n0.a((ArrayList) this.b, (String) this.c, (n0.b) this.d, (Context) this.e);
                return;
            default:
                x0.a((Context) this.b, (z2) this.c, (f0) this.d, (x1) this.e);
                return;
        }
    }

    public /* synthetic */ RunnableC6880rf(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
