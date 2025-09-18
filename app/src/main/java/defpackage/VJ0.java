package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Trace;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.fabric.SurfaceHandlerBinding;
import com.facebook.react.runtime.ReactHostImpl;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class VJ0 {
    public final Activity a;
    public ReactRootView b;
    public final Bundle c;
    public final FC d;
    public final PL0 e;
    public final CK0 f;
    public T71 g;
    public final boolean h;

    public VJ0(Activity activity, PL0 pl0, Bundle bundle) {
        this.h = ReactFeatureFlags.enableFabricRenderer;
        this.a = activity;
        this.c = bundle;
        this.d = new FC();
        this.e = pl0;
    }

    public ReactRootView a() {
        ReactRootView reactRootView = new ReactRootView(this.a);
        reactRootView.setIsFabric(this.h);
        return reactRootView;
    }

    public final InterfaceC2490cJ b() {
        if (ReactFeatureFlags.enableBridgelessArchitecture && this.f != null) {
            UN1.c(null);
        }
        PL0 pl0 = this.e;
        if (!pl0.e() || pl0.a() == null) {
            return null;
        }
        return pl0.a().i;
    }

    public final void c(String str) {
        boolean z = ReactFeatureFlags.enableBridgelessArchitecture;
        Bundle bundle = this.c;
        if (!z) {
            if (this.b != null) {
                throw new IllegalStateException("Cannot loadApp while app is already running.");
            }
            ReactRootView reactRootViewA = a();
            this.b = reactRootViewA;
            QK0 qk0A = this.e.a();
            MT1.b("startReactApplication");
            try {
                UiThreadUtil.assertOnUiThread();
                UN1.b(reactRootViewA.a == null, "This root view has already been attached to a catalyst instance manager");
                reactRootViewA.a = qk0A;
                reactRootViewA.b = str;
                reactRootViewA.c = bundle;
                qk0A.d();
                if (ReactFeatureFlags.enableEagerRootViewAttachment) {
                    if (!reactRootViewA.k) {
                        DisplayMetrics displayMetrics = reactRootViewA.getContext().getResources().getDisplayMetrics();
                        reactRootViewA.l = View.MeasureSpec.makeMeasureSpec(displayMetrics.widthPixels, Integer.MIN_VALUE);
                        reactRootViewA.m = View.MeasureSpec.makeMeasureSpec(displayMetrics.heightPixels, Integer.MIN_VALUE);
                    }
                    reactRootViewA.d();
                }
                return;
            } finally {
                Trace.endSection();
            }
        }
        if (this.g == null) {
            ReactHostImpl reactHostImpl = (ReactHostImpl) this.f;
            reactHostImpl.getClass();
            Activity activity = this.a;
            SurfaceHandlerBinding surfaceHandlerBinding = new SurfaceHandlerBinding(str);
            T71 t71 = new T71();
            t71.a = new AtomicReference(null);
            t71.b = new AtomicReference(null);
            t71.c = surfaceHandlerBinding;
            t71.d = activity;
            surfaceHandlerBinding.setProps(bundle == null ? new WritableNativeMap() : (NativeMap) Arguments.fromBundle(bundle));
            DisplayMetrics displayMetrics2 = activity.getResources().getDisplayMetrics();
            surfaceHandlerBinding.setLayoutConstraints(View.MeasureSpec.makeMeasureSpec(displayMetrics2.widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayMetrics2.heightPixels, Integer.MIN_VALUE), 0, 0, activity.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true), T71.I(activity), activity.getResources().getDisplayMetrics().density);
            OM0 om0 = new OM0(activity, t71);
            om0.setShouldLogContentAppeared(true);
            AtomicReference atomicReference = (AtomicReference) t71.a;
            while (!atomicReference.compareAndSet(null, om0)) {
                if (atomicReference.get() != null) {
                    throw new IllegalStateException("Trying to call ReactSurface.attachView(), but the view is already attached.");
                }
            }
            t71.d = om0.getContext();
            AtomicReference atomicReference2 = (AtomicReference) t71.b;
            while (!atomicReference2.compareAndSet(null, reactHostImpl)) {
                if (atomicReference2.get() != null) {
                    throw new IllegalStateException("This surface is already attached to a host!");
                }
            }
            this.g = t71;
            activity.setContentView((ViewGroup) atomicReference.get());
        }
        T71 t712 = this.g;
        if (((AtomicReference) t712.a).get() == null) {
            N81.c(new IllegalStateException("Trying to call ReactSurface.start(), but view is not created."));
        } else if (((ReactHostImpl) ((AtomicReference) t712.b).get()) == null) {
            N81.c(new IllegalStateException("Trying to call ReactSurface.start(), but no ReactHost is attached."));
        } else {
            ((SurfaceHandlerBinding) t712.c).getSurfaceId();
            int i = ReactHostImpl.a;
            throw null;
        }
    }

    public final void d() {
        InterfaceC2490cJ interfaceC2490cJB = b();
        if (interfaceC2490cJB != null && (interfaceC2490cJB instanceof C6073nQ0)) {
            if (!ReactFeatureFlags.enableBridgelessArchitecture) {
                UiThreadUtil.runOnUiThread(new RunnableC1577Tz0(11, this));
                return;
            }
            if (this.f == null) {
                return;
            }
            N81 n81 = new N81();
            try {
                throw null;
            } catch (Exception e) {
                C7074sg c7074sg = new C7074sg(e);
                synchronized (n81.a) {
                    if (n81.b) {
                        throw new IllegalStateException("Cannot set the error on a completed task.");
                    }
                    n81.b = true;
                    n81.e = c7074sg;
                    n81.a.notifyAll();
                    n81.h();
                    n81.b(new EK0(), AbstractC3857ft1.a);
                }
            }
        }
    }

    public VJ0(Activity activity, CK0 ck0, Bundle bundle) {
        this.h = ReactFeatureFlags.enableFabricRenderer;
        this.a = activity;
        this.c = bundle;
        this.d = new FC();
        this.f = ck0;
    }

    public VJ0(Activity activity, PL0 pl0, Bundle bundle, boolean z) {
        this.h = z;
        this.a = activity;
        this.c = bundle;
        this.d = new FC();
        this.e = pl0;
    }
}
