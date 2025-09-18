package p000;

import android.graphics.ColorSpace;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class V60 {

    /* renamed from: a */
    public final ColorSpace f12354a;

    /* renamed from: b */
    public final Pair f12355b;

    public V60(int i, int i2, ColorSpace colorSpace) {
        this.f12354a = colorSpace;
        this.f12355b = (i == -1 || i2 == -1) ? null : new Pair(Integer.valueOf(i), Integer.valueOf(i2));
    }
}
