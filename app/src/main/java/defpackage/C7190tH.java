package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.horcrux.svg.VirtualView;

/* renamed from: tH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7190tH extends AbstractC6808rH {
    @Override // com.horcrux.svg.VirtualView
    public final void saveDefinition() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).saveDefinition();
            }
        }
    }

    @Override // defpackage.AbstractC6808rH, com.horcrux.svg.VirtualView
    public final void draw(Canvas canvas, Paint paint, float f) {
    }
}
