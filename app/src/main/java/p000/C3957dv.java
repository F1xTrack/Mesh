package p000;

import android.util.Size;
import java.util.Comparator;

/* renamed from: dv */
/* loaded from: classes.dex */
public final class C3957dv implements Comparator {

    /* renamed from: a */
    public final boolean f26388a;

    public C3957dv(boolean z) {
        this.f26388a = z;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Size size = (Size) obj;
        Size size2 = (Size) obj2;
        int iSignum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        return this.f26388a ? iSignum * (-1) : iSignum;
    }
}
