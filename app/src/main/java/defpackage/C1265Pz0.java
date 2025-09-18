package defpackage;

import android.util.SizeF;
import io.legere.pdfiumandroid.util.Size;

/* renamed from: Pz0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1265Pz0 {
    public final JV a;
    public final Size b;
    public final SizeF c;
    public final SizeF d;
    public final float e;
    public final float f;
    public final boolean g;

    public C1265Pz0(JV jv, Size size, Size size2, Size size3, boolean z) {
        this.a = jv;
        this.b = size3;
        this.g = z;
        int iOrdinal = jv.ordinal();
        if (iOrdinal == 1) {
            SizeF sizeFB = b(size2, size3.getHeight());
            this.d = sizeFB;
            this.f = sizeFB.getHeight() / size2.getHeight();
            this.c = b(size, size.getHeight() * this.f);
            return;
        }
        if (iOrdinal != 2) {
            SizeF sizeFC = c(size, size3.getWidth());
            this.c = sizeFC;
            this.e = sizeFC.getWidth() / size.getWidth();
            this.d = c(size2, size2.getWidth() * this.e);
            return;
        }
        SizeF sizeFA = a(size2, size2.getWidth() * (a(size, size3.getWidth(), size3.getHeight()).getWidth() / size.getWidth()), size3.getHeight());
        this.d = sizeFA;
        this.f = sizeFA.getHeight() / size2.getHeight();
        SizeF sizeFA2 = a(size, size3.getWidth(), size.getHeight() * this.f);
        this.c = sizeFA2;
        this.e = sizeFA2.getWidth() / size.getWidth();
    }

    public static SizeF a(Size size, float f, float f2) {
        float width = size.getWidth() / size.getHeight();
        float fFloor = (float) Math.floor(f / width);
        if (fFloor > f2) {
            f = (float) Math.floor(width * f2);
        } else {
            f2 = fFloor;
        }
        return new SizeF(f, f2);
    }

    public static SizeF b(Size size, float f) {
        return new SizeF((float) Math.floor(f / (size.getHeight() / size.getWidth())), f);
    }

    public static SizeF c(Size size, float f) {
        return new SizeF(f, (float) Math.floor(f / (size.getWidth() / size.getHeight())));
    }
}
