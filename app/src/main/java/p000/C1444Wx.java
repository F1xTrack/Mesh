package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: Wx */
/* loaded from: classes.dex */
public final class C1444Wx {

    /* renamed from: a */
    public int f13461a;

    /* renamed from: b */
    public int f13462b;

    /* renamed from: c */
    public float f13463c;

    /* renamed from: d */
    public float f13464d;

    /* renamed from: a */
    public final void m8903a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, TG0.f11277f);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f13463c = typedArrayObtainStyledAttributes.getFloat(index, this.f13463c);
            } else if (index == 0) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f13461a);
                this.f13461a = i2;
                this.f13461a = C1570Yx.f14621d[i2];
            } else if (index == 4) {
                this.f13462b = typedArrayObtainStyledAttributes.getInt(index, this.f13462b);
            } else if (index == 3) {
                this.f13464d = typedArrayObtainStyledAttributes.getFloat(index, this.f13464d);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
