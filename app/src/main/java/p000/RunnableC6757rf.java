package p000;

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
import com.p018my.tracker.obfuscated.AbstractC2385x0;
import com.p018my.tracker.obfuscated.C2313f0;
import com.p018my.tracker.obfuscated.C2345n0;
import com.p018my.tracker.obfuscated.C2386x1;
import com.p018my.tracker.obfuscated.C2395z2;
import com.p018my.tracker.personalize.PersonalizeApiClient;
import com.p018my.tracker.personalize.PersonalizeRequest;
import com.p018my.tracker.personalize.PersonalizeResponse;
import com.reactcommunity.rndatetimepicker.DatePickerModule;
import com.reactcommunity.rndatetimepicker.MaterialDatePickerModule;
import com.reactcommunity.rndatetimepicker.MaterialTimePickerModule;
import com.reactcommunity.rndatetimepicker.TimePickerModule;
import com.swmansion.reanimated.layoutReanimation.ReanimatedNativeHierarchyManager;
import io.appmetrica.analytics.impl.C4382B0;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.sentry.ILogger;
import io.sentry.android.core.C5832D;
import io.sentry.android.core.internal.util.ViewTreeObserverOnDrawListenerC5886f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.logging.Logger;

/* renamed from: rf */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6757rf implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f41787a;

    /* renamed from: b */
    public final /* synthetic */ Object f41788b;

    /* renamed from: c */
    public final /* synthetic */ Object f41789c;

    /* renamed from: d */
    public final /* synthetic */ Object f41790d;

    /* renamed from: e */
    public final /* synthetic */ Object f41791e;

    public /* synthetic */ RunnableC6757rf(PersonalizeApiClient personalizeApiClient, PersonalizeApiClient.OnCompleteListener onCompleteListener, PersonalizeRequest personalizeRequest, String str) {
        this.f41787a = 13;
        this.f41788b = personalizeApiClient;
        this.f41790d = onCompleteListener;
        this.f41791e = personalizeRequest;
        this.f41789c = str;
    }

    /* JADX WARN: Type inference failed for: r1v24, types: [Kp0, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f41787a) {
            case 0:
                C4382B0.m19216a((C4382B0) this.f41788b, (String) this.f41789c, (String) this.f41790d, (PluginErrorDetails) this.f41791e);
                return;
            case 1:
                ((CameraCaptureSession.CaptureCallback) ((C6447mm) this.f41788b).f37864b).onCaptureCompleted((CameraCaptureSession) this.f41789c, (CaptureRequest) this.f41790d, (TotalCaptureResult) this.f41791e);
                return;
            case 2:
                ((CameraCaptureSession.CaptureCallback) ((C6447mm) this.f41788b).f37864b).onCaptureProgressed((CameraCaptureSession) this.f41789c, (CaptureRequest) this.f41790d, (CaptureResult) this.f41791e);
                return;
            case 3:
                ((CameraCaptureSession.CaptureCallback) ((C6447mm) this.f41788b).f37864b).onCaptureFailed((CameraCaptureSession) this.f41789c, (CaptureRequest) this.f41790d, (CaptureFailure) this.f41791e);
                return;
            case 4:
                ((DatePickerModule) this.f41788b).lambda$open$0((C6244jY) this.f41789c, (ReadableMap) this.f41790d, (Promise) this.f41791e);
                return;
            case 5:
                C1236Te c1236Te = (C1236Te) this.f41789c;
                InterfaceC9005cd1 interfaceC9005cd1 = (InterfaceC9005cd1) this.f41790d;
                C0166Cd c0166Cd = (C0166Cd) this.f41791e;
                C7127xG c7127xG = (C7127xG) this.f41788b;
                c7127xG.getClass();
                Logger logger = C7127xG.f45500f;
                try {
                    InterfaceC8255Sc1 interfaceC8255Sc1M3635a = c7127xG.f45503c.m3635a(c1236Te.f11450a);
                    if (interfaceC8255Sc1M3635a == null) {
                        String str = "Transport backend '" + c1236Te.f11450a + "' is not registered";
                        logger.warning(str);
                        interfaceC9005cd1.mo4002d(new IllegalArgumentException(str));
                    } else {
                        ((C11677xU0) c7127xG.f45505e).m25905x(new C4224i9(c7127xG, c1236Te, ((C0305Eq) interfaceC8255Sc1M3635a).m2433a(c0166Cd), 5));
                        interfaceC9005cd1.mo4002d(null);
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    interfaceC9005cd1.mo4002d(e);
                    return;
                }
            case 6:
                C0149CM c0149cm = (C0149CM) this.f41789c;
                Map map = (Map) this.f41790d;
                C0300El c0300El = (C0300El) this.f41791e;
                C0584JG c0584jg = (C0584JG) this.f41788b;
                c0584jg.getClass();
                try {
                    c0584jg.f5430a.mo22192f(c0149cm, map);
                    c0300El.m2375b(null);
                    return;
                } catch (RuntimeException e2) {
                    c0300El.m2377d(e2);
                    return;
                }
            case 7:
                C0149CM c0149cm2 = (C0149CM) this.f41789c;
                Map map2 = (Map) this.f41790d;
                C0300El c0300El2 = (C0300El) this.f41791e;
                C6421mM c6421mM = (C6421mM) this.f41788b;
                c6421mM.getClass();
                try {
                    c6421mM.f37639a.mo22192f(c0149cm2, map2);
                    c0300El2.m2375b(null);
                    return;
                } catch (RuntimeException e3) {
                    c0300El2.m2377d(e3);
                    return;
                }
            case 8:
                ((C11247u60) this.f41788b).m25113J((C1339VH) this.f41789c, (ExecutorService) this.f41790d, (C1753aw) this.f41791e);
                return;
            case 9:
                ImageStoreManager.getBase64ForTag$lambda$0((ImageStoreManager) this.f41788b, (String) this.f41789c, (Callback) this.f41790d, (Callback) this.f41791e);
                return;
            case 10:
                MaterialDatePickerModule.open$lambda$0((ReadableMap) this.f41788b, (Promise) this.f41789c, (C6244jY) this.f41790d, (MaterialDatePickerModule) this.f41791e);
                return;
            case 11:
                MaterialTimePickerModule.open$lambda$0((ReadableMap) this.f41788b, (Promise) this.f41789c, (C6244jY) this.f41790d, (MaterialTimePickerModule) this.f41791e);
                return;
            case 12:
                this.f41789c.mo1068f(((C1356VY) this.f41788b).f12611b, (C7604Fp0) this.f41790d, (C11081sp0) this.f41791e);
                return;
            case 13:
                ((PersonalizeApiClient) this.f41788b).m13627a((PersonalizeApiClient.OnCompleteListener) this.f41790d, (PersonalizeRequest) this.f41791e, (String) this.f41789c);
                return;
            case 14:
                ((PersonalizeApiClient) this.f41788b).m13626a((PersonalizeApiClient.OnCompleteListener) this.f41789c, (PersonalizeRequest) this.f41790d, (PersonalizeResponse) this.f41791e);
                return;
            case 15:
                ReanimatedNativeHierarchyManager.lambda$manageChildren$0((ArrayList) this.f41788b, (View) this.f41789c, (ViewGroupManager) this.f41790d, (ViewGroup) this.f41791e);
                return;
            case 16:
                Q91 q91 = (Q91) this.f41788b;
                q91.getClass();
                AbstractC7806Jm0.m4412f("TextureViewImpl");
                C4224i9 c4224i9 = q91.f9511l;
                if (c4224i9 != null) {
                    c4224i9.m18973c();
                    q91.f9511l = null;
                }
                ((Surface) this.f41789c).release();
                if (q91.f9506g == ((C0489Hl) this.f41790d)) {
                    q91.f9506g = null;
                }
                if (q91.f9507h == ((Z61) this.f41791e)) {
                    q91.f9507h = null;
                    return;
                }
                return;
            case 17:
                ((TimePickerModule) this.f41788b).lambda$open$0((C6244jY) this.f41789c, (ReadableMap) this.f41790d, (Promise) this.f41791e);
                return;
            case 18:
                C10030kb1 c10030kb1 = (C10030kb1) this.f41788b;
                String str2 = (String) ((AtomicMarkableReference) c10030kb1.f36567g).getReference();
                String str3 = (String) this.f41789c;
                C7504Dr0 c7504Dr0 = (C7504Dr0) c10030kb1.f36561a;
                if (str2 != null) {
                    c7504Dr0.m1917j(str3, (String) ((AtomicMarkableReference) c10030kb1.f36567g).getReference());
                }
                Map map3 = (Map) this.f41790d;
                if (!map3.isEmpty()) {
                    c7504Dr0.m1915h(map3, str3, false);
                }
                List list = (List) this.f41791e;
                if (list.isEmpty()) {
                    return;
                }
                c7504Dr0.m1916i(str3, list);
                return;
            case 19:
                Window window = (Window) this.f41788b;
                View viewPeekDecorView = window.peekDecorView();
                if (viewPeekDecorView != null) {
                    window.setCallback((Window.Callback) this.f41789c);
                    ViewTreeObserverOnDrawListenerC5886f.m21585b(viewPeekDecorView, (Runnable) this.f41790d, (C5832D) this.f41791e);
                    return;
                }
                return;
            case 20:
                View view = (View) this.f41788b;
                Canvas canvas = (Canvas) this.f41789c;
                ILogger iLogger = (ILogger) this.f41790d;
                CountDownLatch countDownLatch = (CountDownLatch) this.f41791e;
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
                C2345n0.m13326a((ArrayList) this.f41788b, (String) this.f41789c, (C2345n0.b) this.f41790d, (Context) this.f41791e);
                return;
            default:
                AbstractC2385x0.m13532a((Context) this.f41788b, (C2395z2) this.f41789c, (C2313f0) this.f41790d, (C2386x1) this.f41791e);
                return;
        }
    }

    public /* synthetic */ RunnableC6757rf(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f41787a = i;
        this.f41788b = obj;
        this.f41789c = obj2;
        this.f41790d = obj3;
        this.f41791e = obj4;
    }
}
