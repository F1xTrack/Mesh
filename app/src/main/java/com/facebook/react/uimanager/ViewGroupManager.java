package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.List;
import java.util.WeakHashMap;
import p000.AbstractC0852NX;
import p000.C10169lh0;
import p000.I50;

/* loaded from: classes.dex */
public abstract class ViewGroupManager<T extends ViewGroup> extends BaseViewManager<T, C10169lh0> implements I50 {
    private static WeakHashMap<View, Integer> mZIndexHash = new WeakHashMap<>();

    public ViewGroupManager() {
        super(null);
    }

    public static Integer getViewZIndex(View view) {
        return mZIndexHash.get(view);
    }

    public static void setViewZIndex(View view, int i) {
        mZIndexHash.put(view, Integer.valueOf(i));
    }

    public void addViews(T t, List<View> list) {
        UiThreadUtil.assertOnUiThread();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            addView((ViewGroupManager<T>) t, list.get(i), i);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends C10169lh0> getShadowNodeClass() {
        return C10169lh0.class;
    }

    @Override // p000.J50
    public boolean needsCustomLayoutForChildren() {
        return false;
    }

    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        AbstractC0852NX.m5754c(this, view);
    }

    public void removeView(T t, View view) {
        UiThreadUtil.assertOnUiThread();
        for (int i = 0; i < getChildCount((ViewGroupManager<T>) t); i++) {
            if (getChildAt((ViewGroupManager<T>) t, i) == view) {
                removeViewAt((ViewGroupManager<T>) t, i);
                return;
            }
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(T t, Object obj) {
    }

    public ViewGroupManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // p000.I50
    public void addView(T t, View view, int i) {
        t.addView(view, i);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C10169lh0 createShadowNodeInstance() {
        return new C10169lh0();
    }

    @Override // p000.I50
    public View getChildAt(T t, int i) {
        return t.getChildAt(i);
    }

    @Override // p000.I50
    public int getChildCount(T t) {
        return t.getChildCount();
    }

    @Override // p000.I50
    public void removeViewAt(T t, int i) {
        UiThreadUtil.assertOnUiThread();
        t.removeViewAt(i);
    }
}
