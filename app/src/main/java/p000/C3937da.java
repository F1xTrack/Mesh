package p000;

import android.util.Size;
import java.util.Comparator;

/* renamed from: da */
/* loaded from: classes.dex */
public final /* synthetic */ class C3937da implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ int f26139a;

    /* renamed from: b */
    public final /* synthetic */ int f26140b;

    public /* synthetic */ C3937da(int i, int i2) {
        this.f26139a = i2;
        this.f26140b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f26139a) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                int i = this.f26140b;
                int iAbs = Math.abs(iIntValue - i) - Math.abs(((Integer) obj2).intValue() - i);
                return (int) (iAbs == 0 ? Math.signum(r4.intValue() - r5.intValue()) : Math.signum(iAbs));
            default:
                int iM18157a = AbstractC9318f21.m18157a((Size) obj);
                int i2 = this.f26140b;
                return Math.abs(iM18157a - i2) - Math.abs(AbstractC9318f21.m18157a((Size) obj2) - i2);
        }
    }
}
