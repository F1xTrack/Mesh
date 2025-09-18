package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.horcrux.svg.VirtualView;

/* renamed from: tH */
/* loaded from: classes.dex */
public final class C6876tH extends AbstractC6733rH {
    @Override // com.horcrux.svg.VirtualView
    public final void saveDefinition() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).saveDefinition();
            }
        }
    }

    @Override // p000.AbstractC6733rH, com.horcrux.svg.VirtualView
    public final void draw(Canvas canvas, Paint paint, float f) {
    }
}
