package com.swmansion.reanimated.layoutReanimation;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.swmansion.reanimated.ReanimatedModule;
import com.swmansion.rnscreens.ScreenStackViewManager;
import com.swmansion.rnscreens.ScreenViewManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import p000.AbstractC6550oP;
import p000.C11856yu0;
import p000.C8810b60;
import p000.C9145dh0;
import p000.InterfaceC6947uP;
import p000.InterfaceC7136xP;
import p000.InterfaceC9273eh0;
import p000.OZ1;
import p000.RunnableC8352Tz0;

/* loaded from: classes2.dex */
class ReaLayoutAnimator extends C9145dh0 {
    private final ReactApplicationContext mContext;
    private final WeakReference<C11856yu0> mWeakNativeViewHierarchyManager;
    private AnimationsManager mAnimationsManager = null;
    private volatile boolean mInitialized = false;
    private final ArrayList<View> viewsToSnapshot = new ArrayList<>();

    public ReaLayoutAnimator(ReactApplicationContext reactApplicationContext, C11856yu0 c11856yu0) {
        this.mContext = reactApplicationContext;
        this.mWeakNativeViewHierarchyManager = new WeakReference<>(c11856yu0);
    }

    public /* synthetic */ void lambda$deleteView$0(AbstractC6550oP abstractC6550oP) {
        if (abstractC6550oP.getEventName().equals("topWillDisappear")) {
            getAnimationsManager().notifyAboutScreenWillDisappear();
        }
    }

    @Override // p000.C9145dh0
    public void applyLayoutUpdate(View view, int i, int i2, int i3, int i4) {
        if (!isLayoutAnimationEnabled()) {
            super.applyLayoutUpdate(view, i, i2, i3, i4);
            return;
        }
        UiThreadUtil.assertOnUiThread();
        maybeInit();
        if (view.getWidth() != 0 && view.getHeight() != 0) {
            Snapshot snapshot = new Snapshot(view, this.mWeakNativeViewHierarchyManager.get());
            view.layout(i, i2, i3 + i, i4 + i2);
            this.mAnimationsManager.onViewUpdate(view, snapshot, new Snapshot(view, this.mWeakNativeViewHierarchyManager.get()));
            return;
        }
        if (!this.mAnimationsManager.hasAnimationForTag(view.getId(), 1)) {
            super.applyLayoutUpdate(view, i, i2, i3, i4);
            this.mAnimationsManager.maybeRegisterSharedView(view);
        } else {
            view.layout(i, i2, i3 + i, i4 + i2);
            if (view.getId() != -1) {
                this.viewsToSnapshot.add(view);
            }
        }
    }

    @Override // p000.C9145dh0
    public void deleteView(View view, InterfaceC9273eh0 interfaceC9273eh0) {
        if (!isLayoutAnimationEnabled()) {
            super.deleteView(view, interfaceC9273eh0);
            return;
        }
        UiThreadUtil.assertOnUiThread();
        C11856yu0 c11856yu0 = this.mWeakNativeViewHierarchyManager.get();
        try {
            if (c11856yu0.resolveViewManager(view.getId()).getName().equals(ScreenViewManager.REACT_CLASS) && view.getParent() != null && (view.getParent().getParent() instanceof View)) {
                try {
                    if (c11856yu0.resolveViewManager(((View) view.getParent().getParent()).getId()).getName().equals(ScreenStackViewManager.REACT_CLASS)) {
                        this.mAnimationsManager.cancelAnimationsInSubviews(view);
                        super.deleteView(view, interfaceC9273eh0);
                        InterfaceC6947uP interfaceC6947uPM6091b = OZ1.m6091b((ReactContext) view.getContext(), view.getId());
                        if (interfaceC6947uPM6091b != null) {
                            interfaceC6947uPM6091b.mo11049j(new InterfaceC7136xP() { // from class: com.swmansion.reanimated.layoutReanimation.a
                                @Override // p000.InterfaceC7136xP
                                public final void onEventDispatch(AbstractC6550oP abstractC6550oP) {
                                    this.f20250a.lambda$deleteView$0(abstractC6550oP);
                                }
                            });
                            return;
                        }
                        return;
                    }
                } catch (C8810b60 e) {
                    e.printStackTrace();
                    this.mAnimationsManager.cancelAnimationsInSubviews(view);
                    super.deleteView(view, interfaceC9273eh0);
                    return;
                }
            }
            maybeInit();
            AnimationsManager animationsManager = this.mAnimationsManager;
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            Objects.requireNonNull(interfaceC9273eh0);
            animationsManager.onViewRemoval(view, viewGroup, new RunnableC8352Tz0(9, interfaceC9273eh0));
        } catch (C8810b60 e2) {
            e2.printStackTrace();
            this.mAnimationsManager.cancelAnimationsInSubviews(view);
            super.deleteView(view, interfaceC9273eh0);
        }
    }

    public AnimationsManager getAnimationsManager() {
        return this.mAnimationsManager;
    }

    public boolean isLayoutAnimationEnabled() {
        if (!this.mContext.hasActiveReactInstance()) {
            return false;
        }
        maybeInit();
        return this.mAnimationsManager.isLayoutAnimationEnabled();
    }

    public void maybeInit() {
        if (this.mInitialized) {
            return;
        }
        this.mInitialized = true;
        AnimationsManager animationsManager = ((ReanimatedModule) this.mContext.getNativeModule(ReanimatedModule.class)).getNodesManager().getAnimationsManager();
        this.mAnimationsManager = animationsManager;
        animationsManager.setReanimatedNativeHierarchyManager((ReanimatedNativeHierarchyManager) this.mWeakNativeViewHierarchyManager.get());
    }

    @Override // p000.C9145dh0
    public void reset() {
        super.reset();
        Iterator<View> it = this.viewsToSnapshot.iterator();
        while (it.hasNext()) {
            View next = it.next();
            this.mAnimationsManager.onViewCreate(next, (ViewGroup) next.getParent(), new Snapshot(next, this.mWeakNativeViewHierarchyManager.get()));
        }
        this.viewsToSnapshot.clear();
    }

    @Override // p000.C9145dh0
    public boolean shouldAnimateLayout(View view) {
        return !isLayoutAnimationEnabled() ? super.shouldAnimateLayout(view) : (view == null || view.getParent() == null) ? false : true;
    }
}
