package defpackage;

import android.graphics.Bitmap;
import com.horcrux.svg.FilterRegion;
import java.util.HashMap;

/* renamed from: pU, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6466pU extends AbstractC6808rH {
    public String a;
    public final FilterRegion b;

    public AbstractC6466pU(S91 s91) {
        super(s91);
        this.b = new FilterRegion();
    }

    public static Bitmap m(HashMap map, Bitmap bitmap, String str) {
        Bitmap bitmap2 = str != null ? (Bitmap) map.get(str) : null;
        return bitmap2 != null ? bitmap2 : bitmap;
    }

    public abstract Bitmap l(HashMap map, Bitmap bitmap);

    @Override // com.horcrux.svg.VirtualView
    public final void saveDefinition() {
    }
}
