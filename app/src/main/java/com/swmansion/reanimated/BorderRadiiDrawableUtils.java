package com.swmansion.reanimated;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.swmansion.reanimated.ReactNativeUtils;
import p000.C11323ui0;
import p000.C1179Sk;
import p000.C6520nw;

/* loaded from: classes2.dex */
public class BorderRadiiDrawableUtils {
    public static ReactNativeUtils.BorderRadii getBorderRadii(View view) {
        Drawable background = view.getBackground();
        if (!(background instanceof C1179Sk)) {
            return new ReactNativeUtils.BorderRadii(0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        }
        C1179Sk c1179Sk = (C1179Sk) background;
        C11323ui0 c11323ui0 = c1179Sk.f10953w.f6805a;
        float fM25224a = c11323ui0 != null ? c11323ui0.m25224a(view.getWidth(), view.getHeight()) : Float.NaN;
        C6520nw c6520nw = c1179Sk.f10954x;
        return new ReactNativeUtils.BorderRadii(fM25224a, c6520nw.f38613a, c6520nw.f38614b, c6520nw.f38615c, c6520nw.f38616d);
    }
}
