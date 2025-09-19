package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import p000.C0002A1;
import p000.C0695L1;
import p000.C1009Q1;
import ru.mes.dnevnik.R;

/* renamed from: com.google.android.material.timepicker.c */
/* loaded from: classes.dex */
public final class C1947c extends C0002A1 {

    /* renamed from: d */
    public final /* synthetic */ ClockFaceView f18393d;

    public C1947c(ClockFaceView clockFaceView) {
        this.f18393d = clockFaceView;
    }

    @Override // p000.C0002A1
    /* renamed from: d */
    public final void mo11d(C1009Q1 c1009q1, View view) {
        View.AccessibilityDelegate accessibilityDelegate = this.f11a;
        AccessibilityNodeInfo accessibilityNodeInfo = c1009q1.f9401a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (iIntValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f18393d.f18356w.get(iIntValue - 1));
        }
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, iIntValue, 1, false, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        c1009q1.m6531b(C0695L1.f6454g);
    }

    @Override // p000.C0002A1
    /* renamed from: g */
    public final boolean mo14g(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.mo14g(view, i, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f18393d;
        view.getHitRect(clockFaceView.f18353t);
        float fCenterX = clockFaceView.f18353t.centerX();
        float fCenterY = clockFaceView.f18353t.centerY();
        clockFaceView.f18352s.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockFaceView.f18352s.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }
}
