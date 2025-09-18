package defpackage;

import android.content.Context;
import android.net.Uri;

/* renamed from: Wp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1781Wp0 implements InterfaceC7302ts0 {
    public final /* synthetic */ int a;
    public final Context b;

    public C1781Wp0(Context context, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = context.getApplicationContext();
                break;
            case 2:
                this.b = context.getApplicationContext();
                break;
            default:
                this.b = context;
                break;
        }
    }

    @Override // defpackage.InterfaceC7302ts0
    public final boolean a(Object obj) {
        switch (this.a) {
            case 0:
                return AbstractC7362uA1.a((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                return AbstractC7362uA1.a(uri) && !uri.getPathSegments().contains("video");
            default:
                Uri uri2 = (Uri) obj;
                return AbstractC7362uA1.a(uri2) && uri2.getPathSegments().contains("video");
        }
    }

    @Override // defpackage.InterfaceC7302ts0
    public final C7111ss0 b(Object obj, int i, int i2, C0795Jy0 c0795Jy0) {
        Long l;
        switch (this.a) {
            case 0:
                Uri uri = (Uri) obj;
                return new C7111ss0(new C1958Yw0(uri), new C1703Vp0(this.b, 0, uri));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384) {
                    return null;
                }
                C1958Yw0 c1958Yw0 = new C1958Yw0(uri2);
                Context context = this.b;
                return new C7111ss0(c1958Yw0, C5460kD.e(context, uri2, new C0136Bm1(1, context.getContentResolver())));
            default:
                Uri uri3 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384 || (l = (Long) c0795Jy0.c(C1917Yi1.d)) == null || l.longValue() != -1) {
                    return null;
                }
                C1958Yw0 c1958Yw02 = new C1958Yw0(uri3);
                Context context2 = this.b;
                return new C7111ss0(c1958Yw02, C5460kD.e(context2, uri3, new C3866fw1(1, context2.getContentResolver())));
        }
    }
}
