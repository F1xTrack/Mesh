package defpackage;

import java.io.IOException;
import java.util.List;

/* renamed from: f40 */
/* loaded from: classes2.dex */
public final class C3703f40 extends P81 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ C4085h40 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ List h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3703f40(String str, C4085h40 c4085h40, int i, List list) {
        super(str, true);
        this.f = c4085h40;
        this.g = i;
        this.h = list;
    }

    private final long b() {
        this.f.k.getClass();
        try {
            this.f.w.l(this.g, 9);
            synchronized (this.f) {
                this.f.y.remove(Integer.valueOf(this.g));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }

    @Override // defpackage.P81
    public final long a() {
        switch (this.e) {
            case 0:
                return b();
            default:
                this.f.k.getClass();
                try {
                    this.f.w.l(this.g, 9);
                    synchronized (this.f) {
                        this.f.y.remove(Integer.valueOf(this.g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3703f40(String str, C4085h40 c4085h40, int i, List list, boolean z) {
        super(str, true);
        this.f = c4085h40;
        this.g = i;
        this.h = list;
    }
}
