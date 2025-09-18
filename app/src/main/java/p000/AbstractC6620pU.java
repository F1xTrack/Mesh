package p000;

import android.graphics.Bitmap;
import com.horcrux.svg.FilterRegion;
import java.util.HashMap;

/* renamed from: pU */
/* loaded from: classes.dex */
public abstract class AbstractC6620pU extends AbstractC6733rH {

    /* renamed from: a */
    public String f40111a;

    /* renamed from: b */
    public final FilterRegion f40112b;

    public AbstractC6620pU(S91 s91) {
        super(s91);
        this.f40112b = new FilterRegion();
    }

    /* renamed from: m */
    public static Bitmap m23802m(HashMap map, Bitmap bitmap, String str) {
        Bitmap bitmap2 = str != null ? (Bitmap) map.get(str) : null;
        return bitmap2 != null ? bitmap2 : bitmap;
    }

    /* renamed from: l */
    public abstract Bitmap mo4327l(HashMap map, Bitmap bitmap);

    @Override // com.horcrux.svg.VirtualView
    public final void saveDefinition() {
    }
}
