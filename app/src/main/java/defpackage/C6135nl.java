package defpackage;

/* renamed from: nl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6135nl extends C7925x8 {
    public int k;

    @Override // defpackage.L01, java.util.Map
    public final void clear() {
        this.k = 0;
        super.clear();
    }

    @Override // defpackage.L01, java.util.Map
    public final int hashCode() {
        if (this.k == 0) {
            this.k = super.hashCode();
        }
        return this.k;
    }

    @Override // defpackage.L01
    public final void j(C7925x8 c7925x8) {
        this.k = 0;
        super.j(c7925x8);
    }

    @Override // defpackage.L01
    public final Object k(int i) {
        this.k = 0;
        return super.k(i);
    }

    @Override // defpackage.L01
    public final Object l(int i, Object obj) {
        this.k = 0;
        return super.l(i, obj);
    }

    @Override // defpackage.L01, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.k = 0;
        return super.put(obj, obj2);
    }
}
