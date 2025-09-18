package defpackage;

import android.widget.LinearLayout;

/* renamed from: gN0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3951gN0 extends LinearLayout {
    public final C6969s7 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3951gN0(S91 s91) {
        super(s91);
        O90.f(s91, "context");
        C6969s7 c6969s7 = new C6969s7(s91, null);
        this.a = c6969s7;
        c6969s7.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        c6969s7.setGravity(17);
        c6969s7.setTextColor(-1);
        setBackgroundColor(1442775040);
        setGravity(1);
        setOrientation(1);
        addView(c6969s7);
    }

    public final void setName(String str) {
        O90.f(str, "name");
        this.a.setText("'" + str + "' is not Fabric compatible yet.");
    }
}
