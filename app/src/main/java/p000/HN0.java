package p000;

import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class HN0 extends IS0 {

    /* renamed from: a */
    public final /* synthetic */ int f4251a;

    /* renamed from: b */
    public final long f4252b;

    /* renamed from: c */
    public final Object f4253c;

    /* renamed from: d */
    public final InterfaceC0676Kj f4254d;

    public /* synthetic */ HN0(Object obj, long j, InterfaceC0676Kj interfaceC0676Kj, int i) {
        this.f4251a = i;
        this.f4253c = obj;
        this.f4252b = j;
        this.f4254d = interfaceC0676Kj;
    }

    @Override // p000.IS0
    /* renamed from: o */
    public final long mo3383o() {
        switch (this.f4251a) {
        }
        return this.f4252b;
    }

    @Override // p000.IS0
    /* renamed from: p */
    public final C8540Xp0 mo3384p() {
        Object obj = this.f4253c;
        switch (this.f4251a) {
            case 0:
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                Pattern pattern = C8540Xp0.f13986d;
                return AbstractC11511wA1.m25570c(str);
            default:
                return (C8540Xp0) obj;
        }
    }

    @Override // p000.IS0
    /* renamed from: w */
    public final InterfaceC0676Kj mo3385w() {
        switch (this.f4251a) {
            case 0:
                return (C11917zN0) this.f4254d;
            default:
                return this.f4254d;
        }
    }
}
