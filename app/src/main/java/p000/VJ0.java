package p000;

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

    /* renamed from: a */
    public final Activity f12512a;

    /* renamed from: b */
    public ReactRootView f12513b;

    /* renamed from: c */
    public final Bundle f12514c;

    /* renamed from: d */
    public final C0328FC f12515d;

    /* renamed from: e */
    public final PL0 f12516e;

    /* renamed from: f */
    public final CK0 f12517f;

    /* renamed from: g */
    public T71 f12518g;

    /* renamed from: h */
    public final boolean f12519h;

    public VJ0(Activity activity, PL0 pl0, Bundle bundle) {
        this.f12519h = ReactFeatureFlags.enableFabricRenderer;
        this.f12512a = activity;
        this.f12514c = bundle;
        this.f12515d = new C0328FC();
        this.f12516e = pl0;
    }

    /* renamed from: a */
    public ReactRootView mo580a() {
        ReactRootView reactRootView = new ReactRootView(this.f12512a);
        reactRootView.setIsFabric(this.f12519h);
        return reactRootView;
    }

    /* renamed from: b */
    public final InterfaceC1839cJ m8394b() {
        if (ReactFeatureFlags.enableBridgelessArchitecture && this.f12517f != null) {
            UN1.m7999c(null);
        }
        PL0 pl0 = this.f12516e;
        if (!pl0.m6305e() || pl0.m6302a() == null) {
            return null;
        }
        return pl0.m6302a().f9573i;
    }

    /* renamed from: c */
    public final void m8395c(String str) {
        boolean z = ReactFeatureFlags.enableBridgelessArchitecture;
        Bundle bundle = this.f12514c;
        if (!z) {
            if (this.f12513b != null) {
                throw new IllegalStateException("Cannot loadApp while app is already running.");
            }
            ReactRootView reactRootViewMo580a = mo580a();
            this.f12513b = reactRootViewMo580a;
            QK0 qk0M6302a = this.f12516e.m6302a();
            MT1.m5371b("startReactApplication");
            try {
                UiThreadUtil.assertOnUiThread();
                UN1.m7998b(reactRootViewMo580a.f17860a == null, "This root view has already been attached to a catalyst instance manager");
                reactRootViewMo580a.f17860a = qk0M6302a;
                reactRootViewMo580a.f17861b = str;
                reactRootViewMo580a.f17862c = bundle;
                qk0M6302a.m6635d();
                if (ReactFeatureFlags.enableEagerRootViewAttachment) {
                    if (!reactRootViewMo580a.f17870k) {
                        DisplayMetrics displayMetrics = reactRootViewMo580a.getContext().getResources().getDisplayMetrics();
                        reactRootViewMo580a.f17871l = View.MeasureSpec.makeMeasureSpec(displayMetrics.widthPixels, Integer.MIN_VALUE);
                        reactRootViewMo580a.f17872m = View.MeasureSpec.makeMeasureSpec(displayMetrics.heightPixels, Integer.MIN_VALUE);
                    }
                    reactRootViewMo580a.m10913d();
                }
                return;
            } finally {
                Trace.endSection();
            }
        }
        if (this.f12518g == null) {
            ReactHostImpl reactHostImpl = (ReactHostImpl) this.f12517f;
            reactHostImpl.getClass();
            Activity activity = this.f12512a;
            SurfaceHandlerBinding surfaceHandlerBinding = new SurfaceHandlerBinding(str);
            T71 t71 = new T71();
            t71.f11173a = new AtomicReference(null);
            t71.f11174b = new AtomicReference(null);
            t71.f11175c = surfaceHandlerBinding;
            t71.f11176d = activity;
            surfaceHandlerBinding.setProps(bundle == null ? new WritableNativeMap() : (NativeMap) Arguments.fromBundle(bundle));
            DisplayMetrics displayMetrics2 = activity.getResources().getDisplayMetrics();
            surfaceHandlerBinding.setLayoutConstraints(View.MeasureSpec.makeMeasureSpec(displayMetrics2.widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayMetrics2.heightPixels, Integer.MIN_VALUE), 0, 0, activity.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true), T71.m7552I(activity), activity.getResources().getDisplayMetrics().density);
            OM0 om0 = new OM0(activity, t71);
            om0.setShouldLogContentAppeared(true);
            AtomicReference atomicReference = (AtomicReference) t71.f11173a;
            while (!atomicReference.compareAndSet(null, om0)) {
                if (atomicReference.get() != null) {
                    throw new IllegalStateException("Trying to call ReactSurface.attachView(), but the view is already attached.");
                }
            }
            t71.f11176d = om0.getContext();
            AtomicReference atomicReference2 = (AtomicReference) t71.f11174b;
            while (!atomicReference2.compareAndSet(null, reactHostImpl)) {
                if (atomicReference2.get() != null) {
                    throw new IllegalStateException("This surface is already attached to a host!");
                }
            }
            this.f12518g = t71;
            activity.setContentView((ViewGroup) atomicReference.get());
        }
        T71 t712 = this.f12518g;
        if (((AtomicReference) t712.f11173a).get() == null) {
            N81.m5568c(new IllegalStateException("Trying to call ReactSurface.start(), but view is not created."));
        } else if (((ReactHostImpl) ((AtomicReference) t712.f11174b).get()) == null) {
            N81.m5568c(new IllegalStateException("Trying to call ReactSurface.start(), but no ReactHost is attached."));
        } else {
            ((SurfaceHandlerBinding) t712.f11175c).getSurfaceId();
            int i = ReactHostImpl.f17939a;
            throw null;
        }
    }

    /* renamed from: d */
    public final void m8396d() {
        InterfaceC1839cJ interfaceC1839cJM8394b = m8394b();
        if (interfaceC1839cJM8394b != null && (interfaceC1839cJM8394b instanceof C10391nQ0)) {
            if (!ReactFeatureFlags.enableBridgelessArchitecture) {
                UiThreadUtil.runOnUiThread(new RunnableC8352Tz0(11, this));
                return;
            }
            if (this.f12517f == null) {
                return;
            }
            N81 n81 = new N81();
            try {
                throw null;
            } catch (Exception e) {
                C6838sg c6838sg = new C6838sg(e);
                synchronized (n81.f7527a) {
                    if (n81.f7528b) {
                        throw new IllegalStateException("Cannot set the error on a completed task.");
                    }
                    n81.f7528b = true;
                    n81.f7531e = c6838sg;
                    n81.f7527a.notifyAll();
                    n81.m5575h();
                    n81.m5570b(new EK0(), AbstractC9426ft1.f27446a);
                }
            }
        }
    }

    public VJ0(Activity activity, CK0 ck0, Bundle bundle) {
        this.f12519h = ReactFeatureFlags.enableFabricRenderer;
        this.f12512a = activity;
        this.f12514c = bundle;
        this.f12515d = new C0328FC();
        this.f12517f = ck0;
    }

    public VJ0(Activity activity, PL0 pl0, Bundle bundle, boolean z) {
        this.f12519h = z;
        this.f12512a = activity;
        this.f12514c = bundle;
        this.f12515d = new C0328FC();
        this.f12516e = pl0;
    }
}
