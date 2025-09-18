package p000;

import android.util.SizeF;
import io.legere.pdfiumandroid.util.Size;

/* renamed from: Pz0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8144Pz0 {

    /* renamed from: a */
    public final EnumC0599JV f9384a;

    /* renamed from: b */
    public final Size f9385b;

    /* renamed from: c */
    public final SizeF f9386c;

    /* renamed from: d */
    public final SizeF f9387d;

    /* renamed from: e */
    public final float f9388e;

    /* renamed from: f */
    public final float f9389f;

    /* renamed from: g */
    public final boolean f9390g;

    public C8144Pz0(EnumC0599JV enumC0599JV, Size size, Size size2, Size size3, boolean z) {
        this.f9384a = enumC0599JV;
        this.f9385b = size3;
        this.f9390g = z;
        int iOrdinal = enumC0599JV.ordinal();
        if (iOrdinal == 1) {
            SizeF sizeFM6520b = m6520b(size2, size3.getHeight());
            this.f9387d = sizeFM6520b;
            this.f9389f = sizeFM6520b.getHeight() / size2.getHeight();
            this.f9386c = m6520b(size, size.getHeight() * this.f9389f);
            return;
        }
        if (iOrdinal != 2) {
            SizeF sizeFM6521c = m6521c(size, size3.getWidth());
            this.f9386c = sizeFM6521c;
            this.f9388e = sizeFM6521c.getWidth() / size.getWidth();
            this.f9387d = m6521c(size2, size2.getWidth() * this.f9388e);
            return;
        }
        SizeF sizeFM6519a = m6519a(size2, size2.getWidth() * (m6519a(size, size3.getWidth(), size3.getHeight()).getWidth() / size.getWidth()), size3.getHeight());
        this.f9387d = sizeFM6519a;
        this.f9389f = sizeFM6519a.getHeight() / size2.getHeight();
        SizeF sizeFM6519a2 = m6519a(size, size3.getWidth(), size.getHeight() * this.f9389f);
        this.f9386c = sizeFM6519a2;
        this.f9388e = sizeFM6519a2.getWidth() / size.getWidth();
    }

    /* renamed from: a */
    public static SizeF m6519a(Size size, float f, float f2) {
        float width = size.getWidth() / size.getHeight();
        float fFloor = (float) Math.floor(f / width);
        if (fFloor > f2) {
            f = (float) Math.floor(width * f2);
        } else {
            f2 = fFloor;
        }
        return new SizeF(f, f2);
    }

    /* renamed from: b */
    public static SizeF m6520b(Size size, float f) {
        return new SizeF((float) Math.floor(f / (size.getHeight() / size.getWidth())), f);
    }

    /* renamed from: c */
    public static SizeF m6521c(Size size, float f) {
        return new SizeF(f, (float) Math.floor(f / (size.getWidth() / size.getHeight())));
    }
}
