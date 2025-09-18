package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: y1 */
/* loaded from: classes.dex */
public final class C8092y1 extends ClickableSpan {
    public final int a;
    public final Q1 b;
    public final int c;

    public C8092y1(int i, Q1 q1, int i2) {
        this.a = i;
        this.b = q1;
        this.c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.a.performAction(this.c, bundle);
    }
}
