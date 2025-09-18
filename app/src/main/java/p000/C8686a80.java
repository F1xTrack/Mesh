package p000;

/* renamed from: a80, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8686a80 {

    /* renamed from: a */
    public final Object f15324a;

    /* renamed from: b */
    public final C10417nd0 f15325b;

    /* renamed from: c */
    public final C10417nd0 f15326c;

    /* renamed from: d */
    public final C10417nd0 f15327d;

    /* renamed from: e */
    public final String f15328e;

    /* renamed from: f */
    public final C0055As f15329f;

    public C8686a80(Object obj, C10417nd0 c10417nd0, C10417nd0 c10417nd02, C10417nd0 c10417nd03, String str, C0055As c0055As) {
        O90.m5968f(str, "filePath");
        this.f15324a = obj;
        this.f15325b = c10417nd0;
        this.f15326c = c10417nd02;
        this.f15327d = c10417nd03;
        this.f15328e = str;
        this.f15329f = c0055As;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8686a80)) {
            return false;
        }
        C8686a80 c8686a80 = (C8686a80) obj;
        return this.f15324a.equals(c8686a80.f15324a) && O90.m5963a(this.f15325b, c8686a80.f15325b) && O90.m5963a(this.f15326c, c8686a80.f15326c) && this.f15327d.equals(c8686a80.f15327d) && O90.m5963a(this.f15328e, c8686a80.f15328e) && this.f15329f.equals(c8686a80.f15329f);
    }

    public final int hashCode() {
        int iHashCode = this.f15324a.hashCode() * 31;
        C10417nd0 c10417nd0 = this.f15325b;
        int iHashCode2 = (iHashCode + (c10417nd0 == null ? 0 : c10417nd0.hashCode())) * 31;
        C10417nd0 c10417nd02 = this.f15326c;
        return this.f15329f.hashCode() + AbstractC1374Vq.m8586e((this.f15327d.hashCode() + ((iHashCode2 + (c10417nd02 != null ? c10417nd02.hashCode() : 0)) * 31)) * 31, 31, this.f15328e);
    }

    public final String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f15324a + ", compilerVersion=" + this.f15325b + ", languageVersion=" + this.f15326c + ", expectedVersion=" + this.f15327d + ", filePath=" + this.f15328e + ", classId=" + this.f15329f + ')';
    }
}
