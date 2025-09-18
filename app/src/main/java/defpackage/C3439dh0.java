package defpackage;

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
public class C3439dh0 {
    private Runnable mCompletionRunnable;
    private boolean mShouldAnimateLayout;
    private final AbstractC6181o0 mLayoutCreateAnimation = new C4011gh0();
    private final AbstractC6181o0 mLayoutUpdateAnimation = new C6124nh0();
    private final AbstractC6181o0 mLayoutDeleteAnimation = new C4202hh0();
    private final SparseArray<InterfaceC4392ih0> mLayoutHandlers = new SparseArray<>(0);
    private long mMaxAnimationDuration = -1;

    public static void b(View view) {
        view.setClickable(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                b(viewGroup.getChildAt(i));
            }
        }
    }

    public void applyLayoutUpdate(View view, int i, int i2, int i3, int i4) {
        UiThreadUtil.assertOnUiThread();
        int id = view.getId();
        InterfaceC4392ih0 interfaceC4392ih0 = this.mLayoutHandlers.get(id);
        if (interfaceC4392ih0 != null) {
            ((C6222oC0) interfaceC4392ih0).a(i, i2, i3, i4);
            return;
        }
        Animation animationA = ((view.getWidth() == 0 || view.getHeight() == 0) ? this.mLayoutCreateAnimation : this.mLayoutUpdateAnimation).a(view, i, i2, i3, i4);
        if (animationA instanceof InterfaceC4392ih0) {
            animationA.setAnimationListener(new AnimationAnimationListenerC2373bh0(this, id));
        } else {
            view.layout(i, i2, i3 + i, i4 + i2);
        }
        if (animationA != null) {
            long duration = animationA.getDuration();
            if (duration > this.mMaxAnimationDuration) {
                this.mMaxAnimationDuration = duration;
                if (this.mCompletionRunnable != null) {
                    Handler uiThreadHandler = UiThreadUtil.getUiThreadHandler();
                    uiThreadHandler.removeCallbacks(this.mCompletionRunnable);
                    uiThreadHandler.postDelayed(this.mCompletionRunnable, duration);
                }
            }
            view.startAnimation(animationA);
        }
    }

    public void deleteView(View view, InterfaceC3629eh0 interfaceC3629eh0) {
        UiThreadUtil.assertOnUiThread();
        Animation animationA = this.mLayoutDeleteAnimation.a(view, view.getLeft(), view.getTop(), view.getWidth(), view.getHeight());
        if (animationA == null) {
            ((C4271i3) interfaceC3629eh0).n();
            return;
        }
        b(view);
        animationA.setAnimationListener(new AnimationAnimationListenerC2563ch0(0, interfaceC3629eh0));
        long duration = animationA.getDuration();
        if (duration > this.mMaxAnimationDuration) {
            if (this.mCompletionRunnable != null) {
                Handler uiThreadHandler = UiThreadUtil.getUiThreadHandler();
                uiThreadHandler.removeCallbacks(this.mCompletionRunnable);
                uiThreadHandler.postDelayed(this.mCompletionRunnable, duration);
            }
            this.mMaxAnimationDuration = duration;
        }
        view.startAnimation(animationA);
    }

    public void initializeFromConfig(ReadableMap readableMap, Callback callback) {
        if (readableMap == null) {
            reset();
            return;
        }
        this.mShouldAnimateLayout = false;
        int i = readableMap.hasKey("duration") ? readableMap.getInt("duration") : 0;
        EnumC3820fh0 enumC3820fh0 = EnumC3820fh0.b;
        if (readableMap.hasKey(EnumC3820fh0.a(enumC3820fh0))) {
            this.mLayoutCreateAnimation.c(i, readableMap.getMap(EnumC3820fh0.a(enumC3820fh0)));
            this.mShouldAnimateLayout = true;
        }
        EnumC3820fh0 enumC3820fh02 = EnumC3820fh0.c;
        if (readableMap.hasKey(EnumC3820fh0.a(enumC3820fh02))) {
            this.mLayoutUpdateAnimation.c(i, readableMap.getMap(EnumC3820fh0.a(enumC3820fh02)));
            this.mShouldAnimateLayout = true;
        }
        EnumC3820fh0 enumC3820fh03 = EnumC3820fh0.d;
        if (readableMap.hasKey(EnumC3820fh0.a(enumC3820fh03))) {
            this.mLayoutDeleteAnimation.c(i, readableMap.getMap(EnumC3820fh0.a(enumC3820fh03)));
            this.mShouldAnimateLayout = true;
        }
        if (!this.mShouldAnimateLayout || callback == null) {
            return;
        }
        this.mCompletionRunnable = new RunnableC2182ah0(0, callback);
    }

    public void reset() {
        AbstractC6181o0 abstractC6181o0 = this.mLayoutCreateAnimation;
        abstractC6181o0.c = null;
        abstractC6181o0.d = 0;
        abstractC6181o0.b = 0;
        abstractC6181o0.a = null;
        AbstractC6181o0 abstractC6181o02 = this.mLayoutUpdateAnimation;
        abstractC6181o02.c = null;
        abstractC6181o02.d = 0;
        abstractC6181o02.b = 0;
        abstractC6181o02.a = null;
        AbstractC6181o0 abstractC6181o03 = this.mLayoutDeleteAnimation;
        abstractC6181o03.c = null;
        abstractC6181o03.d = 0;
        abstractC6181o03.b = 0;
        abstractC6181o03.a = null;
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
