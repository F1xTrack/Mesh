package p000;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: y1 */
/* loaded from: classes.dex */
public final class C7175y1 extends ClickableSpan {

    /* renamed from: a */
    public final int f46024a;

    /* renamed from: b */
    public final C1009Q1 f46025b;

    /* renamed from: c */
    public final int f46026c;

    public C7175y1(int i, C1009Q1 c1009q1, int i2) {
        this.f46024a = i;
        this.f46025b = c1009q1;
        this.f46026c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f46024a);
        this.f46025b.f9401a.performAction(this.f46026c, bundle);
    }
}
