package p000;

import android.content.Context;
import android.net.Uri;

/* renamed from: Wp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8488Wp0 implements InterfaceC11215ts0 {

    /* renamed from: a */
    public final /* synthetic */ int f13416a;

    /* renamed from: b */
    public final Context f13417b;

    public C8488Wp0(Context context, int i) {
        this.f13416a = i;
        switch (i) {
            case 1:
                this.f13417b = context.getApplicationContext();
                break;
            case 2:
                this.f13417b = context.getApplicationContext();
                break;
            default:
                this.f13417b = context;
                break;
        }
    }

    @Override // p000.InterfaceC11215ts0
    /* renamed from: a */
    public final boolean mo8529a(Object obj) {
        switch (this.f13416a) {
            case 0:
                return AbstractC11256uA1.m25126a((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                return AbstractC11256uA1.m25126a(uri) && !uri.getPathSegments().contains("video");
            default:
                Uri uri2 = (Uri) obj;
                return AbstractC11256uA1.m25126a(uri2) && uri2.getPathSegments().contains("video");
        }
    }

    @Override // p000.InterfaceC11215ts0
    /* renamed from: b */
    public final C11087ss0 mo8530b(Object obj, int i, int i2, C7830Jy0 c7830Jy0) {
        Long l;
        switch (this.f13416a) {
            case 0:
                Uri uri = (Uri) obj;
                return new C11087ss0(new C8606Yw0(uri), new C8436Vp0(this.f13417b, 0, uri));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384) {
                    return null;
                }
                C8606Yw0 c8606Yw0 = new C8606Yw0(uri2);
                Context context = this.f13417b;
                return new C11087ss0(c8606Yw0, C6286kD.m22166e(context, uri2, new C7391Bm1(1, context.getContentResolver())));
            default:
                Uri uri3 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384 || (l = (Long) c7830Jy0.m4482c(C8579Yi1.f14471d)) == null || l.longValue() != -1) {
                    return null;
                }
                C8606Yw0 c8606Yw02 = new C8606Yw0(uri3);
                Context context2 = this.f13417b;
                return new C11087ss0(c8606Yw02, C6286kD.m22166e(context2, uri3, new C9432fw1(1, context2.getContentResolver())));
        }
    }
}
