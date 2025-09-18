package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* renamed from: s51, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10990s51 implements InterfaceC11215ts0 {

    /* renamed from: a */
    public final /* synthetic */ int f42254a;

    /* renamed from: b */
    public final InterfaceC11215ts0 f42255b;

    public /* synthetic */ C10990s51(InterfaceC11215ts0 interfaceC11215ts0, int i) {
        this.f42254a = i;
        this.f42255b = interfaceC11215ts0;
    }

    @Override // p000.InterfaceC11215ts0
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo8529a(Object obj) {
        switch (this.f42254a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // p000.InterfaceC11215ts0
    /* renamed from: b */
    public final C11087ss0 mo8530b(Object obj, int i, int i2, C7830Jy0 c7830Jy0) {
        Uri uriFromFile;
        switch (this.f42254a) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    uriFromFile = null;
                } else if (str.charAt(0) == '/') {
                    uriFromFile = Uri.fromFile(new File(str));
                } else {
                    Uri uri = Uri.parse(str);
                    uriFromFile = uri.getScheme() == null ? Uri.fromFile(new File(str)) : uri;
                }
                if (uriFromFile == null) {
                    return null;
                }
                InterfaceC11215ts0 interfaceC11215ts0 = this.f42255b;
                if (interfaceC11215ts0.mo8529a(uriFromFile)) {
                    return interfaceC11215ts0.mo8530b(uriFromFile, i, i2, c7830Jy0);
                }
                return null;
            default:
                return this.f42255b.mo8530b(new E10((URL) obj), i, i2, c7830Jy0);
        }
    }
}
