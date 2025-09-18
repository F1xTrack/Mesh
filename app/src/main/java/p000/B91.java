package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.horcrux.svg.C1983Y;

/* loaded from: classes.dex */
public final class B91 extends C1983Y {

    /* renamed from: q */
    public String f608q;

    /* renamed from: r */
    public int f609r;

    /* renamed from: s */
    public int f610s;

    /* renamed from: t */
    public C11931zU0 f611t;

    @Override // com.horcrux.svg.C1983Y, com.horcrux.svg.C1993g, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final void draw(Canvas canvas, Paint paint, float f) {
        mo11365l(canvas, paint, f);
    }

    @Override // com.horcrux.svg.C1983Y, com.horcrux.svg.C1993g, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final Path getPath(Canvas canvas, Paint paint) {
        return m11363s(canvas, paint);
    }

    @Override // com.horcrux.svg.C1983Y
    /* renamed from: u */
    public final void mo533u(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (!str.equals("align") && !str.equals("stretch")) {
            throw new IllegalArgumentException("No enum constant com.horcrux.svg.TextProperties.TextPathMethod.".concat(str));
        }
        invalidate();
    }

    @Override // com.horcrux.svg.C1993g
    /* renamed from: p */
    public final void mo531p() {
    }

    @Override // com.horcrux.svg.C1983Y, com.horcrux.svg.C1993g
    /* renamed from: q */
    public final void mo532q() {
    }
}
