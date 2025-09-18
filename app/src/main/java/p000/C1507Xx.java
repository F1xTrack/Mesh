package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* renamed from: Xx */
/* loaded from: classes.dex */
public final class C1507Xx {

    /* renamed from: m */
    public static final SparseIntArray f14052m;

    /* renamed from: a */
    public float f14053a;

    /* renamed from: b */
    public float f14054b;

    /* renamed from: c */
    public float f14055c;

    /* renamed from: d */
    public float f14056d;

    /* renamed from: e */
    public float f14057e;

    /* renamed from: f */
    public float f14058f;

    /* renamed from: g */
    public float f14059g;

    /* renamed from: h */
    public float f14060h;

    /* renamed from: i */
    public float f14061i;

    /* renamed from: j */
    public float f14062j;

    /* renamed from: k */
    public boolean f14063k;

    /* renamed from: l */
    public float f14064l;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f14052m = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
    }

    /* renamed from: a */
    public final void m9184a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, TG0.f11279h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f14052m.get(index)) {
                case 1:
                    this.f14053a = typedArrayObtainStyledAttributes.getFloat(index, this.f14053a);
                    break;
                case 2:
                    this.f14054b = typedArrayObtainStyledAttributes.getFloat(index, this.f14054b);
                    break;
                case 3:
                    this.f14055c = typedArrayObtainStyledAttributes.getFloat(index, this.f14055c);
                    break;
                case 4:
                    this.f14056d = typedArrayObtainStyledAttributes.getFloat(index, this.f14056d);
                    break;
                case 5:
                    this.f14057e = typedArrayObtainStyledAttributes.getFloat(index, this.f14057e);
                    break;
                case 6:
                    this.f14058f = typedArrayObtainStyledAttributes.getDimension(index, this.f14058f);
                    break;
                case 7:
                    this.f14059g = typedArrayObtainStyledAttributes.getDimension(index, this.f14059g);
                    break;
                case 8:
                    this.f14060h = typedArrayObtainStyledAttributes.getDimension(index, this.f14060h);
                    break;
                case 9:
                    this.f14061i = typedArrayObtainStyledAttributes.getDimension(index, this.f14061i);
                    break;
                case 10:
                    this.f14062j = typedArrayObtainStyledAttributes.getDimension(index, this.f14062j);
                    break;
                case 11:
                    this.f14063k = true;
                    this.f14064l = typedArrayObtainStyledAttributes.getDimension(index, this.f14064l);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
