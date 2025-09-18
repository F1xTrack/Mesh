package p000;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* renamed from: zN */
/* loaded from: classes.dex */
public final class C7260zN extends AbstractC11489w02 {

    /* renamed from: a */
    public final TextView f46806a;

    /* renamed from: b */
    public final C7134xN f46807b;

    /* renamed from: c */
    public boolean f46808c = true;

    public C7260zN(TextView textView) {
        this.f46806a = textView;
        this.f46807b = new C7134xN(textView);
    }

    @Override // p000.AbstractC11489w02
    /* renamed from: a */
    public final InputFilter[] mo166a(InputFilter[] inputFilterArr) {
        if (!this.f46808c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C7134xN) {
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
            C7134xN c7134xN = this.f46807b;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c7134xN;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == c7134xN) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // p000.AbstractC11489w02
    /* renamed from: b */
    public final boolean mo167b() {
        return this.f46808c;
    }

    @Override // p000.AbstractC11489w02
    /* renamed from: c */
    public final void mo168c(boolean z) {
        if (z) {
            TextView textView = this.f46806a;
            textView.setTransformationMethod(mo170e(textView.getTransformationMethod()));
        }
    }

    @Override // p000.AbstractC11489w02
    /* renamed from: d */
    public final void mo169d(boolean z) {
        this.f46808c = z;
        TextView textView = this.f46806a;
        textView.setTransformationMethod(mo170e(textView.getTransformationMethod()));
        textView.setFilters(mo166a(textView.getFilters()));
    }

    @Override // p000.AbstractC11489w02
    /* renamed from: e */
    public final TransformationMethod mo170e(TransformationMethod transformationMethod) {
        return this.f46808c ? ((transformationMethod instanceof C0213DN) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new C0213DN(transformationMethod) : transformationMethod instanceof C0213DN ? ((C0213DN) transformationMethod).f1979a : transformationMethod;
    }
}
