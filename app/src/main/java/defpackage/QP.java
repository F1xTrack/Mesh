package defpackage;

/* loaded from: classes.dex */
public final class QP {
    public final LP[] a;
    public final long[] b;
    public final String c;
    public final String d;

    public QP(String str, String str2, long[] jArr, LP[] lpArr) {
        this.c = str;
        this.d = str2;
        this.b = jArr;
        this.a = lpArr;
    }

    public final String a() {
        return this.c + "/" + this.d;
    }
}
