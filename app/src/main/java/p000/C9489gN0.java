package p000;

import android.widget.LinearLayout;

/* renamed from: gN0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9489gN0 extends LinearLayout {

    /* renamed from: a */
    public final C6803s7 f27707a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9489gN0(S91 s91) {
        super(s91);
        O90.m5968f(s91, "context");
        C6803s7 c6803s7 = new C6803s7(s91, null);
        this.f27707a = c6803s7;
        c6803s7.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        c6803s7.setGravity(17);
        c6803s7.setTextColor(-1);
        setBackgroundColor(1442775040);
        setGravity(1);
        setOrientation(1);
        addView(c6803s7);
    }

    public final void setName(String str) {
        O90.m5968f(str, "name");
        this.f27707a.setText("'" + str + "' is not Fabric compatible yet.");
    }
}
