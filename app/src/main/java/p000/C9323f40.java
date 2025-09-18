package p000;

import java.io.IOException;
import java.util.List;

/* renamed from: f40 */
/* loaded from: classes2.dex */
public final class C9323f40 extends P81 {

    /* renamed from: e */
    public final /* synthetic */ int f27037e = 1;

    /* renamed from: f */
    public final /* synthetic */ C9579h40 f27038f;

    /* renamed from: g */
    public final /* synthetic */ int f27039g;

    /* renamed from: h */
    public final /* synthetic */ List f27040h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9323f40(String str, C9579h40 c9579h40, int i, List list) {
        super(str, true);
        this.f27038f = c9579h40;
        this.f27039g = i;
        this.f27040h = list;
    }

    /* renamed from: b */
    private final long m18162b() {
        this.f27038f.f28224k.getClass();
        try {
            this.f27038f.f28236w.m23603l(this.f27039g, 9);
            synchronized (this.f27038f) {
                this.f27038f.f28238y.remove(Integer.valueOf(this.f27039g));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }

    @Override // p000.P81
    /* renamed from: a */
    public final long mo4621a() {
        switch (this.f27037e) {
            case 0:
                return m18162b();
            default:
                this.f27038f.f28224k.getClass();
                try {
                    this.f27038f.f28236w.m23603l(this.f27039g, 9);
                    synchronized (this.f27038f) {
                        this.f27038f.f28238y.remove(Integer.valueOf(this.f27039g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9323f40(String str, C9579h40 c9579h40, int i, List list, boolean z) {
        super(str, true);
        this.f27038f = c9579h40;
        this.f27039g = i;
        this.f27040h = list;
    }
}
