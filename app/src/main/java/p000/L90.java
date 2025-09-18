package p000;

import android.util.Rational;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class L90 implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ int f6519a;

    /* renamed from: b */
    public final Object f6520b;

    public /* synthetic */ L90(int i, Object obj) {
        this.f6519a = i;
        this.f6520b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f6519a) {
            case 0:
                AbstractC7742Ig0 abstractC7742Ig0 = (AbstractC7742Ig0) obj;
                O90.m5965c(abstractC7742Ig0);
                InterfaceC6497nZ interfaceC6497nZ = (InterfaceC6497nZ) this.f6520b;
                String string = interfaceC6497nZ.invoke(abstractC7742Ig0).toString();
                AbstractC7742Ig0 abstractC7742Ig02 = (AbstractC7742Ig0) obj2;
                O90.m5965c(abstractC7742Ig02);
                return GT1.m3070b(string, interfaceC6497nZ.invoke(abstractC7742Ig02).toString());
            case 1:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int iCompareTo = Boolean.valueOf(materialButton.f18159o).compareTo(Boolean.valueOf(materialButton2.f18159o));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                if (iCompareTo2 != 0) {
                    return iCompareTo2;
                }
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f6520b;
                return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
            default:
                Rational rational = (Rational) obj2;
                Rational rational2 = (Rational) this.f6520b;
                float fFloatValue = ((Rational) obj).floatValue();
                float fFloatValue2 = rational2.floatValue();
                float f = fFloatValue > fFloatValue2 ? fFloatValue2 / fFloatValue : fFloatValue / fFloatValue2;
                float fFloatValue3 = rational.floatValue();
                float fFloatValue4 = rational2.floatValue();
                return Float.compare(fFloatValue3 > fFloatValue4 ? fFloatValue4 / fFloatValue3 : fFloatValue3 / fFloatValue4, f);
        }
    }
}
