package p000;

/* renamed from: bT0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC8856bT0 implements InterfaceC7290zr {

    /* renamed from: a */
    public final AbstractC8418Vg0 f17035a;

    /* renamed from: b */
    public final String f17036b;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC8856bT0(String str, InterfaceC6497nZ interfaceC6497nZ) {
        this.f17035a = (AbstractC8418Vg0) interfaceC6497nZ;
        this.f17036b = "must return ".concat(str);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Vg0, nZ] */
    @Override // p000.InterfaceC7290zr
    /* renamed from: a */
    public final boolean mo7727a(C9261eb0 c9261eb0) {
        return O90.m5963a(c9261eb0.f1432h, this.f17035a.invoke(AbstractC6940uI.m25152e(c9261eb0)));
    }

    @Override // p000.InterfaceC7290zr
    /* renamed from: b */
    public final String mo10456b(C9261eb0 c9261eb0) {
        return KS1.m4645a(this, c9261eb0);
    }

    @Override // p000.InterfaceC7290zr
    public final String getDescription() {
        return this.f17036b;
    }
}
