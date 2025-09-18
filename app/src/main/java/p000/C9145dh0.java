package p000;

import android.os.Handler;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;

/* renamed from: dh0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9145dh0 {
    private Runnable mCompletionRunnable;
    private boolean mShouldAnimateLayout;
    private final AbstractC6525o0 mLayoutCreateAnimation = new C9529gh0();
    private final AbstractC6525o0 mLayoutUpdateAnimation = new C10425nh0();
    private final AbstractC6525o0 mLayoutDeleteAnimation = new C9657hh0();
    private final SparseArray<InterfaceC9785ih0> mLayoutHandlers = new SparseArray<>(0);
    private long mMaxAnimationDuration = -1;

    /* renamed from: b */
    public static void m17728b(View view) {
        view.setClickable(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m17728b(viewGroup.getChildAt(i));
            }
        }
    }

    public void applyLayoutUpdate(View view, int i, int i2, int i3, int i4) {
        UiThreadUtil.assertOnUiThread();
        int id = view.getId();
        InterfaceC9785ih0 interfaceC9785ih0 = this.mLayoutHandlers.get(id);
        if (interfaceC9785ih0 != null) {
            ((C10491oC0) interfaceC9785ih0).m23361a(i, i2, i3, i4);
            return;
        }
        Animation animationM23293a = ((view.getWidth() == 0 || view.getHeight() == 0) ? this.mLayoutCreateAnimation : this.mLayoutUpdateAnimation).m23293a(view, i, i2, i3, i4);
        if (animationM23293a instanceof InterfaceC9785ih0) {
            animationM23293a.setAnimationListener(new AnimationAnimationListenerC8884bh0(this, id));
        } else {
            view.layout(i, i2, i3 + i, i4 + i2);
        }
        if (animationM23293a != null) {
            long duration = animationM23293a.getDuration();
            if (duration > this.mMaxAnimationDuration) {
                this.mMaxAnimationDuration = duration;
                if (this.mCompletionRunnable != null) {
                    Handler uiThreadHandler = UiThreadUtil.getUiThreadHandler();
                    uiThreadHandler.removeCallbacks(this.mCompletionRunnable);
                    uiThreadHandler.postDelayed(this.mCompletionRunnable, duration);
                }
            }
            view.startAnimation(animationM23293a);
        }
    }

    public void deleteView(View view, InterfaceC9273eh0 interfaceC9273eh0) {
        UiThreadUtil.assertOnUiThread();
        Animation animationM23293a = this.mLayoutDeleteAnimation.m23293a(view, view.getLeft(), view.getTop(), view.getWidth(), view.getHeight());
        if (animationM23293a == null) {
            ((C4218i3) interfaceC9273eh0).m18949n();
            return;
        }
        m17728b(view);
        animationM23293a.setAnimationListener(new AnimationAnimationListenerC9012ch0(0, interfaceC9273eh0));
        long duration = animationM23293a.getDuration();
        if (duration > this.mMaxAnimationDuration) {
            if (this.mCompletionRunnable != null) {
                Handler uiThreadHandler = UiThreadUtil.getUiThreadHandler();
                uiThreadHandler.removeCallbacks(this.mCompletionRunnable);
                uiThreadHandler.postDelayed(this.mCompletionRunnable, duration);
            }
            this.mMaxAnimationDuration = duration;
        }
        view.startAnimation(animationM23293a);
    }

    public void initializeFromConfig(ReadableMap readableMap, Callback callback) {
        if (readableMap == null) {
            reset();
            return;
        }
        this.mShouldAnimateLayout = false;
        int i = readableMap.hasKey("duration") ? readableMap.getInt("duration") : 0;
        EnumC9401fh0 enumC9401fh0 = EnumC9401fh0.f27328b;
        if (readableMap.hasKey(EnumC9401fh0.m18266a(enumC9401fh0))) {
            this.mLayoutCreateAnimation.m23294c(i, readableMap.getMap(EnumC9401fh0.m18266a(enumC9401fh0)));
            this.mShouldAnimateLayout = true;
        }
        EnumC9401fh0 enumC9401fh02 = EnumC9401fh0.f27329c;
        if (readableMap.hasKey(EnumC9401fh0.m18266a(enumC9401fh02))) {
            this.mLayoutUpdateAnimation.m23294c(i, readableMap.getMap(EnumC9401fh0.m18266a(enumC9401fh02)));
            this.mShouldAnimateLayout = true;
        }
        EnumC9401fh0 enumC9401fh03 = EnumC9401fh0.f27330d;
        if (readableMap.hasKey(EnumC9401fh0.m18266a(enumC9401fh03))) {
            this.mLayoutDeleteAnimation.m23294c(i, readableMap.getMap(EnumC9401fh0.m18266a(enumC9401fh03)));
            this.mShouldAnimateLayout = true;
        }
        if (!this.mShouldAnimateLayout || callback == null) {
            return;
        }
        this.mCompletionRunnable = new RunnableC8756ah0(0, callback);
    }

    public void reset() {
        AbstractC6525o0 abstractC6525o0 = this.mLayoutCreateAnimation;
        abstractC6525o0.f38665c = null;
        abstractC6525o0.f38666d = 0;
        abstractC6525o0.f38664b = 0;
        abstractC6525o0.f38663a = null;
        AbstractC6525o0 abstractC6525o02 = this.mLayoutUpdateAnimation;
        abstractC6525o02.f38665c = null;
        abstractC6525o02.f38666d = 0;
        abstractC6525o02.f38664b = 0;
        abstractC6525o02.f38663a = null;
        AbstractC6525o0 abstractC6525o03 = this.mLayoutDeleteAnimation;
        abstractC6525o03.f38665c = null;
        abstractC6525o03.f38666d = 0;
        abstractC6525o03.f38664b = 0;
        abstractC6525o03.f38663a = null;
        this.mCompletionRunnable = null;
        this.mShouldAnimateLayout = false;
        this.mMaxAnimationDuration = -1L;
    }

    public boolean shouldAnimateLayout(View view) {
        if (view == null) {
            return false;
        }
        return (this.mShouldAnimateLayout && view.getParent() != null) || this.mLayoutHandlers.get(view.getId()) != null;
    }
}
