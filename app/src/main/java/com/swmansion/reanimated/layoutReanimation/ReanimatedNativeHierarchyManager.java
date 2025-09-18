package com.swmansion.reanimated.layoutReanimation;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.swmansion.rnscreens.ScreenStackViewManager;
import com.swmansion.rnscreens.ScreenViewManager;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p000.C8581Yj1;
import p000.C8810b60;
import p000.ComponentCallbacks2C7803Jk1;
import p000.RunnableC6757rf;

/* loaded from: classes2.dex */
public class ReanimatedNativeHierarchyManager extends ReanimatedNativeHierarchyManagerBase {
    private final HashMap<Integer, Runnable> cleanerCallback;
    private boolean initOk;
    private final HashMap<Integer, Set<Integer>> mPendingDeletionsForTag;
    private final ReaLayoutAnimator mReaLayoutAnimator;
    private final TabNavigatorObserver mTabNavigatorObserver;
    private final HashMap<Integer, ArrayList<View>> toBeRemoved;

    public ReanimatedNativeHierarchyManager(ComponentCallbacks2C7803Jk1 componentCallbacks2C7803Jk1, ReactApplicationContext reactApplicationContext) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super(componentCallbacks2C7803Jk1);
        this.toBeRemoved = new HashMap<>();
        this.cleanerCallback = new HashMap<>();
        this.mPendingDeletionsForTag = new HashMap<>();
        this.initOk = true;
        ReaLayoutAnimator reaLayoutAnimator = new ReaLayoutAnimator(reactApplicationContext, this);
        this.mReaLayoutAnimator = reaLayoutAnimator;
        this.mTabNavigatorObserver = new TabNavigatorObserver(reaLayoutAnimator);
        Class<? super Object> superclass = getClass().getSuperclass().getSuperclass();
        if (superclass == null) {
            return;
        }
        try {
            Field declaredField = superclass.getDeclaredField("mLayoutAnimator");
            declaredField.setAccessible(true);
            try {
                Field declaredField2 = Field.class.getDeclaredField("accessFlags");
                declaredField2.setAccessible(true);
                declaredField2.setInt(declaredField, declaredField.getModifiers() & (-17));
            } catch (IllegalAccessException | NoSuchFieldException e) {
                e.printStackTrace();
            }
            declaredField.set(this, this.mReaLayoutAnimator);
        } catch (IllegalAccessException | NoSuchFieldException e2) {
            this.initOk = false;
            e2.printStackTrace();
        }
        try {
            Field declaredField3 = superclass.getDeclaredField("mPendingDeletionsForTag");
            declaredField3.setAccessible(true);
            try {
                Field declaredField4 = Field.class.getDeclaredField("accessFlags");
                declaredField4.setAccessible(true);
                declaredField4.setInt(declaredField3, declaredField3.getModifiers() & (-17));
            } catch (IllegalAccessException | NoSuchFieldException e3) {
                e3.printStackTrace();
            }
            declaredField3.set(this, this.mPendingDeletionsForTag);
        } catch (IllegalAccessException | NoSuchFieldException e4) {
            this.initOk = false;
            e4.printStackTrace();
        }
        if (this.initOk) {
            setLayoutAnimationEnabled(true);
        }
    }

    private boolean checkIfTopScreenHasHeader(ViewGroup viewGroup) throws NoSuchFieldException, SecurityException {
        try {
            ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0).getClass().getDeclaredField("mIsHidden").setAccessible(true);
            return !r1.getBoolean(r4);
        } catch (IllegalAccessException | NoSuchFieldException | NullPointerException unused) {
            return false;
        }
    }

    private boolean isLayoutAnimationDisabled() {
        return (this.initOk && this.mReaLayoutAnimator.isLayoutAnimationEnabled()) ? false : true;
    }

    public static /* synthetic */ void lambda$manageChildren$0(ArrayList arrayList, View view, ViewGroupManager viewGroupManager, ViewGroup viewGroup) {
        arrayList.remove(view);
        viewGroupManager.removeView(viewGroup, view);
    }

    @Override // p000.C11856yu0
    public synchronized void dropView(View view) {
        if (isLayoutAnimationDisabled()) {
            super.dropView(view);
            return;
        }
        if (this.toBeRemoved.containsKey(Integer.valueOf(view.getId()))) {
            this.toBeRemoved.remove(Integer.valueOf(view.getId()));
        }
        if (this.cleanerCallback.containsKey(Integer.valueOf(view.getId()))) {
            Runnable runnable = this.cleanerCallback.get(Integer.valueOf(view.getId()));
            this.cleanerCallback.remove(Integer.valueOf(view.getId()));
            runnable.run();
        }
        super.dropView(view);
    }

    @Override // p000.C11856yu0
    public synchronized void manageChildren(int i, int[] iArr, C8581Yj1[] c8581Yj1Arr, int[] iArr2) {
        Set<Integer> set;
        int i2;
        ArrayList<View> arrayList;
        if (isLayoutAnimationDisabled()) {
            super.manageChildren(i, iArr, c8581Yj1Arr, iArr2);
            return;
        }
        try {
            ViewGroup viewGroup = (ViewGroup) resolveView(i);
            ViewGroupManager viewGroupManager = (ViewGroupManager) resolveViewManager(i);
            AnimationsManager animationsManager = this.mReaLayoutAnimator.getAnimationsManager();
            if (viewGroupManager.getName().equals(ScreenStackViewManager.REACT_CLASS)) {
                if (iArr2 == null) {
                    animationsManager.makeSnapshotOfTopScreenViews(viewGroup);
                } else {
                    animationsManager.notifyAboutViewsRemoval(iArr2);
                }
                if (iArr != null && (this.mReaLayoutAnimator instanceof ReaLayoutAnimator)) {
                    for (int i3 : iArr) {
                        this.mReaLayoutAnimator.getAnimationsManager().cancelAnimationsInSubviews(viewGroupManager.getChildAt((ViewGroupManager) viewGroup, i3));
                    }
                }
                super.manageChildren(i, iArr, c8581Yj1Arr, iArr2);
                return;
            }
            if (this.toBeRemoved.containsKey(Integer.valueOf(i))) {
                ArrayList<View> arrayList2 = this.toBeRemoved.get(Integer.valueOf(i));
                HashSet hashSet = new HashSet();
                Iterator<View> it = arrayList2.iterator();
                while (it.hasNext()) {
                    hashSet.add(Integer.valueOf(it.next().getId()));
                }
                while (viewGroupManager.getChildCount((ViewGroupManager) viewGroup) != 0 && hashSet.contains(Integer.valueOf(viewGroupManager.getChildAt((ViewGroupManager) viewGroup, viewGroupManager.getChildCount((ViewGroupManager) viewGroup) - 1).getId()))) {
                    viewGroupManager.removeViewAt((ViewGroupManager) viewGroup, viewGroupManager.getChildCount((ViewGroupManager) viewGroup) - 1);
                }
            }
            if (iArr2 != null) {
                if (!this.toBeRemoved.containsKey(Integer.valueOf(i))) {
                    this.toBeRemoved.put(Integer.valueOf(i), new ArrayList<>());
                }
                ArrayList<View> arrayList3 = this.toBeRemoved.get(Integer.valueOf(i));
                int length = iArr2.length;
                int i4 = 0;
                while (i4 < length) {
                    try {
                        View viewResolveView = resolveView(iArr2[i4]);
                        arrayList3.add(viewResolveView);
                        arrayList = arrayList3;
                        i2 = i4;
                        this.cleanerCallback.put(Integer.valueOf(viewResolveView.getId()), new RunnableC6757rf(arrayList3, viewResolveView, viewGroupManager, viewGroup, 15));
                    } catch (C8810b60 e) {
                        i2 = i4;
                        arrayList = arrayList3;
                        e.printStackTrace();
                    }
                    i4 = i2 + 1;
                    arrayList3 = arrayList;
                }
            }
            HashMap<Integer, Set<Integer>> map = this.mPendingDeletionsForTag;
            if (map != null && (set = map.get(Integer.valueOf(i))) != null) {
                set.clear();
            }
            animationsManager.notifyAboutViewsRemoval(iArr2);
            super.manageChildren(i, iArr, c8581Yj1Arr, null);
            if (this.toBeRemoved.containsKey(Integer.valueOf(i))) {
                Iterator<View> it2 = this.toBeRemoved.get(Integer.valueOf(i)).iterator();
                while (it2.hasNext()) {
                    viewGroupManager.addView((ViewGroupManager) viewGroup, it2.next(), viewGroupManager.getChildCount((ViewGroupManager) viewGroup));
                }
            }
            super.manageChildren(i, null, null, iArr2);
        } catch (C8810b60 e2) {
            e2.printStackTrace();
            super.manageChildren(i, iArr, c8581Yj1Arr, iArr2);
        }
    }

    public void publicDropView(View view) {
        dropView(view);
    }

    @Override // com.swmansion.reanimated.layoutReanimation.ReanimatedNativeHierarchyManagerBase
    public synchronized void updateLayoutCommon(int i, int i2, int i3, int i4, int i5, int i6) {
        ReaLayoutAnimator reaLayoutAnimator;
        try {
            if (isLayoutAnimationDisabled()) {
                return;
            }
            try {
                String name = resolveViewManager(i2).getName();
                View viewResolveView = resolveView(i);
                if (viewResolveView != null && name.equals(ScreenViewManager.REACT_CLASS) && this.mReaLayoutAnimator != null) {
                    if (!checkIfTopScreenHasHeader((ViewGroup) viewResolveView) || !viewResolveView.isLayoutRequested()) {
                        this.mReaLayoutAnimator.getAnimationsManager().screenDidLayout(viewResolveView);
                    }
                    View viewResolveView2 = resolveView(i2);
                    View view = (View) viewResolveView2.getParent();
                    if (view != null && ScreensHelper.isScreenContainer((View) view.getParent())) {
                        this.mTabNavigatorObserver.handleScreenContainerUpdate(viewResolveView2);
                    }
                }
                View viewResolveView3 = resolveView(i2);
                if (viewResolveView3 != null && (reaLayoutAnimator = this.mReaLayoutAnimator) != null) {
                    reaLayoutAnimator.getAnimationsManager().viewDidLayout(viewResolveView3);
                }
            } catch (C8810b60 e) {
                e.printStackTrace();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
