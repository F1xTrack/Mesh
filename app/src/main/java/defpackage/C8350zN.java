package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* renamed from: zN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8350zN extends AbstractC7711w02 {
    public final TextView a;
    public final C7970xN b;
    public boolean c = true;

    public C8350zN(TextView textView) {
        this.a = textView;
        this.b = new C7970xN(textView);
    }

    @Override // defpackage.AbstractC7711w02
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        if (!this.c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C7970xN) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            C7970xN c7970xN = this.b;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c7970xN;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == c7970xN) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // defpackage.AbstractC7711w02
    public final boolean b() {
        return this.c;
    }

    @Override // defpackage.AbstractC7711w02
    public final void c(boolean z) {
        if (z) {
            TextView textView = this.a;
            textView.setTransformationMethod(e(textView.getTransformationMethod()));
        }
    }

    @Override // defpackage.AbstractC7711w02
    public final void d(boolean z) {
        this.c = z;
        TextView textView = this.a;
        textView.setTransformationMethod(e(textView.getTransformationMethod()));
        textView.setFilters(a(textView.getFilters()));
    }

    @Override // defpackage.AbstractC7711w02
    public final TransformationMethod e(TransformationMethod transformationMethod) {
        return this.c ? ((transformationMethod instanceof DN) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new DN(transformationMethod) : transformationMethod instanceof DN ? ((DN) transformationMethod).a : transformationMethod;
    }
}
