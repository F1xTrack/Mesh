package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* renamed from: s51, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6965s51 implements InterfaceC7302ts0 {
    public final /* synthetic */ int a;
    public final InterfaceC7302ts0 b;

    public /* synthetic */ C6965s51(InterfaceC7302ts0 interfaceC7302ts0, int i) {
        this.a = i;
        this.b = interfaceC7302ts0;
    }

    @Override // defpackage.InterfaceC7302ts0
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // defpackage.InterfaceC7302ts0
    public final C7111ss0 b(Object obj, int i, int i2, C0795Jy0 c0795Jy0) {
        Uri uriFromFile;
        switch (this.a) {
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
                InterfaceC7302ts0 interfaceC7302ts0 = this.b;
                if (interfaceC7302ts0.a(uriFromFile)) {
                    return interfaceC7302ts0.b(uriFromFile, i, i2, c0795Jy0);
                }
                return null;
            default:
                return this.b.b(new E10((URL) obj), i, i2, c0795Jy0);
        }
    }
}
