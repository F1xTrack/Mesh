package defpackage;

import android.util.Size;
import java.util.Comparator;

/* renamed from: da, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3417da implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ C3417da(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                int i = this.b;
                int iAbs = Math.abs(iIntValue - i) - Math.abs(((Integer) obj2).intValue() - i);
                return (int) (iAbs == 0 ? Math.signum(r4.intValue() - r5.intValue()) : Math.signum(iAbs));
            default:
                int iA = AbstractC3696f21.a((Size) obj);
                int i2 = this.b;
                return Math.abs(iA - i2) - Math.abs(AbstractC3696f21.a((Size) obj2) - i2);
        }
    }
}
