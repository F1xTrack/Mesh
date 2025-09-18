package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.List;

/* renamed from: pS0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6461pS0 implements InterfaceC6079nS0 {
    public static final C8272yy0 b = new C8272yy0("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, C8272yy0.e);
    public final Context a;

    public C6461pS0(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.InterfaceC6079nS0
    public final boolean a(Object obj, C0795Jy0 c0795Jy0) {
        return ((Uri) obj).getScheme().equals("android.resource");
    }

    @Override // defpackage.InterfaceC6079nS0
    public final /* bridge */ /* synthetic */ InterfaceC5506kS0 b(Object obj, int i, int i2, C0795Jy0 c0795Jy0) {
        return c((Uri) obj, c0795Jy0);
    }

    public final InterfaceC5506kS0 c(Uri uri, C0795Jy0 c0795Jy0) throws PackageManager.NameNotFoundException, NumberFormatException {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        Context context = this.a;
        if (authority.equals(context.getPackageName())) {
            contextCreatePackageContext = context;
        } else {
            try {
                contextCreatePackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException(AbstractC7209tN0.w("Failed to obtain context or unrecognized Uri format for: ", uri), e);
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
                throw new IllegalArgumentException(AbstractC7209tN0.w("Failed to find resource id for: ", uri));
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException(AbstractC7209tN0.w("Unrecognized Uri format: ", uri));
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException(AbstractC7209tN0.w("Unrecognized Uri format: ", uri), e2);
            }
        }
        Resources.Theme theme = (Resources.Theme) c0795Jy0.c(b);
        IL1.a("Can't get a theme from another package", contextCreatePackageContext.getPackageName().equals(authority) || theme == null);
        Drawable drawableB = theme == null ? C6698qh1.b(context, contextCreatePackageContext, identifier, null) : C6698qh1.b(context, context, identifier, theme);
        if (drawableB != null) {
            return new C3691f10(drawableB, 1);
        }
        return null;
    }
}
