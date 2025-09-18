package com.facebook.react.views.view;

import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.views.view.C1932a;
import p000.InterfaceC9871jM0;

/* loaded from: classes.dex */
public abstract class ReactClippingViewManager<T extends C1932a> extends ViewGroupManager<T> {
    @InterfaceC9871jM0(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(T t, boolean z) {
        UiThreadUtil.assertOnUiThread();
        t.setRemoveClippedSubviews(z);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, p000.I50
    public void removeAllViews(T t) {
        UiThreadUtil.assertOnUiThread();
        if (t.getRemoveClippedSubviews()) {
            t.removeAllViewsWithSubviewClippingEnabled();
        } else {
            t.removeAllViews();
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(T t, View view, int i) {
        UiThreadUtil.assertOnUiThread();
        if (t.getRemoveClippedSubviews()) {
            t.addViewWithSubviewClippingEnabled(view, i);
        } else {
            t.addView(view, i);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(T t, int i) {
        if (t.getRemoveClippedSubviews()) {
            return t.getChildAtWithSubviewClippingEnabled(i);
        }
        return t.getChildAt(i);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(T t) {
        if (t.getRemoveClippedSubviews()) {
            return t.getAllChildrenCount();
        }
        return t.getChildCount();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(T t, int i) {
        UiThreadUtil.assertOnUiThread();
        if (t.getRemoveClippedSubviews()) {
            View childAt = getChildAt((ReactClippingViewManager<T>) t, i);
            if (childAt != null) {
                if (childAt.getParent() != null) {
                    t.removeView(childAt);
                }
                t.removeViewWithSubviewClippingEnabled(childAt);
                return;
            }
            return;
        }
        t.removeViewAt(i);
    }
}
