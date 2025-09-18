package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: Zs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2023Zs extends A1 {
    public final L1 d;

    public AbstractC2023Zs(Context context, int i) {
        this.d = new L1(16, context.getString(i));
    }

    @Override // defpackage.A1
    public void d(Q1 q1, View view) {
        this.a.onInitializeAccessibilityNodeInfo(view, q1.a);
        q1.b(this.d);
    }
}
