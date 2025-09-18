package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* renamed from: Vx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1726Vx {
    public static final SparseIntArray e;
    public int a;
    public int b;
    public float c;
    public float d;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        sparseIntArray.append(2, 1);
        sparseIntArray.append(4, 2);
        sparseIntArray.append(5, 3);
        sparseIntArray.append(1, 4);
        sparseIntArray.append(0, 5);
        sparseIntArray.append(3, 6);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, TG0.e);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (e.get(index)) {
                case 1:
                    this.d = typedArrayObtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 2:
                    this.b = typedArrayObtainStyledAttributes.getInt(index, this.b);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = AbstractC5340ja1.a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.a = C1960Yx.f(typedArrayObtainStyledAttributes, index, this.a);
                    break;
                case 6:
                    this.c = typedArrayObtainStyledAttributes.getFloat(index, this.c);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
