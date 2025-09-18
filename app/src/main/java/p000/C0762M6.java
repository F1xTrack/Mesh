package p000;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: M6 */
/* loaded from: classes.dex */
public final class C0762M6 {

    /* renamed from: a */
    public final TextView f6990a;

    /* renamed from: b */
    public final C9196e41 f6991b;

    public C0762M6(TextView textView) {
        this.f6990a = textView;
        this.f6991b = new C9196e41(textView);
    }

    /* renamed from: a */
    public final InputFilter[] m5261a(InputFilter[] inputFilterArr) {
        return ((AbstractC11489w02) this.f6991b.f26532b).mo166a(inputFilterArr);
    }

    /* renamed from: b */
    public final void m5262b(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f6990a.getContext().obtainStyledAttributes(attributeSet, AbstractC8704aH0.f15431i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m5264d(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: c */
    public final void m5263c(boolean z) {
        ((AbstractC11489w02) this.f6991b.f26532b).mo168c(z);
    }

    /* renamed from: d */
    public final void m5264d(boolean z) {
        ((AbstractC11489w02) this.f6991b.f26532b).mo169d(z);
    }
}
