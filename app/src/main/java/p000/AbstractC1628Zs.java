package p000;

import android.content.Context;
import android.view.View;

/* renamed from: Zs */
/* loaded from: classes.dex */
public abstract class AbstractC1628Zs extends C0002A1 {

    /* renamed from: d */
    public final C0695L1 f15161d;

    public AbstractC1628Zs(Context context, int i) {
        this.f15161d = new C0695L1(16, context.getString(i));
    }

    @Override // p000.C0002A1
    /* renamed from: d */
    public void mo11d(C1009Q1 c1009q1, View view) {
        this.f11a.onInitializeAccessibilityNodeInfo(view, c1009q1.f9401a);
        c1009q1.m6531b(this.f15161d);
    }
}
