package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.common.time.RealtimeSinceBootClock;

/* renamed from: hi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4204hi implements InterfaceC4213hl {
    public final String a;
    public final C3394dS0 b;
    public final CT0 c;
    public final C8110y60 d;
    public final InterfaceC4213hl e;
    public final String f;
    public Object g;
    public final int h;

    public C4204hi(String str, C3394dS0 c3394dS0, CT0 ct0, C8110y60 c8110y60, InterfaceC4213hl interfaceC4213hl, String str2) {
        O90.f(str, "sourceString");
        O90.f(ct0, "rotationOptions");
        O90.f(c8110y60, "imageDecodeOptions");
        this.a = str;
        this.b = c3394dS0;
        this.c = ct0;
        this.d = c8110y60;
        this.e = interfaceC4213hl;
        this.f = str2;
        this.h = ((((c8110y60.hashCode() + ((ct0.hashCode() + (((str.hashCode() * 31) + (c3394dS0 != null ? c3394dS0.hashCode() : 0)) * 31)) * 31)) * 31) + (interfaceC4213hl != null ? interfaceC4213hl.hashCode() : 0)) * 31) + (str2 != null ? str2.hashCode() : 0);
        RealtimeSinceBootClock.get().getClass();
        SystemClock.elapsedRealtime();
    }

    @Override // defpackage.InterfaceC4213hl
    public final boolean a(Uri uri) {
        O90.f(uri, "uri");
        String string = uri.toString();
        O90.e(string, "uri.toString()");
        return AbstractC7538v51.p(this.a, string, false);
    }

    @Override // defpackage.InterfaceC4213hl
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C4204hi.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        O90.d(obj, "null cannot be cast to non-null type com.facebook.imagepipeline.cache.BitmapMemoryCacheKey");
        C4204hi c4204hi = (C4204hi) obj;
        return O90.a(this.a, c4204hi.a) && O90.a(this.b, c4204hi.b) && O90.a(this.c, c4204hi.c) && O90.a(this.d, c4204hi.d) && O90.a(this.e, c4204hi.e) && O90.a(this.f, c4204hi.f);
    }

    public final int hashCode() {
        return this.h;
    }

    public final String toString() {
        return "BitmapMemoryCacheKey(sourceString=" + this.a + ", resizeOptions=" + this.b + ", rotationOptions=" + this.c + ", imageDecodeOptions=" + this.d + ", postprocessorCacheKey=" + this.e + ", postprocessorName=" + this.f + ")";
    }
}
