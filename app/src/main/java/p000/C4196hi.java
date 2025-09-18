package p000;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.common.time.RealtimeSinceBootClock;

/* renamed from: hi */
/* loaded from: classes.dex */
public final class C4196hi implements InterfaceC4199hl {

    /* renamed from: a */
    public final String f28529a;

    /* renamed from: b */
    public final C9115dS0 f28530b;

    /* renamed from: c */
    public final CT0 f28531c;

    /* renamed from: d */
    public final C11756y60 f28532d;

    /* renamed from: e */
    public final InterfaceC4199hl f28533e;

    /* renamed from: f */
    public final String f28534f;

    /* renamed from: g */
    public Object f28535g;

    /* renamed from: h */
    public final int f28536h;

    public C4196hi(String str, C9115dS0 c9115dS0, CT0 ct0, C11756y60 c11756y60, InterfaceC4199hl interfaceC4199hl, String str2) {
        O90.m5968f(str, "sourceString");
        O90.m5968f(ct0, "rotationOptions");
        O90.m5968f(c11756y60, "imageDecodeOptions");
        this.f28529a = str;
        this.f28530b = c9115dS0;
        this.f28531c = ct0;
        this.f28532d = c11756y60;
        this.f28533e = interfaceC4199hl;
        this.f28534f = str2;
        this.f28536h = ((((c11756y60.hashCode() + ((ct0.hashCode() + (((str.hashCode() * 31) + (c9115dS0 != null ? c9115dS0.hashCode() : 0)) * 31)) * 31)) * 31) + (interfaceC4199hl != null ? interfaceC4199hl.hashCode() : 0)) * 31) + (str2 != null ? str2.hashCode() : 0);
        RealtimeSinceBootClock.get().getClass();
        SystemClock.elapsedRealtime();
    }

    @Override // p000.InterfaceC4199hl
    /* renamed from: a */
    public final boolean mo5924a(Uri uri) {
        O90.m5968f(uri, "uri");
        String string = uri.toString();
        O90.m5967e(string, "uri.toString()");
        return AbstractC11374v51.m25351p(this.f28529a, string, false);
    }

    @Override // p000.InterfaceC4199hl
    /* renamed from: b */
    public final String mo5925b() {
        return this.f28529a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C4196hi.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        O90.m5966d(obj, "null cannot be cast to non-null type com.facebook.imagepipeline.cache.BitmapMemoryCacheKey");
        C4196hi c4196hi = (C4196hi) obj;
        return O90.m5963a(this.f28529a, c4196hi.f28529a) && O90.m5963a(this.f28530b, c4196hi.f28530b) && O90.m5963a(this.f28531c, c4196hi.f28531c) && O90.m5963a(this.f28532d, c4196hi.f28532d) && O90.m5963a(this.f28533e, c4196hi.f28533e) && O90.m5963a(this.f28534f, c4196hi.f28534f);
    }

    public final int hashCode() {
        return this.f28536h;
    }

    public final String toString() {
        return "BitmapMemoryCacheKey(sourceString=" + this.f28529a + ", resizeOptions=" + this.f28530b + ", rotationOptions=" + this.f28531c + ", imageDecodeOptions=" + this.f28532d + ", postprocessorCacheKey=" + this.f28533e + ", postprocessorName=" + this.f28534f + ")";
    }
}
