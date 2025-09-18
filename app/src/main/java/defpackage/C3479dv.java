package defpackage;

import android.util.Size;
import java.util.Comparator;

/* renamed from: dv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3479dv implements Comparator {
    public final boolean a;

    public C3479dv(boolean z) {
        this.a = z;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Size size = (Size) obj;
        Size size2 = (Size) obj2;
        int iSignum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        return this.a ? iSignum * (-1) : iSignum;
    }
}
