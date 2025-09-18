package p000;

import android.graphics.Rect;
import java.util.Comparator;

/* renamed from: IW */
/* loaded from: classes.dex */
public final class C0537IW implements Comparator {

    /* renamed from: a */
    public final Rect f4964a = new Rect();

    /* renamed from: b */
    public final Rect f4965b = new Rect();

    /* renamed from: c */
    public final boolean f4966c;

    /* renamed from: d */
    public final OL0 f4967d;

    public C0537IW(boolean z, OL0 ol0) {
        this.f4966c = z;
        this.f4967d = ol0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f4967d.getClass();
        Rect rect = this.f4964a;
        ((C1009Q1) obj).m6535g(rect);
        Rect rect2 = this.f4965b;
        ((C1009Q1) obj2).m6535g(rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        boolean z = this.f4966c;
        if (i3 < i4) {
            return z ? 1 : -1;
        }
        if (i3 > i4) {
            return z ? -1 : 1;
        }
        int i5 = rect.bottom;
        int i6 = rect2.bottom;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        int i7 = rect.right;
        int i8 = rect2.right;
        if (i7 < i8) {
            return z ? 1 : -1;
        }
        if (i7 > i8) {
            return z ? -1 : 1;
        }
        return 0;
    }
}
