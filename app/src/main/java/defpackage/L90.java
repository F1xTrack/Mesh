package defpackage;

import android.util.Rational;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class L90 implements Comparator {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ L90(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                AbstractC0663Ig0 abstractC0663Ig0 = (AbstractC0663Ig0) obj;
                O90.c(abstractC0663Ig0);
                InterfaceC6099nZ interfaceC6099nZ = (InterfaceC6099nZ) this.b;
                String string = interfaceC6099nZ.invoke(abstractC0663Ig0).toString();
                AbstractC0663Ig0 abstractC0663Ig02 = (AbstractC0663Ig0) obj2;
                O90.c(abstractC0663Ig02);
                return GT1.b(string, interfaceC6099nZ.invoke(abstractC0663Ig02).toString());
            case 1:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int iCompareTo = Boolean.valueOf(materialButton.o).compareTo(Boolean.valueOf(materialButton2.o));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                if (iCompareTo2 != 0) {
                    return iCompareTo2;
                }
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.b;
                return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
            default:
                Rational rational = (Rational) obj2;
                Rational rational2 = (Rational) this.b;
                float fFloatValue = ((Rational) obj).floatValue();
                float fFloatValue2 = rational2.floatValue();
                float f = fFloatValue > fFloatValue2 ? fFloatValue2 / fFloatValue : fFloatValue / fFloatValue2;
                float fFloatValue3 = rational.floatValue();
                float fFloatValue4 = rational2.floatValue();
                return Float.compare(fFloatValue3 > fFloatValue4 ? fFloatValue4 / fFloatValue3 : fFloatValue3 / fFloatValue4, f);
        }
    }
}
