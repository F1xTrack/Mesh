package p000;

/* renamed from: m01, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10208m01 implements InterfaceC0776MK {

    /* renamed from: a */
    public final C10464o01 f37384a;

    /* renamed from: b */
    public final long f37385b;

    /* renamed from: c */
    public final Object f37386c;

    /* renamed from: d */
    public final C0619Jp f37387d;

    public C10208m01(C10464o01 c10464o01, long j, Object obj, C0619Jp c0619Jp) {
        this.f37384a = c10464o01;
        this.f37385b = j;
        this.f37386c = obj;
        this.f37387d = c0619Jp;
    }

    @Override // p000.InterfaceC0776MK
    /* renamed from: a */
    public final void mo3407a() {
        C10464o01 c10464o01 = this.f37384a;
        synchronized (c10464o01) {
            if (this.f37385b < c10464o01.m23302l()) {
                return;
            }
            Object[] objArr = c10464o01.f38672g;
            O90.m5965c(objArr);
            long j = this.f37385b;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            WB1.m8706a(objArr, j, WB1.f13057a);
            c10464o01.m23297f();
        }
    }
}
