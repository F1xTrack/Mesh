package defpackage;

import android.graphics.ColorSpace;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class V60 {
    public final ColorSpace a;
    public final Pair b;

    public V60(int i, int i2, ColorSpace colorSpace) {
        this.a = colorSpace;
        this.b = (i == -1 || i2 == -1) ? null : new Pair(Integer.valueOf(i), Integer.valueOf(i2));
    }
}
