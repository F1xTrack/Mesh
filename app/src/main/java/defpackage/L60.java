package defpackage;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class L60 implements J60 {
    public final int a;
    public final int b;
    public final HashMap c;

    public L60(int i, int i2, HashMap map) {
        this.a = i;
        this.b = i2;
        this.c = map;
    }

    @Override // defpackage.J60
    public final Map getExtras() {
        return this.c;
    }

    @Override // defpackage.J60
    public final int getHeight() {
        return this.b;
    }

    @Override // defpackage.J60
    public final int getWidth() {
        return this.a;
    }
}
