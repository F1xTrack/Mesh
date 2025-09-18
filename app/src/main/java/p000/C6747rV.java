package p000;

/* renamed from: rV */
/* loaded from: classes.dex */
public class C6747rV extends AbstractC1461XD {

    /* renamed from: a */
    public final int f41686a;

    public C6747rV(String str) {
        super(str);
        this.f41686a = 1;
    }

    public C6747rV(String str, Exception exc) {
        super(str, exc);
        this.f41686a = 1;
    }

    public C6747rV(String str, int i) {
        super(str);
        this.f41686a = i;
    }

    public C6747rV(Throwable th) {
        super("Unable to parse config update message.", th);
        this.f41686a = 3;
    }
}
