package defpackage;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class M6 {
    public final TextView a;
    public final C3513e41 b;

    public M6(TextView textView) {
        this.a = textView;
        this.b = new C3513e41(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((AbstractC7711w02) this.b.b).a(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, AbstractC2104aH0.i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z) {
        ((AbstractC7711w02) this.b.b).c(z);
    }

    public final void d(boolean z) {
        ((AbstractC7711w02) this.b.b).d(z);
    }
}
