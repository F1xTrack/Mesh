package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.horcrux.svg.Y;

/* loaded from: classes.dex */
public final class B91 extends Y {
    public String q;
    public int r;
    public int s;
    public C8372zU0 t;

    @Override // com.horcrux.svg.Y, com.horcrux.svg.C2592g, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final void draw(Canvas canvas, Paint paint, float f) {
        l(canvas, paint, f);
    }

    @Override // com.horcrux.svg.Y, com.horcrux.svg.C2592g, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final Path getPath(Canvas canvas, Paint paint) {
        return s(canvas, paint);
    }

    @Override // com.horcrux.svg.Y
    public final void u(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (!str.equals("align") && !str.equals("stretch")) {
            throw new IllegalArgumentException("No enum constant com.horcrux.svg.TextProperties.TextPathMethod.".concat(str));
        }
        invalidate();
    }

    @Override // com.horcrux.svg.C2592g
    public final void p() {
    }

    @Override // com.horcrux.svg.Y, com.horcrux.svg.C2592g
    public final void q() {
    }
}
