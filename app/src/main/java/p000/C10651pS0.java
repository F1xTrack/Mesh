package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.List;

/* renamed from: pS0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10651pS0 implements InterfaceC10395nS0 {

    /* renamed from: b */
    public static final C11864yy0 f40083b = new C11864yy0("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, C11864yy0.f46557e);

    /* renamed from: a */
    public final Context f40084a;

    public C10651pS0(Context context) {
        this.f40084a = context.getApplicationContext();
    }

    @Override // p000.InterfaceC10395nS0
    /* renamed from: a */
    public final boolean mo9107a(Object obj, C7830Jy0 c7830Jy0) {
        return ((Uri) obj).getScheme().equals("android.resource");
    }

    @Override // p000.InterfaceC10395nS0
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ InterfaceC10011kS0 mo9108b(Object obj, int i, int i2, C7830Jy0 c7830Jy0) {
        return m23789c((Uri) obj, c7830Jy0);
    }

    /* renamed from: c */
    public final InterfaceC10011kS0 m23789c(Uri uri, C7830Jy0 c7830Jy0) throws PackageManager.NameNotFoundException, NumberFormatException {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        Context context = this.f40084a;
        if (authority.equals(context.getPackageName())) {
            contextCreatePackageContext = context;
        } else {
            try {
                contextCreatePackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException(AbstractC11153tN0.m24911w("Failed to obtain context or unrecognized Uri format for: ", uri), e);
                }
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, ConstantDeviceInfo.APP_PLATFORM);
            }
            if (identifier == 0) {
                throw new IllegalArgumentException(AbstractC11153tN0.m24911w("Failed to find resource id for: ", uri));
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException(AbstractC11153tN0.m24911w("Unrecognized Uri format: ", uri));
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException(AbstractC11153tN0.m24911w("Unrecognized Uri format: ", uri), e2);
            }
        }
        Resources.Theme theme = (Resources.Theme) c7830Jy0.m4482c(f40083b);
        IL1.m3827a("Can't get a theme from another package", contextCreatePackageContext.getPackageName().equals(authority) || theme == null);
        Drawable drawableM24044b = theme == null ? C10810qh1.m24044b(context, contextCreatePackageContext, identifier, null) : C10810qh1.m24044b(context, context, identifier, theme);
        if (drawableM24044b != null) {
            return new C9314f10(drawableM24044b, 1);
        }
        return null;
    }
}
