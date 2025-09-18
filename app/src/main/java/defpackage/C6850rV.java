package defpackage;

/* renamed from: rV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6850rV extends XD {
    public final int a;

    public C6850rV(String str) {
        super(str);
        this.a = 1;
    }

    public C6850rV(String str, Exception exc) {
        super(str, exc);
        this.a = 1;
    }

    public C6850rV(String str, int i) {
        super(str);
        this.a = i;
    }

    public C6850rV(Throwable th) {
        super("Unable to parse config update message.", th);
        this.a = 3;
    }
}
