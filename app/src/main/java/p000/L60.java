package p000;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class L60 implements J60 {

    /* renamed from: a */
    public final int f6490a;

    /* renamed from: b */
    public final int f6491b;

    /* renamed from: c */
    public final HashMap f6492c;

    public L60(int i, int i2, HashMap map) {
        this.f6490a = i;
        this.f6491b = i2;
        this.f6492c = map;
    }

    @Override // p000.J60
    public final Map getExtras() {
        return this.f6492c;
    }

    @Override // p000.J60
    public final int getHeight() {
        return this.f6491b;
    }

    @Override // p000.J60
    public final int getWidth() {
        return this.f6490a;
    }
}
