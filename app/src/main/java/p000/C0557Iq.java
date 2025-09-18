package p000;

import android.text.Layout;
import android.text.SpannableStringBuilder;

/* renamed from: Iq */
/* loaded from: classes.dex */
public final class C0557Iq {

    /* renamed from: c */
    public static final C0295Eg f5166c = new C0295Eg(2);

    /* renamed from: a */
    public final C6933uB f5167a;

    /* renamed from: b */
    public final int f5168b;

    public C0557Iq(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
        boolean z2;
        int i5;
        if (z) {
            i5 = i3;
            z2 = true;
        } else {
            z2 = false;
            i5 = -16777216;
        }
        this.f5167a = new C6933uB(spannableStringBuilder, alignment, null, null, f, 0, i, f2, i2, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z2, i5, Integer.MIN_VALUE, 0.0f);
        this.f5168b = i4;
    }
}
