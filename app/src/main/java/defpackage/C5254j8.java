package defpackage;

import android.animation.TypeEvaluator;
import kotlin.KotlinVersion;

/* renamed from: j8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5254j8 implements TypeEvaluator {
    public static final C5254j8 a = new C5254j8();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        float f2 = ((iIntValue >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f3 = ((iIntValue >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f4 = ((iIntValue >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        int iIntValue2 = ((Integer) obj2).intValue();
        float f5 = ((iIntValue2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f6 = ((iIntValue2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f7 = ((iIntValue2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float fPow = (float) Math.pow(f3, 2.2d);
        float fPow2 = (float) Math.pow(f4, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(f6, 2.2d);
        float fPow5 = (float) Math.pow(f7, 2.2d);
        float fPow6 = (float) Math.pow((iIntValue2 & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f, 2.2d);
        float fD = AbstractC1705Vq.d(f5, f2, f, f2);
        float fD2 = AbstractC1705Vq.d(fPow4, fPow, f, fPow);
        float fD3 = AbstractC1705Vq.d(fPow5, fPow2, f, fPow2);
        float fD4 = AbstractC1705Vq.d(fPow6, fPow3, f, fPow3);
        float fPow7 = ((float) Math.pow(fD2, 0.45454545454545453d)) * 255.0f;
        float fPow8 = ((float) Math.pow(fD3, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(fD4, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fD * 255.0f) << 24) | (Math.round(fPow8) << 8));
    }
}
