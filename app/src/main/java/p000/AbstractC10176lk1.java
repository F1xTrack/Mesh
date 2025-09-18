package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;

/* renamed from: lk1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10176lk1 {
    /* renamed from: a */
    public static View.AccessibilityDelegate m22533a(View view) {
        return view.getAccessibilityDelegate();
    }

    /* renamed from: b */
    public static ContentCaptureSession m22534b(View view) {
        return view.getContentCaptureSession();
    }

    /* renamed from: c */
    public static List<Rect> m22535c(View view) {
        return view.getSystemGestureExclusionRects();
    }

    /* renamed from: d */
    public static void m22536d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
    }

    /* renamed from: e */
    public static void m22537e(View view, AbstractC6856sy abstractC6856sy) {
        view.setContentCaptureSession(null);
    }

    /* renamed from: f */
    public static void m22538f(View view, List<Rect> list) {
        view.setSystemGestureExclusionRects(list);
    }
}
