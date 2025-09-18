package p000;

/* renamed from: uK */
/* loaded from: classes.dex */
public final class C6942uK {

    /* renamed from: a */
    public boolean f43649a;

    /* renamed from: b */
    public long f43650b;

    /* renamed from: c */
    public long f43651c;

    /* renamed from: a */
    public final synchronized long m25166a() {
        return this.f43650b;
    }

    /* renamed from: b */
    public final synchronized void m25167b(long j, long j2) {
        if (this.f43649a) {
            this.f43650b += j;
            this.f43651c += j2;
        }
    }

    /* renamed from: c */
    public final synchronized void m25168c() {
        this.f43649a = false;
        this.f43651c = -1L;
        this.f43650b = -1L;
    }

    /* renamed from: d */
    public final synchronized void m25169d(long j, long j2) {
        this.f43651c = j2;
        this.f43650b = j;
        this.f43649a = true;
    }
}
