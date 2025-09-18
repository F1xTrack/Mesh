package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* renamed from: Vx */
/* loaded from: classes.dex */
public final class C1381Vx {

    /* renamed from: e */
    public static final SparseIntArray f12876e;

    /* renamed from: a */
    public int f12877a;

    /* renamed from: b */
    public int f12878b;

    /* renamed from: c */
    public float f12879c;

    /* renamed from: d */
    public float f12880d;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f12876e = sparseIntArray;
        sparseIntArray.append(2, 1);
        sparseIntArray.append(4, 2);
        sparseIntArray.append(5, 3);
        sparseIntArray.append(1, 4);
        sparseIntArray.append(0, 5);
        sparseIntArray.append(3, 6);
    }

    /* renamed from: a */
    public final void m8642a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, TG0.f11276e);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f12876e.get(index)) {
                case 1:
                    this.f12880d = typedArrayObtainStyledAttributes.getFloat(index, this.f12880d);
                    break;
                case 2:
                    this.f12878b = typedArrayObtainStyledAttributes.getInt(index, this.f12878b);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = AbstractC9900ja1.f35251a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f12877a = C1570Yx.m9432f(typedArrayObtainStyledAttributes, index, this.f12877a);
                    break;
                case 6:
                    this.f12879c = typedArrayObtainStyledAttributes.getFloat(index, this.f12879c);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
